package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public enum BillingWizardName implements Parcelable {
    ACTIVATE_CREDIT_CARD("ACTIVATE_CREDIT_CARD"),
    ACTIVATE_CREDIT_CARD_DO_NOT_USE("ACTIVATE_CREDIT_CARD_DO_NOT_USE"),
    ADD_CREDIT_CARD("ADD_CREDIT_CARD"),
    ADD_FUNDS("ADD_FUNDS"),
    ADD_FUNDS_DO_NOT_USE("ADD_FUNDS_DO_NOT_USE"),
    ADD_PM("ADD_PM"),
    ADD_PM_DO_NOT_USE("ADD_PM_DO_NOT_USE"),
    AUTO("AUTO"),
    AUTO_DO_NOT_USE("AUTO_DO_NOT_USE"),
    BRAZIL_REFUND("BRAZIL_REFUND"),
    CHANGE_COUNTRY_CURRENCY("CHANGE_COUNTRY_CURRENCY"),
    CHANGE_COUNTRY_CURRENCY_DO_NOT_USE("CHANGE_COUNTRY_CURRENCY_DO_NOT_USE"),
    COLLECT_ACCOUNT_INFO("COLLECT_ACCOUNT_INFO"),
    COLLECT_ACCOUNT_INFO_DO_NOT_USE("COLLECT_ACCOUNT_INFO_DO_NOT_USE"),
    CREATE_BM_AD_ACCOUNT("CREATE_BM_AD_ACCOUNT"),
    CREATE_BM_AD_ACCOUNT_DO_NOT_USE("CREATE_BM_AD_ACCOUNT_DO_NOT_USE"),
    DEACTIVATE_AD_ACCOUNT("DEACTIVATE_AD_ACCOUNT"),
    DELETE_MI_SHARING("DELETE_MI_SHARING"),
    EDIT_CREDIT_CARD("EDIT_CREDIT_CARD"),
    EDIT_CREDIT_CARD_DO_NOT_USE("EDIT_CREDIT_CARD_DO_NOT_USE"),
    EDIT_MI_SHARING("EDIT_MI_SHARING"),
    EDIT_PRIMARY_PM("EDIT_PRIMARY_PM"),
    EDIT_PRIMARY_PM_DO_NOT_USE("EDIT_PRIMARY_PM_DO_NOT_USE"),
    MI_ONBOARDING("MI_ONBOARDING"),
    MI_ONBOARDING_DO_NOT_USE("MI_ONBOARDING_DO_NOT_USE"),
    MI_TO_SELF_SERVE("MI_TO_SELF_SERVE"),
    MI_TO_SELF_SERVE_DO_NOT_USE("MI_TO_SELF_SERVE_DO_NOT_USE"),
    A0U(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    NONE_DO_NOT_USE("NONE_DO_NOT_USE"),
    PAY_NOW("PAY_NOW"),
    PAY_NOW_DO_NOT_USE("PAY_NOW_DO_NOT_USE"),
    RECEIVE_CREDIT_CARD("RECEIVE_CREDIT_CARD"),
    RECEIVE_CREDIT_CARD_DO_NOT_USE("RECEIVE_CREDIT_CARD_DO_NOT_USE"),
    REJECT_CREDIT_CARD("REJECT_CREDIT_CARD"),
    RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION("RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION"),
    RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION_DO_NOT_USE("RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION_DO_NOT_USE"),
    RESOLVE_PREAUTH_FRICTION("RESOLVE_PREAUTH_FRICTION"),
    REVOKE_CC_SHARING("REVOKE_CC_SHARING"),
    SHARE_CREDIT_CARD("SHARE_CREDIT_CARD"),
    SHARE_CREDIT_CARD_DO_NOT_USE("SHARE_CREDIT_CARD_DO_NOT_USE");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        BillingWizardName[] billingWizardNameArr;
        A01 = 0oU.A00(billingWizardNameArr);
        CREATOR = new W6D(19);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BillingWizardName(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
