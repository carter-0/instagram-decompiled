package X;

import com.instagram.reels.question.model.QuestionResponsesModel;
import java.util.List;

/* renamed from: X.Xzc  reason: case insensitive filesystem */
public final class C22327Xzc implements AnonymousClass371, AnonymousClass1XV {
    public final CDU A00;

    public final boolean getCanSeeBroadcastChats() {
        return this.A00.getCanSeeBroadcastChats();
    }

    public final boolean getCanSeeNotes() {
        return this.A00.getCanSeeNotes();
    }

    public final String getCategory() {
        return this.A00.getCategory();
    }

    public final String getClientFacingErrorMessage() {
        return this.A00.getClientFacingErrorMessage();
    }

    public final String getErrorCode() {
        return this.A00.getErrorCode();
    }

    public final String getErrorMessage() {
        return this.A00.getErrorMessage();
    }

    public final String getStatus() {
        String status = this.A00.getStatus();
        0qQ.A07(status);
        return status;
    }

    public final boolean isCheckpointRequired() {
        return this.A00.isCheckpointRequired();
    }

    public final boolean isConsentRequired() {
        return this.A00.isConsentRequired();
    }

    public final boolean isDelegateAccessBlocked() {
        return this.A00.isDelegateAccessBlocked();
    }

    public final boolean isEpdError() {
        return this.A00.isEpdError();
    }

    public final boolean isFeedbackRequired() {
        return this.A00.isFeedbackRequired();
    }

    public final boolean isLoginRequired() {
        return this.A00.isLoginRequired();
    }

    public final boolean isOk() {
        return this.A00.isOk();
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        C42016BAq bAq = this.A00.A00;
        if (bAq != null) {
            return bAq;
        }
        C41845B3m.A0v();
        throw AnonymousClass00P.createAndThrow();
    }

    public final F0A getCheckpoint() {
        return this.A00.mCheckpoint;
    }

    public final String getCheckpointUrl() {
        return this.A00.mCheckpointUrl;
    }

    public final C45336Cue getConsentData() {
        return this.A00.mConsentData;
    }

    public final String getDialogueType() {
        return this.A00.mDialogueType;
    }

    public final String getEnrollmentTime() {
        return this.A00.mEnrollmentTime;
    }

    public final String getErrorBody() {
        return this.A00.mErrorBody;
    }

    public final String getErrorSource() {
        return this.A00.mErrorSource;
    }

    public final List getErrorStrings() {
        return this.A00.mErrorStrings;
    }

    public final String getErrorTitle() {
        return this.A00.mErrorTitle;
    }

    public final String getErrorType() {
        return this.A00.mErrorType;
    }

    public final String getExpirationTime() {
        return this.A00.mExpirationTime;
    }

    public final String getFeedbackAction() {
        return this.A00.mFeedbackAction;
    }

    public final String getFeedbackAppealLabel() {
        return this.A00.mFeedbackAppealLabel;
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A00.mFeedbackIgnoreLabel;
    }

    public final String getFeedbackMessage() {
        return this.A00.mFeedbackMessage;
    }

    public final String getFeedbackTitle() {
        return this.A00.mFeedbackTitle;
    }

    public final String getFeedbackUrl() {
        return this.A00.mFeedbackUrl;
    }

    public final String getLocalizedErrorMessage() {
        return this.A00.mLocalizedErrorMessage;
    }

    public final String getLogoutReason() {
        return this.A00.mLogoutReason;
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A00.mNewsURLIsRegulated;
    }

    public final String getNextMaxId() {
        C42016BAq bAq = this.A00.A00;
        if (bAq == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        QuestionResponsesModel questionResponsesModel = bAq.A00;
        if (questionResponsesModel != null) {
            return questionResponsesModel.BP8();
        }
        return null;
    }

    public final String getReasonsThrown() {
        return this.A00.mReasonsThrown;
    }

    public final long getResponseTimestamp() {
        return this.A00.mResponseTimestamp;
    }

    public final String getResponsiblePolicy() {
        return this.A00.mResponsiblePolicy;
    }

    public final String getRestrictionDetailUseCase() {
        return this.A00.mRestrictionDetailUseCase;
    }

    public final String getRestrictionExtraData() {
        return this.A00.mRestrictionExtraData;
    }

    public final String getRestrictionType() {
        return this.A00.mRestrictionType;
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A00.mSentryBlockRestrictionDialogueUnificationEnabled;
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A00.mLockCheckpointDialog;
    }

    public final boolean getSpam() {
        return this.A00.mSpam;
    }

    public final int getStatusCode() {
        return this.A00.mStatusCode;
    }

    public final List getSystemMessages() {
        return this.A00.mSystemMessages;
    }

    public final void setFromDiskCache(boolean z) {
        this.A00.mFromDiskCache = z;
    }

    public final void setResponseId(int i) {
        this.A00.mResponseId = i;
    }

    public final void setResponseTimestamp(long j) {
        this.A00.mResponseTimestamp = j;
    }

    public final void setServerElapsedTime(long j) {
        this.A00.mServerElapsedTime = j;
    }

    public final void setStatusCode(int i) {
        this.A00.mStatusCode = i;
    }

    public C22327Xzc(CDU cdu) {
        this.A00 = cdu;
    }

    public final boolean CP6() {
        return true;
    }

    public final boolean CPJ() {
        return false;
    }
}
