package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.Y0o  reason: case insensitive filesystem */
public abstract class C22360Y0o implements C336537em, AnonymousClass3HQ {
    public final C335587dC A00;
    public final /* synthetic */ C21220XPk A01;

    public final boolean CPt() {
        return this.A01.CPt();
    }

    public final /* synthetic */ void EQF(String str) {
    }

    public final boolean getCanSeeBroadcastChats() {
        return this.A01.getCanSeeBroadcastChats();
    }

    public final boolean getCanSeeNotes() {
        return this.A01.getCanSeeNotes();
    }

    public final String getCategory() {
        return this.A01.getCategory();
    }

    public final String getCheckpointUrl() {
        return this.A01.getCheckpointUrl();
    }

    public final String getClientFacingErrorMessage() {
        return this.A01.getClientFacingErrorMessage();
    }

    public final String getDialogueType() {
        return this.A01.getDialogueType();
    }

    public final String getEnrollmentTime() {
        return this.A01.getEnrollmentTime();
    }

    public final String getErrorBody() {
        return this.A01.getErrorBody();
    }

    public final String getErrorCode() {
        return this.A01.getErrorCode();
    }

    public final String getErrorSource() {
        return this.A01.getErrorSource();
    }

    public final String getErrorTitle() {
        return this.A01.getErrorTitle();
    }

    public final String getErrorType() {
        return this.A01.getErrorType();
    }

    public final String getExpirationTime() {
        return this.A01.getExpirationTime();
    }

    public final String getFeedbackAction() {
        return this.A01.getFeedbackAction();
    }

    public final String getFeedbackAppealLabel() {
        return this.A01.getFeedbackAppealLabel();
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A01.getFeedbackIgnoreLabel();
    }

    public final String getFeedbackMessage() {
        return this.A01.getFeedbackMessage();
    }

    public final String getFeedbackTitle() {
        return this.A01.getFeedbackTitle();
    }

    public final String getFeedbackUrl() {
        return this.A01.getFeedbackUrl();
    }

    public final String getLocalizedErrorMessage() {
        return this.A01.getLocalizedErrorMessage();
    }

    public final String getLogoutReason() {
        return this.A01.getLogoutReason();
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A01.getNewsURLIsRegulated();
    }

    public final String getReasonsThrown() {
        return this.A01.getReasonsThrown();
    }

    public final String getResponsiblePolicy() {
        return this.A01.getResponsiblePolicy();
    }

    public final String getRestrictionDetailUseCase() {
        return this.A01.getRestrictionDetailUseCase();
    }

    public final String getRestrictionExtraData() {
        return this.A01.getRestrictionExtraData();
    }

    public final String getRestrictionType() {
        return this.A01.getRestrictionType();
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A01.getSentryBlockRestrictionDialogueUnificationEnabled();
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return this.A01.getShouldShowWebviewCancelButton();
    }

    public final boolean getSpam() {
        return this.A01.getSpam();
    }

    public final String getStatus() {
        return this.A01.getStatus();
    }

    public final boolean isEpdError() {
        return this.A01.isEpdError();
    }

    public final boolean isFeedbackRequired() {
        return this.A01.isFeedbackRequired();
    }

    public final boolean isOk() {
        return this.A01.isOk();
    }

    public final long AjJ() {
        return this.A01.A00;
    }

    public final long AjP() {
        return this.A01.A01;
    }

    public final String BjE() {
        return this.A00.BjE();
    }

    public final /* bridge */ /* synthetic */ boolean CKA() {
        return this.A00.BBY();
    }

    public final void EQE(long j) {
        this.A01.A00 = j;
    }

    public final void EQG(long j) {
        this.A01.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        return this.A01.A00.reinterpret(CMa.class);
    }

    public final List getItems() {
        List CD6 = this.A00.CD6();
        if (CD6 == null) {
            return 0sn.A00;
        }
        return CD6;
    }

    public final String getNextMaxId() {
        return this.A00.getNextMaxId();
    }

    public final long getResponseTimestamp() {
        return this.A01.mResponseTimestamp;
    }

    public final int getStatusCode() {
        return this.A01.mStatusCode;
    }

    public final void setFromDiskCache(boolean z) {
        this.A01.mFromDiskCache = z;
    }

    public final void setResponseId(int i) {
        this.A01.mResponseId = i;
    }

    public final void setResponseTimestamp(long j) {
        this.A01.mResponseTimestamp = j;
    }

    public final void setServerElapsedTime(long j) {
        this.A01.mServerElapsedTime = j;
    }

    public final void setStatusCode(int i) {
        this.A01.mStatusCode = i;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.XPk, X.XEF] */
    public C22360Y0o(C335587dC r4) {
        TreeJNI reinterpret = ((TreeJNI) r4).reinterpret(XEE.class);
        0qQ.A07(reinterpret);
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        XEE xee = (XEE) new TreeUpdaterJNI(0se.A0M(AnonymousClass7TE.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ok")), reinterpret).applyToTree(reinterpret);
        0qQ.A0A(xee);
        0qQ.A0B(xee, 1);
        ? xef = new XEF(xee);
        xef.A01 = -1;
        xef.A00 = -1;
        this.A01 = xef;
        this.A00 = r4;
    }

    public final Object B3J() {
        return null;
    }

    public final Integer BlQ() {
        return null;
    }

    public final String BnF() {
        return null;
    }

    public final List Bqo() {
        return null;
    }

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
}
