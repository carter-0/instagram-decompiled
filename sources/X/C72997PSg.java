package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

/* renamed from: X.PSg  reason: case insensitive filesystem */
public final class C72997PSg implements 1aV {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C72997PSg(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A01 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = obj;
        this.A04 = obj3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Object obj2;
        C47124Dr1 dr1;
        Object obj3;
        C74233PrM prM = (C74233PrM) obj;
        boolean z = prM instanceof C72176Oxl;
        if (this.A00 != 0) {
            if (z) {
                Object A012 = C66996MgU.A01(prM);
                0qQ.A07(A012);
                dr1 = (C47124Dr1) A012;
                AnonymousClass7GX r5 = (AnonymousClass7GX) this.A04;
                int i = this.A01;
                String str = this.A05;
                String str2 = this.A06;
                String str3 = dr1.A02;
                String str4 = dr1.A01;
                HashMap A1E = AnonymousClass7TE.A1E();
                if (str3 == null) {
                    str3 = "";
                }
                A1E.put("error_message", str3);
                if (str4 == null) {
                    str4 = "";
                }
                A1E.put(TraceFieldType.ErrorCode, str4);
                C69871NtZ.A00(r5.A00, str, str2, "resign_moderator_error", "view", "resign_moderator", "thread_details", A1E, i);
                obj3 = this.A02;
            } else {
                int i2 = this.A01;
                C69871NtZ.A00(((AnonymousClass7GX) this.A04).A00, this.A05, this.A06, "resign_moderator_success", "view", "resign_moderator", "thread_details", (HashMap) null, i2);
                obj2 = this.A03;
                ((JPL) obj2).Cfo();
                return;
            }
        } else if (z) {
            Object A013 = C66996MgU.A01(prM);
            0qQ.A07(A013);
            dr1 = (C47124Dr1) A013;
            C313756gx r10 = (C313756gx) this.A02;
            int i3 = this.A01;
            String str5 = this.A05;
            String str6 = this.A06;
            String str7 = dr1.A00;
            String str8 = dr1.A01;
            1Ln A0J = DbT.A0J(r10);
            if (DbT.A1Y(A0J)) {
                HashMap A1E2 = AnonymousClass7TE.A1E();
                if (str7 == null) {
                    str7 = "";
                }
                A1E2.put("error_message", str7);
                if (str8 == null) {
                    str8 = "";
                }
                A1E2.put(TraceFieldType.ErrorCode, str8);
                DbW.A17(A0J, r10);
                Dba.A1D(A0J, "resign_collaborator_error");
                A0J.A0p("resign_collaborator");
                JTQ.A1C(A0J, DbZ.A0b(A0J, "thread_details", str5, str6, i3), A1E2);
            }
            obj3 = this.A03;
        } else {
            C313756gx r52 = (C313756gx) this.A02;
            int i4 = this.A01;
            String str9 = this.A05;
            String str10 = this.A06;
            1Ln A0J2 = DbT.A0J(r52);
            if (DbT.A1Y(A0J2)) {
                DbW.A17(A0J2, r52);
                Dba.A1D(A0J2, "resign_collaborator_success");
                A0J2.A0p("resign_collaborator");
                A0J2.A0i(DbZ.A0b(A0J2, "thread_details", str9, str10, i4));
                A0J2.Cgf();
            }
            obj2 = this.A04;
            ((JPL) obj2).Cfo();
            return;
        }
        C69904Nu6.A00((Context) obj3, dr1.A05);
    }
}
