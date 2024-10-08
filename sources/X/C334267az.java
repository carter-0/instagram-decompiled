package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.7az  reason: invalid class name and case insensitive filesystem */
public final class C334267az implements AnonymousClass1GR {
    public String A00 = "";
    public boolean A01;
    public final /* synthetic */ C333817aC A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ C252683pV A07;
    public final /* synthetic */ boolean A08;

    public final void DEO(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final void DEQ(C268654dm r5, AnonymousClass1QW r6) {
        C334157al r0;
        String str;
        String str2;
        0qQ.A0B(r5, 1);
        1XP r3 = (1XP) r5.A00();
        StringBuilder sb = new StringBuilder();
        sb.append("commentFetchType = ");
        if (this.A02.A01 == null) {
            r0 = C334157al.INITIAL_LOADING;
        } else {
            r0 = C334157al.HEAD_LOADING;
        }
        sb.append(r0);
        if (r3 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("|| Error Title: ");
            sb2.append(r3.mErrorTitle);
            sb2.append("|| Error Type: ");
            sb2.append(r3.mErrorType);
            sb2.append("|| Error Message: ");
            sb2.append(r3.getErrorMessage());
            sb2.append("|| Status: ");
            sb2.append(r3.getStatus());
            sb2.append("|| Status Code: ");
            sb2.append(r3.mStatusCode);
            str = sb2.toString();
        } else {
            str = "FetchCommentPageResponse = null || Error = null";
        }
        sb.append(str);
        sb.append(" || Throwable = ");
        Throwable A012 = r5.A01();
        if (A012 == null || (str2 = A012.getMessage()) == null) {
            str2 = "null";
        }
        sb.append(str2);
        0wb.A03("CommentsFetcher#Comments Fetch Error", sb.toString());
        this.A07.FIG(C335957do.A00);
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DeX() {
    }

    public final /* synthetic */ void Den() {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public C334267az(C333817aC r2, UserSession userSession, String str, String str2, 0sP r6, C252683pV r7, boolean z) {
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = userSession;
        this.A08 = z;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = r7;
    }

    public final void D58(AnonymousClass1QW r5, AnonymousClass2ZK r6) {
        C252683pV r3 = this.A07;
        r3.FIG(new C338027hI(this.A01, this.A00));
        r3.AI3((Throwable) null);
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r2, AnonymousClass1QW r3, AnonymousClass2ZK r4) {
        C335777dW r22 = (C335777dW) r2;
        0qQ.A0B(r22, 2);
        this.A01 = r22.A0I;
        this.A00 = r22.A0C;
    }

    public final /* bridge */ /* synthetic */ void DTy(1XR r25, AnonymousClass1QW r26, AnonymousClass2ZK r27) {
        AnonymousClass9IV r13;
        C335777dW r5 = (C335777dW) r25;
        0qQ.A0B(r26, 0);
        0qQ.A0B(r27, 1);
        0qQ.A0B(r5, 2);
        this.A06.invoke(r5);
        1bK r7 = r5.A03;
        if (r7 != null) {
            String str = r7.A0r;
            if (str != null) {
                this.A02.A02.add(str);
            }
            boolean z = r5.A0K;
            Set set = this.A02.A02;
            r13 = C335837dc.A00(this.A03, r7, this.A04, this.A05, set, this.A08, false, z);
        } else {
            r13 = null;
        }
        List list = r5.A0D;
        C333817aC r11 = this.A02;
        ArrayList<1bK> arrayList = new ArrayList<>();
        for (Object next : list) {
            Set set2 = r11.A02;
            String str2 = ((1bK) next).A0r;
            if (str2 == null) {
                str2 = "";
            }
            if (!set2.contains(str2)) {
                arrayList.add(next);
            }
        }
        UserSession userSession = this.A03;
        boolean z2 = this.A08;
        String str3 = this.A04;
        String str4 = this.A05;
        ArrayList arrayList2 = new ArrayList();
        for (1bK r4 : arrayList) {
            String str5 = r4.A0r;
            if (str5 != null) {
                r11.A02.add(str5);
            }
            AnonymousClass9IV A002 = C335837dc.A00(userSession, r4, str3, str4, r11.A02, z2, false, r5.A0K);
            if (A002 != null) {
                arrayList2.add(A002);
            }
        }
        boolean z3 = false;
        if (r5.A07 == AnonymousClass05K.A00) {
            z3 = true;
        }
        List list2 = r5.A0F;
        boolean z4 = r5.A0K;
        Integer num = r5.A08;
        ArrayList arrayList3 = arrayList2;
        List list3 = list2;
        boolean z5 = z4;
        Integer num2 = num;
        this.A07.FIG(new C335927dl(r13, r5.A04, r5.A05, num2, (String) null, arrayList3, list3, z3, z5, false, r5.A0G));
    }
}
