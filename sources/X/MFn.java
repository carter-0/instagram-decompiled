package X;

import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureAnimatedMediaMessageMutationFactory;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class MFn extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFn(0xF r2, AnonymousClass797 r3, C254703su r4, C74551Pwk pwk, 1gD r6, C65701gB r7, AnonymousClass4D7 r8, boolean z) {
        super(2, r8);
        this.A02 = 0;
        this.A01 = r6;
        this.A05 = r7;
        this.A06 = r4;
        this.A08 = z;
        this.A03 = r3;
        this.A04 = pwk;
        this.A07 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MFn, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.MFn, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r20) {
        AnonymousClass4D7 r8 = r20;
        switch (this.A02) {
            case 0:
                C254703su r12 = (C254703su) this.A06;
                boolean z = this.A08;
                AnonymousClass797 r11 = (AnonymousClass797) this.A03;
                C74551Pwk pwk = (C74551Pwk) this.A04;
                return new MFn((0xF) this.A07, r11, r12, pwk, (1gD) this.A01, (C65701gB) this.A05, r8, z);
            case 1:
                return new MFn(this.A03, this.A05, this.A06, this.A04, this.A07, r8, 1, this.A08);
            default:
                ? mFn = new MFn(this.A03, this.A05, this.A06, this.A04, this.A07, r8, 2, this.A08);
                mFn.A01 = obj;
                return mFn;
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.MFn, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        XRY xry;
        Object obj2 = obj;
        switch (this.A02) {
            case 0:
                1Hj r2 = 1Hj.A02;
                if (this.A00 != 0) {
                    0eS.A00(obj2);
                } else {
                    0eS.A00(obj2);
                    1gD r7 = (1gD) this.A01;
                    C65701gB r5 = (C65701gB) this.A05;
                    C254703su r4 = (C254703su) this.A06;
                    boolean z = this.A08;
                    AnonymousClass797 r3 = (AnonymousClass797) this.A03;
                    this.A00 = 1;
                    if (r5.Aqm() == 2FW.A0K) {
                        obj2 = new DirectConfigureAnimatedMediaMessageMutationFactory(r7.A00).A00(r3, r4, r5, this);
                    } else if (r5.Aqm() == 2FW.A1A) {
                        obj2 = new DirectConfigureMediaMessageMutationFactory(r7.A00).A03(r3, r4, r5, this);
                    } else if (r4.A1a()) {
                        obj2 = new DirectConfigureMediaCollectionMessageMutationFactory(r7.A00).A02(r4, r5, this, z);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == r2) {
                        return r2;
                    }
                }
                1OS r32 = (1OS) obj2;
                if (r32 == null) {
                    ((C74551Pwk) this.A04).DTM(C270214gN.A0G, (String) null);
                } else {
                    1Ou A012 = 1Ou.A01(((1gD) this.A01).A00);
                    AnonymousClass1cH r22 = (AnonymousClass1cH) A012.A09.A01(r32.A02()).A04.getValue();
                    0qQ.A07(r22);
                    r22.EM9((0xF) this.A07, (C74551Pwk) this.A04, r32);
                }
                return C60340gF.A00;
            case 1:
                1Hj r23 = 1Hj.A02;
                if (this.A00 != 0) {
                    xry = (XRY) this.A01;
                    0eS.A00(obj2);
                } else {
                    0eS.A00(obj2);
                    0eP r0 = (0eP) this.A05;
                    xry = (XRY) r0.A00;
                    C21251XQw xQw = (C21251XQw) this.A06;
                    String name = xry.name();
                    AnonymousClass7TG.A1N(xQw, name);
                    ((LGF) ((SettingsScreenViewModel) this.A03).A0E.getValue()).A00.markerPoint(827064321, xQw.hashCode(), "section_load_begin", name);
                    I4T i4t = (I4T) this.A04;
                    C53400GnX A002 = i4t.A00(xry);
                    SettingsSession settingsSession = (SettingsSession) this.A07;
                    boolean z2 = this.A08;
                    this.A01 = xry;
                    this.A00 = 1;
                    obj2 = UiStateKt.A00(A002, settingsSession, i4t, (List) r0.A01, this, z2);
                    if (obj2 == r23) {
                        return r23;
                    }
                }
                C21251XQw xQw2 = (C21251XQw) this.A06;
                String name2 = xry.name();
                AnonymousClass7TG.A1N(xQw2, name2);
                ((LGF) ((SettingsScreenViewModel) this.A03).A0E.getValue()).A00.markerPoint(827064321, xQw2.hashCode(), "section_load_end", name2);
                return obj2;
            default:
                1Hj r42 = 1Hj.A02;
                if (this.A00 != 0) {
                    0eS.A00(obj2);
                } else {
                    0eS.A00(obj2);
                    C262224Cq r52 = (C262224Cq) this.A01;
                    SettingsScreenViewModel settingsScreenViewModel = (SettingsScreenViewModel) this.A03;
                    C21251XQw xQw3 = (C21251XQw) this.A05;
                    settingsScreenViewModel.A08(xQw3, true);
                    try {
                        List<Object> list = (List) this.A06;
                        Object obj3 = this.A04;
                        Object obj4 = this.A07;
                        boolean z3 = this.A08;
                        ArrayList A0r = AnonymousClass7TG.A0r(list);
                        for (Object mFn : list) {
                            JTQ.A1M(A0r, new MFn((Object) settingsScreenViewModel, mFn, (Object) xQw3, obj3, obj4, (AnonymousClass4D7) null, 1, AnonymousClass7TF.A1P(z3 ? 1 : 0)), r52);
                        }
                        this.A00 = 1;
                        obj2 = AnonymousClass42T.A00(A0r, this);
                        if (obj2 == r42) {
                            return r42;
                        }
                    } catch (CancellationException e) {
                        ((SettingsScreenViewModel) this.A03).A07((C21251XQw) this.A05, e.toString(), false);
                        throw e;
                    }
                }
                List list2 = (List) obj2;
                ((SettingsScreenViewModel) this.A03).A07((C21251XQw) this.A05, (String) null, true);
                return new HEP(list2, false);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFn) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, AnonymousClass4D7 r7, int i, boolean z) {
        super(2, r7);
        this.A02 = i;
        this.A03 = obj;
        this.A05 = obj2;
        this.A06 = obj3;
        this.A04 = obj4;
        this.A07 = obj5;
        this.A08 = z;
    }
}
