package com.instagram.creation.capture.quickcapture.sundial.store;

import X.00k;
import X.01e;
import X.02z;
import X.05G;
import X.0Tu;
import X.0Yt;
import X.0eP;
import X.0qQ;
import X.0sn;
import X.0sr;
import X.106;
import X.10b;
import X.10q;
import X.182;
import X.19B;
import X.1Eo;
import X.2Fk;
import X.2Nn;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0qC;
import X.AnonymousClass0r6;
import X.AnonymousClass109;
import X.AnonymousClass10A;
import X.AnonymousClass10H;
import X.AnonymousClass11O;
import X.AnonymousClass4D7;
import X.AnonymousClass831;
import X.AnonymousClass836;
import X.AnonymousClass839;
import X.AnonymousClass83A;
import X.AnonymousClass83B;
import X.AnonymousClass83D;
import X.AnonymousClass83E;
import X.AnonymousClass83F;
import X.AnonymousClass83G;
import X.AnonymousClass8IJ;
import X.AnonymousClass8IK;
import X.AnonymousClass8Y4;
import X.AnonymousClass9KC;
import X.AnonymousClass9KL;
import X.AnonymousClass9RI;
import X.C226292g8;
import X.C229632nm;
import X.C262094Cc;
import X.C262204Co;
import X.C262224Cq;
import X.C357588Yu;
import X.C361268fw;
import X.C361278fx;
import X.C376509Ig;
import X.C376889Js;
import X.C376959Jz;
import X.C61860pz;
import android.content.Context;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

public final class ClipsAudioStore {
    public AudioOverlayTrack A00;
    public C262204Co A01;
    public boolean A02;
    public final Context A03;
    public final 01e A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final 2Fk A07;
    public final UserSession A08;
    public final AnonymousClass83B A09;
    public final AnonymousClass83A A0A;
    public final 2Nn A0B;
    public final List A0C = new ArrayList();
    public final C262094Cc A0D;
    public final C262224Cq A0E;
    public final AnonymousClass0r6 A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final 05G A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final 05G A0T;
    public final 05G A0U;
    public final AnonymousClass0Ud A0V;
    public final AnonymousClass0Ud A0W;
    public final AnonymousClass0Ud A0X;
    public final AnonymousClass0Ud A0Y;
    public final AnonymousClass0Ud A0Z;
    public final AnonymousClass0Ud A0a;
    public final AnonymousClass0Ud A0b;
    public final AnonymousClass0Ud A0c;
    public final AnonymousClass0Ud A0d;
    public final AnonymousClass0Ud A0e;
    public final AnonymousClass0Ud A0f;
    public final AnonymousClass0Ud A0g;
    public final AnonymousClass0Ud A0h;
    public final AnonymousClass0Ud A0i;
    public final AnonymousClass0Ud A0j;
    public final AnonymousClass0Ud A0k;
    public final AnonymousClass0Ud A0l;
    public final AnonymousClass0Ud A0m;
    public final AnonymousClass0Ud A0n;
    public final AnonymousClass836 A0o;
    public final 05G A0p;
    public final 05G A0q;
    public final AnonymousClass0Ud A0r;
    public final AnonymousClass0Ud A0s;
    public final AnonymousClass0Ud A0t;

