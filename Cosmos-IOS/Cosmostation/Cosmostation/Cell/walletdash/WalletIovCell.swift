//
//  WalletIovCell.swift
//  Cosmostation
//
//  Created by yongjoo on 28/10/2019.
//  Copyright © 2019 wannabit. All rights reserved.
//

import UIKit

class WalletIovCell: UITableViewCell {
    
    @IBOutlet weak var rootCardView: CardView!
    @IBOutlet weak var totalAmount: UILabel!
    @IBOutlet weak var totalValue: UILabel!
    @IBOutlet weak var availableAmount: UILabel!
    @IBOutlet weak var delegatedAmount: UILabel!
    @IBOutlet weak var unbondingAmount: UILabel!
    @IBOutlet weak var rewardAmount: UILabel!

    override func awakeFromNib() {
        super.awakeFromNib()
        self.selectionStyle = .none
        availableAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
        delegatedAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
        unbondingAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
        rewardAmount.font = UIFontMetrics(forTextStyle: .footnote).scaledFont(for: Font_13_footnote)
    }
    
    var actionDelegate: (() -> Void)? = nil
    var actionVote: (() -> Void)? = nil
    var actionNameService: (() -> Void)? = nil
    
    @IBAction func onClickDelegate(_ sender: UIButton) {
        actionDelegate?()
    }
    @IBAction func onClickVote(_ sender: UIButton) {
        actionVote?()
    }
    @IBAction func onClickNameService(_ sender: UIButton) {
        actionNameService?()
    }
    
    func updateView(_ account: Account?, _ chainType: ChainType?) {
        if (chainType == ChainType.IOV_MAIN) {
            let available = BaseData.instance.availableAmount(IOV_MAIN_DENOM)
            let delegated = BaseData.instance.delegatedSumAmount()
            let unbonding = BaseData.instance.unbondingSumAmount()
            let reward = BaseData.instance.rewardAmount(IOV_MAIN_DENOM)
            let total = available.adding(delegated).adding(unbonding).adding(reward)
            
            totalAmount.attributedText = WUtils.displayAmount2(total.stringValue, totalAmount.font, 6, 6)
            availableAmount.attributedText = WUtils.displayAmount2(available.stringValue, availableAmount.font, 6, 6)
            delegatedAmount.attributedText = WUtils.displayAmount2(delegated.stringValue, delegatedAmount.font, 6, 6)
            unbondingAmount.attributedText = WUtils.displayAmount2(unbonding.stringValue, unbondingAmount.font, 6, 6)
            rewardAmount.attributedText = WUtils.displayAmount2(reward.stringValue, rewardAmount.font, 6, 6)
            totalValue.attributedText = WUtils.dpTokenValue(total, BaseData.instance.getLastPrice(), 6, totalValue.font)
            BaseData.instance.updateLastTotal(account, total.multiplying(byPowerOf10: -6).stringValue)
            
        } else if (chainType == ChainType.IOV_TEST) {
            let available = BaseData.instance.availableAmount(IOV_TEST_DENOM)
            let delegated = BaseData.instance.delegatedSumAmount()
            let unbonding = BaseData.instance.unbondingSumAmount()
            let reward = BaseData.instance.rewardAmount(IOV_TEST_DENOM)
            let total = available.adding(delegated).adding(unbonding).adding(reward)
            
            totalAmount.attributedText = WUtils.displayAmount2(total.stringValue, totalAmount.font, 6, 6)
            availableAmount.attributedText = WUtils.displayAmount2(available.stringValue, availableAmount.font, 6, 6)
            delegatedAmount.attributedText = WUtils.displayAmount2(delegated.stringValue, delegatedAmount.font, 6, 6)
            unbondingAmount.attributedText = WUtils.displayAmount2(unbonding.stringValue, unbondingAmount.font, 6, 6)
            rewardAmount.attributedText = WUtils.displayAmount2(reward.stringValue, rewardAmount.font, 6, 6)
            totalValue.attributedText = WUtils.dpTokenValue(total, BaseData.instance.getLastPrice(), 6, totalValue.font)
            BaseData.instance.updateLastTotal(account, total.multiplying(byPowerOf10: -6).stringValue)
            
        }
        
    }
}