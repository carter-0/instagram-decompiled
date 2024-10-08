package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class XEI implements C298835u7, AnonymousClass3HQ {
    public final C293585l1 A00;
    public final XEJ A01;
    public final List A02;
    public final B5i A03;
    public final UserSession A04;
    public final 1E5 A05;
    public final List A06;

    public XEI(XEJ xej, B5i b5i, UserSession userSession, 1E5 r11) {
        ArrayList arrayList;
        0qQ.A0B(r11, 4);
        this.A04 = userSession;
        this.A03 = b5i;
        this.A01 = xej;
        this.A05 = r11;
        C41888B5h A0E = b5i.A0E(r11);
        this.A00 = A0E;
        List<C276024sM> items = A0E.getItems();
        ArrayList A0r = AnonymousClass7TG.A0r(items);
        for (C276024sM A022 : items) {
            A0r.add(C295325ny.A02(A022));
        }
        this.A02 = A0r;
        List<DU5> BJe = this.A00.BJe();
        if (BJe != null) {
            arrayList = AnonymousClass7TE.A1C();
            for (DU5 du5 : BJe) {
                du5.E7B(new 1E9(this.A05, 6, false));
                C267324bN A032 = C295325ny.A03(du5);
                if (A032 != null) {
                    arrayList.add(A032);
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        this.A06 = arrayList;
    }

    public final /* synthetic */ void EQF(String str) {
    }

    public final HashMap Ahj() {
        Map BQI = this.A00.BQI();
        if (BQI != null) {
            return new HashMap(BQI);
        }
        return null;
    }

    public final long AjJ() {
        return this.A01.A00;
    }

    public final long AjP() {
        return this.A01.A01;
    }

    public final List Ao2() {
        List BJe = this.A00.BJe();
        if (BJe == null) {
            return 0sn.A00;
        }
        return BJe;
    }

    public final String BaG() {
        return this.A00.Bl8();
    }

    public final C276114sa BaP() {
        return this.A00.BaO();
    }

    public final String Bnn() {
        return this.A00.AqM();
    }

    public final boolean CP6() {
        return this.A00.BaO().BU8();
    }

    public final boolean CPJ() {
        C276024sM r0;
        1Xj BPf;
        C293585l1 r3 = this.A00;
        if (0qQ.A0K(r3.BaO().BP8(), "0") || (!r3.getItems().isEmpty() && (r0 = (C276024sM) r3.getItems().get(0)) != null && (BPf = r0.BPf()) != null && BPf.A0C.BsQ() != null)) {
            return true;
        }
        return false;
    }

    public final boolean CPt() {
        return this.A01.CPt();
    }

    public final boolean Cdj() {
        return AnonymousClass7TF.A1Y(this.A00.CBC(), true);
    }

    public final void EQE(long j) {
        this.A01.A00 = j;
    }

    public final void EQG(long j) {
        this.A01.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        return this.A01.A00.reinterpret(C41888B5h.class);
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

    public final String getNextMaxId() {
        return this.A00.BaO().BP8();
    }

    public final String getReasonsThrown() {
        return this.A01.getReasonsThrown();
    }

    public final long getResponseTimestamp() {
        return this.A01.mResponseTimestamp;
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

    public final int getStatusCode() {
        return this.A01.mStatusCode;
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

    public final List Ahh() {
        return 0sn.A00;
    }

    public final List Ao1() {
        return this.A06;
    }

    public final List Ao4() {
        return this.A02;
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
