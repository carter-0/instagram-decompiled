package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import com.instagram.music.common.model.AudioType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ilq  reason: case insensitive filesystem */
public final class C58087Ilq extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58087Ilq(Object obj, Object obj2, Object obj3, String str, String str2, String str3, AnonymousClass4D7 r8, int i) {
        super(2, r8);
        this.A01 = i;
        this.A04 = obj;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Ilq, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        String str;
        String str2;
        Object obj2;
        Object obj3;
        String str3;
        int i;
        int i2 = this.A01;
        Object obj4 = this.A04;
        AnonymousClass4D7 r7 = r11;
        if (i2 != 0) {
            str3 = this.A05;
            obj2 = this.A02;
            str = this.A07;
            str2 = this.A06;
            obj3 = this.A03;
            i = 1;
        } else {
            str = this.A07;
            str2 = this.A06;
            obj2 = this.A02;
            obj3 = this.A03;
            str3 = this.A05;
            i = 0;
        }
        return new C58087Ilq(obj4, obj2, obj3, str, str2, str3, r7, i);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.Ilq, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C59497JLv jLv;
        if (this.A01 != 0) {
            1Hj r1 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                C53044Ghc ghc = (C53044Ghc) this.A04;
                C249513ju r2 = ghc.A0G;
                String str = this.A05;
                AudioType audioType = (AudioType) this.A02;
                String str2 = this.A07;
                String str3 = this.A06;
                AudioPageAssetModel audioPageAssetModel = ghc.A02;
                if (audioPageAssetModel == null) {
                    0qQ.A0F("audioPageAssetModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                HJ0 hj0 = new HJ0((ClipChainType) this.A03, audioType, str, str2, str3, audioPageAssetModel.A05);
                this.A00 = 1;
                if (r2.ELH(hj0, this) == r1) {
                    return r1;
                }
            }
        } else {
            1Hj r12 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                C54435HDk hDk = (C54435HDk) this.A04;
                String str4 = this.A07;
                String str5 = this.A06;
                boolean A1S = DbW.A1S(1, str4, str5);
                C54435HDk.A00(hDk, IQP.A00, str4, str5);
                KS5 ks5 = new KS5(new C53368Gms(1, A1S ? 1 : 0, 16), new BBV(str5, 23), (C61076JwE) this.A02, (C61076JwE) this.A03, this.A05);
                MagicModImageGenerationDataSource magicModImageGenerationDataSource = hDk.A02;
                this.A00 = 1;
                obj = magicModImageGenerationDataSource.A01.AWg(ks5, this);
                if (obj == r12) {
                    return r12;
                }
            }
            Object obj2 = (C239803Ii) obj;
            C54435HDk hDk2 = (C54435HDk) this.A04;
            String str6 = this.A07;
            String str7 = this.A06;
            if (obj2 instanceof C239793Ih) {
                List<C53376Gn6> list = (List) ((C61078JwG) ((C239793Ih) obj2).A00).A00;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (C53376Gn6 A002 : list) {
                    A0r.add(I12.A07.A00(A002, CameraTool.BACKDROP));
                }
                I12 i12 = (I12) 00k.A0J(A0r);
                if (i12 != null) {
                    Dba.A0j(1, str6, str7);
                    jLv = new C53525Gpv(i12);
                } else {
                    Dba.A0j(1, str6, str7);
                    jLv = IQO.A00;
                }
                C54435HDk.A00(hDk2, jLv, str6, str7);
                obj2 = C51967G9n.A0d();
            } else if (!(obj2 instanceof C297815sO)) {
                throw AnonymousClass7TE.A1K();
            }
            if (!(obj2 instanceof C239793Ih)) {
                if (obj2 instanceof C297815sO) {
                    Dba.A0j(1, str6, str7);
                    C54435HDk.A00(hDk2, IQO.A00, str6, str7);
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58087Ilq) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
