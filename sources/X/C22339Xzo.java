package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Xzo  reason: case insensitive filesystem */
public final class C22339Xzo implements C298835u7, AnonymousClass3HQ {
    public final XEJ A00;
    public final C293575l0 A01;

    public C22339Xzo(1E6 r11, XEJ xej) {
        ArrayList arrayList;
        ArrayList arrayList2;
        0qQ.A0B(r11, 2);
        this.A00 = xej;
        17P r1 = (C41888B5h) xej.A00.reinterpret(C41888B5h.class);
        1E9 r3 = new 1E9(r11, 6, false);
        List Ao0 = r1.Ao0();
        if (Ao0 != null) {
            arrayList = AnonymousClass7TF.A0p(Ao0);
            Iterator it = Ao0.iterator();
            while (it.hasNext()) {
                C41848B3p.A1Q(r3, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        String stringValueByHashCode = r1.getStringValueByHashCode(1759802346);
        r1.A0j(235795787);
        List items = r1.getItems();
        ArrayList A0p = AnonymousClass7TF.A0p(items);
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            C41848B3p.A1Q(r3, A0p, it2);
        }
        List<DU5> BJe = r1.BJe();
        if (BJe != null) {
            arrayList2 = AnonymousClass7TF.A0p(BJe);
            for (DU5 F1X : BJe) {
                arrayList2.add(F1X.F1X(r3));
            }
        } else {
            arrayList2 = null;
        }
        C276104sZ F7P = r1.BaO().F7P();
        String stringValueByHashCode2 = r1.getStringValueByHashCode(-1198642808);
        r1.A0j(37109963);
        this.A01 = new C293575l0(F7P, r1.A0B(2079275687), stringValueByHashCode, stringValueByHashCode2, (HashMap) null, arrayList, A0p, arrayList2);
    }

    public final /* synthetic */ void EQF(String str) {
    }

    public final HashMap Ahj() {
        return this.A01.A04;
    }

    public final long AjJ() {
        return this.A00.A00;
    }

    public final long AjP() {
        return this.A00.A01;
    }

    public final List Ao1() {
        List<BE8> list = this.A01.A06;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (BE8 A03 : list) {
            C267324bN A032 = C295325ny.A03(A03);
            if (A032 != null) {
                A1C.add(A032);
            }
        }
        return A1C;
    }

    public final List Ao2() {
        List list = this.A01.A06;
        if (list == null) {
            return 0sn.A00;
        }
        return list;
    }

    public final List Ao4() {
        List<C276014sL> list = this.A01.A05;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C276014sL A02 : list) {
            A0r.add(C295325ny.A02(A02));
        }
        return A0r;
    }

    public final String BaG() {
        return this.A01.A03;
    }

    public final C276114sa BaP() {
        return this.A01.A00;
    }

    public final String Bnn() {
        return this.A01.A02;
    }

    public final boolean CP6() {
        return this.A01.A00.BU8();
    }

    public final boolean CPt() {
        return this.A00.CPt();
    }

    public final void EQE(long j) {
        this.A00.A00 = j;
    }

    public final void EQG(long j) {
        this.A00.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        return this.A00.A00.reinterpret(C41888B5h.class);
    }

    public final boolean getCanSeeBroadcastChats() {
        return this.A00.getCanSeeBroadcastChats();
    }

    public final boolean getCanSeeNotes() {
        return this.A00.getCanSeeNotes();
    }

    public final String getCategory() {
        return this.A00.getCategory();
    }

    public final String getCheckpointUrl() {
        return this.A00.getCheckpointUrl();
    }

    public final String getClientFacingErrorMessage() {
        return this.A00.getClientFacingErrorMessage();
    }

    public final String getDialogueType() {
        return this.A00.getDialogueType();
    }

    public final String getEnrollmentTime() {
        return this.A00.getEnrollmentTime();
    }

    public final String getErrorBody() {
        return this.A00.getErrorBody();
    }

    public final String getErrorCode() {
        return this.A00.getErrorCode();
    }

    public final String getErrorSource() {
        return this.A00.getErrorSource();
    }

    public final String getErrorTitle() {
        return this.A00.getErrorTitle();
    }

    public final String getErrorType() {
        return this.A00.getErrorType();
    }

    public final String getExpirationTime() {
        return this.A00.getExpirationTime();
    }

    public final String getFeedbackAction() {
        return this.A00.getFeedbackAction();
    }

    public final String getFeedbackAppealLabel() {
        return this.A00.getFeedbackAppealLabel();
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A00.getFeedbackIgnoreLabel();
    }

    public final String getFeedbackMessage() {
        return this.A00.getFeedbackMessage();
    }

    public final String getFeedbackTitle() {
        return this.A00.getFeedbackTitle();
    }

    public final String getFeedbackUrl() {
        return this.A00.getFeedbackUrl();
    }

    public final String getLocalizedErrorMessage() {
        return this.A00.getLocalizedErrorMessage();
    }

    public final String getLogoutReason() {
        return this.A00.getLogoutReason();
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A00.getNewsURLIsRegulated();
    }

    public final String getNextMaxId() {
        return this.A01.A00.BP8();
    }

    public final String getReasonsThrown() {
        return this.A00.getReasonsThrown();
    }

    public final long getResponseTimestamp() {
        return this.A00.mResponseTimestamp;
    }

    public final String getResponsiblePolicy() {
        return this.A00.getResponsiblePolicy();
    }

    public final String getRestrictionDetailUseCase() {
        return this.A00.getRestrictionDetailUseCase();
    }

    public final String getRestrictionExtraData() {
        return this.A00.getRestrictionExtraData();
    }

    public final String getRestrictionType() {
        return this.A00.getRestrictionType();
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A00.getSentryBlockRestrictionDialogueUnificationEnabled();
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return this.A00.getShouldShowWebviewCancelButton();
    }

    public final boolean getSpam() {
        return this.A00.getSpam();
    }

    public final String getStatus() {
        return this.A00.getStatus();
    }

    public final int getStatusCode() {
        return this.A00.mStatusCode;
    }

    public final boolean isEpdError() {
        return this.A00.isEpdError();
    }

    public final boolean isFeedbackRequired() {
        return this.A00.isFeedbackRequired();
    }

    public final boolean isOk() {
        return this.A00.isOk();
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

    public final List Ahh() {
        return 0sn.A00;
    }

    public final boolean CPJ() {
        if (!0qQ.A0K(getNextMaxId(), "0")) {
            List list = this.A01.A05;
            if (!AnonymousClass7TE.A1b(list) || ((C276014sL) list.get(0)).A00.A0C.BsQ() == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean Cdj() {
        return AnonymousClass7TE.A0v().equals(this.A01.A01);
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
