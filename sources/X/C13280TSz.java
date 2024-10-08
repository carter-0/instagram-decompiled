package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.LinkedHashMap;

/* renamed from: X.TSz  reason: case insensitive filesystem */
public final class C13280TSz extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13280TSz(Object obj, Object obj2, String str, String str2, String str3, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.TSz, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        String str;
        String str2;
        String str3;
        Object obj2;
        Object obj3;
        int i;
        AnonymousClass4D7 r6 = r10;
        if (this.A00 != 0) {
            obj2 = this.A02;
            str3 = this.A03;
            str = this.A05;
            str2 = this.A04;
            obj3 = this.A01;
            i = 1;
        } else {
            str = this.A05;
            str2 = this.A04;
            str3 = this.A03;
            obj2 = this.A02;
            obj3 = this.A01;
            i = 0;
        }
        return new C13280TSz(obj2, obj3, str3, str, str2, r6, i);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Rex, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        0eS.A00(obj);
        if (i != 0) {
            C55672HlV hlV = ((C54430HDc) this.A02).A00;
            String str = this.A03;
            String str2 = this.A05;
            String str3 = this.A04;
            Object obj2 = this.A01;
            0qQ.A0B(str, 0);
            DbZ.A0t(1, str2, str3, obj2);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            2IV A0R = Pxe.A0R();
            A0R.A09(str3, "parent_clip_id");
            0Df.A00(A0R.A02(), Double.valueOf((double) System.currentTimeMillis()), C273654mx.A00(2245));
            2IV A0R2 = Pxe.A0R();
            A0R2.A09(str2, "element_id");
            A0R2.A09("TEXT", AnonymousClass000.A00(4737));
            Pxf.A1E(C41845B3m.A03(GraphQlCallInput.A02, str, "new_text"), A0R2, AnonymousClass000.A00(5314));
            A0R.A05("swapped_elements", AnonymousClass7TE.A1I(A0R2));
            A042.A00(A0R, "input");
            C12090Smk.A00(C12096Smq.A00, new PandoGraphQLRequest(C41845B3m.A05(), "CreateClipsSpin", A042.getParamsCopy(), A043.getParamsCopy(), C76.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_create_clips_spin", AnonymousClass7TE.A1C()), hlV.A01, obj2, 16);
        } else {
            Object obj3 = this.A02;
            String str4 = this.A03;
            C11635Sdd sdd = new C11635Sdd(obj3, this.A01, str4, 3);
            ? obj4 = new Object();
            String str5 = this.A05;
            String str6 = this.A04;
            AnonymousClass7TG.A1T(str5, str6, str4);
            C2818659w r3 = new C2818659w();
            String A0i = 002.A0i("proof.", str4, str6, '.');
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            A1H.put("secret_and_key", A0i);
            A1H.put("device_key", str4);
            C7422QCn A012 = SQA.A01(C10448RsP.A00("secret_and_key", A1H));
            0qQ.A07(A012);
            SUj.A0H(A012, new C11636Sde(r3, obj4, str5, str4));
            new AnonymousClass5A6(r3).A06(Pxm.A08, sdd);
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C13280TSz) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
