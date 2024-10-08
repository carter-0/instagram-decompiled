package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class GLN implements AnonymousClass0lh {
    public static final int A08 = ((int) TimeUnit.MINUTES.toMillis(60));
    public final MusicPageTabType A00;
    public final UserSession A01;
    public final 0xa A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06 = Collections.synchronizedMap(AnonymousClass7TE.A1E());
    public final 1P2 A07;

    public final void A01(C67231sQ r12, UserSession userSession, String str, String str2) {
        C2606046i A012;
        UserSession userSession2 = userSession;
        String str3 = str2;
        AnonymousClass7TG.A1Q(userSession, str2);
        if (r12 != null && (A012 = C291335gz.A01(r12)) != null) {
            AudioPageAssetModel audioPageAssetModel = new AudioPageAssetModel(A012.Adv(), A012.getAssetId(), r12.C1x(), r12.getMusicCanonicalId(), (String) null);
            String str4 = str;
            if (str.equals("on_touch_down")) {
                A00(audioPageAssetModel, userSession, this, str, str2);
            } else {
                0nY.A00().ATE(new C52356GPb(audioPageAssetModel, userSession2, this, str4, str3));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00db, code lost:
        if (X.A17.A00(r8, X.1Au.A00(r8)) != false) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.clips.audio.model.AudioPageAssetModel r17, com.instagram.common.session.UserSession r18, X.GLN r19, java.lang.String r20, java.lang.String r21) {
        /*
            r10 = r17
            java.lang.String r3 = r10.A02
            long r13 = java.lang.System.currentTimeMillis()
            r5 = r19
            X.0xa r4 = r5.A02
            java.lang.String r0 = "LAST_OPENED_AUDIO_PAGE_TIMESTAMP_KEY"
            r1 = -1
            long r6 = r4.getLong(r0, r1)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0043
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = X.C51966G9m.A07(r6)
            long r6 = r2.toHours(r0)
            r1 = 24
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
            java.util.Map r2 = r5.A03
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r2.get(r3)
            if (r0 == 0) goto L_0x0156
            long r0 = X.AnonymousClass7TE.A0R(r0)
            long r8 = r13 - r0
            int r0 = A08
            long r6 = (long) r0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0044
        L_0x0043:
            return
        L_0x0044:
            java.util.Map r8 = r5.A04
            r6 = r20
            boolean r0 = r8.containsKey(r6)
            r7 = 0
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "loop_playback_25_percent"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0071
            java.util.Map r0 = r5.A05
            java.lang.Object r1 = r0.get(r3)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L_0x0068
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            r0.put(r3, r1)
        L_0x0068:
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x0043
            r1.add(r6)
        L_0x0071:
            java.util.Map r4 = r5.A06
            java.lang.Number r0 = X.C51966G9m.A14(r3, r4)
            int r1 = X.C51967G9n.A04(r0, r7)
            java.lang.Object r0 = r8.get(r6)
            if (r0 == 0) goto L_0x015b
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.put(r3, r0)
            java.lang.Number r0 = X.C51966G9m.A14(r3, r4)
            if (r0 == 0) goto L_0x0043
            int r9 = r0.intValue()
            boolean r0 = X.AnonymousClass1B0.A05
            com.instagram.common.session.UserSession r8 = r5.A01
            X.1B0 r1 = X.AnonymousClass1B1.A00(r8)
            X.1B2 r0 = X.1B2.A0H
            boolean r0 = r1.A00(r0)
            X.0Tu r4 = X.0Tu.A05
            if (r0 != 0) goto L_0x014f
            r0 = 36609725706475430(0x82105a000f17a6, double:3.215476180083532E-306)
        L_0x00ae:
            long r11 = X.182.A01(r4, r8, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            X.0qQ.A0A(r0)
            r0 = 36328873499311763(0x8110eb00043e93, double:3.0378641133721636E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x00e6
            r0 = 36328873499442837(0x8110eb00063e95, double:3.0378641134550554E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 1
            X.0qQ.A0B(r8, r0)
            X.1Av r0 = X.1Au.A00(r8)
            boolean r0 = X.A17.A00(r8, r0)
            if (r0 == 0) goto L_0x00e6
        L_0x00dd:
            r0 = 36609725706475430(0x82105a000f17a6, double:3.215476180083532E-306)
            long r11 = X.182.A01(r4, r8, r0)
        L_0x00e6:
            long r0 = (long) r9
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x0043
            java.lang.String r0 = "on_touch_down"
            boolean r0 = X.0qQ.A0K(r6, r0)
            r6 = r18
            if (r0 == 0) goto L_0x0134
            r0 = 36316138921005053(0x81055600000ffd, double:3.029810714772969E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x010b
            r0 = 36316138921070590(0x81055600010ffe, double:3.029810714814415E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0134
        L_0x010b:
            com.instagram.api.schemas.MusicPageTabType r0 = r5.A00
            r20 = 1
            X.IMb r15 = new X.IMb
            r16 = r0
            r18 = r7
            r19 = r7
            r15.<init>(r16, r17, r18, r19, r20)
        L_0x011a:
            r16 = 0
            r18 = r21
            r19 = r16
            r20 = r7
            r21 = r7
            r17 = r6
            r15.AQ0(r16, r17, r18, r19, r20, r21)
            X.0qQ.A06(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r2.put(r3, r0)
            return
        L_0x0134:
            r0 = 36316138921136127(0x81055600020fff, double:3.029810714855861E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 != 0) goto L_0x0043
            com.instagram.api.schemas.MusicPageTabType r0 = r5.A00
            r18 = 100
            r19 = 1
            X.IMb r15 = new X.IMb
            r16 = r0
            r20 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x011a
        L_0x014f:
            r0 = 36609725706409893(0x82105a000e17a5, double:3.2154761800420864E-306)
            goto L_0x00ae
        L_0x0156:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x015b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLN.A00(com.instagram.clips.audio.model.AudioPageAssetModel, com.instagram.common.session.UserSession, X.GLN, java.lang.String, java.lang.String):void");
    }

    public final void onSessionWillEnd() {
        this.A06.clear();
        this.A05.clear();
        this.A03.clear();
        0xY AR4 = this.A02.AR4();
        AR4.AHM();
        AR4.apply();
    }

    public GLN(MusicPageTabType musicPageTabType, UserSession userSession) {
        this.A00 = musicPageTabType;
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A04 = A1E;
        this.A05 = Collections.synchronizedMap(AnonymousClass7TE.A1E());
        this.A03 = Collections.synchronizedMap(AnonymousClass7TE.A1E());
        this.A01 = userSession;
        this.A02 = 1Al.A01(userSession).A03(1An.A0f);
        this.A07 = 1P1.A00(userSession);
        A1E.put("like_reels", 30);
        A1E.put("save_reels", 50);
        A1E.put("open_profile_page", 30);
        A1E.put("open_share_sheet", 30);
        A1E.put("open_comments", 15);
        A1E.put("follow_creator", 15);
        A1E.put("loop_playback_25_percent", 4);
        A1E.put("on_touch_down", 1073741823);
    }
}