    public final void A08(C361278fx r27) {
        boolean z;
        OriginalAudioSubtype originalAudioSubtype;
        int i;
        int i2;
        C361278fx r2 = r27;
        0qQ.A0B(r2, 0);
        if (AnonymousClass9RI.A00(r2)) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) r2.A01;
            if (audioOverlayTrack != null && audioOverlayTrack.A04 == 0 && ((i2 = audioOverlayTrack.A01) == 0 || i2 == audioOverlayTrack.A02)) {
                z = true;
            } else {
                z = false;
            }
            this.A02 = !z;
            if (r2.A00 == 3 && audioOverlayTrack != null && audioOverlayTrack.A04 + audioOverlayTrack.A02 < A00(this)) {
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    originalAudioSubtype = musicAssetModel.A01;
                } else {
                    originalAudioSubtype = null;
                }
                if (originalAudioSubtype != OriginalAudioSubtype.A06 && AnonymousClass8IK.A00(this.A08)) {
                    audioOverlayTrack.A01 = audioOverlayTrack.A04 + audioOverlayTrack.A02;
                    ArrayList A1M = 0sr.A1M(new C361278fx[]{r2});
                    int i3 = audioOverlayTrack.A01;
                    while (i3 < A00(this) && i3 != 0) {
                        if (audioOverlayTrack.A02 + i3 >= A00(this)) {
                            i = 0;
                        } else {
                            i = audioOverlayTrack.A02 + i3;
                        }
                        int i4 = audioOverlayTrack.A03;
                        int i5 = audioOverlayTrack.A02;
                        String str = audioOverlayTrack.A0B;
                        String str2 = audioOverlayTrack.A0A;
                        String str3 = audioOverlayTrack.A0E;
                        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
                        MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
                        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
                        AnonymousClass8IJ r5 = audioOverlayTrack.A05;
                        float f = audioOverlayTrack.A00;
                        int i6 = i4;
                        int i7 = i5;
                        String str4 = str2;
                        String str5 = str3;
                        MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
                        String str6 = str;
                        InstagramAudioApplySource instagramAudioApplySource = audioOverlayTrack.A07;
                        MusicAssetModel musicAssetModel3 = musicAssetModel2;
                        AnonymousClass8IJ r12 = r5;
                        DownloadedTrack downloadedTrack2 = downloadedTrack;
                        AudioOverlayTrack audioOverlayTrack2 = new AudioOverlayTrack(r12, downloadedTrack2, instagramAudioApplySource, musicAssetModel3, musicBrowseCategory2, str6, str4, str5, audioOverlayTrack.A0C, f, i6, i7, i3, i);
                        String obj = UUID.randomUUID().toString();
                        0qQ.A07(obj);
                        audioOverlayTrack2.A0D = obj;
                        A1M.add(new AnonymousClass8Y4(audioOverlayTrack2));
                        i3 = audioOverlayTrack2.A01;
                    }
                    A0C(A1M);
                    return;
                }
            }
            this.A0G.Epw(0sr.A1M(new C361278fx[]{r2}));
        }
    }

    public final void A0D(List list) {
        AudioOverlayTrack A032;
        AudioOverlayTrack A012;
        05G r6 = this.A0G;
        List list2 = (List) r6.getValue();
        if (list2 != null && list.size() == list2.size()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                0eP r3 = (0eP) it.next();
                C376509Ig r2 = (C376509Ig) r3.A01;
                if (!(0qQ.A0K(r2.A01, true) || (A032 = A03((String) r3.A00)) == null || (A012 = A01(r2, this, A032)) == null)) {
                    arrayList.add(new AnonymousClass8Y4(A012));
                }
            }
            r6.Epw(arrayList);
        }
    }

    public static final int A00(ClipsAudioStore clipsAudioStore) {
        return ((AnonymousClass831) clipsAudioStore.A0o.A03.getValue()).A00;
    }

    public static final AudioOverlayTrack A01(C376509Ig r15, ClipsAudioStore clipsAudioStore, AudioOverlayTrack audioOverlayTrack) {
        int i;
        int i2;
        int i3;
        int i4;
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        MusicAssetModel musicAssetModel = audioOverlayTrack2.A08;
        if (musicAssetModel != null) {
            if (musicAssetModel.A00 > 0) {
                C376509Ig r4 = r15;
                Number number = (Number) r15.A03;
                if (number != null) {
                    i = number.intValue();
                } else {
                    Number number2 = (Number) r15.A04;
                    i = audioOverlayTrack2.A03;
                    if (number2 != null && (i = i + (number2.intValue() - audioOverlayTrack2.A04)) < 0) {
                        i = 0;
                    }
                }
                Number number3 = (Number) r15.A04;
                if (number3 != null) {
                    i2 = number3.intValue();
                } else {
                    i2 = audioOverlayTrack2.A04;
                }
                Number number4 = (Number) r4.A02;
                if (number4 != null) {
                    i3 = number4.intValue();
                } else {
                    i3 = audioOverlayTrack2.A01;
                }
                if (i >= 0 && (i4 = audioOverlayTrack2.A02) > 0 && i2 >= 0 && i3 >= 0) {
                    if (i3 == A00(clipsAudioStore)) {
                        i3 = 0;
                    }
                    String str = audioOverlayTrack2.A0B;
                    String str2 = audioOverlayTrack2.A0A;
                    String str3 = audioOverlayTrack2.A0E;
                    MusicBrowseCategory musicBrowseCategory = audioOverlayTrack2.A09;
                    DownloadedTrack downloadedTrack = audioOverlayTrack2.A06;
                    AnonymousClass8IJ r3 = audioOverlayTrack2.A05;
                    float f = audioOverlayTrack2.A00;
                    AudioOverlayTrack audioOverlayTrack3 = new AudioOverlayTrack(r3, downloadedTrack, audioOverlayTrack2.A07, musicAssetModel, musicBrowseCategory, str, str2, str3, audioOverlayTrack2.A0C, f, i, i4, i2, i3);
                    String str4 = audioOverlayTrack2.A0D;
                    0qQ.A0B(str4, 0);
                    audioOverlayTrack3.A0D = str4;
                    return audioOverlayTrack3;
                }
            }
            return null;
        }
        throw new IllegalStateException("Music asset should not be null when adjusting audio");
    }

    public final int A02(boolean z) {
        List list = (List) this.A0V.getValue();
        if (list == null || list.isEmpty()) {
            return 0;
        }
        if (z || this.A02 || !AnonymousClass8IK.A00(this.A08)) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((C361278fx) next).A00 == 3) {
                    arrayList.add(next);
                }
            }
            return arrayList.size();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (((C361278fx) next2).A00 == 3) {
                arrayList2.add(next2);
            }
        }
        int size = arrayList2.size();
        if (1 > size) {
            return size;
        }
        return 1;
    }

    public final AudioOverlayTrack A03(String str) {
        List<C361278fx> list;
        if (str == null || (list = (List) this.A0G.getValue()) == null) {
            return null;
        }
        for (C361278fx r0 : list) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) r0.A01;
            if (audioOverlayTrack != null && 0qQ.A0K(audioOverlayTrack.A0D, str)) {
                return audioOverlayTrack;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.io.File r11, java.lang.String r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r10 = this;
            r4 = 43
            boolean r0 = X.C66128MDg.A01(r4, r14)
            if (r0 == 0) goto L_0x006a
            r2 = r14
            X.MDg r2 = (X.C66128MDg) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x006a
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r4 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r3) goto L_0x0070
            java.lang.Object r6 = r2.A01
            X.0rm r6 = (X.0rm) r6
            X.0eS.A00(r4)
        L_0x0028:
            java.lang.Object r0 = r6.A00
            return r0
        L_0x002b:
            X.0eS.A00(r4)
            X.2Nn r0 = r10.A0B
            java.io.File r0 = r0.A01()
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r12)
            java.lang.String r0 = "_audio"
            java.lang.String r0 = X.002.A0R(r13, r0)
            java.io.File r7 = new java.io.File
            r7.<init>(r4, r0)
            X.0rm r6 = new X.0rm
            r6.<init>()
            r5 = r11
            r6.A00 = r11
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x0067
            X.4Cc r0 = r10.A0D
            r8 = 0
            r9 = 39
            X.JZr r4 = new X.JZr
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A01 = r6
            r2.A00 = r3
            java.lang.Object r0 = X.1Eo.A00(r2, r0, r4)
            if (r0 != r1) goto L_0x0028
            return r1
        L_0x0067:
            r6.A00 = r7
            goto L_0x0028
        L_0x006a:
            X.MDg r2 = new X.MDg
            r2.<init>(r10, r14, r4)
            goto L_0x0016
        L_0x0070:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore.A04(java.io.File, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void A05() {
        this.A0G.Epw(0sr.A1M(new C361278fx[]{C361268fw.A00}));
    }

    public final void A06(float f) {
        this.A0q.Epw(Float.valueOf(C229632nm.A02(f, 0.0f, 1.0f)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.8Yx] */
    public final void A07(float f) {
        05G r2 = this.A0K;
        float A012 = C229632nm.A01(f);
        ? obj = new Object();
        obj.A00 = A012;
        r2.Epw(obj);
    }

    public final void A0A(C357588Yu r5) {
        if (182.A06(0Tu.A05, this.A08, 36323771077897683L)) {
            this.A0T.Epw(r5);
        }
    }

    public final void A0B(HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        05G r12 = this.A0G;
        List<C361278fx> list = (List) r12.getValue();
        if (list != null) {
            for (C361278fx r2 : list) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) r2.A01;
                if (audioOverlayTrack != null) {
                    String str = audioOverlayTrack.A0D;
                    HashMap hashMap2 = hashMap;
                    if (hashMap2.get(str) != null) {
                        Number number = (Number) hashMap2.get(str);
                        if (number != null) {
                            float floatValue = number.floatValue();
                            if (floatValue != audioOverlayTrack.A00) {
                                this.A02 = true;
                            }
                            int i = audioOverlayTrack.A03;
                            int i2 = audioOverlayTrack.A04;
                            int i3 = audioOverlayTrack.A01;
                            String str2 = audioOverlayTrack.A0B;
                            String str3 = audioOverlayTrack.A0A;
                            String str4 = audioOverlayTrack.A0E;
                            MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
                            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                            DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
                            AnonymousClass8IJ r3 = audioOverlayTrack.A05;
                            String str5 = audioOverlayTrack.A0C;
                            InstagramAudioApplySource instagramAudioApplySource = audioOverlayTrack.A07;
                            MusicAssetModel musicAssetModel2 = musicAssetModel;
                            MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
                            AnonymousClass8IJ r18 = r3;
                            DownloadedTrack downloadedTrack2 = downloadedTrack;
                            AudioOverlayTrack audioOverlayTrack2 = new AudioOverlayTrack(r18, downloadedTrack2, instagramAudioApplySource, musicAssetModel2, musicBrowseCategory2, str2, str3, str4, str5, floatValue, i, audioOverlayTrack.A02, i2, i3);
                            String str6 = audioOverlayTrack.A0D;
                            0qQ.A0B(str6, 0);
                            audioOverlayTrack2.A0D = str6;
                            r2 = new AnonymousClass8Y4(audioOverlayTrack2);
                        }
                    }
                }
                arrayList.add(r2);
            }
        }
        r12.Epw(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E() {
        /*
            r3 = this;
            X.05G r0 = r3.A0G
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0013:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.next()
            X.8fx r0 = (X.C361278fx) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0013
            r2.add(r0)
            goto L_0x0013
        L_0x0027:
            java.lang.Object r0 = X.00k.A0J(r2)
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            if (r0 == 0) goto L_0x0036
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A08
            if (r0 == 0) goto L_0x0036
            com.instagram.api.schemas.OriginalAudioSubtype r2 = r0.A01
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            com.instagram.api.schemas.OriginalAudioSubtype r1 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            r0 = 0
            if (r2 != r1) goto L_0x003d
            r0 = 1
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore.A0E():boolean");
    }

    public final boolean A0F() {
        C361278fx r0;
        AudioOverlayTrack audioOverlayTrack;
        String str;
        String str2;
        05G r1 = this.A0G;
        List list = (List) r1.getValue();
        if (list != null && (r0 = (C361278fx) 00k.A0J(list)) != null && (audioOverlayTrack = (AudioOverlayTrack) r0.A01) != null && (str = audioOverlayTrack.A0A) != null) {
            List list2 = (List) r1.getValue();
            if (list2 != null && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AudioOverlayTrack audioOverlayTrack2 = (AudioOverlayTrack) ((C361278fx) it.next()).A01;
                    if (audioOverlayTrack2 != null) {
                        str2 = audioOverlayTrack2.A0A;
                    } else {
                        str2 = null;
                    }
                    if (!0qQ.A0K(str2, str)) {
                        break;
                    }
                }
            }
            if (A0E() || this.A02 || !AnonymousClass8IK.A00(this.A08)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public ClipsAudioStore(Context context, UserSession userSession, AnonymousClass836 r14, 2Nn r15, C262094Cc r16, C262224Cq r17) {
        this.A03 = context;
        this.A08 = userSession;
        this.A0o = r14;
        C262224Cq r4 = r17;
        this.A0E = r4;
        this.A0D = r16;
        this.A0B = r15;
        02z A012 = 106.A01((Object) null);
        this.A0G = A012;
        this.A0V = A012;
        AnonymousClass0qC r0 = new AnonymousClass0qC(A012);
        19B r3 = 19B.A00;
        this.A05 = C226292g8.A00(r3, r0);
        02z A013 = 106.A01((Object) null);
        this.A0p = A013;
        this.A0X = 10b.A03(A013);
        AnonymousClass83A r10 = new AnonymousClass83A(new AnonymousClass839(r15));
        this.A0A = r10;
        AnonymousClass83B r1 = new AnonymousClass83B(r15, r4, A00(this));
        this.A09 = r1;
        AnonymousClass0qC r02 = new AnonymousClass0qC(new AnonymousClass83D(A012));
        AnonymousClass109 r6 = AnonymousClass10A.A01;
        C361268fw r7 = C361268fw.A00;
        this.A0Y = 10b.A02(r7, r4, r02, r6);
        this.A06 = C226292g8.A00(r3, new AnonymousClass0qC(new AnonymousClass83E(A012)));
        02z A014 = 106.A01(r7);
        this.A0M = A014;
        this.A0d = A014;
        0sn r9 = 0sn.A00;
        02z A015 = 106.A01(r9);
        this.A0S = A015;
        this.A0l = A015;
        02z A016 = 106.A01((Object) null);
        this.A0N = A016;
        this.A0s = A016;
        this.A0F = AnonymousClass10H.A03(new AnonymousClass9KC(this, (AnonymousClass4D7) null, 0), A015, A016);
        05G r2 = r10.A03;
        this.A07 = C226292g8.A00(r3, r2);
        Float valueOf = Float.valueOf(1.0f);
        02z r03 = new 02z(valueOf);
        this.A0q = r03;
        this.A0k = 10b.A03(r03);
        02z r04 = new 02z(valueOf);
        this.A0H = r04;
        this.A0W = 10b.A03(r04);
        02z r05 = new 02z(valueOf);
        this.A0U = r05;
        this.A0n = 10b.A03(r05);
        02z r06 = new 02z(valueOf);
        this.A0O = r06;
        this.A0g = 10b.A03(r06);
        02z r07 = new 02z(valueOf);
        this.A0Q = r07;
        this.A0i = 10b.A03(r07);
        AnonymousClass0Ud r12 = r1.A04;
        this.A0f = r12;
        this.A0j = 10b.A03(r2);
        02z A017 = 106.A01(r9);
        this.A0P = A017;
        this.A0h = 10b.A03(A017);
        02z A018 = 106.A01(new AnonymousClass83F(new LinkedHashMap(), new LinkedHashMap()));
        this.A0I = A018;
        this.A0r = 10b.A03(A018);
        02z A019 = 106.A01(0Yt.A0E());
        this.A0J = A019;
        this.A0a = 10b.A03(A019);
        02z A0110 = 106.A01(0Yt.A0E());
        this.A0R = A0110;
        this.A0t = 10b.A03(A0110);
        this.A0e = r12;
        this.A0Z = 10b.A02((Object) null, r4, 10q.A02(new AnonymousClass9KL(this, (AnonymousClass4D7) null), new AnonymousClass83G(A019)), r6);
        02z A0111 = 106.A01((Object) null);
        this.A0T = A0111;
        this.A0m = 10b.A03(A0111);
        02z A0112 = 106.A01((Object) null);
        this.A0L = A0112;
        this.A0c = 10b.A03(A0112);
        02z A0113 = 106.A01((Object) null);
        this.A0K = A0113;
        this.A0b = 10b.A03(A0113);
        this.A04 = new 01e(50);
        AnonymousClass11O.A03(r4, new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 39), r14.A03));
        1Eo.A03(AnonymousClass05K.A00, r3, new C376889Js(this, (AnonymousClass4D7) null, 46), r4);
    }

    public final void A09(C361278fx r9, AudioOverlayTrack audioOverlayTrack) {
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        if (AnonymousClass9RI.A00(r9)) {
            this.A02 = true;
            05G r5 = this.A0G;
            Collection collection = (Collection) r5.getValue();
            if (collection == null) {
                arrayList = new ArrayList();
            }
            if (r9 instanceof AnonymousClass8Y4) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C361268fw) {
                        arrayList2.add(next);
                    }
                }
                arrayList.removeAll(arrayList2);
            }
            int i = 0;
            Iterator it2 = arrayList.iterator();
            if (audioOverlayTrack != null) {
                while (true) {
                    if (it2.hasNext()) {
                        AudioOverlayTrack audioOverlayTrack2 = (AudioOverlayTrack) ((C361278fx) it2.next()).A01;
                        if (audioOverlayTrack2 != null) {
                            str3 = audioOverlayTrack2.A0D;
                        } else {
                            str3 = null;
                        }
                        if (0qQ.A0K(str3, audioOverlayTrack.A0D)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                arrayList.add(r9);
                r5.Epw(arrayList);
            }
            while (true) {
                if (it2.hasNext()) {
                    AudioOverlayTrack audioOverlayTrack3 = (AudioOverlayTrack) ((C361278fx) it2.next()).A01;
                    if (audioOverlayTrack3 != null) {
                        str = audioOverlayTrack3.A0D;
                    } else {
                        str = null;
                    }
                    AudioOverlayTrack audioOverlayTrack4 = (AudioOverlayTrack) r9.A01;
                    if (audioOverlayTrack4 != null) {
                        str2 = audioOverlayTrack4.A0D;
                    } else {
                        str2 = null;
                    }
                    if (0qQ.A0K(str, str2)) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            arrayList.add(r9);
            r5.Epw(arrayList);
            if (i != -1) {
                arrayList.set(i, r9);
                r5.Epw(arrayList);
            }
            arrayList.add(r9);
            r5.Epw(arrayList);
        }
    }

    public final void A0C(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AnonymousClass9RI.A00((C361278fx) it.next())) {
                return;
            }
        }
        this.A0G.Epw(list);
    }
}
