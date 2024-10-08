package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8QG  reason: invalid class name */
public final class AnonymousClass8QG implements AnonymousClass81E {
    public Integer A00;
    public String A01;
    public final C357638Yz A02;
    public final C353828Ji A03;
    public final AnonymousClass8QA A04;
    public final AnonymousClass8K4 A05;
    public final AnonymousClass8LU A06;
    public final AnonymousClass8MC A07;
    public final TargetViewSizeProvider A08;
    public final C3499582p A09;
    public final AnonymousClass80D A0A;
    public final AnonymousClass8DO A0B;
    public final C353508Hx A0C;
    public final ClipsCreationDraftViewModel A0D;
    public final C314676if A0E;
    public final AnonymousClass88B A0F;
    public final AnonymousClass4DH A0G;
    public final AnonymousClass82W A0H;
    public final AnonymousClass8BA A0I;
    public final C352888Fl A0J;
    public final AnonymousClass81T A0K;
    public final C353788Jb A0L;
    public final ClipsCreationViewModel A0M;

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    private C365758nd A00() {
        C3498482b r0;
        AnonymousClass80D r4 = this.A0A;
        UserSession userSession = r4.A0S;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A06, userSession, 36323225617443851L) || ((r0 = r4.A0u) != null && r0.A0G)) {
            return this.A09.A02.A02();
        }
        return this.A09.A02.A01();
    }

    public static void A01(AnonymousClass8QG r4) {
        if (!r4.A09.A02.A01.A07() || !r4.A00().equals(C365758nd.A07) || !(r4.A02.A08.A00 instanceof AnonymousClass80O)) {
            A04(r4, true);
            return;
        }
        Context A012 = 2Yn.A01(r4.A0G.requireContext());
        AnonymousClass80D r3 = r4.A0A;
        C46498Dg1 dg1 = new C46498Dg1(A012, r3.A0S);
        AnonymousClass2k4 r1 = AnonymousClass2k4.NIGHT;
        0qQ.A0B(r1, 0);
        dg1.A02 = r1;
        dg1.A04(new AMA(r4), 2131972522);
        dg1.A04(new AMB(r4), 2131972580);
        dg1.A02(new AM0(), 2131954722);
        new C49945FFy(dg1).A03(r3.A05);
    }

    public static void A02(AnonymousClass8QG r5) {
        boolean z;
        if (!r5.A09.A02.A01.A07() || !r5.A00().equals(C365758nd.A07)) {
            throw new IllegalStateException("Current captured media is not of valid type CapturedMediaType.Video");
        }
        Context requireContext = r5.A0G.requireContext();
        MusicOverlayStickerModel A0R = r5.A0I.A0R();
        Af4 af4 = new Af4(r5);
        ClipsAudioStore clipsAudioStore = r5.A0M.A0K;
        if (!clipsAudioStore.A0E()) {
            List list = (List) clipsAudioStore.A0G.getValue();
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) ((C361278fx) it.next()).A01;
                    if (audioOverlayTrack != null && audioOverlayTrack.A0E == null) {
                        break;
                    }
                }
            }
            z = false;
            FCO.A01(requireContext, A0R, af4, z);
        }
        z = true;
        FCO.A01(requireContext, A0R, af4, z);
    }

    public static void A03(AnonymousClass8QG r63, Boolean bool, 0sP r65) {
        AnonymousClass3QO r37;
        String str;
        boolean z;
        C357458Xy r2;
        AnonymousClass8QG r3 = r63;
        C3499582p r0 = r3.A09;
        C3499582p r28 = r0;
        C3499482o r22 = r0.A02;
        C365758nd A012 = r22.A01();
        if (A012 == C365758nd.A04 || A012 == C365758nd.A07) {
            ClipsCreationDraftViewModel clipsCreationDraftViewModel = r3.A0D;
            boolean booleanValue = bool.booleanValue();
            AnonymousClass80D r02 = r3.A0A;
            C2801950r A0H2 = r02.A0H();
            C357638Yz r27 = r3.A02;
            AnonymousClass88B r26 = r3.A0F;
            C41409AtV atV = new C41409AtV(r3);
            C366688pV A002 = r3.A07.A00();
            C353508Hx r4 = r3.A0C;
            AudioOverlayTrack Bru = r4.Bru();
            boolean FMp = r4.FMp();
            String Ao9 = r4.Ao9();
            C41419Atf atf = new C41419Atf(r4);
            C41420Atg atg = new C41420Atg(r4);
            String ASp = r4.ASp();
            C41421Ath ath = new C41421Ath(r3);
            C366678pU A042 = r3.A04.A04();
            C41422Ati ati = new C41422Ati(r3);
            C41423Atj atj = new C41423Atj(r3);
            C353828Ji r14 = r3.A03;
            AnonymousClass8DO r13 = r3.A0B;
            AnonymousClass8LU r12 = r3.A06;
            TargetViewSizeProvider targetViewSizeProvider = r3.A08;
            String str2 = r02.A2D;
            UserSession userSession = r02.A0S;
            0qQ.A0B(userSession, 1);
            String A022 = C59737JVv.A02(userSession, str2, 0sn.A00);
            C41424Atk atk = new C41424Atk(r02);
            0sP auL = new C41461AuL(r3);
            C41410AtW atW = new C41410AtW(r3);
            C41411AtX atX = new C41411AtX(r02);
            C41417Atd atd = new C41417Atd(r02);
            C41418Ate ate = new C41418Ate(r02);
            ACRType aCRType = r22.A01.A01;
            boolean z2 = false;
            if (r02.A0k != null) {
                z2 = true;
            }
            if (r02.A3O || r02.A3p) {
                r37 = AnonymousClass3QO.FAN_CLUB;
            } else {
                PendingRecipient pendingRecipient = r02.A1S;
                if (pendingRecipient == null || !pendingRecipient.A0Y) {
                    r37 = null;
                } else {
                    r37 = AnonymousClass3QO.OPAL;
                }
            }
            String str3 = r02.A2V;
            String str4 = r02.A2T;
            C378619Qn r23 = r02.A13;
            if (r23 != null) {
                str = r23.A0D;
            } else {
                str = null;
            }
            if (r02.A3p) {
                z = false;
            } else {
                z = null;
            }
            ArrayList arrayList = new ArrayList();
            PendingRecipient pendingRecipient2 = r02.A1S;
            if (pendingRecipient2 == null) {
                Parcelable.Creator creator = PendingRecipient.CREATOR;
                pendingRecipient2 = new PendingRecipient(AnonymousClass0t1.A01.A01(r02.A0S));
            }
            arrayList.add(pendingRecipient2);
            0qQ.A0B(A0H2, 1);
            0qQ.A0B(r27, 2);
            0qQ.A0B(Ao9, 8);
            0qQ.A0B(r14, 17);
            0qQ.A0B(r13, 18);
            0qQ.A0B(r12, 19);
            0qQ.A0B(targetViewSizeProvider, 20);
            C62320sa r03 = clipsCreationDraftViewModel.A0N;
            if (r03 != null && (r2 = (C357458Xy) r03.invoke()) != null) {
                C318136oS A003 = C318116oQ.A00(clipsCreationDraftViewModel);
                ACRType aCRType2 = aCRType;
                C357638Yz r25 = r27;
                C353828Ji r262 = r14;
                TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
                AnonymousClass8DO r29 = r13;
                AnonymousClass8LU r30 = r12;
                C2801950r r34 = A0H2;
                ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2 clipsCreationDraftViewModel$updateDraftAndMaybeSave$2 = new ClipsCreationDraftViewModel$updateDraftAndMaybeSave$2(aCRType2, r25, r262, targetViewSizeProvider2, r28, r29, r30, A042, A002, clipsCreationDraftViewModel, r34, r2, r26, r37, Bru, z, Ao9, ASp, A022, str3, str4, str, arrayList, (AnonymousClass4D7) null, atV, atf, atg, ath, ati, atj, atk, atW, atX, atd, ate, r65, auL, booleanValue, FMp, z2, false);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, clipsCreationDraftViewModel$updateDraftAndMaybeSave$2, A003);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r2.A0G != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        r4 = new java.util.LinkedHashMap(((X.AnonymousClass8ME) r10.get()).A1B());
        r3 = r4.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        if (r3.hasNext() == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        r9 = (android.graphics.drawable.Drawable) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if ((r9 instanceof X.AnonymousClass9X8) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        r9 = (X.AnonymousClass9X8) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (r9 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        r4.remove(r9);
        r8 = r9.getIntrinsicWidth();
        r3 = r9.getIntrinsicHeight();
        r12 = new X.C349307zv(r9.A0B, r8, r3, 0);
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0088, code lost:
        if (r11 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
        r12.A0F = r2;
        r12.A1C = r11;
        r1.A03 = new X.C367508qr(r8, r3);
        r1.A0D = X.AnonymousClass8LU.A03(r1, r12);
        r11 = r1.A0o;
        r11.A0A(r8, r3, r12.A09, false);
        r11 = r11.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        if (r11 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        r10 = ((X.AnonymousClass8ME) r10.get()).A1m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        if (r10.getInteractiveDrawables().size() <= 0) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        r10 = r10.A0X(android.graphics.drawable.Drawable.class);
        r14 = r10.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cb, code lost:
        if (r14.hasNext() == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cd, code lost:
        r12 = r14.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d3, code lost:
        if ((r12 instanceof X.C369838vP) != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d7, code lost:
        if ((r12 instanceof X.C386059jz) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
        if (r10.get(r12) == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00df, code lost:
        r12 = (X.C369458un) r10.get(r12);
        r2 = r12.A06;
        r13 = r11.A08;
        r13.A01 = r2;
        r13.A00 = r12.A05;
        r11.A04(r12.A01);
        r11.A05(r12.A02);
        r11.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fd, code lost:
        r10 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
        if (r10.A03() == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010b, code lost:
        if (r10.A03().A0I == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010d, code lost:
        r10 = r10.A03().A0I.A02;
        r1.A0C = X.AnonymousClass9TB.A01(X.C369408uY.A02(X.C369398uX.A00(((java.lang.Number) r10.get(0)).intValue()), X.C369398uX.A00(((java.lang.Number) r10.get(1)).intValue()), (float) r8, (float) r3, r9.A03.A02, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0166, code lost:
        if (r3 == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (X.182.A06(X.0Tu.A06, r9, 36323225617443851L) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass8QG r24, boolean r25) {
        /*
            r5 = r24
            X.8nd r0 = r5.A00()
            int r1 = r0.ordinal()
            r15 = 1
            r0 = 0
            r6 = r25
            if (r1 == r0) goto L_0x0283
            if (r1 != r15) goto L_0x027b
            r23 = r25 ^ 1
            X.8LU r1 = r5.A06
            X.82p r2 = r1.A0k
            X.82o r7 = r2.A02
            X.8BA r2 = r1.A0f
            X.6if r10 = r2.A1g
            java.lang.Object r2 = r10.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.util.LinkedHashMap r4 = r2.A1B()
            boolean r11 = r7.A0B()
            if (r11 == 0) goto L_0x0040
            com.instagram.common.session.UserSession r9 = r1.A0c
            X.0qQ.A0B(r9, r0)
            X.0Tu r8 = X.0Tu.A06
            r2 = 36323225617443851(0x810bc800062c0b, double:3.034292370136701E-306)
            boolean r2 = X.182.A06(r8, r9, r2)
            if (r2 != 0) goto L_0x004a
        L_0x0040:
            X.82Y r2 = r7.A01
            X.82b r2 = r2.A04
            if (r2 == 0) goto L_0x0149
            boolean r2 = r2.A0G
            if (r2 == 0) goto L_0x0149
        L_0x004a:
            java.lang.Object r2 = r10.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.util.LinkedHashMap r2 = r2.A1B()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r2)
            java.util.Set r2 = r4.keySet()
            java.util.Iterator r3 = r2.iterator()
        L_0x0061:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0149
            java.lang.Object r9 = r3.next()
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            boolean r2 = r9 instanceof X.AnonymousClass9X8
            if (r2 == 0) goto L_0x0061
            X.9X8 r9 = (X.AnonymousClass9X8) r9
            if (r9 == 0) goto L_0x0149
            r4.remove(r9)
            int r8 = r9.getIntrinsicWidth()
            int r3 = r9.getIntrinsicHeight()
            com.instagram.common.gallery.Medium r2 = r9.A0B
            X.7zv r12 = new X.7zv
            r12.<init>(r2, r8, r3, r0)
            r2 = 5
            if (r11 == 0) goto L_0x008b
            r2 = 4
        L_0x008b:
            r12.A0F = r2
            r12.A1C = r11
            X.8qr r2 = new X.8qr
            r2.<init>(r8, r3)
            r1.A03 = r2
            X.3Q2 r2 = X.AnonymousClass8LU.A03(r1, r12)
            r1.A0D = r2
            X.8Kz r11 = r1.A0o
            int r2 = r12.A09
            r11.A0A(r8, r3, r2, r0)
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r11 = r11.A05
            if (r11 == 0) goto L_0x0149
            java.lang.Object r2 = r10.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r2.A1m
            java.util.List r2 = r10.getInteractiveDrawables()
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x00fd
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            java.util.HashMap r10 = r10.A0X(r2)
            java.util.Set r2 = r10.keySet()
            java.util.Iterator r14 = r2.iterator()
        L_0x00c7:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x00fd
            java.lang.Object r12 = r14.next()
            boolean r2 = r12 instanceof X.C369838vP
            if (r2 != 0) goto L_0x00d9
            boolean r2 = r12 instanceof X.C386059jz
            if (r2 == 0) goto L_0x00c7
        L_0x00d9:
            java.lang.Object r2 = r10.get(r12)
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r12 = r10.get(r12)
            X.8un r12 = (X.C369458un) r12
            float r2 = r12.A06
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r13 = r11.A08
            r13.A01 = r2
            float r2 = r12.A05
            r13.A00 = r2
            float r2 = r12.A01
            r11.A04(r2)
            float r2 = r12.A02
            r11.A05(r2)
            r11.A03()
            goto L_0x00c7
        L_0x00fd:
            X.82Y r10 = r7.A01
            X.8Cl r2 = r10.A03()
            if (r2 == 0) goto L_0x0149
            X.8Cl r2 = r10.A03()
            X.0v6 r2 = r2.A0I
            if (r2 == 0) goto L_0x0149
            X.8Cl r2 = r10.A03()
            X.0v6 r2 = r2.A0I
            java.util.List r10 = r2.A02
            java.lang.Object r2 = r10.get(r0)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float[] r16 = X.C369398uX.A00(r2)
            java.lang.Object r2 = r10.get(r15)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float[] r17 = X.C369398uX.A00(r2)
            float r8 = (float) r8
            float r3 = (float) r3
            X.9Hy r2 = r9.A03
            float r2 = r2.A02
            r18 = r8
            r19 = r3
            r20 = r2
            r21 = r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r2 = X.C369408uY.A02(r16, r17, r18, r19, r20, r21)
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r2 = X.AnonymousClass9TB.A01(r2)
            r1.A0C = r2
        L_0x0149:
            X.3Q2 r2 = r1.A0D
            if (r2 != 0) goto L_0x018a
            r2 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.AnonymousClass8LU.A0B(r1, r2)
            java.lang.String r8 = "saveVideo with null mPendingMediaForMetadataOnly.\nCaptured media count: "
            X.82Y r6 = r7.A01
            java.util.List r2 = r6.A0m
            int r5 = r2.size()
            java.lang.String r4 = "\nIs switching items in multi-edit: "
            X.8QA r2 = r1.A06
            if (r2 == 0) goto L_0x0168
            boolean r3 = r2.A05
            r2 = 1
            if (r3 != 0) goto L_0x0169
        L_0x0168:
            r2 = 0
        L_0x0169:
            java.lang.String r3 = X.002.A0d(r8, r4, r5, r2)
            java.lang.String r2 = "VideoViewController"
            X.0kD.A01(r2, r3)
            X.7zv r3 = r6.A04()
            if (r3 == 0) goto L_0x0189
            X.8QA r2 = r1.A06
            r2.getClass()
            X.9TD r2 = new X.9TD
            r2.<init>(r1, r3, r0, r15)
            r1.A0F = r2
            android.view.ViewGroup r0 = r1.A0X
            X.0nA.A0p(r0, r2)
        L_0x0189:
            return
        L_0x018a:
            X.02m r2 = X.02m.A0p
            r9 = 18948745(0x1212289, float:2.9595808E-38)
            r2.markerStart(r9)
            X.02m r8 = X.02m.A0p
            java.lang.String r3 = "media_type"
            java.lang.String r2 = "video"
            r8.markerAnnotate(r9, r3, r2)
            r1.A0I()
            X.3Q2 r2 = r1.A0D
            r2.getClass()
            com.instagram.common.session.UserSession r3 = r1.A0c
            boolean r2 = X.C305756Jk.A01(r3)
            if (r2 == 0) goto L_0x01ae
            r1.onPause()
        L_0x01ae:
            X.3Q2 r10 = r1.A0D
            long r8 = java.lang.System.nanoTime()
            java.lang.String r2 = java.lang.String.valueOf(r8)
            X.3Q2 r2 = X.AnonymousClass9T3.A00(r10, r2)
            X.82Y r8 = r7.A01
            java.lang.String r7 = r8.A05()
            int r7 = r7.hashCode()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r2.A2e = r7
            X.4yO r7 = r1.A05
            boolean r7 = r7 instanceof X.AnonymousClass80O
            if (r7 == 0) goto L_0x0250
            r17 = 0
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r1.A0i
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r7 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r7
            X.81W r9 = r7.A0K
            int r7 = r9.getWidth()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r7)
            int r7 = r9.getHeight()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r7)
            X.AD8 r16 = new X.AD8
            r18 = r17
            r19 = r17
            r20 = r17
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x01f5:
            X.4yO r7 = r1.A05
            boolean r7 = r7 instanceof X.AnonymousClass80O
            if (r7 == 0) goto L_0x0256
            X.50r r9 = r1.A0w
            X.50r r7 = X.C2801950r.FEED_POST
            if (r9 != r7) goto L_0x0256
            X.7zv r7 = r8.A04()
            if (r7 == 0) goto L_0x0256
            X.7zv r9 = r8.A04()
            X.8PW r7 = r1.A0G()
            X.0qQ.A0B(r3, r0)
            X.0qQ.A0B(r9, r15)
            r8 = 0
            android.graphics.Point r7 = X.AEJ.A00(r3, r8, r7, r9)
            if (r7 == 0) goto L_0x0256
            int r11 = r7.x
            float r10 = (float) r11
            int r9 = r7.y
            float r7 = (float) r9
            float r10 = r10 / r7
            r2.A02 = r10
            java.lang.Integer r19 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r9)
            X.8Bc r7 = r1.A0r
            X.2Fk r7 = r7.A00
            java.lang.Object r9 = r7.A02()
            X.8Bd r7 = X.C351968Bd.FIT
            if (r9 != r7) goto L_0x024d
            r7 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r18 = java.lang.Float.valueOf(r7)
        L_0x023f:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r15)
            X.AD8 r16 = new X.AD8
            r21 = r8
            r22 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x0256
        L_0x024d:
            r18 = 0
            goto L_0x023f
        L_0x0250:
            X.AD8 r16 = new X.AD8
            r16.<init>()
            goto L_0x01f5
        L_0x0256:
            X.1GK r17 = X.AnonymousClass8LU.A00(r1)     // Catch:{ IllegalArgumentException -> 0x026a }
            r18 = r1
            r19 = r16
            r20 = r2
            r21 = r4
            r22 = r15
            X.LBC r7 = X.AnonymousClass8LU.A02(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IllegalArgumentException -> 0x026a }
            goto L_0x035e
        L_0x026a:
            r3 = 460(0x1cc, float:6.45E-43)
            X.Y46 r2 = new X.Y46
            r2.<init>(r1)
            X.5g0 r0 = new X.5g0
            r0.<init>(r2, r3)
            X.1ES.A03(r0)
            goto L_0x0376
        L_0x027b:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0283:
            X.8K4 r3 = r5.A05
            X.8Ji r1 = r3.A0F
            X.81C r1 = r1.A00
            X.81E r8 = r1.A00()
            X.8Jj r8 = (X.C353838Jj) r8
            r9 = 0
            r14 = -1
            r12 = 1065353216(0x3f800000, float:1.0)
            r10 = r9
            r11 = r9
            r13 = r12
            r16 = r15
            r18 = r15
            r17 = r0
            android.graphics.Bitmap r10 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass8K4.A06(r3)
            X.0eM r4 = r3.A0l
            java.lang.Object r2 = r4.getValue()
            X.6ST r2 = (X.AnonymousClass6ST) r2
            android.app.Activity r9 = r3.A0A
            r1 = 2131969783(0x7f1346f7, float:1.9576499E38)
            java.lang.String r1 = r9.getString(r1)
            r2.A00(r1)
            java.lang.Object r1 = r4.getValue()
            android.app.Dialog r1 = (android.app.Dialog) r1
            X.AnonymousClass0fN.A00(r1)
            X.82p r1 = r3.A0I
            X.82o r1 = r1.A02
            X.82Y r1 = r1.A01
            X.8Cl r8 = r1.A03()
            r8.getClass()
            boolean r7 = X.C305756Jk.A00(r9)
            com.instagram.common.session.UserSession r11 = r3.A0D
            X.0qQ.A0B(r11, r0)
            java.util.List r1 = r8.A09()
            if (r1 == 0) goto L_0x02e2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02f0
        L_0x02e2:
            java.util.List r2 = r8.A08()
            if (r2 == 0) goto L_0x0326
            com.instagram.api.schemas.CameraTool r1 = com.instagram.api.schemas.CameraTool.AI_CONTEXTUAL_BACKGROUND
            boolean r1 = r2.contains(r1)
            if (r1 != r15) goto L_0x0326
        L_0x02f0:
            X.0Tu r4 = X.0Tu.A05
            r1 = 36327258592000280(0x810f73000a3918, double:3.036842839485672E-306)
            boolean r1 = X.182.A06(r4, r11, r1)
            if (r1 != 0) goto L_0x0326
        L_0x02fd:
            X.Aaq r4 = new X.Aaq
            r4.<init>(r3, r7)
            X.Aay r2 = new X.Aay
            r2.<init>(r3)
            X.Aav r1 = new X.Aav
            r1.<init>(r3, r8)
            X.8lx r18 = r3.A0G()
            r19 = r4
            r20 = r1
            r21 = r2
            r22 = r8
            r23 = r15
            r24 = r7
            r25 = r0
            r17 = r3
            r16 = r10
            X.AnonymousClass8K4.A04(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0376
        L_0x0326:
            java.util.List r1 = r8.A0p
            if (r1 == 0) goto L_0x02fd
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 != r15) goto L_0x02fd
            X.0Tu r4 = X.0Tu.A05
            r1 = 2342162927707496173(0x208108c600181eed, double:4.065516769895642E-152)
            boolean r1 = X.182.A06(r4, r11, r1)
            if (r1 == 0) goto L_0x02fd
            if (r10 != 0) goto L_0x0359
            X.80G r2 = r3.A0E
            android.view.View r1 = r2.A05()
            int r4 = r1.getWidth()
            android.view.View r1 = r2.A05()
            int r2 = r1.getHeight()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r4, r2, r1)
        L_0x0359:
            android.graphics.Bitmap r10 = X.C9832Rhu.A00(r9, r10)
            goto L_0x02fd
        L_0x035e:
            X.Aap r4 = new X.Aap
            r4.<init>(r1)
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319132513344439(0x81080f00021bb7, double:3.031703874622626E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x037a
            X.LS1.A01(r7, r4)
        L_0x0376:
            A05(r5, r15, r6)
            return
        L_0x037a:
            X.5g0 r0 = X.LS1.A00(r7, r4)
            X.1ES.A03(r0)
            goto L_0x0376
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QG.A04(X.8QG, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        if (r6 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b2, code lost:
        if (r16 != false) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass8QG r27, boolean r28, boolean r29) {
        /*
            r6 = r27
            X.82p r0 = r6.A09
            X.82o r9 = r0.A02
            X.82Y r11 = r9.A01
            X.8Cl r1 = r11.A03()
            X.80D r8 = r6.A0A
            com.instagram.common.session.UserSession r4 = r8.A0S
            r10 = 0
            X.0qQ.A0B(r4, r10)
            X.0Tu r0 = X.0Tu.A06
            r2 = 36323225617443851(0x810bc800062c0b, double:3.034292370136701E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x0212
            X.8nd r17 = r9.A02()
        L_0x0025:
            X.8nd r0 = r9.A01()
            int r2 = r0.ordinal()
            if (r2 == r10) goto L_0x0205
            r0 = 1
            if (r2 != r0) goto L_0x0478
            X.8nh r0 = r9.A00()
            X.7zv r0 = r0.A03
            r0.getClass()
            int r3 = r0.A0F
        L_0x003d:
            X.8Fl r0 = r6.A0J
            r25 = 2
            java.lang.Integer r0 = r0.A0N()
            if (r0 == 0) goto L_0x0201
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0201
        L_0x004d:
            X.8Yz r0 = r6.A02
            java.lang.Integer r5 = r0.A08()
            X.8DO r7 = r6.A0B
            java.lang.String r13 = r8.A2G
            X.82W r0 = r6.A0H
            X.82X r0 = r0.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            com.instagram.camera.effect.models.CameraAREffect r8 = r0.A09
            X.8Jb r0 = r6.A0L
            com.instagram.camera.effect.models.CameraAREffect r2 = r0.A00()
            X.8nd r0 = r9.A01()
            int r12 = r0.ordinal()
            if (r12 == r10) goto L_0x01f0
            r0 = 1
            if (r12 != r0) goto L_0x0470
            X.8LU r0 = r6.A06
            int r10 = r0.Au0()
        L_0x007a:
            X.8Yz r0 = r11.A0X
            r0.getClass()
            X.80m r0 = r0.A09
            java.lang.Object r12 = r0.A00
            java.util.Set r12 = (java.util.Set) r12
            X.8aL r0 = X.C358088aL.A0B
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x01ed
            X.8nd r14 = r9.A01()
            X.8nd r12 = X.C365758nd.A07
            X.8nh r0 = r9.A00()
            if (r14 != r12) goto L_0x01e4
            X.7zv r0 = r0.A03
            r0.getClass()
            java.lang.String r9 = r0.A0l
        L_0x00a0:
            X.81T r0 = r6.A0K
            java.lang.String r24 = r0.getModuleName()
            X.50r r11 = r11.A0g
            X.50r r0 = X.C2801950r.FEED_POST
            r23 = 0
            if (r11 != r0) goto L_0x01e0
            X.4yP r11 = X.C279294yP.FEED
        L_0x00b0:
            if (r1 == 0) goto L_0x01d8
            java.util.List r22 = r1.A08()
            java.lang.String r0 = r1.A0g
            r27 = r0
            java.lang.String r0 = r1.A0e
            r26 = r0
        L_0x00be:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0M
            X.2gB r0 = r0.A0F
            java.lang.Object r0 = r0.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            if (r0 == 0) goto L_0x01d4
            java.util.ArrayList r0 = r0.A05()
            java.util.ArrayList r21 = X.2AL.A0C(r0)
        L_0x00d2:
            r12 = 1
            r0 = 6
            X.0qQ.A0B(r7, r0)
            r16 = 0
            if (r8 == 0) goto L_0x01d0
            boolean r0 = r8.A0D()
            if (r0 != r12) goto L_0x00e3
            r16 = 1
        L_0x00e3:
            java.lang.String r6 = r8.A0K
            if (r6 != 0) goto L_0x00f5
        L_0x00e7:
            X.0Tu r14 = X.0Tu.A05
            r0 = 36320678701507345(0x81097700012311, double:3.0326816902428475E-306)
            boolean r0 = X.182.A06(r14, r4, r0)
            if (r0 == 0) goto L_0x00f5
            r6 = r13
        L_0x00f5:
            if (r6 != 0) goto L_0x01ba
            if (r10 > 0) goto L_0x01ba
            X.0sn r14 = X.0sn.A00
        L_0x00fb:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            if (r8 == 0) goto L_0x01b2
            java.lang.String r0 = r8.A0M
            if (r0 == 0) goto L_0x01b2
            if (r16 == 0) goto L_0x01b6
            r15.add(r0)
        L_0x010b:
            java.util.ArrayList r20 = X.C59895JbK.A0C(r8, r2)
            X.0yf r13 = new X.0yf
            r13.<init>(r12)
            if (r6 == 0) goto L_0x012d
            java.lang.Integer r0 = r7.B09(r6)
            if (r0 != 0) goto L_0x01a9
            r0 = 1044(0x414, float:1.463E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r6 = X.002.A0R(r0, r6)
            java.lang.String r1 = "CameraLoggerHelper"
            r0 = r23
            X.0kD.A07(r1, r6, r0)
        L_0x012d:
            X.27r r8 = X.27p.A01(r4)
            X.JYm r7 = X.2AL.A03(r3)
            int r6 = X.C59895JbK.A01(r17)
            int r1 = X.2AL.A00(r4, r5, r3)
            if (r2 == 0) goto L_0x01a4
            java.lang.String r0 = r2.A0K
            r19 = r0
            java.lang.String r0 = r2.A0M
            r18 = r0
        L_0x0147:
            r2 = 0
            r5 = 2
            if (r6 == r12) goto L_0x0190
            if (r6 == r5) goto L_0x0190
        L_0x014d:
            r4 = 0
            if (r2 != 0) goto L_0x016b
            X.283 r0 = r8.A04
            X.28D r2 = r0.A09
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0, r1}
            java.lang.String r0 = "logSaveToCameraRoll() mediaType is not valid: entryPoint=%s mediaType=%d, captureFormat=%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "IgCameraLoggerImpl"
            X.0kD.A01(r0, r1)
        L_0x016b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = 0
        L_0x0176:
            int r0 = r14.size()
            if (r1 >= r0) goto L_0x0218
            java.lang.Object r0 = r14.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            long r16 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x0176
        L_0x0190:
            r0 = 4
            if (r1 == r0) goto L_0x01a0
            r0 = 9
            if (r1 == r0) goto L_0x01a0
            r0 = 23
            if (r1 == r0) goto L_0x01a0
            r0 = 3
            if (r1 == r0) goto L_0x01a0
            r2 = 1
            goto L_0x014d
        L_0x01a0:
            if (r6 != r5) goto L_0x014d
            r2 = 1
            goto L_0x014d
        L_0x01a4:
            r19 = r23
            r18 = r23
            goto L_0x0147
        L_0x01a9:
            java.lang.String r0 = r0.toString()
            r13.put(r6, r0)
            goto L_0x012d
        L_0x01b2:
            if (r16 == 0) goto L_0x01b6
            goto L_0x010b
        L_0x01b6:
            r8 = r23
            goto L_0x010b
        L_0x01ba:
            r0 = 3
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            if (r6 == 0) goto L_0x01c5
            r14.add(r6)
        L_0x01c5:
            if (r10 <= 0) goto L_0x00fb
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r14.add(r0)
            goto L_0x00fb
        L_0x01d0:
            r6 = r23
            goto L_0x00e7
        L_0x01d4:
            r21 = 0
            goto L_0x00d2
        L_0x01d8:
            r22 = r23
            r27 = r23
            r26 = r23
            goto L_0x00be
        L_0x01e0:
            r11 = r23
            goto L_0x00b0
        L_0x01e4:
            X.8Cl r0 = r0.A02
            r0.getClass()
            java.lang.String r9 = r0.A0d
            goto L_0x00a0
        L_0x01ed:
            r9 = 0
            goto L_0x00a0
        L_0x01f0:
            X.8K4 r0 = r6.A05
            X.8Kj r0 = r0.A0Z
            if (r0 != 0) goto L_0x01fb
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x007a
        L_0x01fb:
            int r10 = r0.Au0()
            goto L_0x007a
        L_0x0201:
            r25 = 1
            goto L_0x004d
        L_0x0205:
            X.8nh r0 = r9.A00()
            X.8Cl r0 = r0.A02
            r0.getClass()
            int r3 = r0.A08
            goto L_0x003d
        L_0x0212:
            X.8nd r17 = r9.A01()
            goto L_0x0025
        L_0x0218:
            int r0 = r15.size()
            if (r4 >= r0) goto L_0x0232
            java.lang.Object r0 = r15.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.add(r0)
            int r4 = r4 + 1
            goto L_0x0218
        L_0x0232:
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0271
            java.util.Set r0 = r13.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x0245:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0271
            java.lang.Object r13 = r15.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r0 = r13.getKey()
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r13.getValue()
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r14.put(r4, r0)
            goto L_0x0245
        L_0x0271:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r19 == 0) goto L_0x0295
            if (r18 == 0) goto L_0x0295
            long r0 = java.lang.Long.parseLong(r19)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13.add(r0)
            long r0 = java.lang.Long.parseLong(r18)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.add(r0)
        L_0x0295:
            r0 = 1
            r1 = r25
            if (r1 != r5) goto L_0x029b
            r0 = 2
        L_0x029b:
            if (r6 != r12) goto L_0x02cc
            X.28t r6 = X.28t.A05
        L_0x029f:
            if (r28 == 0) goto L_0x03c7
            X.0wc r15 = r8.A01
            java.lang.String r12 = "ig_camera_save_to_camera_roll"
            X.0kJ r1 = r15.A00
            X.0Aj r1 = r15.A00(r1, r12)
            if (r22 == 0) goto L_0x02cf
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r16 = r22.iterator()
        L_0x02b6:
            boolean r12 = r16.hasNext()
            if (r12 == 0) goto L_0x02d0
            java.lang.Object r12 = r16.next()
            com.instagram.api.schemas.CameraTool r12 = (com.instagram.api.schemas.CameraTool) r12
            X.80P r12 = X.2AL.A05(r12)
            if (r12 == 0) goto L_0x02b6
            r15.add(r12)
            goto L_0x02b6
        L_0x02cc:
            X.28t r6 = X.28t.A06
            goto L_0x029f
        L_0x02cf:
            r15 = 0
        L_0x02d0:
            if (r21 != 0) goto L_0x03c1
            r12 = 0
            java.util.ArrayList r12 = r8.A0N(r12)
        L_0x02d7:
            java.util.ArrayList r12 = X.27x.A0G(r12, r15)
            boolean r15 = r1.isSampled()
            if (r15 == 0) goto L_0x046f
            if (r11 != 0) goto L_0x02e7
            X.4yP r11 = r8.A0J()
        L_0x02e7:
            java.lang.String r15 = "applied_effect_ids"
            r1.AAe(r15, r3)
            java.lang.String r3 = "applied_effect_instance_ids"
            r1.AAe(r3, r2)
            java.lang.String r3 = "attribution_ids"
            r2 = r20
            r1.AAe(r3, r2)
            java.lang.String r2 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A8k(r2, r0)
            X.283 r0 = r8.A04
            java.lang.String r3 = r0.A0L
            java.lang.String r2 = "camera_session_id"
            r1.AAJ(r2, r3)
            X.8fP r3 = r8.A0I()
            java.lang.String r2 = "capture_type"
            r1.A8M(r3, r2)
            java.lang.String r2 = "effect_indices"
            r1.A9H(r2, r14)
            X.28D r3 = r0.A09
            java.lang.String r2 = "entry_point"
            r1.A8M(r3, r2)
            java.lang.String r3 = "event_type"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1.A8k(r3, r2)
            java.lang.String r2 = "media_source"
            r1.A8M(r7, r2)
            java.lang.String r2 = "media_type"
            r1.A8M(r6, r2)
            java.lang.String r3 = "module"
            r2 = r24
            r1.AAJ(r3, r2)
            java.lang.String r2 = "postcapture_applied_effect_ids"
            r1.AAe(r2, r13)
            java.lang.String r2 = "postcapture_applied_effect_instance_ids"
            r1.AAe(r2, r4)
            X.JVj r3 = X.C59725JVj.POST_CAPTURE
            java.lang.String r2 = "surface"
            r1.A8M(r3, r2)
            r17 = 0
            r13 = r8
            r14 = r23
            r15 = r14
            r16 = r14
            r18 = r17
            java.util.ArrayList r3 = r13.A0O(r14, r15, r16, r17, r18)
            java.lang.String r2 = "camera_tools"
            r1.AAe(r2, r3)
            java.lang.String r2 = "camera_tools_struct"
            r1.AAe(r2, r12)
            long r2 = (long) r10
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            r2 = 549(0x225, float:7.7E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r1.A9F(r2, r3)
            java.lang.String r2 = "format_variant"
            r1.AAJ(r2, r9)
            java.lang.String r2 = "camera_destination"
            r1.A8M(r11, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r29)
            java.lang.String r2 = "with_audio"
            r1.A7p(r2, r3)
            java.lang.String r2 = r0.A0M
            java.lang.String r0 = "composition_str_id"
            r1.AAJ(r0, r2)
            java.lang.String r0 = "composition_media_type"
            r1.A8M(r6, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "nav_chain"
            r1.AAJ(r0, r2)
            com.instagram.common.session.UserSession r2 = r8.A03
            X.02m r0 = r8.A00
            X.8aX r2 = X.2AL.A07(r0, r2)
            java.lang.String r0 = "system_info"
            r1.AAK(r2, r0)
            r0 = 615(0x267, float:8.62E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = r27
            r1.AAJ(r2, r0)
            r0 = 1387(0x56b, float:1.944E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = r26
            r1.AAJ(r2, r0)
            r1.Cgf()
            return
        L_0x03c1:
            java.util.ArrayList r12 = X.2AL.A0B(r21)
            goto L_0x02d7
        L_0x03c7:
            X.29R r11 = r8.A09
            r1 = 5
            X.0qQ.A0B(r7, r1)
            X.0wc r1 = r11.A01
            X.1Ln r8 = X.1Ln.A08(r1)
            X.0Aj r1 = r8.A00
            boolean r1 = r1.isSampled()
            if (r1 == 0) goto L_0x046f
            java.lang.String r1 = "IG_CAMERA_SAVE_TO_CAMERA_ROLL_CANCEL"
            r8.A0t(r1)
            java.lang.String r1 = "SAVE_TO_CAMERA_ROLL_CANCEL"
            r8.A0r(r1)
            X.29R.A00(r8, r11)
            X.283 r1 = r11.A04
            X.28D r1 = r1.A09
            r8.A0b(r1)
            r8.A0W(r5)
            java.lang.String r1 = "applied_effect_ids"
            r8.A0S(r1, r3)
            java.lang.String r1 = "applied_effect_instance_ids"
            r8.A0S(r1, r2)
            java.lang.String r2 = "attribution_ids"
            r1 = r20
            r8.A0S(r2, r1)
            r8.A0V(r0)
            X.8fP r1 = r11.A0I()
            java.lang.String r0 = "capture_type"
            r8.A0M(r1, r0)
            java.lang.String r1 = "effect_indices"
            X.0Aj r0 = r8.A00
            r0.A9H(r1, r14)
            java.lang.String r0 = "media_source"
            r8.A0M(r7, r0)
            r8.A0c(r6)
            r0 = r24
            r8.A0n(r0)
            java.lang.String r0 = "postcapture_applied_effect_ids"
            r8.A0S(r0, r13)
            java.lang.String r0 = "postcapture_applied_effect_instance_ids"
            r8.A0S(r0, r4)
            r8.A0U()
            r4 = 0
            r0 = r11
            r1 = r23
            r2 = r1
            r3 = r1
            r5 = r4
            java.util.ArrayList r1 = r0.A0O(r1, r2, r3, r4, r5)
            java.lang.String r0 = "camera_tools"
            r8.A0S(r0, r1)
            X.4yP r0 = r11.A0J()
            r8.A0a(r0)
            long r0 = (long) r10
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 549(0x225, float:7.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A0Q(r0, r1)
            java.lang.String r0 = "format_variant"
            r8.A0R(r0, r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r29)
            java.lang.String r0 = "with_audio"
            r8.A0O(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r8.A0u(r0)
            r8.Cgf()
        L_0x046f:
            return
        L_0x0470:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0478:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QG.A05(X.8QG, boolean, boolean):void");
    }

    public final void A06() {
        if (Build.VERSION.SDK_INT < 33) {
            AnonymousClass80D r2 = this.A0A;
            Activity activity = r2.A05;
            String A002 = AnonymousClass000.A00(10);
            if (!1DL.A07(activity, A002)) {
                1DL.A04(r2.A05, new AYM(this), new String[]{A002});
                this.A00 = AnonymousClass05K.A00;
                return;
            }
        }
        A01(this);
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public AnonymousClass8QG(AnonymousClass82W r2, C357638Yz r3, C353828Ji r4, AnonymousClass8QA r5, AnonymousClass8K4 r6, AnonymousClass8BA r7, AnonymousClass8LU r8, AnonymousClass8MC r9, TargetViewSizeProvider targetViewSizeProvider, C352888Fl r11, C3499582p r12, AnonymousClass80D r13, AnonymousClass81T r14, AnonymousClass8DO r15, C353788Jb r16, C353508Hx r17, ClipsCreationViewModel clipsCreationViewModel, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C314676if r20, AnonymousClass88B r21) {
        this.A0A = r13;
        r13.A0M.getClass();
        this.A0G = r13.A0M;
        this.A09 = r12;
        this.A02 = r3;
        this.A0I = r7;
        this.A0M = clipsCreationViewModel;
        this.A0D = clipsCreationDraftViewModel;
        this.A0F = r21;
        this.A07 = r9;
        this.A0C = r17;
        this.A05 = r6;
        this.A06 = r8;
        this.A0J = r11;
        this.A0B = r15;
        this.A0H = r2;
        this.A0L = r16;
        this.A0K = r14;
        this.A04 = r5;
        this.A0E = r20;
        this.A03 = r4;
        this.A08 = targetViewSizeProvider;
    }
}
