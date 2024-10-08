package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xzb  reason: case insensitive filesystem */
public final class C22326Xzb implements AnonymousClass371, 1XU, AnonymousClass1XV, C66446MSa {
    public long A00 = -1;
    public long A01 = -1;
    public final CDF A02;

    public final /* synthetic */ void EQF(String str) {
    }

    public final boolean getCanSeeBroadcastChats() {
        return this.A02.getCanSeeBroadcastChats();
    }

    public final boolean getCanSeeNotes() {
        return this.A02.getCanSeeNotes();
    }

    public final String getCategory() {
        return this.A02.getCategory();
    }

    public final String getClientFacingErrorMessage() {
        return this.A02.getClientFacingErrorMessage();
    }

    public final String getErrorCode() {
        return this.A02.getErrorCode();
    }

    public final String getErrorMessage() {
        return this.A02.getErrorMessage();
    }

    public final String getStatus() {
        String status = this.A02.getStatus();
        0qQ.A07(status);
        return status;
    }

    public final boolean isCheckpointRequired() {
        return this.A02.isCheckpointRequired();
    }

    public final boolean isConsentRequired() {
        return this.A02.isConsentRequired();
    }

    public final boolean isDelegateAccessBlocked() {
        return this.A02.isDelegateAccessBlocked();
    }

    public final boolean isEpdError() {
        return this.A02.isEpdError();
    }

    public final boolean isFeedbackRequired() {
        return this.A02.isFeedbackRequired();
    }

    public final boolean isLoginRequired() {
        return this.A02.isLoginRequired();
    }

    public final boolean isOk() {
        return this.A02.isOk();
    }

    public final boolean CPt() {
        return AnonymousClass7TF.A1P((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1)));
    }

    public final CGO F04() {
        ArrayList arrayList;
        CGO cgo = new CGO();
        BBR bbr = this.A02.A00;
        if (bbr == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        List<DSN> A002 = bbr.A00();
        if (A002 != null) {
            arrayList = AnonymousClass7TG.A0r(A002);
            for (DSN jzc : A002) {
                arrayList.add(new JZC(jzc));
            }
        } else {
            arrayList = AnonymousClass7TE.A1C();
        }
        cgo.A05 = arrayList;
        String str = cgo.A04;
        if (str != null) {
            C63345KvS.A00(arrayList, str);
        }
        return cgo;
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        BBR bbr = this.A02.A00;
        if (bbr != null) {
            return bbr;
        }
        C41845B3m.A0v();
        throw AnonymousClass00P.createAndThrow();
    }

    public final F0A getCheckpoint() {
        return this.A02.mCheckpoint;
    }

    public final String getCheckpointUrl() {
        return this.A02.mCheckpointUrl;
    }

    public final C45336Cue getConsentData() {
        return this.A02.mConsentData;
    }

    public final String getDialogueType() {
        return this.A02.mDialogueType;
    }

    public final String getEnrollmentTime() {
        return this.A02.mEnrollmentTime;
    }

    public final String getErrorBody() {
        return this.A02.mErrorBody;
    }

    public final String getErrorSource() {
        return this.A02.mErrorSource;
    }

    public final List getErrorStrings() {
        return this.A02.mErrorStrings;
    }

    public final String getErrorTitle() {
        return this.A02.mErrorTitle;
    }

    public final String getErrorType() {
        return this.A02.mErrorType;
    }

    public final String getExpirationTime() {
        return this.A02.mExpirationTime;
    }

    public final String getFeedbackAction() {
        return this.A02.mFeedbackAction;
    }

    public final String getFeedbackAppealLabel() {
        return this.A02.mFeedbackAppealLabel;
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A02.mFeedbackIgnoreLabel;
    }

    public final String getFeedbackMessage() {
        return this.A02.mFeedbackMessage;
    }

    public final String getFeedbackTitle() {
        return this.A02.mFeedbackTitle;
    }

    public final String getFeedbackUrl() {
        return this.A02.mFeedbackUrl;
    }

    public final String getLocalizedErrorMessage() {
        return this.A02.mLocalizedErrorMessage;
    }

    public final String getLogoutReason() {
        return this.A02.mLogoutReason;
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A02.mNewsURLIsRegulated;
    }

    public final String getReasonsThrown() {
        return this.A02.mReasonsThrown;
    }

    public final long getResponseTimestamp() {
        return this.A02.mResponseTimestamp;
    }

    public final String getResponsiblePolicy() {
        return this.A02.mResponsiblePolicy;
    }

    public final String getRestrictionDetailUseCase() {
        return this.A02.mRestrictionDetailUseCase;
    }

    public final String getRestrictionExtraData() {
        return this.A02.mRestrictionExtraData;
    }

    public final String getRestrictionType() {
        return this.A02.mRestrictionType;
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A02.mSentryBlockRestrictionDialogueUnificationEnabled;
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A02.mLockCheckpointDialog;
    }

    public final boolean getSpam() {
        return this.A02.mSpam;
    }

    public final int getStatusCode() {
        return this.A02.mStatusCode;
    }

    public final List getSystemMessages() {
        return this.A02.mSystemMessages;
    }

    public final void setFromDiskCache(boolean z) {
        this.A02.mFromDiskCache = z;
    }

    public final void setResponseId(int i) {
        this.A02.mResponseId = i;
    }

    public final void setResponseTimestamp(long j) {
        this.A02.mResponseTimestamp = j;
    }

    public final void setServerElapsedTime(long j) {
        this.A02.mServerElapsedTime = j;
    }

    public final void setStatusCode(int i) {
        this.A02.mStatusCode = i;
    }

    public C22326Xzb(CDF cdf) {
        this.A02 = cdf;
    }

    public final long AjJ() {
        return this.A00;
    }

    public final long AjP() {
        return this.A01;
    }

    public final boolean CP6() {
        return true;
    }

    public final boolean CPJ() {
        return false;
    }

    public final String getNextMaxId() {
        return null;
    }

    public final void EQE(long j) {
        this.A00 = j;
    }

    public final void EQG(long j) {
        this.A01 = j;
    }
}
