package X;

import android.app.Application;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jfl  reason: case insensitive filesystem */
public final class C60105Jfl extends C361478gI {
    public ImmutableList A00;
    public AudioFilterType A01;
    public Integer A02;
    public final UserSession A03;
    public final AnonymousClass8II A04;
    public final C60099Jff A05;
    public final C3507185x A06;
    public final C354388Lv A07;
    public final ClipsCreationViewModel A08;
    public final AnonymousClass8RF A09;
    public final AnonymousClass8M1 A0A;
    public final C61806KMu A0B;
    public final C3516889w A0C;
    public final AnonymousClass0r6 A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final AnonymousClass0Ud A0G;
    public final C60108Jfo A0H;
    public final AnonymousClass0r6 A0I;
    public final AnonymousClass0r6 A0J;
    public final AnonymousClass0r6 A0K;
    public final AnonymousClass0r6 A0L;
    public final AnonymousClass0r6 A0M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60105Jfl(Application application, UserSession userSession, AnonymousClass8II r10, C60099Jff jff, C3507185x r12, C354388Lv r13, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r15, AnonymousClass8M1 r16, C60108Jfo jfo, C61806KMu kMu, C3516889w r19) {
        super(application);
        0qQ.A0B(application, 1);
        C60108Jfo jfo2 = jfo;
        C51974G9v.A1S(userSession, jfo2, r15, r13, clipsCreationViewModel);
        C61806KMu kMu2 = kMu;
        C3516889w r1 = r19;
        C51974G9v.A1Q(r1, r12, r10, kMu2);
        AnonymousClass8M1 r3 = r16;
        DbW.A1P(r3, 11, jff);
        this.A03 = userSession;
        this.A0H = jfo2;
        this.A09 = r15;
        this.A07 = r13;
        this.A08 = clipsCreationViewModel;
        this.A0C = r1;
        this.A06 = r12;
        this.A04 = r10;
        this.A0B = kMu2;
        this.A0A = r3;
        this.A05 = jff;
        02z A012 = 106.A01((Object) null);
        this.A0E = A012;
        this.A0G = A012;
        02z A013 = 106.A01(r15.A0E());
        this.A0F = A013;
        MCA A002 = MCA.A00(this, C66193MHj.A01(r13.A08, A013, 16), 33);
        this.A0K = A002;
        MCA A003 = MCA.A00(this, A013, 34);
        this.A0L = A003;
        C61820pm A014 = C66193MHj.A01(C66193MHj.A01(A013, r3.A07, 14), r3.A05, 15);
        this.A0J = A014;
        C61820pm A015 = C66193MHj.A01(r10.A0G, A013, 13);
        this.A0I = A015;
        C61820pm A016 = C66193MHj.A01(A013, jff.A01, 17);
        this.A0M = A016;
        this.A0D = 10q.A04(new AnonymousClass0r6[]{A002, A003, A014, A015, A016});
    }

    public static final ImmutableList A00(AnonymousClass8RH r5, C60105Jfl jfl) {
        ImmutableList immutableList;
        C355828Rn r52;
        if ((r5 instanceof C355828Rn) && (r52 = (C355828Rn) r5) != null) {
            int i = r52.A00;
            if (Integer.valueOf(i) != null) {
                if (i == -1) {
                    List<AudioOverlayTrack> A0N = jfl.A08.A0N();
                    ArrayList A0r = AnonymousClass7TG.A0r(A0N);
                    for (AudioOverlayTrack audioOverlayTrack : A0N) {
                        JTP.A1V(A0r, audioOverlayTrack.A00);
                    }
                    C3507185x r1 = jfl.A06;
                    Float valueOf = Float.valueOf(r1.A0E());
                    ClipsAudioStore clipsAudioStore = r1.A01;
                    ArrayList A1M = 0sr.A1M(new Float[]{valueOf, Float.valueOf(JTR.A03(clipsAudioStore.A0n)), Float.valueOf(JTR.A03(clipsAudioStore.A0g)), Float.valueOf(JTR.A03(clipsAudioStore.A0i))});
                    A1M.addAll(A0r);
                    return DbU.A0K(A1M);
                }
                Float A0H2 = jfl.A08.A0H(i);
                if (A0H2 != null) {
                    immutableList = ImmutableList.of(A0H2);
                    0qQ.A07(immutableList);
                    return immutableList;
                }
            }
        }
        immutableList = ImmutableList.of();
        0qQ.A07(immutableList);
        return immutableList;
    }

