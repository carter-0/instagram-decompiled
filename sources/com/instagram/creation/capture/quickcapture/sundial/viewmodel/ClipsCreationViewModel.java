package com.instagram.creation.capture.quickcapture.sundial.viewmodel;

import X.002;
import X.00k;
import X.01N;
import X.055;
import X.05D;
import X.05G;
import X.0Tu;
import X.0V1;
import X.0V2;
import X.0Yv;
import X.0eP;
import X.0jo;
import X.0kD;
import X.0qQ;
import X.0sn;
import X.0sr;
import X.106;
import X.10D;
import X.10q;
import X.182;
import X.19B;
import X.1Eo;
import X.2Fk;
import X.2Nn;
import X.AEH;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0qC;
import X.AnonymousClass0r6;
import X.AnonymousClass10H;
import X.AnonymousClass12T;
import X.AnonymousClass2Fj;
import X.AnonymousClass2gB;
import X.AnonymousClass30D;
import X.AnonymousClass4D7;
import X.AnonymousClass51M;
import X.AnonymousClass51N;
import X.AnonymousClass51O;
import X.AnonymousClass51R;
import X.AnonymousClass5MI;
import X.AnonymousClass831;
import X.AnonymousClass832;
import X.AnonymousClass833;
import X.AnonymousClass835;
import X.AnonymousClass836;
import X.AnonymousClass83H;
import X.AnonymousClass83I;
import X.AnonymousClass83R;
import X.AnonymousClass8A1;
import X.AnonymousClass8A2;
import X.AnonymousClass8J0;
import X.AnonymousClass8JI;
import X.AnonymousClass8N6;
import X.AnonymousClass8QI;
import X.AnonymousClass8Y4;
import X.AnonymousClass9K3;
import X.AnonymousClass9KC;
import X.AnonymousClass9KX;
import X.AnonymousClass9RH;
import X.AnonymousClass9RI;
import X.C226292g8;
import X.C262204Co;
import X.C262224Cq;
import X.C268714ds;
import X.C2801950r;
import X.C293505kq;
import X.C318116oQ;
import X.C318136oS;
import X.C321016tR;
import X.C347017w8;
import X.C3495780x;
import X.C3495880y;
import X.C3495980z;
import X.C3500282x;
import X.C3500482z;
import X.C3500783d;
import X.C3501283j;
import X.C3501383k;
import X.C3501483l;
import X.C3501583m;
import X.C3501683n;
import X.C351888Av;
import X.C353538Ia;
import X.C357588Yu;
import X.C357618Yx;
import X.C359548d5;
import X.C361268fw;
import X.C361278fx;
import X.C361348g5;
import X.C361478gI;
import X.C376429Hy;
import X.C376699Iz;
import X.C377089Km;
import X.C381709cC;
import X.C388389nk;
import X.C390749rm;
import X.C394689yW;
import X.C59798JYr;
import X.C61770pa;
import X.C62320sa;
import X.C65107LnV;
import X.GTT;
import X.KN4;
import X.LSY;
import X.M1Y;
import X.MF2;
import X.MGV;
import android.app.Application;
import android.graphics.drawable.Drawable;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.api.schemas.CreationToolEnum;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;

public final class ClipsCreationViewModel extends C361478gI implements C3500282x {
    public CreationToolEnum A00;
    public AnonymousClass8QI A01;
    public C351888Av A02;
    public C2801950r A03 = C2801950r.CLIPS;
    public AudioOverlayTrack A04;
    public Integer A05;
    public C62320sa A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final 2Fk A0A;
    public final 2Fk A0B;
    public final 2Fk A0C;
    public final 2Fk A0D;
    public final 2Fk A0E;
    public final AnonymousClass2gB A0F;
    public final AnonymousClass2gB A0G;
    public final AnonymousClass2Fj A0H = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A0I = new AnonymousClass2Fj();
    public final UserSession A0J;
    public final ClipsAudioStore A0K;
    public final AnonymousClass83H A0L;
    public final AnonymousClass83I A0M;
    public final C3500783d A0N;
    public final AnonymousClass836 A0O;
    public final AnonymousClass83R A0P;
    public final C3501583m A0Q;
    public final 2Nn A0R;
    public final String A0S;
    public final AnonymousClass0eM A0T;
    public final AnonymousClass0r6 A0U;
    public final 0V2 A0V;
    public final 0V2 A0W;
    public final 0V2 A0X;
    public final 0V2 A0Y;
    public final 05G A0Z;
    public final C61770pa A0a;
    public final C61770pa A0b;
    public final AnonymousClass0Ud A0c;
    public final 2Fk A0d;
    public final AnonymousClass833 A0e;
    public final C3500482z A0f;
    public final C3495780x A0g;
    public final AnonymousClass0r6 A0h;
    public final AnonymousClass0r6 A0i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsCreationViewModel(Application application, UserSession userSession, C3500482z r17, C3495780x r18, 2Nn r19) {
        super(application);
        C3495780x r2 = r18;
        0qQ.A0B(r2, 3);
        2Nn r0 = r19;
        0qQ.A0B(r0, 4);
        C3500482z r3 = r17;
        0qQ.A0B(r3, 5);
        UserSession userSession2 = userSession;
        this.A0J = userSession2;
        this.A0g = r2;
        this.A0R = r0;
        this.A0f = r3;
        AnonymousClass2gB r12 = new AnonymousClass2gB();
        r12.A0B(new AnonymousClass831(0sn.A00, false));
        this.A0G = r12;
        AnonymousClass2gB r10 = new AnonymousClass2gB();
        this.A0F = r10;
        Integer num = AnonymousClass05K.A00;
        this.A0W = 10D.A01(num, 0, 0);
        this.A06 = AnonymousClass832.A00;
        this.A0Z = 106.A01((Object) null);
        this.A05 = AnonymousClass05K.A0C;
        05D A012 = 10D.A01(num, 0, 0);
        this.A0V = A012;
        this.A0U = A012;
        String obj = UUID.randomUUID().toString();
        this.A0S = obj;
        this.A0e = new AnonymousClass833(userSession2);
        AnonymousClass836 r1 = r3.A00(obj).A05;
        this.A0O = r1;
        this.A0c = r1.A03;
        ClipsAudioStore clipsAudioStore = r3.A00(obj).A01;
        this.A0K = clipsAudioStore;
        this.A0M = r3.A00(obj).A03;
        AnonymousClass83R r4 = r3.A00(obj).A06;
        this.A0P = r4;
        this.A0L = r3.A00(obj).A02;
        C3500783d r32 = r3.A00(obj).A04;
        this.A0N = r32;
        2Fk r5 = r1.A00;
        r12.A0E(r5, new C3501283j(new C377089Km(this, 4)));
        r10.A0E(r5, new C3501283j(new C377089Km(this, 5)));
        this.A0E = clipsAudioStore.A07;
        AnonymousClass0Ud r6 = r4.A05;
        this.A0i = r6;
        05D A013 = 10D.A01(num, 0, 0);
        this.A0Y = A013;
        05D A014 = 10D.A01(num, 0, 0);
        this.A0X = A014;
        055 A042 = 10q.A04(new AnonymousClass0r6[]{A014, r6});
        this.A0h = A042;
        this.A0a = new 0V1((C262204Co) null, A013);
        C3501383k r02 = new C3501383k(new AnonymousClass0qC(AnonymousClass10H.A03(new AnonymousClass9KC(this, (AnonymousClass4D7) null, 1), A013, A042)));
        19B r52 = 19B.A00;
        this.A0A = C226292g8.A00(r52, r02);
        this.A0C = C226292g8.A00(r52, r6);
        this.A0D = C226292g8.A00(r52, r4.A06);
        this.A0d = C226292g8.A00(r52, r4.A07);
        this.A0T = AnonymousClass0eN.A01(C3501483l.A00);
        this.A0Q = new C3501583m(this);
        0V1 r42 = new 0V1((C262204Co) null, r32.A09);
        this.A0b = r42;
        C3500783d r03 = this.A0N;
        this.A0B = C226292g8.A00(r52, new C3501683n(10q.A04(new AnonymousClass0r6[]{r03.A05, r03.A06, r03.A07, r03.A08, r42})));
    }

