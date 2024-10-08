package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

public abstract class XEF extends 1XQ implements AnonymousClass371 {
    public final XEE A00;

    public final F0A getCheckpoint() {
        return null;
    }

    public final C45336Cue getConsentData() {
        return null;
    }

    public final String getErrorMessage() {
        return null;
    }

    public final List getErrorStrings() {
        return null;
    }

    public final List getSystemMessages() {
        return null;
    }

    public final boolean getCanSeeBroadcastChats() {
        return this.A00.getBooleanValue(AnonymousClass000.A00(4563));
    }

    public final boolean getCanSeeNotes() {
        return this.A00.getBooleanValue(AnonymousClass000.A00(4564));
    }

    public final String getCategory() {
        return this.A00.getStringValue("category");
    }

    public final String getCheckpointUrl() {
        return this.A00.getStringValue("checkpoint_url");
    }

    public final String getClientFacingErrorMessage() {
        return this.A00.getStringValue(AnonymousClass000.A00(4584));
    }

    public final String getDialogueType() {
        return this.A00.getStringValue(AnonymousClass000.A00(2999));
    }

    public final String getEnrollmentTime() {
        return this.A00.getStringValue(AnonymousClass000.A00(3064));
    }

    public final String getErrorBody() {
        return this.A00.getStringValue(AnonymousClass000.A00(3066));
    }

    public final String getErrorCode() {
        return this.A00.getStringValue(TraceFieldType.ErrorCode);
    }

    public final String getErrorSource() {
        return this.A00.getStringValue(AnonymousClass000.A00(1314));
    }

    public final String getErrorTitle() {
        return this.A00.getStringValue(AnonymousClass000.A00(284));
    }

    public final String getErrorType() {
        return this.A00.getStringValue("error_type");
    }

    public final String getExpirationTime() {
        return this.A00.getStringValue(AnonymousClass000.A00(3077));
    }

    public final String getFeedbackAction() {
        return this.A00.getStringValue(AnonymousClass000.A00(1355));
    }

    public final String getFeedbackAppealLabel() {
        return this.A00.getStringValue(AnonymousClass000.A00(1356));
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A00.getStringValue(AnonymousClass000.A00(1357));
    }

    public final String getFeedbackMessage() {
        return this.A00.getStringValue(AnonymousClass000.A00(606));
    }

    public final String getFeedbackTitle() {
        return this.A00.getStringValue(AnonymousClass000.A00(1359));
    }

    public final String getFeedbackUrl() {
        return this.A00.getStringValue(AnonymousClass000.A00(1360));
    }

    public final String getLocalizedErrorMessage() {
        return this.A00.getStringValue(AnonymousClass000.A00(3522));
    }

    public final String getLogoutReason() {
        return this.A00.getStringValue(AnonymousClass000.A00(3531));
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A00.getBooleanValue("news_url_is_regulated");
    }

    public final String getReasonsThrown() {
        return this.A00.getStringValue(AnonymousClass000.A00(3835));
    }

    public final String getResponsiblePolicy() {
        return this.A00.getStringValue(AnonymousClass000.A00(3892));
    }

    public final String getRestrictionDetailUseCase() {
        return this.A00.getStringValue(AnonymousClass000.A00(3894));
    }

    public final String getRestrictionExtraData() {
        return this.A00.getStringValue(AnonymousClass000.A00(3895));
    }

    public final String getRestrictionType() {
        return this.A00.getStringValue(AnonymousClass000.A00(5193));
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A00.getBooleanValue("sentry_block_restriction_dialogue_unification_enabled");
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A00.getBooleanValue("lock");
    }

    public final boolean getSpam() {
        return this.A00.getBooleanValue("is_spam");
    }

    public final String getStatus() {
        String stringValue = this.A00.getStringValue(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }

    public final boolean isEpdError() {
        return this.A00.getBooleanValue(AnonymousClass000.A00(4922));
    }

    public final boolean isFeedbackRequired() {
        if (!this.A00.getBooleanValue(AnonymousClass000.A00(1358))) {
            return false;
        }
        return true;
    }

    public XEF(XEE xee) {
        this.A00 = xee;
    }

    public final boolean isCheckpointRequired() {
        return false;
    }

    public final boolean isConsentRequired() {
        return false;
    }

    public final boolean isDelegateAccessBlocked() {
        return false;
    }

    public final boolean isLoginRequired() {
        return false;
    }

    public final boolean isOk() {
        return 0qQ.A0K(getStatus(), "ok");
    }
}
