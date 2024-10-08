package com.instagram.direct.fragment.prompts.challenges.duration;

import X.05G;
import X.0Tu;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.182;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C60340gF;
import X.C61079JwH;
import X.C69369Nk9;
import X.C69373NkD;
import X.DbT;
import X.N4R;
import X.NIN;
import X.O6O;
import com.instagram.igds.components.textcell.IgdsListCell;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.fragment.prompts.challenges.duration.ChallengeDurationSelectorFragment$configureOptions$8", f = "ChallengeDurationSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChallengeDurationSelectorFragment$configureOptions$8 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ NIN A01;
    public final /* synthetic */ IgdsListCell A02;
    public final /* synthetic */ IgdsListCell A03;
    public final /* synthetic */ IgdsListCell A04;
    public final /* synthetic */ IgdsListCell A05;
    public final /* synthetic */ IgdsListCell A06;
    public final /* synthetic */ IgdsListCell A07;
    public final /* synthetic */ IgdsListCell A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeDurationSelectorFragment$configureOptions$8(NIN nin, IgdsListCell igdsListCell, IgdsListCell igdsListCell2, IgdsListCell igdsListCell3, IgdsListCell igdsListCell4, IgdsListCell igdsListCell5, IgdsListCell igdsListCell6, IgdsListCell igdsListCell7, AnonymousClass4D7 r10) {
        super(2, r10);
        this.A04 = igdsListCell;
        this.A08 = igdsListCell2;
        this.A02 = igdsListCell3;
        this.A07 = igdsListCell4;
        this.A01 = nin;
        this.A06 = igdsListCell5;
        this.A03 = igdsListCell6;
        this.A05 = igdsListCell7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.fragment.prompts.challenges.duration.ChallengeDurationSelectorFragment$configureOptions$8, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        ? challengeDurationSelectorFragment$configureOptions$8 = new ChallengeDurationSelectorFragment$configureOptions$8(this.A01, this.A04, this.A08, this.A02, this.A07, this.A06, this.A03, this.A05, r12);
        challengeDurationSelectorFragment$configureOptions$8.A00 = obj;
        return challengeDurationSelectorFragment$configureOptions$8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChallengeDurationSelectorFragment$configureOptions$8) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        C69373NkD nkD;
        String str;
        0eS.A00(obj);
        N4R n4r = (N4R) this.A00;
        boolean z = true;
        this.A04.setChecked(AnonymousClass7TF.A1W(n4r.A02, C69369Nk9.ONE_DAY));
        IgdsListCell igdsListCell = this.A08;
        C69369Nk9 nk9 = (C69369Nk9) n4r.A02;
        igdsListCell.setChecked(AnonymousClass7TF.A1W(nk9, C69369Nk9.THREE_DAYS));
        this.A02.setChecked(AnonymousClass7TF.A1W(nk9, C69369Nk9.FIVE_DAYS));
        this.A07.setChecked(AnonymousClass7TF.A1W(nk9, C69369Nk9.SEVEN_DAYS));
        NIN nin = this.A01;
        if (182.A06(0Tu.A05, DbT.A0X(nin.A02), 36324312244105182L)) {
            this.A06.setChecked(AnonymousClass7TF.A1W(nk9, C69369Nk9.ONE_MIN));
            this.A03.setChecked(AnonymousClass7TF.A1W(nk9, C69369Nk9.FIVE_MIN));
            IgdsListCell igdsListCell2 = this.A05;
            if (nk9 != C69369Nk9.ONE_HOUR) {
                z = false;
            }
            igdsListCell2.setChecked(z);
        }
        O6O o6o = nin.A00;
        if (o6o == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0B(nk9, 0);
        05G r4 = o6o.A00.A04().A00;
        do {
            value = r4.getValue();
            C61079JwH jwH = (C61079JwH) value;
            nkD = (C69373NkD) jwH.A01;
            str = jwH.A02;
            AnonymousClass7TG.A1O(nkD, str);
        } while (!r4.AIY(value, new C61079JwH(nk9, nkD, str)));
        return C60340gF.A00;
    }
}