    public final void A0V(C376699Iz r6, String str) {
        Object obj;
        0qQ.A0B(str, 0);
        C3500783d r4 = this.A0N;
        Iterator it = r4.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass5MI) obj).getId(), str)) {
                break;
            }
        }
        AnonymousClass5MI r3 = (AnonymousClass5MI) obj;
        if (r3 != null) {
            C65107LnV lnV = new C65107LnV(r3);
            r3.EpP(r6);
            r4.A09.FIA(new 0eP(lnV, r3));
        }
    }

    public final void A0W(UserSession userSession, VoiceOption voiceOption, String str, String str2, int i) {
        String str3 = str;
        0qQ.A0B(str, 1);
        String str4 = str2;
        0qQ.A0B(str4, 3);
        VoiceOption voiceOption2 = voiceOption;
        0qQ.A0B(voiceOption, 4);
        ClipsAudioStore clipsAudioStore = this.A0K;
        C262204Co r0 = clipsAudioStore.A01;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        C262224Cq r1 = clipsAudioStore.A0E;
        clipsAudioStore.A01 = 1Eo.A04(19B.A00, new MF2(clipsAudioStore, userSession, voiceOption2, str3, str4, (String) null, (AnonymousClass4D7) null, i, 0), r1);
    }

    public final void A0b(C361278fx r4, boolean z) {
        C359548d5 r1;
        AudioOverlayTrack audioOverlayTrack;
        if (z && r4.A00 != 0) {
            String str = null;
            if (A0n()) {
                C361278fx r0 = (C361278fx) this.A0K.A06.A02();
                if (!(r0 == null || (audioOverlayTrack = (AudioOverlayTrack) r0.A00()) == null)) {
                    str = audioOverlayTrack.A0A;
                }
                if (!0qQ.A0K(str, ((AudioOverlayTrack) r4.A00()).A0A)) {
                    r1 = C359548d5.AUDIO_REPLACE;
                }
            } else {
                r1 = C359548d5.AUDIO_ADD;
            }
            A03(r1, this, true);
        }
        A02(r4, (AudioOverlayTrack) null, false);
    }

    public final void A0c(AnonymousClass5MI r5) {
        0qQ.A0B(r5, 0);
        C3500783d r3 = this.A0N;
        List list = r3.A02;
        list.remove(r5);
        r3.A0C.Epw(new ArrayList(list));
        if (r5 instanceof Drawable) {
            r3.A06.FIA(r5);
        }
    }

    public final void A0f(C268714ds r4) {
        0qQ.A0B(r4, 0);
        C3500783d r2 = this.A0N;
        List list = r2.A01;
        list.remove(r4);
        r2.A0B.Epw(list);
        if (r4 instanceof Drawable) {
            r2.A06.FIA(r4);
        }
    }

    public final void A0h(String str) {
        0qQ.A0B(str, 0);
        this.A0Q.A01(C359548d5.VOICEOVER_REMOVE);
        ClipsAudioStore clipsAudioStore = this.A0K;
        List list = clipsAudioStore.A0C;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (0qQ.A0K(((M1Y) it.next()).A06, str)) {
                it.remove();
            }
        }
        clipsAudioStore.A0S.Epw(C59798JYr.A00(list, ClipsAudioStore.A00(clipsAudioStore)));
    }

    public final void A0i(List list) {
        05G r5 = this.A0O.A02;
        AnonymousClass831 r2 = (AnonymousClass831) r5.getValue();
        0qQ.A0B(r2, 0);
        ArrayList A052 = r2.A05();
        0qQ.A0C(A052, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.pushList>");
        A052.addAll(list);
        AnonymousClass831 r4 = new AnonymousClass831(00k.A0a(A052), r2.A03);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            } else {
                r4 = AEH.A00(r4, (r4.A01.size() - i) - 2);
                i = i2;
            }
        }
        r5.Epw(r4);
    }

    public final void A0j(List list) {
        0qQ.A0B(list, 0);
        AnonymousClass836 r5 = this.A0O;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            AnonymousClass51R r1 = ((AnonymousClass51M) next).A0F;
            if (!(r1.A05 == 0 || r1.A09 == 0)) {
                arrayList.add(next);
            }
        }
        r5.A02(arrayList);
    }

    public final void A0k(List list, boolean z) {
        0qQ.A0B(list, 0);
        if (z) {
            A03(C359548d5.VIDEO_CLIP_TRANSFORM, this, true);
        }
        05G r4 = this.A0O.A02;
        AnonymousClass831 r5 = (AnonymousClass831) r4.getValue();
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0eP r7 = (0eP) it.next();
            Object obj = r7.A00;
            AnonymousClass51N A062 = ((AnonymousClass51N) ((AnonymousClass831) r4.getValue()).A03(((Number) obj).intValue())).A06();
            if (A062 instanceof AnonymousClass51M) {
                ((AnonymousClass51M) A062).A0A = (C376429Hy) r7.A01;
            } else if (A062 instanceof KN4) {
                ((KN4) A062).A01 = (C376429Hy) r7.A01;
            }
            arrayList.add(new 0eP(obj, A062));
        }
        r4.Epw(LSY.A03(r5, arrayList));
    }

    public static final AnonymousClass831 A00(ClipsCreationViewModel clipsCreationViewModel) {
        Object A022 = clipsCreationViewModel.A0G.A02();
        0qQ.A0A(A022);
        return (AnonymousClass831) A022;
    }

    public static final void A01(C361278fx r2, ClipsCreationViewModel clipsCreationViewModel) {
        boolean z;
        if ((r2 instanceof AnonymousClass8Y4) || r2.A01()) {
            z = true;
        } else if (r2 instanceof C361268fw) {
            z = false;
        } else {
            return;
        }
        ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        clipsAudioStore.A06(f);
    }

    private final void A02(C361278fx r5, AudioOverlayTrack audioOverlayTrack, boolean z) {
        UserSession userSession = this.A0J;
        if (AnonymousClass30D.A08(userSession)) {
            182.A06(0Tu.A05, userSession, 36321395960980801L);
        }
        if (this.A0L.A01 != null && AnonymousClass9RH.A00(r5)) {
            if (!z || (r5.A00 != 3 && !r5.A01())) {
                this.A0K.A08(r5);
            } else {
                this.A0K.A09(r5, audioOverlayTrack);
            }
        }
    }

    public static final void A03(C359548d5 r3, ClipsCreationViewModel clipsCreationViewModel, boolean z) {
        C351888Av r0;
        if (!clipsCreationViewModel.A09 && (r0 = clipsCreationViewModel.A02) != null) {
            ClipsCreationDraftViewModel clipsCreationDraftViewModel = r0.A00;
            C293505kq A012 = ClipsCreationDraftViewModel.A01(clipsCreationDraftViewModel);
            if (A012 == null) {
                0kD.A07("ClipsCreationDraftViewModel", "Draft Snapshot is null when saving Undo snapshot", (Throwable) null);
                return;
            }
            C361348g5 r1 = clipsCreationDraftViewModel.A0H.A05;
            r1.A01(r3, A012);
            if (z) {
                r1.A00.clear();
                r1.A02.Epw(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if (r6 != null) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r9, X.C293505kq r10) {
        /*
            X.836 r1 = r9.A0O
            java.util.List r0 = r10.A0v
            r1.A02(r0)
            java.util.List r1 = r10.A0p
            if (r1 == 0) goto L_0x0033
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r2.next()
            com.instagram.music.common.model.AudioOverlayTrack r1 = (com.instagram.music.common.model.AudioOverlayTrack) r1
            com.instagram.music.common.model.DownloadedTrack r0 = r1.A06
            if (r0 == 0) goto L_0x001a
            X.8Y4 r0 = new X.8Y4
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x001a
        L_0x0033:
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r4 = r9.A0K
            r4.A05()
            goto L_0x003e
        L_0x0039:
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r4 = r9.A0K
            r4.A0C(r3)
        L_0x003e:
            X.8vh r6 = r10.A0C
            if (r6 == 0) goto L_0x0063
            X.8pV r0 = r6.A01
            if (r0 == 0) goto L_0x0063
            X.8vv r0 = r0.A03
            if (r0 == 0) goto L_0x0063
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x0063
            java.util.List r2 = r4.A0C
            r2.clear()
            r2.addAll(r0)
            X.05G r1 = r4.A0S
            int r0 = com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore.A00(r4)
            java.util.ArrayList r0 = X.C59798JYr.A00(r2, r0)
            r1.Epw(r0)
        L_0x0063:
            X.8QI r0 = r9.A01
            if (r0 == 0) goto L_0x00c4
            X.80R r3 = r0.A00
            X.8QA r5 = r3.A0a
            r10 = 1
            if (r6 != 0) goto L_0x00c8
            X.AnonymousClass8QA.A02(r5)
        L_0x0071:
            X.6if r1 = r3.A1y
            r5 = 0
            if (r1 == 0) goto L_0x00c5
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r1 = r1.get()
            X.8cb r1 = (X.C359318cb) r1
            if (r6 == 0) goto L_0x010b
            X.8pV r0 = r6.A01
            if (r0 == 0) goto L_0x00a4
            X.8vv r4 = r0.A03
            if (r4 == 0) goto L_0x00a4
            X.85x r2 = r1.A0r
            float r1 = r4.A03
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r2.A01
            r0.A06(r1)
            float r0 = r4.A00
            r2.A0F(r0)
            float r0 = r4.A01
            r2.A0G(r0)
            float r0 = r4.A04
            r2.A0I(r0)
        L_0x00a4:
            X.8pV r0 = r6.A01
            if (r0 == 0) goto L_0x010b
            com.instagram.camera.effect.models.CameraAREffect r2 = r0.A00
            if (r2 == 0) goto L_0x010b
            X.8Jb r1 = r3.A1Z
            X.84B r0 = X.AnonymousClass84B.MINI_GALLERY
            r1.A01(r0, r2)
            X.86W r0 = r3.A0H
            X.81C r0 = r0.A00
            X.81E r1 = r0.A00()
            X.8Xo r1 = (X.C357358Xo) r1
            X.8pV r0 = r6.A01
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00
            r1.A05(r0)
        L_0x00c4:
            return
        L_0x00c5:
            if (r6 == 0) goto L_0x010b
            goto L_0x00a4
        L_0x00c8:
            X.8pU r0 = r5.A05()
            X.8pR r0 = r0.A01
            X.8pN r0 = r0.A04
            java.util.List r9 = X.C18686Vwk.A02(r0)
            X.82p r0 = r5.A0F
            X.82o r0 = r0.A02
            X.8nh r7 = r0.A00()
            X.8BF r8 = new X.8BF
            r8.<init>()
            X.34S r2 = r5.A03(r6, r7, r8, r9, r10)
            java.lang.Object r0 = r2.A01
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0126
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00fd
            java.lang.String r2 = "restore_media_edits"
            java.lang.String r1 = "Error in the media edits serialization"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            goto L_0x0071
        L_0x00fd:
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x0120
            X.8pU r0 = (X.C366678pU) r0
            r5.A0B(r0)
            r5.A09()
            goto L_0x0071
        L_0x010b:
            X.8Jb r1 = r3.A1Z
            X.84B r0 = X.AnonymousClass84B.MINI_GALLERY
            r1.A01(r0, r5)
            X.86W r0 = r3.A0H
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Xo r0 = (X.C357358Xo) r0
            r0.A05(r5)
            return
        L_0x0120:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0126:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel, X.5kq):void");
    }

    public static final boolean A05(ClipsCreationViewModel clipsCreationViewModel, int i, int i2, int i3) {
        AnonymousClass51M r3;
        AnonymousClass51M r1;
        AnonymousClass51M r12;
        AnonymousClass51M r13;
        AnonymousClass8A2 A012;
        long A062;
        AnonymousClass836 r6 = clipsCreationViewModel.A0O;
        UserSession userSession = clipsCreationViewModel.A0J;
        05G r9 = r6.A02;
        if (i >= ((AnonymousClass831) r9.getValue()).A01.size()) {
            A012 = AnonymousClass8A1.A01(userSession);
            String A022 = 002.A02(i, ((AnonymousClass831) r9.getValue()).A01.size(), "invalid index: ", " >= ");
            0qQ.A0B(A022, 0);
            A062 = A012.A0K.A07(A022, "", 613293953, A012.A0B);
        } else {
            AnonymousClass51N A063 = ((AnonymousClass51N) ((AnonymousClass831) r9.getValue()).A03(i)).A06();
            if (A063 instanceof AnonymousClass51M) {
                AnonymousClass51M r7 = (AnonymousClass51M) A063;
                if (i2 == r7.A09 && i3 == r7.A08) {
                    A012 = AnonymousClass8A1.A01(userSession);
                    long j = A012.A0B;
                    if (j == 613293953) {
                        return false;
                    }
                    A062 = A012.A0K.A06(CancelReason.LOGIC_CONSTRAINT, "trim times unchanged", 613293953, j);
                } else {
                    if (i3 - i2 < 100) {
                        i3 = Math.min(i2 + 100, r7.A0B());
                    }
                    if (i3 - i2 < 100) {
                        i2 = Math.max(0, i3 - 100);
                    }
                    r7.A09 = i2;
                    r7.A08 = i3;
                    while (!C394689yW.A00(r7, false, false)) {
                        int i4 = i - 1;
                        AnonymousClass51O A042 = ((AnonymousClass831) r9.getValue()).A04(i4);
                        if (!(A042 instanceof AnonymousClass51M) || (r13 = (AnonymousClass51M) A042) == null) {
                            r3 = null;
                        } else {
                            r3 = AnonymousClass51M.A00((GTT) null, r13, (AnonymousClass51R) null, 0.0f, 0, 0, 0, 0, 1073741823);
                        }
                        int i5 = i + 1;
                        AnonymousClass51O A043 = ((AnonymousClass831) r9.getValue()).A04(i5);
                        if (!(A043 instanceof AnonymousClass51M) || (r12 = (AnonymousClass51M) A043) == null) {
                            r1 = null;
                        } else {
                            r1 = AnonymousClass51M.A00((GTT) null, r12, (AnonymousClass51R) null, 0.0f, 0, 0, 0, 0, 1073741823);
                        }
                        if (r3 == null && r7.A0L != null) {
                            r7.A0L = null;
                        } else if (r1 == null && r7.A0M != null) {
                            r7.A0M = null;
                        } else if (r7.A0L != null) {
                            r7.A0L = null;
                            if (r3 != null) {
                                r3.A0M = null;
                                r6.A01(r3, i4);
                            }
                        } else {
                            r7.A0M = null;
                            if (r1 != null) {
                                r1.A0L = null;
                                r6.A01(r1, i5);
                            }
                        }
                    }
                }
            } else if (A063 instanceof KN4) {
                ((KN4) A063).A00 = Math.max(i3 - i2, 100);
            }
            r6.A01(A063, i);
            AnonymousClass8A2 A013 = AnonymousClass8A1.A01(userSession);
            long j2 = A013.A0B;
            if (j2 != 613293953) {
                A013.A0B = A013.A0K.A02(613293953, j2);
            }
            AnonymousClass51M r2 = (AnonymousClass51M) A00(clipsCreationViewModel).A04(i);
            if (r2 == null) {
                return true;
            }
            2Nn r14 = clipsCreationViewModel.A0R;
            if (!r14.A02()) {
                return true;
            }
            AnonymousClass833.A00(r2, r14);
            return true;
        }
        A012.A0B = A062;
        return false;
    }

    public final int A0E() {
        AnonymousClass8JI r1;
        if (this.A03 != C2801950r.FEED_POST) {
            AnonymousClass8J0 r2 = this.A0L.A00;
            if (r2 != null && ((r1 = r2.A03) == null || r1 == AnonymousClass8JI.REMIX)) {
                0qQ.A0A(r2);
                return r2.A01;
            }
        } else if (A00(this).A01.size() == 1) {
            return Math.max(((AnonymousClass51M) A00(this).A03(0)).A0F.A04, A0F());
        } else {
            C3495780x r22 = this.A0g;
            C3495880y A002 = C3495980z.A00(this.A0J);
            0qQ.A0B(A002, 0);
            r22.A05.A0B(A002);
        }
        return A0F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r3 = r0.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0F() {
        /*
            r5 = this;
            X.80x r0 = r5.A0g
            X.2Fj r0 = r0.A05
            java.lang.Object r0 = r0.A02()
            X.80y r0 = (X.C3495880y) r0
            r4 = 0
            if (r0 == 0) goto L_0x0031
            int r3 = r0.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x0031
            X.0eM r1 = r5.A0T
            java.lang.Object r0 = r1.getValue()
            X.2Fk r0 = (X.2Fk) r0
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x0030
            java.lang.Object r0 = r1.getValue()
            X.2Fk r0 = (X.2Fk) r0
            r0.A0B(r2)
        L_0x0030:
            return r3
        L_0x0031:
            java.lang.String r1 = "ClipsCreationViewModel"
            java.lang.String r0 = "max total recording duration is NULL"
            X.0kD.A07(r1, r0, r4)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A0F():int");
    }

    public final AnonymousClass831 A0G() {
        AnonymousClass831 r0 = (AnonymousClass831) this.A0O.A03.getValue();
        List list = r0.A02;
        boolean z = r0.A03;
        0qQ.A0B(list, 0);
        return new AnonymousClass831(list, z);
    }

    public final Float A0H(int i) {
        AnonymousClass51M r0;
        AnonymousClass831 r02 = (AnonymousClass831) this.A0G.A02();
        if (r02 == null || (r0 = (AnonymousClass51M) r02.A04(i)) == null) {
            return null;
        }
        return Float.valueOf(r0.A01);
    }

    public final Integer A0I(int i) {
        AnonymousClass51M r0;
        AnonymousClass831 r02 = (AnonymousClass831) this.A0G.A02();
        if (r02 == null || (r0 = (AnonymousClass51M) r02.A04(i)) == null) {
            return null;
        }
        return Integer.valueOf(r0.A08 - r0.A09);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.4D7, X.Avk] */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f A[LOOP:0: B:10:0x004d->B:11:0x004f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0J(X.C390749rm r16, java.io.File r17, java.lang.String r18, java.lang.String r19, X.AnonymousClass4D7 r20, int r21, int r22, int r23) {
        /*
            r15 = this;
            r6 = r20
            r5 = r18
            r9 = r16
            r14 = r21
            r1 = r22
            r2 = r23
            boolean r0 = r6 instanceof X.C41542Avk
            if (r0 == 0) goto L_0x0089
            r7 = r6
            X.Avk r7 = (X.C41542Avk) r7
            int r4 = r7.A03
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x0089
            int r4 = r4 - r3
            r7.A03 = r4
        L_0x001e:
            java.lang.Object r4 = r7.A07
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A03
            r3 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r3) goto L_0x00ae
            int r2 = r7.A02
            int r1 = r7.A01
            int r14 = r7.A00
            java.lang.Object r9 = r7.A06
            X.9rm r9 = (X.C390749rm) r9
            java.lang.Object r5 = r7.A05
            java.lang.String r5 = (java.lang.String) r5
            X.0eS.A00(r4)
        L_0x003a:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0qQ.A0B(r9, r3)
            r0 = 2
            X.0qQ.A0B(r4, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r2 / r14
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x008f
            int r0 = r7 * r14
            int r13 = r1 + r0
            r0 = 45
            java.lang.String r11 = X.002.A0G(r5, r0, r7)
            X.8Y4 r10 = new X.8Y4
            r10.<init>(r4)
            r12 = 1065353216(0x3f800000, float:1.0)
            X.9cC r8 = new X.9cC
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            X.0eS.A00(r4)
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r15.A0K
            r7.A04 = r15
            r7.A05 = r5
            r7.A06 = r9
            r7.A00 = r14
            r7.A01 = r1
            r7.A02 = r2
            r7.A03 = r3
            r8 = r17
            r4 = r19
            java.lang.Object r4 = r0.A04(r8, r4, r5, r7)
            if (r4 != r6) goto L_0x003a
            return r6
        L_0x0089:
            X.Avk r7 = new X.Avk
            r7.<init>(r15, r6)
            goto L_0x001e
        L_0x008f:
            int r2 = r2 % r14
            if (r2 <= 0) goto L_0x00ad
            int r0 = r6 * r14
            int r1 = r1 + r0
            r0 = 45
            java.lang.String r7 = X.002.A0G(r5, r0, r6)
            X.8Y4 r6 = new X.8Y4
            r6.<init>(r4)
            r8 = 1065353216(0x3f800000, float:1.0)
            X.9cC r4 = new X.9cC
            r5 = r9
            r9 = r1
            r10 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.add(r4)
        L_0x00ad:
            return r3
        L_0x00ae:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A0J(X.9rm, java.io.File, java.lang.String, java.lang.String, X.4D7, int, int, int):java.lang.Object");
    }

    public final String A0L() {
        MusicAssetModel musicAssetModel;
        int i;
        ClipsAudioStore clipsAudioStore = this.A0K;
        int i2 = A00(this).A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<C361278fx> list = (List) clipsAudioStore.A0G.getValue();
        if (list != null) {
            ArrayList<AudioOverlayTrack> arrayList = new ArrayList<>();
            for (C361278fx r0 : list) {
                Object obj = r0.A01;
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            for (AudioOverlayTrack audioOverlayTrack : arrayList) {
                if (audioOverlayTrack.A0E == null && (musicAssetModel = audioOverlayTrack.A08) != null) {
                    int i3 = audioOverlayTrack.A01;
                    if (i3 == 0) {
                        i3 = i2;
                    }
                    String str = musicAssetModel.A0E;
                    0qQ.A07(str);
                    Number number = (Number) linkedHashMap.get(musicAssetModel.A0E);
                    if (number != null) {
                        i = number.intValue();
                    } else {
                        i = 0;
                    }
                    linkedHashMap.put(str, Integer.valueOf(i + (i3 - audioOverlayTrack.A04)));
                    String str2 = musicAssetModel.A0E;
                    0qQ.A07(str2);
                    String str3 = musicAssetModel.A0I;
                    0qQ.A07(str3);
                    linkedHashMap2.put(str2, str3);
                }
            }
        }
        for (Object next : linkedHashMap.keySet()) {
            Number number2 = (Number) linkedHashMap.get(next);
            if (number2 != null && number2.intValue() > 90000) {
                return (String) linkedHashMap2.get(next);
            }
        }
        return null;
    }

    public final List A0N() {
        List<C361278fx> list = (List) this.A0K.A0V.getValue();
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (C361278fx r0 : list) {
            Object obj = r0.A01;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A0O() {
        05G r3 = this.A0O.A02;
        0qQ.A0B(r3.getValue(), 0);
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 0);
        r3.Epw(new AnonymousClass831(r1, false));
        this.A0L.A04.clear();
    }

    public final void A0P() {
        Object value;
        ArrayList arrayList;
        ClipsAudioStore clipsAudioStore = this.A0K;
        C390749rm r6 = C390749rm.VIDEO_STICKER_AUDIO;
        05G r5 = clipsAudioStore.A0P;
        do {
            value = r5.getValue();
            arrayList = new ArrayList();
            for (Object next : (List) value) {
                if (((C381709cC) next).A03 != r6) {
                    arrayList.add(next);
                }
            }
        } while (!r5.AIY(value, arrayList));
    }

    public final void A0Q() {
        ClipsAudioStore clipsAudioStore = this.A0K;
        int i = A00(this).A00;
        ArrayList arrayList = new ArrayList();
        List<M1Y> list = clipsAudioStore.A0C;
        for (M1Y m1y : list) {
            int min = Math.min(i - 100, m1y.A03);
            int min2 = Math.min(i, m1y.A02);
            Integer valueOf = Integer.valueOf(min);
            Integer valueOf2 = Integer.valueOf(min2);
            M1Y A002 = m1y.A00();
            0qQ.A0C(A002, AnonymousClass000.A00(1630));
            if (valueOf != null) {
                A002.A03 = valueOf.intValue();
            }
            if (valueOf2 != null) {
                A002.A02 = valueOf2.intValue();
            }
            arrayList.add(A002);
        }
        list.clear();
        list.addAll(arrayList);
        clipsAudioStore.A0S.Epw(C59798JYr.A00(list, i));
    }

    public final void A0R(int i) {
        05G r12 = this.A0O.A02;
        int i2 = i;
        AnonymousClass51N A062 = ((AnonymousClass51N) ((AnonymousClass831) r12.getValue()).A03(i2)).A06();
        if (A062 instanceof AnonymousClass51M) {
            AnonymousClass51M r10 = (AnonymousClass51M) A062;
            AnonymousClass51R r0 = r10.A0F;
            int i3 = r0.A03;
            int i4 = r0.A02;
            int i5 = r0.A04;
            int i6 = i5 - i4;
            int i7 = i5 - i3;
            String str = r0.A0F;
            String str2 = r0.A0G;
            String str3 = r0.A0E;
            long j = r0.A0A;
            int i8 = r0.A09;
            int i9 = r0.A05;
            int i10 = r0.A01;
            int i11 = r0.A07;
            String str4 = r0.A0D;
            int i12 = r0.A00;
            int i13 = r0.A08;
            String str5 = r0.A0H;
            int i14 = r0.A06;
            MediaUploadMetadata mediaUploadMetadata = r0.A0B;
            boolean z = r0.A0K;
            String str6 = r0.A0I;
            List list = r0.A0J;
            Boolean bool = r0.A0C;
            0qQ.A0B(str, 0);
            0qQ.A0B(mediaUploadMetadata, 16);
            MediaUploadMetadata mediaUploadMetadata2 = mediaUploadMetadata;
            AnonymousClass51R r14 = new AnonymousClass51R(mediaUploadMetadata2, bool, str, str2, str3, str4, str5, str6, list, i8, i9, i10, i11, i12, i13, i5, i6, i7, i14, j, z);
            r10.A0F = r14;
            int i15 = r10.A09;
            int i16 = r10.A08;
            int i17 = r14.A04;
            r10.A09 = i17 - i16;
            r10.A08 = i17 - i15;
            r10.A00 = -r10.A00;
        }
        r12.Epw(LSY.A02(A062, (AnonymousClass831) r12.getValue(), i2));
    }

    public final void A0S(int i, int i2) {
        String str;
        String str2;
        String str3;
        AnonymousClass51M r1;
        AnonymousClass51M r12;
        AnonymousClass51M r13;
        AnonymousClass51M r14;
        if (i != i2) {
            05G r3 = this.A0O.A02;
            AnonymousClass51O A042 = ((AnonymousClass831) r3.getValue()).A04(i);
            String str4 = null;
            if (!(A042 instanceof AnonymousClass51M) || (r14 = (AnonymousClass51M) A042) == null) {
                str = null;
            } else {
                str = r14.A0L;
            }
            AnonymousClass51O A043 = ((AnonymousClass831) r3.getValue()).A04(i);
            if (!(A043 instanceof AnonymousClass51M) || (r13 = (AnonymousClass51M) A043) == null) {
                str2 = null;
            } else {
                str2 = r13.A0M;
            }
            AnonymousClass51O A044 = ((AnonymousClass831) r3.getValue()).A04(i2);
            if (!(A044 instanceof AnonymousClass51M) || (r12 = (AnonymousClass51M) A044) == null) {
                str3 = null;
            } else {
                str3 = r12.A0L;
            }
            AnonymousClass51O A045 = ((AnonymousClass831) r3.getValue()).A04(i2);
            if ((A045 instanceof AnonymousClass51M) && (r1 = (AnonymousClass51M) A045) != null) {
                str4 = r1.A0M;
            }
            AnonymousClass831 r8 = (AnonymousClass831) r3.getValue();
            0qQ.A0B(r8, 0);
            ArrayList A052 = r8.A05();
            0qQ.A0C(A052, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.moveSegment>");
            A052.add(i2, A052.remove(i));
            r3.Epw(AEH.A01(AEH.A01(AEH.A01(AEH.A01(new AnonymousClass831(00k.A0a(A052), r8.A03), str, i - 1), str2, i), str3, i2 - 1), str4, i2));
        }
    }

    public final void A0T(int i, String str) {
        AnonymousClass836 r1 = this.A0O;
        if (!0qQ.A0K(r1.A00(i), str)) {
            05G r12 = r1.A02;
            r12.Epw(AEH.A01((AnonymousClass831) r12.getValue(), str, i));
        }
    }

    public final void A0U(int i, boolean z) {
        C351888Av r0;
        A03(C359548d5.VIDEO_CLIP_REMOVE, this, true);
        AnonymousClass836 r02 = this.A0O;
        if (i >= 0) {
            05G r3 = r02.A02;
            if (((AnonymousClass831) r3.getValue()).A01.size() > i) {
                AnonymousClass831 r6 = (AnonymousClass831) r3.getValue();
                0qQ.A0B(r6, 0);
                if (!r6.A01.isEmpty()) {
                    ArrayList A052 = r6.A05();
                    0qQ.A0C(A052, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.remove>");
                    Object remove = A052.remove(i);
                    0qQ.A07(remove);
                    AnonymousClass831 r1 = new AnonymousClass831(00k.A0a(A052), r6.A03);
                    AEH.A00(r1, i - 1);
                    AnonymousClass51N r4 = (AnonymousClass51N) remove;
                    r3.Epw(r1);
                    if (r4.A00 != AnonymousClass05K.A01) {
                        0kD.A07("ClipsCreationViewModel", "IgPhotoSegment not supported in ClipsCreationViewModel", (Throwable) null);
                        return;
                    }
                    this.A0L.A04.remove(r4);
                    if (z && (r0 = this.A02) != null) {
                        Boolean bool = (Boolean) r0.A00.A05.A02();
                        if (bool == null || !bool.booleanValue()) {
                            if (182.A06(0Tu.A05, this.A0J, 36327061022849163L)) {
                                1Eo.A05(AnonymousClass12T.A00.CO6(480314591, 3), new MGV(this, r4, (AnonymousClass4D7) null, 42), C318116oQ.A00(this));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public final void A0Z(C361278fx r4, AudioOverlayTrack audioOverlayTrack, boolean z) {
        C359548d5 r1;
        AudioOverlayTrack audioOverlayTrack2 = (AudioOverlayTrack) r4.A01;
        if (audioOverlayTrack2 != null) {
            int i = audioOverlayTrack2.A02 + audioOverlayTrack2.A04;
            if ((audioOverlayTrack2.A01 == 0 && A00(this).A00 > i) || audioOverlayTrack2.A01 > i) {
                audioOverlayTrack2.A01 = i;
            }
        }
        if (z && r4.A00 != 0) {
            if (audioOverlayTrack == null || 0qQ.A0K(((AudioOverlayTrack) r4.A00()).A0A, audioOverlayTrack.A0A)) {
                r1 = C359548d5.AUDIO_ADD;
            } else {
                r1 = C359548d5.AUDIO_REPLACE;
            }
            A03(r1, this, true);
        }
        A02(r4, audioOverlayTrack, true);
    }

    public final void A0a(C361278fx r2, List list, boolean z) {
        this.A0O.A02(list);
        if (AnonymousClass9RH.A00(r2)) {
            A01(r2, this);
            this.A0K.A08(r2);
        }
        if (z) {
            Set set = this.A0L.A04;
            set.clear();
            set.addAll(list);
        }
    }

    public final void A0d(AnonymousClass51M r6, Integer num) {
        05G r2;
        AnonymousClass831 A002;
        int intValue;
        AnonymousClass836 r4 = this.A0O;
        if (((AnonymousClass831) r4.A03.getValue()).A01.size() != 0) {
            A03(C359548d5.VIDEO_CLIP_ADD, this, true);
        }
        if (num != null && (intValue = num.intValue()) >= 0) {
            r2 = r4.A02;
            if (intValue < ((AnonymousClass831) r2.getValue()).A01.size()) {
                A002 = AEH.A00(AEH.A00(LSY.A01(r6, (AnonymousClass831) r2.getValue(), intValue), intValue - 1), intValue + 1);
                r2.Epw(A002);
            }
        }
        r2 = r4.A02;
        A002 = LSY.A00(r6, (AnonymousClass831) r2.getValue());
        AEH.A00(A002, A002.A01.size() - 2);
        r2.Epw(A002);
    }

    public final void A0e(AudioOverlayTrack audioOverlayTrack, boolean z) {
        ArrayList arrayList;
        Object obj;
        ClipsAudioStore clipsAudioStore = this.A0K;
        clipsAudioStore.A02 = true;
        05G r5 = clipsAudioStore.A0G;
        Collection collection = (Collection) r5.getValue();
        if (collection == null) {
            arrayList = new ArrayList();
        }
        if (audioOverlayTrack == null) {
            clipsAudioStore.A05();
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (0qQ.A0K(((C361278fx) next).A01, audioOverlayTrack)) {
                arrayList2.add(next);
            }
        }
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            if (z) {
                obj = C388389nk.A00;
            } else {
                obj = C361268fw.A00;
            }
            arrayList.add(obj);
        }
        r5.Epw(arrayList);
    }

    public final void A0g(String str) {
        05G r4 = this.A0O.A02;
        AnonymousClass831 r0 = (AnonymousClass831) r4.getValue();
        List list = r0.A02;
        boolean z = r0.A03;
        0qQ.A0B(list, 0);
        AnonymousClass831 r2 = new AnonymousClass831(list, z);
        int size = ((AnonymousClass831) r4.getValue()).A01.size();
        for (int i = -1; i < size; i++) {
            r2 = AEH.A01(r2, str, i);
        }
        r4.Epw(r2);
    }

    public final boolean A0l() {
        if (C3495980z.A00(this.A0J).A01 - A00(this).A00 > 100) {
            return true;
        }
        return false;
    }

    public final boolean A0m() {
        OriginalAudioSubtype originalAudioSubtype;
        MusicAssetModel musicAssetModel;
        List<C361278fx> list = (List) this.A0K.A0V.getValue();
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (C361278fx r0 : list) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) r0.A01;
                if (audioOverlayTrack == null || (musicAssetModel = audioOverlayTrack.A08) == null) {
                    originalAudioSubtype = null;
                } else {
                    originalAudioSubtype = musicAssetModel.A01;
                }
                if (originalAudioSubtype == OriginalAudioSubtype.A06) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0n() {
        C361278fx r0 = (C361278fx) this.A0K.A06.A02();
        if (r0 == null || r0.A00 != 3) {
            return false;
        }
        return true;
    }

    public final boolean A0o() {
        C321016tR r1;
        String str;
        C347017w8 r2;
        List<AnonymousClass5MI> list = this.A0N.A02;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AnonymousClass5MI AfT : list) {
            Drawable AfT2 = AfT.AfT();
            Drawable drawable = null;
            if ((AfT2 instanceof C347017w8) && (r2 = (C347017w8) AfT2) != null) {
                drawable = r2.A04();
            }
            if ((drawable instanceof AnonymousClass8N6) && (r1 = (C321016tR) drawable) != null) {
                String str2 = r1.A0E;
                if ((str2 == null || str2.length() == 0) && (((str = r1.A0l) == null || str.length() == 0) && r1.A0Y != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0p() {
        List<C361278fx> list = (List) this.A0K.A0V.getValue();
        if (list == null) {
            return false;
        }
        for (C361278fx r0 : list) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) r0.A01;
            if (audioOverlayTrack != null && audioOverlayTrack.A01()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0q() {
        int i;
        List list = (List) this.A0K.A0V.getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((C361278fx) next).A01 != null) {
                    arrayList.add(next);
                }
            }
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (((long) i) < 182.A01(0Tu.A06, this.A0J, 36602870938080063L)) {
            return false;
        }
        return true;
    }

    public final boolean A0r() {
        C3500783d r2 = this.A0N;
        if ((!((Collection) r2.A0D.getValue()).isEmpty()) || (!((Collection) r2.A0E.getValue()).isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean A0s() {
        AnonymousClass831 r0 = (AnonymousClass831) this.A0F.A02();
        if (r0 == null || r0.A01.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A0t() {
        if (this.A03 != C2801950r.FEED_POST) {
            return false;
        }
        int i = C3495980z.A00(this.A0J).A01;
        int i2 = A00(this).A00;
        if (i2 < 0 || i2 > i) {
            return false;
        }
        return true;
    }

    public final void AHr() {
        C3500783d r3 = this.A0N;
        List list = r3.A02;
        ArrayList A0U2 = 00k.A0U(list);
        List list2 = r3.A01;
        ArrayList A0U3 = 00k.A0U(list2);
        List list3 = r3.A00;
        ArrayList A0U4 = 00k.A0U(list3);
        list.clear();
        list2.clear();
        list3.clear();
        r3.A0C.Epw(new ArrayList());
        05G r0 = r3.A0B;
        0sn r1 = 0sn.A00;
        r0.Epw(r1);
        r3.A0A.Epw(r1);
        Iterator it = A0U2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Drawable) {
                r3.A06.FIA(next);
            }
        }
        Iterator it2 = A0U3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof Drawable) {
                r3.A06.FIA(next2);
            }
        }
        Iterator it3 = A0U4.iterator();
        while (it3.hasNext()) {
            r3.A04.FIA(it3.next());
        }
    }

    public final void onCleared() {
        this.A06.invoke();
        C3500482z r2 = this.A0f;
        String str = this.A0S;
        0qQ.A0B(str, 0);
        AnonymousClass835 r0 = (AnonymousClass835) r2.A00.remove(str);
        if (r0 != null) {
            r0.A00();
        }
    }

    public final String A0K() {
        String A0L2 = A0L();
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass9KX r2 = new AnonymousClass9KX(this, A0L2, (AnonymousClass4D7) null, 3);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
        return A0L2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.55O, X.9oA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.55O, java.lang.Object, X.9oB] */
    public final List A0M() {
        01N A1H = 0jo.A1H();
        ClipsAudioStore clipsAudioStore = this.A0K;
        C357588Yu r2 = (C357588Yu) clipsAudioStore.A0c.getValue();
        if (r2 != null) {
            Integer num = AnonymousClass05K.A00;
            ? obj = new Object();
            obj.A00 = num;
            obj.A00 = r2;
            A1H.add(obj);
        }
        C357618Yx r22 = (C357618Yx) clipsAudioStore.A0b.getValue();
        if (r22 != null) {
            Integer num2 = AnonymousClass05K.A01;
            ? obj2 = new Object();
            obj2.A00 = num2;
            obj2.A00 = r22;
            A1H.add(obj2);
        }
        return 0jo.A1I(A1H);
    }

    public final void A0X(C353538Ia r5) {
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass9K3 r2 = new AnonymousClass9K3((Object) this, (Object) r5, (AnonymousClass4D7) null, 43);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }

    public final void A0Y(C361278fx r3) {
        if (AnonymousClass9RH.A00(r3)) {
            ClipsAudioStore clipsAudioStore = this.A0K;
            if (AnonymousClass9RI.A00(r3)) {
                clipsAudioStore.A0M.Epw(r3);
            }
        }
    }

    public final boolean A0u() {
        if (A0t() || this.A03 != C2801950r.FEED_POST) {
            return false;
        }
        return true;
    }
}
