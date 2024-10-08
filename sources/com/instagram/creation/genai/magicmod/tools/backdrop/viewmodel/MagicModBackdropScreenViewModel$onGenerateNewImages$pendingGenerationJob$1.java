package com.instagram.creation.genai.magicmod.tools.backdrop.viewmodel;

import X.00k;
import X.05G;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass62P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.BBV;
import X.C239793Ih;
import X.C239803Ii;
import X.C297815sO;
import X.C318116oQ;
import X.C51971G9r;
import X.C52973GgQ;
import X.C53368Gms;
import X.C53376Gn6;
import X.C53395GnS;
import X.C54436HDl;
import X.C55509Hir;
import X.C60340gF;
import X.C61076JwE;
import X.C61078JwG;
import X.C61084JwM;
import X.DbS;
import X.DbU;
import X.G9w;
import X.HBS;
import X.HMG;
import X.I12;
import X.KS5;
import X.L82;
import com.instagram.api.schemas.CameraTool;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.genai.magicmod.tools.backdrop.viewmodel.MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1", f = "MagicModBackdropScreenViewModel.kt", i = {}, l = {854}, m = "invokeSuspend", n = {}, s = {})
public final class MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C61076JwE A02;
    public final /* synthetic */ C61076JwE A03;
    public final /* synthetic */ C52973GgQ A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1(C61076JwE jwE, C61076JwE jwE2, C52973GgQ ggQ, String str, List list, AnonymousClass4D7 r7, int i, boolean z) {
        super(2, r7);
        this.A05 = str;
        this.A04 = ggQ;
        this.A01 = i;
        this.A02 = jwE;
        this.A03 = jwE2;
        this.A07 = z;
        this.A06 = list;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.genai.magicmod.tools.backdrop.viewmodel.MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        String str = this.A05;
        C52973GgQ ggQ = this.A04;
        int i = this.A01;
        return new MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1(this.A02, this.A03, ggQ, str, this.A06, r11, i, this.A07);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.creation.genai.magicmod.tools.backdrop.viewmodel.MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            BBV bbv = new BBV(this.A05, 23);
            C52973GgQ ggQ = this.A04;
            KS5 ks5 = new KS5(new C53368Gms(this.A01, DbS.A05(C54436HDl.A00(C52973GgQ.A00(ggQ)).A02.getValue()), 16), bbv, this.A02, this.A03, ggQ.A07.A00.A03);
            this.A00 = 1;
            obj = ((MagicModImageGenerationDataSource) ggQ.A0C.getValue()).A01.AWg(ks5, this);
            if (obj == r2) {
                return r2;
            }
        }
        Object obj2 = (C239803Ii) obj;
        C52973GgQ ggQ2 = this.A04;
        boolean z = this.A07;
        if (!(obj2 instanceof C239793Ih)) {
            if (obj2 instanceof C297815sO) {
                C52973GgQ.A07(ggQ2, (C55509Hir) ((C297815sO) obj2).A00, z);
                05G r3 = ggQ2.A0I;
                do {
                    value3 = r3.getValue();
                } while (!r3.AIY(value3, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, (I12) null, (L82) null, (HMG) null, (C53395GnS) value3, (Integer) null, (AnonymousClass62P) null, 0, 98303, false, false, false)));
                r3.getValue();
                obj2 = DbU.A0f();
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        List list = this.A06;
        if (obj2 instanceof C239793Ih) {
            List<C53376Gn6> list2 = (List) ((C61078JwG) ((C239793Ih) obj2).A00).A00;
            ArrayList A0r = AnonymousClass7TG.A0r(list2);
            for (C53376Gn6 A002 : list2) {
                A0r.add(I12.A07.A00(A002, CameraTool.BACKDROP));
            }
            if (A0r.isEmpty()) {
                C52973GgQ.A07(ggQ2, HBS.A00, z);
            } else {
                C52973GgQ.A0A(ggQ2, 00k.A0S(A0r, list), z);
            }
            05G r32 = ggQ2.A0I;
            do {
                value = r32.getValue();
            } while (!r32.AIY(value, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, (I12) null, (L82) null, (HMG) null, (C53395GnS) value, (Integer) null, (AnonymousClass62P) null, 0, 98303, false, false, false)));
            if (G9w.A0X(r32).A0D) {
                C51971G9r.A1Q(ggQ2, C318116oQ.A00(ggQ2), 35);
                do {
                    value2 = r32.getValue();
                } while (!r32.AIY(value2, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, (I12) null, (L82) null, (HMG) null, (C53395GnS) value2, (Integer) null, (AnonymousClass62P) null, 0, 65535, false, false, false)));
            }
        } else if (!(obj2 instanceof C297815sO)) {
            throw AnonymousClass7TE.A1K();
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
