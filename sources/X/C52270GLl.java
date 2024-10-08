package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONArray;

@DebugMetadata(c = "instagram.features.clips.midcard.ClipsMidcardFetcher$fetchMidcardFromNetwork$2", f = "ClipsMidcardFetcher.kt", i = {}, l = {108, 110}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.GLl  reason: case insensitive filesystem */
public final class C52270GLl extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C229352nF A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ GD6 A06;
    public final /* synthetic */ C54575HJk A07;
    public final /* synthetic */ C52012GBj A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ JSONArray A0A;
    public final /* synthetic */ JSONArray A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52270GLl(Context context, C229352nF r3, UserSession userSession, GD6 gd6, C54575HJk hJk, C52012GBj gBj, String str, AnonymousClass4D7 r9, JSONArray jSONArray, JSONArray jSONArray2, int i, int i2) {
        super(1, r9);
        this.A05 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A0A = jSONArray;
        this.A0B = jSONArray2;
        this.A03 = context;
        this.A06 = gd6;
        this.A07 = hJk;
        this.A08 = gBj;
        this.A04 = r3;
        this.A09 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.GLl] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r14) {
        UserSession userSession = this.A05;
        int i = this.A02;
        int i2 = this.A01;
        JSONArray jSONArray = this.A0A;
        JSONArray jSONArray2 = this.A0B;
        return new C52270GLl(this.A03, this.A04, userSession, this.A06, this.A07, this.A08, this.A09, r14, jSONArray, jSONArray2, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C52270GLl) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.4D7, X.GLl] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1Hj r2 = X.1Hj.A02
            int r0 = r13.A00
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 == r6) goto L_0x0081
            X.0eS.A00(r14)
        L_0x000d:
            X.3Ih r14 = X.C51967G9n.A0d()
        L_0x0011:
            boolean r0 = r14 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0032
            boolean r0 = r14 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b2
            X.0wj r2 = X.0wj.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsMidcardFetcher"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Mid card request failed"
            r2.ABQ(r1, r0)
            r2.report()
            X.5sO r14 = X.DbU.A0f()
        L_0x0032:
            return r14
        L_0x0033:
            X.0eS.A00(r14)
            com.instagram.common.session.UserSession r0 = r13.A05
            int r11 = r13.A02
            int r10 = r13.A01
            org.json.JSONArray r1 = r13.A0A
            org.json.JSONArray r9 = r13.A0B
            r5 = 0
            X.AnonymousClass7TF.A1C(r0, r5, r1)
            r8 = 0
            r7 = r8
            X.1NY r4 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "clips/mid_cards/"
            r4.A0A(r0)
            java.lang.String r0 = "start_position"
            r4.A0C(r0, r11)
            java.lang.String r0 = "end_position"
            r4.A0C(r0, r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ads_position"
            r4.A9m(r0, r1)
            if (r9 == 0) goto L_0x0068
            java.lang.String r8 = r9.toString()
        L_0x0068:
            java.lang.String r0 = "moment_ids"
            r4.A0G(r0, r8)
            java.lang.Class<X.B5G> r1 = X.B5G.class
            java.lang.Class<X.B5F> r0 = X.B5F.class
            X.1OC r1 = X.DbT.A0R(r7, r4, r1, r0, r5)
            r13.A00 = r6
            r0 = 1394228119(0x531a3b97, float:6.6242472E11)
            java.lang.Object r14 = r1.A02(r13, r0, r3, r5)
            if (r14 != r2) goto L_0x0084
            return r2
        L_0x0081:
            X.0eS.A00(r14)
        L_0x0084:
            X.3Ii r14 = (X.C239803Ii) r14
            android.content.Context r5 = r13.A03
            X.GD6 r9 = r13.A06
            X.HJk r10 = r13.A07
            X.GBj r11 = r13.A08
            com.instagram.common.session.UserSession r7 = r13.A05
            X.2nF r6 = r13.A04
            java.lang.String r12 = r13.A09
            boolean r0 = r14 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a9
            X.3Ih r14 = (X.C239793Ih) r14
            java.lang.Object r8 = r14.A00
            X.B5G r8 = (X.B5G) r8
            X.GNV r4 = X.GNV.A00
            r13.A00 = r3
            java.lang.Object r0 = r4.A04(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r2) goto L_0x000d
            return r2
        L_0x00a9:
            boolean r0 = r14 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0011
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52270GLl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