    public final void A0E() {
        AnonymousClass8RH A0J2;
        int i;
        int i2;
        int i3;
        05G r2 = this.A0E;
        Object value = r2.getValue();
        C62458Kg8 kg8 = C62458Kg8.HIDDEN;
        if (value != kg8) {
            r2.Epw(kg8);
            AnonymousClass8RF r22 = this.A09;
            AnonymousClass8RH A0E2 = r22.A0E();
            if (A0E2 instanceof C355818Rm) {
                C354388Lv r10 = this.A07;
                List list = r10.A06;
                synchronized (list) {
                    UserSession userSession = r10.A02;
                    C64168LRo A002 = C59953JcJ.A00(userSession);
                    synchronized (A002) {
                    }
                    list.clear();
                    r10.A01 = false;
                    Application A0D2 = r10.A0D();
                    List list2 = r10.A04;
                    ArrayList A0r = AnonymousClass7TG.A0r(list2);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        A0r.add(new C63695L3f(C64925LkQ.A00, AnonymousClass7TG.A0F(it)));
                    }
                    A002.A06(A0D2, A0r);
                    C59953JcJ.A01(userSession, JTR.A0P(r10));
                }
                A0J2 = JTQ.A0J();
            } else if (A0E2 instanceof C355838Ro) {
                C355838Ro r3 = (C355838Ro) A0E2;
                A0J2 = new C355858Rq(r3.A01, r3.A00, r3.A02);
            } else {
                if (A0E2 instanceof C355758Rg) {
                    C355758Rg r32 = (C355758Rg) A0E2;
                    i2 = r32.A00;
                    i3 = r32.A01;
                } else {
                    if (!(A0E2 instanceof KM7)) {
                        if (A0E2 instanceof C355828Rn) {
                            C355828Rn r33 = (C355828Rn) A0E2;
                            C53368Gms gms = r33.A01;
                            if (gms != null) {
                                A0J2 = new C355748Rf(gms.A00, gms.A01);
                            } else {
                                i = r33.A00;
                                if (i == -1) {
                                    C53368Gms gms2 = r33.A03;
                                    if (gms2 != null) {
                                        i3 = gms2.A01;
                                        i2 = gms2.A00;
                                    }
                                }
                            }
                        } else if (A0E2 instanceof C355748Rf) {
                            return;
                        } else {
                            if (A0E2 instanceof AnonymousClass8RR) {
                                i = ((AnonymousClass8RR) A0E2).A00;
                            } else if (A0E2 instanceof C355798Rk) {
                                C355798Rk r34 = (C355798Rk) A0E2;
                                int i4 = r34.A00;
                                if (i4 != -1) {
                                    A0J2 = new C355748Rf(i4, r34.A01);
                                } else {
                                    return;
                                }
                            } else {
                                if (A0E2 instanceof KM1) {
                                    KM1 km1 = (KM1) A0E2;
                                    Integer num = km1.A02;
                                    if (num == AnonymousClass05K.A00) {
                                        i = km1.A00;
                                    } else if (num == AnonymousClass05K.A0C) {
                                        i2 = km1.A00;
                                        i3 = km1.A01;
                                    } else {
                                        return;
                                    }
                                }
                                A0J2 = JTQ.A0J();
                            }
                        }
                        A0J2 = new C355868Rr(i);
                    }
                    if (182.A06(0Tu.A05, this.A03, 36327202756966630L)) {
                        A0J2 = new KM9(-1);
                    } else {
                        A0J2 = JTQ.A0J();
                    }
                }
                A0J2 = new C355758Rg(i2, i3);
            }
            r22.A0G(A0J2);
        }
    }
}
