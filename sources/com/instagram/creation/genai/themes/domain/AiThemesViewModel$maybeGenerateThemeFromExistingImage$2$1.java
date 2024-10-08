package com.instagram.creation.genai.themes.domain;

import X.00k;
import X.05G;
import X.0eS;
import X.0sP;
import X.19E;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C229632nm;
import X.C239793Ih;
import X.C239803Ii;
import X.C262204Co;
import X.C262224Cq;
import X.C297815sO;
import X.C389799qE;
import X.C53032GhN;
import X.C53390GnN;
import X.C60340gF;
import X.C61045Jvj;
import X.C65364Ls5;
import X.HM3;
import X.MHN;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.genai.themes.domain.AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1", f = "AiThemesViewModel.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
public final class AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C61045Jvj A02;
    public final /* synthetic */ C53032GhN A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ C262224Cq A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1(C61045Jvj jvj, C53032GhN ghN, AnonymousClass4D7 r4, 0sP r5, C262224Cq r6, int i) {
        super(1, r4);
        this.A03 = ghN;
        this.A02 = jvj;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.genai.themes.domain.AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r8) {
        C53032GhN ghN = this.A03;
        return new AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1(this.A02, ghN, r8, this.A04, this.A05, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.creation.genai.themes.domain.AiThemesViewModel$maybeGenerateThemeFromExistingImage$2$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object value;
        C53390GnN gnN;
        Object value2;
        C53390GnN gnN2;
        Object value3;
        C53390GnN gnN3;
        List list;
        List A0i;
        Object obj2;
        1Hj r6 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C53032GhN ghN = this.A03;
            05G r4 = ghN.A0H;
            do {
                value = r4.getValue();
                gnN = (C53390GnN) value;
            } while (!C53390GnN.A02(HM3.GeneratingTheme, gnN, value, gnN.A03, r4));
            C389799qE r5 = ghN.A0B;
            C61045Jvj jvj = this.A02;
            this.A00 = 1;
            obj = 1Eo.A00(this, r5.A01.ArX(), new MHN((Object) jvj, (Object) r5, (AnonymousClass4D7) null, 31));
            if (obj == r6) {
                return r6;
            }
        }
        C239803Ii r10 = (C239803Ii) obj;
        if (19E.A07(this.A05)) {
            if (r10 instanceof C239793Ih) {
                C53032GhN ghN2 = this.A03;
                C262204Co r0 = ghN2.A06;
                if (r0 != null) {
                    r0.AG7((CancellationException) null);
                }
                C65364Ls5 ls5 = ghN2.A02;
                if (ls5 != null) {
                    ls5.A00(100, AnonymousClass05K.A01);
                }
                05G r62 = ghN2.A0H;
                int i = this.A01;
                do {
                    value3 = r62.getValue();
                    gnN3 = (C53390GnN) value3;
                    list = gnN3.A03;
                    A0i = 00k.A0i(list, C229632nm.A0C(0, i));
                    obj2 = ((C239793Ih) r10).A00;
                } while (!C53390GnN.A02(HM3.Success, gnN3, value3, 00k.A0S(00k.A0i(list, C229632nm.A0C(i + 1, list.size())), 00k.A0T(obj2, A0i)), r62));
                Object obj3 = ((C61045Jvj) obj2).A01;
                if (obj3 != null) {
                    this.A04.invoke(obj3);
                }
            } else if (r10 instanceof C297815sO) {
                C53032GhN ghN3 = this.A03;
                C262204Co r02 = ghN3.A06;
                if (r02 != null) {
                    r02.AG7((CancellationException) null);
                }
                C65364Ls5 ls52 = ghN3.A02;
                if (ls52 != null) {
                    ls52.A00(-1, AnonymousClass05K.A0N);
                }
                05G r42 = ghN3.A0H;
                do {
                    value2 = r42.getValue();
                    gnN2 = (C53390GnN) value2;
                } while (!C53390GnN.A02(HM3.Failed, gnN2, value2, gnN2.A03, r42));
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        return C60340gF.A00;
    }
}
