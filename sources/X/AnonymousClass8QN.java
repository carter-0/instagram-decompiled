package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.8QN  reason: invalid class name */
public final class AnonymousClass8QN implements AnonymousClass0iw, AnonymousClass8QO, AnonymousClass7TJ, C352348Cz, C3493580b, AnonymousClass8QC {
    public static final String __redex_internal_original_name = "MultiMediaEditController";
    public int A00;
    public int A01;
    public C53401GnY A02;
    public IgImageView A03;
    public C352278Cs A04 = new AnonymousClass8QS(this);
    public AnonymousClass6ST A05;
    public Runnable A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Activity A0A;
    public final View.OnTouchListener A0B;
    public final View A0C;
    public final View A0D;
    public final AnonymousClass4DH A0E;
    public final AnonymousClass0iw A0F;
    public final UserSession A0G;
    public final TouchInterceptorFrameLayout A0H;
    public final C71662eb A0I;
    public final C71662eb A0J;
    public final AnonymousClass8QA A0K;
    public final AnonymousClass8QV A0L;
    public final AnonymousClass8K4 A0M;
    public final AnonymousClass8BA A0N;
    public final AnonymousClass8LU A0O;
    public final TargetViewSizeProvider A0P;
    public final C3499582p A0Q;
    public final C3509286x A0R;
    public final AnonymousClass80D A0S;
    public final AnonymousClass8QG A0T;
    public final AnonymousClass88O A0U;
    public final AnonymousClass8KO A0V;
    public final AnonymousClass8L3 A0W;
    public final AnonymousClass8K7 A0X = new AnonymousClass8QQ(this);
    public final AnonymousClass8QP A0Y;
    public final AnonymousClass80U A0Z;
    public final C353918Jw A0a;
    public final C354148Kv A0b;
    public final AnonymousClass8QZ A0c;
    public final AnonymousClass8KX A0d;
    public final AnonymousClass8R4 A0e;
    public final InteractiveDrawableContainer A0f;
    public final Runnable A0g;
    public final Runnable A0h = new AnonymousClass8QR(this);
    public final String A0i;
    public final String A0j;
    public final Map A0k;
    public final AnonymousClass0eK A0l;
    public final AnonymousClass0eK A0m;
    public final AnonymousClass0eK A0n;
    public final int A0o;
    public final AnonymousClass4D6 A0p;
    public final C352888Fl A0q;
    public final C3495780x A0r;

    public final void DBP(boolean z) {
        A07((AnonymousClass8QZ) null);
    }

    public final void DLn(AnonymousClass9SZ r1, int i) {
    }

    public final void DMW() {
    }

    public final void DMZ(List list) {
    }

    private C365798nh A00(String str) {
        Integer num;
        AnonymousClass8BA r3 = this.A0N;
        C352218Cl r2 = r3.A0O;
        r2.getClass();
        C365798nh r4 = new C365798nh((Bitmap) null, r2, str, false);
        C3499482o r0 = this.A0Q.A02;
        AnonymousClass802 r1 = r3.A0B;
        AnonymousClass82Y r32 = r0.A01;
        List list = r32.A0m;
        list.add(r4);
        r32.A0o.add(r1);
        if (list.size() == 1) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        r32.A0B = num;
        this.A0c.A09(list.size() - 1);
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        if (r6 == r5) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.common.gallery.Medium r21, X.AnonymousClass8QN r22, X.AnonymousClass8QZ r23, X.1Xj r24) {
        /*
            r3 = r24
            java.lang.String r0 = r3.getId()
            if (r0 == 0) goto L_0x0111
            java.lang.String r4 = r3.getId()
        L_0x000c:
            r0 = r22
            X.8BA r1 = r0.A0N
            X.8Cl r2 = r1.A0O
            if (r2 == 0) goto L_0x00a1
            com.instagram.common.gallery.model.GalleryItem r6 = new com.instagram.common.gallery.model.GalleryItem
            r6.<init>(r2, r4)
            X.8QP r5 = r0.A0Y
            r4 = 0
            X.9SZ r2 = new X.9SZ
            r2.<init>(r6, r4)
            boolean r2 = r5.A8m(r2)
            if (r2 == 0) goto L_0x00a1
            X.8QA r2 = r0.A0K
            java.lang.String r4 = r3.getId()
            X.8QE r2 = r2.A0H
            java.util.HashMap r2 = r2.A00
            boolean r2 = r2.containsKey(r4)
            boolean r5 = r3.A5v()
            r8 = r21
            r4 = r23
            if (r5 == 0) goto L_0x00a5
            boolean r5 = r3.CeS()
            if (r5 == 0) goto L_0x00a5
            X.28D r6 = r1.A0q
            X.28D r5 = X.28D.A2Y
            if (r6 == r5) goto L_0x011b
            X.28D r5 = X.28D.A0Z
            if (r6 == r5) goto L_0x011b
            java.lang.String r7 = r3.getId()
            r7.getClass()
            r8.getClass()
            android.app.Activity r6 = r0.A0A
            com.instagram.common.session.UserSession r5 = r0.A0G
            X.7zv r6 = X.C39906AIv.A05(r6, r8, r5)
            X.8Cl r5 = r1.A0O
            if (r5 == 0) goto L_0x006d
            X.0v6 r5 = r5.A0I
            r6.A0U = r5
            android.graphics.Bitmap r5 = r1.A02
            r6.A0N = r5
        L_0x006d:
            X.8nh r8 = new X.8nh
            r8.<init>(r6, r7)
            X.82p r5 = r0.A0Q
            X.82o r6 = r5.A02
            X.802 r5 = r1.A0C
            X.82Y r7 = r6.A01
            java.util.List r6 = r7.A0m
            r6.add(r8)
            java.util.List r1 = r7.A0o
            r1.add(r5)
            int r5 = r6.size()
            r1 = 1
            if (r5 != r1) goto L_0x00a2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x008d:
            r7.A0B = r1
            int r1 = r6.size()
            int r5 = r1 + -1
            X.8QZ r1 = r0.A0c
            r1.A09(r5)
            X.Aq6 r1 = new X.Aq6
            r1.<init>(r0, r4, r3, r2)
        L_0x009f:
            r0.A06 = r1
        L_0x00a1:
            return
        L_0x00a2:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x008d
        L_0x00a5:
            java.lang.String r5 = r3.getId()
            r5.getClass()
            X.8nh r14 = r0.A00(r5)
            X.82p r5 = r0.A0Q
            X.82o r5 = r5.A02
            X.82Y r5 = r5.A01
            java.util.List r5 = r5.A0m
            int r5 = r5.size()
            int r17 = r5 + -1
            X.28D r6 = r1.A0q
            X.28D r5 = X.28D.A0Z
            if (r6 == r5) goto L_0x00ca
            if (r2 == 0) goto L_0x00ca
            r0.A07(r4)
            return
        L_0x00ca:
            boolean r1 = r3.A5v()
            if (r1 == 0) goto L_0x010b
            X.28D r1 = X.28D.A2Y
            if (r6 == r1) goto L_0x00d7
            r13 = 1
            if (r6 != r5) goto L_0x00d8
        L_0x00d7:
            r13 = 0
        L_0x00d8:
            android.app.Activity r7 = r0.A0A
            com.instagram.common.session.UserSession r1 = r0.A0G
            com.instagram.user.model.User r9 = r3.A2A(r1)
            r9.getClass()
            java.lang.String r10 = r3.A2n()
            r8.getClass()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r0.A0P
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r1 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r1
            X.81W r1 = r1.A0K
            int r11 = r1.getWidth()
            int r12 = r1.getHeight()
            X.9jy r6 = new X.9jy
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AZ5 r11 = new X.AZ5
            r12 = r6
            r13 = r0
            r15 = r4
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6.A9D(r11)
            return
        L_0x010b:
            X.Aor r1 = new X.Aor
            r1.<init>(r0, r4, r3)
            goto L_0x009f
        L_0x0111:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            goto L_0x000c
        L_0x011b:
            r8.getClass()
            java.lang.String r5 = r3.getId()
            r5.getClass()
            X.8nh r19 = r0.A00(r5)
            X.82p r5 = r0.A0Q
            X.82o r5 = r5.A02
            X.82Y r5 = r5.A01
            java.util.List r5 = r5.A0m
            int r5 = r5.size()
            int r23 = r5 + -1
            android.app.Activity r5 = r0.A0A     // Catch:{ IllegalArgumentException -> 0x018a }
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ IllegalArgumentException -> 0x018a }
            r5 = 2131165207(0x7f070017, float:1.7944625E38)
            int r5 = r6.getDimensionPixelSize(r5)     // Catch:{ IllegalArgumentException -> 0x018a }
            float r6 = (float) r5     // Catch:{ IllegalArgumentException -> 0x018a }
            com.instagram.common.session.UserSession r9 = r0.A0G     // Catch:{ IllegalArgumentException -> 0x018a }
            X.9sQ r10 = X.C391149sQ.STORY_EOY_SHARE     // Catch:{ IllegalArgumentException -> 0x018a }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r5 = r0.A0P     // Catch:{ IllegalArgumentException -> 0x018a }
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r5 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r5     // Catch:{ IllegalArgumentException -> 0x018a }
            X.81W r5 = r5.A0K     // Catch:{ IllegalArgumentException -> 0x018a }
            int r14 = r5.getWidth()     // Catch:{ IllegalArgumentException -> 0x018a }
            int r15 = r5.getHeight()     // Catch:{ IllegalArgumentException -> 0x018a }
            r5 = 1
            X.9Hy r7 = new X.9Hy     // Catch:{ IllegalArgumentException -> 0x018a }
            r7.<init>((float) r6)     // Catch:{ IllegalArgumentException -> 0x018a }
            java.lang.String r12 = "gallery_story_video_sticker"
            X.0qQ.A0B(r9, r5)     // Catch:{ IllegalArgumentException -> 0x018a }
            r18 = 0
            r13 = 0
            X.9sL r11 = X.C391099sL.NOT_CLIPS     // Catch:{ IllegalArgumentException -> 0x018a }
            r16 = -1
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9X8 r6 = new X.9X8     // Catch:{ IllegalArgumentException -> 0x018a }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IllegalArgumentException -> 0x018a }
            X.87i r1 = r1.A0x     // Catch:{ IllegalArgumentException -> 0x018a }
            X.6b1 r22 = X.C39906AIv.A03(r1)     // Catch:{ IllegalArgumentException -> 0x018a }
            X.Aqw r1 = new X.Aqw     // Catch:{ IllegalArgumentException -> 0x018a }
            r17 = r6
            r18 = r0
            r20 = r4
            r21 = r3
            r24 = r2
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IllegalArgumentException -> 0x018a }
            r0.A06 = r1     // Catch:{ IllegalArgumentException -> 0x018a }
            return
        L_0x018a:
            r2 = move-exception
            java.lang.String r1 = "MultiMediaEditController"
            java.lang.String r0 = "Error creating video sticker for remote media."
            X.0kD.A07(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QN.A01(com.instagram.common.gallery.Medium, X.8QN, X.8QZ, X.1Xj):void");
    }

    public static void A02(AnonymousClass8QN r3) {
        int ordinal = r3.A0Q.A02.A01().ordinal();
        if (ordinal == 0) {
            r3.A0M.A0I(r3.A0K);
        } else if (ordinal == 1) {
            r3.A0O.A0N(r3.A0K, true);
        } else {
            throw new UnsupportedOperationException("Unknown captured media type");
        }
    }

    public static void A03(AnonymousClass8QN r8, C365798nh r9, TreeMap treeMap, int i) {
        boolean z;
        Object obj;
        ArrayList arrayList = new ArrayList();
        C357638Yz r0 = r8.A0Q.A02.A01.A0X;
        if (r0 == null || !((obj = r0.A08.A00) == AnonymousClass80M.A00 || obj == AnonymousClass9QA.A00)) {
            z = false;
        } else {
            z = true;
        }
        if (r9.A05 == C365758nd.A07) {
            C349307zv r6 = r9.A03;
            r6.getClass();
            C59796JYp A012 = C59796JYp.A01(r6.A0k, 0);
            0qQ.A07(A012);
            if (A012.A03 >= 15500 && !z) {
                Iterator it = C39820AAr.A01(r6, 4, 15000, 5000).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C365798nh((C349307zv) it.next()));
                }
                treeMap.put(Integer.valueOf(i), arrayList);
                A06(r8, treeMap);
            }
        }
        arrayList.add(r9);
        treeMap.put(Integer.valueOf(i), arrayList);
        A06(r8, treeMap);
    }

    public static void A05(AnonymousClass8QN r13, 1Xj r14) {
        for (Drawable drawable : r13.A0f.getAllDrawables()) {
            if (drawable instanceof C347017w8) {
                ArrayList A062 = ((C347017w8) drawable).A06(C369768vI.class);
                if (!A062.isEmpty()) {
                    Iterator it = A062.iterator();
                    while (it.hasNext()) {
                        if ("birthday_sticker_id".equals(((C369768vI) it.next()).A0O)) {
                            C317876nz r8 = C317876nz.A17;
                            r13.A0N.A0g(C369468uo.A0F.A01(r13.A0A, r13.A0G, r8, (String) null, (String) null, r14.A1A() * 1000), C39906AIv.A00());
                        }
                    }
                }
            }
        }
    }

    public static void A06(AnonymousClass8QN r9, TreeMap treeMap) {
        GalleryItem galleryItem;
        if (r9.A00 == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = new ArrayList(treeMap.values()).iterator();
            while (it.hasNext()) {
                for (C365798nh r1 : (List) it.next()) {
                    arrayList2.add(r1);
                    if (r1.A05.ordinal() != 0) {
                        C349307zv r0 = r1.A03;
                        r0.getClass();
                        galleryItem = new GalleryItem(r0);
                    } else {
                        C352218Cl r12 = r1.A02;
                        r12.getClass();
                        galleryItem = new GalleryItem(r12, r12.A0h);
                    }
                    arrayList.add(new AnonymousClass9SZ(galleryItem, (Bitmap) null));
                }
            }
            r9.A0Y.EaZ(arrayList);
            int size = arrayList.size();
            AnonymousClass8QZ r2 = r9.A0c;
            if (size > 1) {
                RecyclerView recyclerView = r2.A0L;
                recyclerView.setItemAnimator((AnonymousClass3AS) null);
                r2.A0B(false);
                recyclerView.setEnabled(false);
                r2.A0J.setEnabled(false);
            } else {
                r2.A0A(false);
            }
            r9.A0B(arrayList2);
        }
    }

    public final void A07(AnonymousClass8QZ r24) {
        Bitmap A032;
        Bitmap A002;
        if (this.A09) {
            AnonymousClass8QZ r6 = this.A0c;
            r6.A0B(false);
            r6.A0C(true, false);
            C355598Qp r5 = r6.A0S;
            RectF rectF = new RectF(0.0f, 0.0f, (float) r5.A01, (float) r5.A00);
            C328787Gf r1 = r5.A03;
            Bitmap A082 = 1MF.A08(r1.BxA(r1.Brp()), (int) rectF.width(), (int) rectF.height());
            int ordinal = this.A0Q.A02.A01().ordinal();
            AnonymousClass9X8 r10 = null;
            if (ordinal == 0) {
                ArrayList A0V2 = this.A0f.A0V(AnonymousClass9X8.class);
                28D r12 = this.A0N.A0q;
                if ((r12 == 28D.A2Y || r12 == 28D.A0Z) && !A0V2.isEmpty()) {
                    r10 = (AnonymousClass9X8) A0V2.get(0);
                }
                AnonymousClass8K4 r9 = this.A0M;
                if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                    AnonymousClass80G r2 = r9.A0E;
                    rectF.set(0.0f, 0.0f, (float) r2.A05().getWidth(), (float) r2.A05().getHeight());
                    0kD.A01("PhotoViewController#takeScreenshot:invalidScalingRect", "");
                }
                AnonymousClass80G r122 = r9.A0E;
                if (A082 == null) {
                    int width = (int) rectF.width();
                    int height = (int) rectF.height();
                    MultiListenerTextureView multiListenerTextureView = r122.A0D;
                    if (multiListenerTextureView != null) {
                        A032 = multiListenerTextureView.getBitmap(width, height);
                    } else {
                        A032 = null;
                    }
                } else {
                    A032 = r122.A03(A082);
                }
                if (A032 != null) {
                    Canvas canvas = new Canvas(A032);
                    if (!(r10 == null || (A002 = r10.A00(0)) == null)) {
                        Bitmap A003 = 0fO.A00(A002, (int) (((float) A002.getWidth()) * (rectF.width() / ((float) r122.A05().getWidth()))), (int) (((float) A002.getHeight()) * (rectF.height() / ((float) r122.A05().getHeight()))), false);
                        canvas.drawBitmap(A003, (rectF.width() - ((float) A003.getWidth())) / 2.0f, (rectF.height() - ((float) A003.getHeight())) / 2.0f, (Paint) null);
                    }
                    Bitmap A012 = ((C353838Jj) r9.A0F.A00.A00()).A01(A082, rectF, (B1K) null, 1.0f, 1.0f, -1, false, true, true, true);
                    if (A012 != null) {
                        canvas.drawBitmap(A012, 0.0f, 0.0f, (Paint) null);
                    }
                }
            } else if (ordinal == 1) {
                A032 = this.A0O.A0F(A082, rectF, (AnonymousClass9X8) null);
            } else {
                throw new UnsupportedOperationException("Unknown captured media type");
            }
            C328787Gf r13 = r6.A0R;
            int Brp = r13.Brp();
            r13.AAH(A032, Brp);
            r5.notifyItemChanged(Brp);
            AnonymousClass8QZ r22 = r24;
            if (r24 != null) {
                C328787Gf r0 = r22.A0R;
                int Brp2 = r0.Brp();
                r0.AAH(A032, Brp2);
                r22.A0S.notifyItemChanged(Brp2);
            }
            this.A0H.CNi(this.A0B);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (0 < r0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r1 > r0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(java.lang.String r7) {
        /*
            r6 = this;
            X.8QP r5 = r6.A0Y
            int r4 = r5.A00(r7)
            int r0 = r5.A00
            if (r0 != r4) goto L_0x0022
            X.8QZ r3 = r6.A0c
            X.7Gf r2 = r3.A0R
            if (r0 != 0) goto L_0x0026
            int r0 = r2.getCount()
            int r1 = r0 + -1
            int r0 = r2.Brp()
            int r0 = r0 + 1
            if (r1 <= r0) goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            X.AnonymousClass8QZ.A05(r3, r1)
        L_0x0022:
            r5.removeItem(r4)
            return
        L_0x0026:
            int r0 = r2.Brp()
            int r0 = r0 + -1
            r1 = 0
            if (r1 >= r0) goto L_0x001f
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QN.A09(java.lang.String):void");
    }

    public final void A0A(List list) {
        GalleryItem galleryItem;
        AnonymousClass8QP r6 = this.A0Y;
        List<C365798nh> list2 = list;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
        for (C365798nh r2 : list2) {
            if (r2.A05.ordinal() != 0) {
                C349307zv r1 = r2.A03;
                if (r1 != null) {
                    String str = r2.A06;
                    0qQ.A07(str);
                    galleryItem = new GalleryItem((Draft) null, (GeneratedMediaMetadata) null, (Medium) null, (RemoteMedia) null, (AnonymousClass8y3) null, (ImageUrl) null, (C352218Cl) null, r1, AnonymousClass05K.A0u, str, -1);
                }
                galleryItem = null;
            } else {
                C352218Cl r12 = r2.A02;
                if (r12 != null) {
                    String str2 = r2.A06;
                    0qQ.A07(str2);
                    galleryItem = new GalleryItem(r12, str2);
                }
                galleryItem = null;
            }
            0qQ.A0A(galleryItem);
            arrayList.add(new AnonymousClass9SZ(galleryItem, (Bitmap) null));
        }
        r6.EaZ(arrayList);
        AnonymousClass8QZ r8 = this.A0c;
        r8.A0B(true);
        List list3 = this.A0Q.A02.A01.A0m;
        List unmodifiableList = Collections.unmodifiableList(list3);
        0qQ.A07(unmodifiableList);
        Iterator it = unmodifiableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((C365798nh) it.next()).A00 != null) {
                AnonymousClass6ST r13 = new AnonymousClass6ST(this.A0A);
                this.A05 = r13;
                r13.setContentView(R.layout.layout_superlative_loader);
                if (this.A05.getWindow() != null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.copyFrom(this.A05.getWindow().getAttributes());
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    this.A05.getWindow().setAttributes(layoutParams);
                }
                this.A05.setCancelable(false);
                AnonymousClass0fN.A00(this.A05);
            }
        }
        C355598Qp r62 = r8.A0S;
        RectF rectF = new RectF(0.0f, 0.0f, (float) r62.A01, (float) r62.A00);
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        for (int i = 0; i < list3.size(); i++) {
            C365798nh r11 = (C365798nh) list3.get(i);
            0qQ.A07(r11);
            if (r11.A05 == C365758nd.A04) {
                AnonymousClass8QA r0 = this.A0K;
                String str3 = r11.A06;
                0qQ.A0B(str3, 0);
                1GK r02 = (1GK) r0.A0L.get(str3);
                if (r02 != null) {
                    r02.A03(new C40276AYr(rectF, this, r11, height, width, i));
                }
            } else if (r11.A05 == C365758nd.A07 && r11.A00 != null) {
                C349307zv r03 = r11.A03;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                if (r03 != null) {
                    try {
                        mediaMetadataRetriever.setDataSource(r03.A0k);
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0);
                        if (frameAtTime != null) {
                            Bitmap bitmap = r11.A00;
                            int height2 = frameAtTime.getHeight();
                            int width2 = frameAtTime.getWidth();
                            Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Paint paint = new Paint(2);
                            canvas.drawBitmap(frameAtTime, 0.0f, 0.0f, paint);
                            if (!(bitmap.getWidth() == width2 && bitmap.getHeight() == height2)) {
                                bitmap = 0fO.A00(bitmap, width2, height2, false);
                            }
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            r8.A0R.AAH(createBitmap, i);
                            r62.notifyItemChanged(i);
                        }
                    } catch (Exception e) {
                        0kD.A0H("Exception calling MediaMetadataRetriever#release", e);
                    }
                }
            }
        }
    }

    public final void A0B(List list) {
        if (this.A07) {
            this.A07 = false;
            this.A0Q.A02.A09(list);
            this.A0L.Du1(this.A02);
            this.A02 = null;
            return;
        }
        AnonymousClass80U r0 = this.A0Z;
        C364688lp.A00(r0);
        ((AnonymousClass80T) r0).A01.A04(new AnonymousClass8SP(list, (List) null));
    }

    public final void CjC(CharSequence charSequence, boolean z) {
        AnonymousClass8KX r2 = this.A0d;
        String charSequence2 = charSequence.toString();
        0qQ.A0B(charSequence2, 0);
        if (z) {
            r2.A01.A01(charSequence2);
        }
    }

    public final void DAx() {
        if (this.A08) {
            this.A08 = false;
            this.A0C.postOnAnimation(this.A0h);
        }
    }

    public final void DAy() {
        this.A0C.postOnAnimation(this.A0h);
    }

    public final void DBQ() {
        if (this.A09) {
            AnonymousClass8QZ r1 = this.A0c;
            r1.A0C(false, false);
            r1.A0A(false);
            this.A0H.CNi((View.OnTouchListener) null);
        }
    }

    public final void DMA(int i, int i2) {
        AnonymousClass82Y r2 = this.A0Q.A02.A01;
        List list = r2.A0m;
        list.add(i2, list.remove(r2.A00));
        r2.A00 = i2;
        AnonymousClass82Y.A00(r2);
    }

    public final void DMJ(AnonymousClass9SZ r2, int i) {
        this.A0Q.A02.A01.A06(i);
    }

    public final void DMM(AnonymousClass9SZ r5, int i) {
        this.A0f.A0S = false;
        this.A0O.A0x.A01();
        AnonymousClass8QA r3 = this.A0K;
        r3.A05 = true;
        r3.A0E(false);
        r3.A03 = false;
        int ordinal = r3.A0F.A02.A01().ordinal();
        if (ordinal == 0) {
            r3.A0A.A0H();
        } else if (ordinal == 1) {
            AnonymousClass8LU r2 = r3.A0C;
            boolean z = r3.A0O;
            AnonymousClass8LU.A09(r2);
            C366068o8 r0 = r2.A0q.A04;
            if (r0 != null) {
                r0.A02();
            }
            r2.A0j.A03(z);
            r2.A0A = null;
        } else {
            throw new UnsupportedOperationException("Unknown captured media type");
        }
        AnonymousClass82Y r02 = this.A0Q.A02.A01;
        r02.A00 = i;
        AnonymousClass82Y.A00(r02);
        A02(this);
        this.A0N.A0Y();
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        Intent intent;
        if (((AnonymousClass80V) obj).ordinal() == 39) {
            Integer num = null;
            if (obj3 instanceof C356438Tw) {
                C356438Tw r9 = (C356438Tw) obj3;
                num = Integer.valueOf(r9.A00);
                intent = r9.A01;
            } else if (obj3 instanceof C356458Ty) {
                C356458Ty r92 = (C356458Ty) obj3;
                int i = 0;
                if (r92.A01) {
                    i = -1;
                }
                num = Integer.valueOf(i);
                intent = r92.A00;
            } else {
                intent = null;
            }
            Integer num2 = this.A0Q.A02.A01.A0B;
            0qQ.A07(num2);
            if (num2 == AnonymousClass05K.A0C && num != null && num.intValue() == -1 && intent != null) {
                A04(this, new C39892ADt(intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets"), intent.getParcelableArrayListExtra("bundle_extra_user_story_targets")), intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false));
            }
        }
    }

    public final String getModuleName() {
        C357638Yz r0 = this.A0Q.A02.A01.A0X;
        r0.getClass();
        if (r0.A08.A00 == AnonymousClass80M.A00) {
            return "direct_postcapture_camera";
        }
        return "stories_postcapture_camera";
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r4.isEmpty() != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass8QN r12, X.C39892ADt r13, boolean r14) {
        /*
            boolean r0 = r13.A01()
            r5 = 0
            if (r0 == 0) goto L_0x00aa
            X.0eM r0 = X.ADu.A02
            java.lang.Object r0 = r0.getValue()
            X.ADu r0 = (X.ADu) r0
            android.graphics.Bitmap r8 = r0.A00
            r0.A00 = r5
        L_0x0013:
            com.instagram.common.session.UserSession r7 = r12.A0G
            java.util.List r4 = r13.A00
            if (r4 == 0) goto L_0x0020
            boolean r1 = r4.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r3 = 0
            X.0qQ.A0B(r7, r3)
            if (r0 == 0) goto L_0x0033
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r7)
            X.AXy r0 = new X.AXy
            r0.<init>()
            r1.A00(r0)
        L_0x0033:
            if (r14 == 0) goto L_0x00e9
            X.2cc r1 = X.C71342cb.A00(r7)
            int r0 = r12.A0o
            int r0 = r0 + 2
            r1.A0D(r12, r5, r0)
            X.2cc r1 = X.C71342cb.A00(r7)
            android.app.Activity r0 = r12.A0A
            r1.A08(r0, r12)
            X.2cc r2 = X.C71342cb.A00(r7)
            X.8Fl r1 = r12.A0q
            java.lang.String r0 = "unknown"
            r2.A0E(r0, r1)
            X.82p r0 = r12.A0Q
            X.82o r0 = r0.A02
            r0.A06()
            X.80D r2 = r12.A0S
            X.AVK r0 = r2.A0d
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r13.A01()
            if (r0 == 0) goto L_0x00b0
            X.AVK r9 = r2.A0d
            r9.getClass()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r6 = r12.A0P
            java.util.List r0 = r13.A01
            if (r0 == 0) goto L_0x00a8
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
        L_0x0076:
            java.lang.String r0 = "If we are animating back to the stories tray, there must be valid user story targets"
            X.17k.A07(r10, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r10.iterator()
        L_0x0084:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r10 = r11.next()
            com.instagram.pendingmedia.model.UserStoryTarget r10 = (com.instagram.pendingmedia.model.UserStoryTarget) r10
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0C
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0084
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            java.lang.String r0 = r0.getId()
            r1.add(r0)
            goto L_0x0084
        L_0x00a8:
            r10 = 0
            goto L_0x0076
        L_0x00aa:
            r8 = r5
            goto L_0x0013
        L_0x00ad:
            r9.A00(r8, r7, r6, r1)
        L_0x00b0:
            X.B2s r1 = r2.A0l
            java.util.List r0 = r13.A01
            if (r0 == 0) goto L_0x00ea
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
        L_0x00ba:
            if (r4 == 0) goto L_0x00c0
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
        L_0x00c0:
            r1.AI6(r5, r0, r4, r3)
            X.0eK r0 = r12.A0n
            java.lang.Object r1 = r0.get()
            X.8WK r1 = (X.AnonymousClass8WK) r1
            if (r1 == 0) goto L_0x00db
            r0 = r1
            X.8WJ r0 = (X.AnonymousClass8WJ) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00db
            boolean r0 = r2.A48
            if (r0 == 0) goto L_0x00db
            r1.APW()
        L_0x00db:
            X.80U r0 = r12.A0Z
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r1 = r0.A01
            X.9y3 r0 = new X.9y3
            r0.<init>()
            r1.A04(r0)
        L_0x00e9:
            return
        L_0x00ea:
            r0 = 0
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QN.A04(X.8QN, X.ADt, boolean):void");
    }

    public final void A08(AnonymousClass8QZ r4, 1Xj r5) {
        if (r5.A5v()) {
            C290815g0 A002 = C59730JVo.A00(this.A0A, this.A0G, r5, __redex_internal_original_name);
            A002.A00 = new C385769jV(this, r4, r5);
            1ES.A03(A002);
            return;
        }
        A01((Medium) null, this, r4, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x012b, code lost:
        if (r8.A00 != 8) goto L_0x012d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8QN(android.view.View r41, android.view.View r42, X.28D r43, X.AnonymousClass0iw r44, X.C71662eb r45, X.AnonymousClass8QA r46, X.AnonymousClass8K4 r47, X.AnonymousClass8BA r48, X.AnonymousClass8LU r49, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r50, X.C352888Fl r51, X.C3499582p r52, X.C3509286x r53, X.AnonymousClass80D r54, X.AnonymousClass8QG r55, X.AnonymousClass88O r56, com.instagram.creation.capture.quickcapture.save.CachingVideoSaver r57, X.AnonymousClass80U r58, X.C353918Jw r59, X.C3495780x r60, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r61, java.lang.Runnable r62, java.util.Map r63, X.AnonymousClass0eK r64, X.AnonymousClass0eK r65, X.AnonymousClass0eK r66, int r67) {
        /*
            r40 = this;
            r2 = r40
            r2.<init>()
            X.8QP r7 = new X.8QP
            r7.<init>()
            r2.A0Y = r7
            X.8QQ r0 = new X.8QQ
            r0.<init>(r2)
            r2.A0X = r0
            X.8QR r0 = new X.8QR
            r0.<init>(r2)
            r2.A0h = r0
            X.8QS r0 = new X.8QS
            r0.<init>(r2)
            r2.A04 = r0
            r4 = r54
            r2.A0S = r4
            com.instagram.model.direct.camera.DirectCameraViewModel r8 = r4.A1I
            r5 = r52
            r2.A0Q = r5
            r0 = r58
            r2.A0Z = r0
            r1 = r45
            r2.A0I = r1
            r0.A7w(r2)
            android.app.Activity r15 = r4.A05
            r2.A0A = r15
            com.instagram.common.session.UserSession r6 = r4.A0S
            r2.A0G = r6
            X.4DH r0 = r4.A0M
            r0.getClass()
            X.4DH r0 = r4.A0M
            r2.A0E = r0
            r12 = r44
            r2.A0F = r12
            r1 = r41
            r2.A0C = r1
            r3 = r61
            r2.A0f = r3
            X.8QT r0 = new X.8QT
            r0.<init>(r2)
            r3.A09 = r0
            r0 = r47
            r2.A0M = r0
            r0 = r49
            r2.A0O = r0
            r0 = r48
            r2.A0N = r0
            r0 = r46
            r2.A0K = r0
            java.lang.String r0 = r4.A2q
            r2.A0j = r0
            java.lang.String r0 = r4.A2P
            r2.A0i = r0
            r0 = r64
            r2.A0l = r0
            r0 = r59
            r2.A0a = r0
            r0 = r50
            r2.A0P = r0
            r3 = r55
            r2.A0T = r3
            r3 = r42
            r2.A0D = r3
            r3 = r65
            r2.A0n = r3
            X.8KX r3 = X.AnonymousClass8KW.A00(r6)
            r2.A0d = r3
            r3 = r67
            r2.A0o = r3
            r3 = r51
            r2.A0q = r3
            r3 = r53
            r2.A0R = r3
            r3 = 2131435948(0x7f0b21ac, float:1.8493753E38)
            android.view.View r4 = r1.findViewById(r3)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.2eb r3 = new X.2eb
            r3.<init>(r4)
            r2.A0J = r3
            X.0nx r4 = X.C61610nw.A00()
            java.lang.String r3 = "MultiMediaEditController"
            r4.A01 = r3
            X.0vF r3 = new X.0vF
            r3.<init>(r4)
            X.1ET r4 = new X.1ET
            r4.<init>(r3)
            r2.A0p = r4
            r3 = r56
            r2.A0U = r3
            android.content.Context r11 = r15.getApplicationContext()
            X.8KN r10 = new X.8KN
            r10.<init>(r0)
            r16 = 0
            r3 = 0
            X.0qQ.A0B(r11, r3)
            r3 = 1
            X.0qQ.A0B(r6, r3)
            r3 = 6
            r9 = r43
            X.0qQ.A0B(r9, r3)
            android.content.Context r18 = r11.getApplicationContext()
            X.0qQ.A0A(r18)
            X.8KO r3 = new X.8KO
            r17 = r3
            r19 = r9
            r20 = r6
            r21 = r4
            r22 = r5
            r23 = r16
            r24 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r2.A0V = r3
            android.content.Context r10 = r15.getApplicationContext()
            r3 = 0
            X.0qQ.A0B(r10, r3)
            r3 = 2
            X.0qQ.A0B(r0, r3)
            android.content.Context r18 = r10.getApplicationContext()
            X.0qQ.A0A(r18)
            X.8L3 r3 = new X.8L3
            r17 = r3
            r22 = r0
            r23 = r5
            r24 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r2.A0W = r3
            r9 = 0
            r28 = 2131968361(0x7f134169, float:1.9573614E38)
            if (r8 == 0) goto L_0x012d
            r9 = 1
            r28 = 2131973082(0x7f1353da, float:1.958319E38)
            int r4 = r8.A00
            r3 = 8
            r34 = 1
            if (r4 == r3) goto L_0x012f
        L_0x012d:
            r34 = 0
        L_0x012f:
            X.8QV r5 = new X.8QV
            r5.<init>(r2, r8, r9)
            r2.A0L = r5
            r3 = 2131436600(0x7f0b2438, float:1.8495075E38)
            android.view.View r4 = r1.requireViewById(r3)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r4 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r4
            if (r9 == 0) goto L_0x01e0
            if (r34 != 0) goto L_0x01e0
            r8.getClass()
            X.8Qb r3 = new X.8Qb
            r3.<init>(r12, r8)
        L_0x014b:
            android.content.res.Resources r9 = r15.getResources()
            r8 = 2131165232(0x7f070030, float:1.7944675E38)
            int r30 = r9.getDimensionPixelSize(r8)
            android.content.res.Resources r8 = r15.getResources()
            r11 = 2131165195(0x7f07000b, float:1.79446E38)
            int r8 = r8.getDimensionPixelSize(r11)
            int r13 = r8 / 2
            r10 = 1
            X.8QX r9 = new X.8QX
            r9.<init>(r2)
            r29 = 3
            r27 = 1058013184(0x3f100000, float:0.5625)
            r32 = 2131099791(0x7f06008f, float:1.7811945E38)
            r38 = 0
            r8 = 4
            X.0qQ.A0B(r4, r8)
            X.8QY r26 = X.AnonymousClass8QY.A00
            X.8QZ r14 = new X.8QZ
            r23 = r16
            r31 = r13
            r33 = r11
            r35 = r10
            r36 = r10
            r37 = r34
            r39 = r38
            r21 = r7
            r22 = r5
            r25 = r9
            r20 = r3
            r19 = r4
            r18 = r6
            r17 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r2.A0c = r14
            r7.A91(r2)
            X.8KN r4 = new X.8KN
            r4.<init>(r0)
            X.8Kv r3 = new X.8Kv
            r18 = r57
            r14 = r3
            r16 = r6
            r17 = r0
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r2.A0b = r3
            r0 = 2131437968(0x7f0b2990, float:1.849785E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            r2.A0H = r0
            r0.setKeepObservingAfterRequestDisallowTouchEvent(r10)
            X.8R4 r0 = new X.8R4
            r0.<init>(r15, r2)
            r2.A0e = r0
            X.8R5 r0 = new X.8R5
            r0.<init>(r2)
            r2.A0B = r0
            r0 = r60
            r2.A0r = r0
            r0 = r66
            r2.A0m = r0
            r0 = r63
            r2.A0k = r0
            r0 = r62
            r2.A0g = r0
            return
        L_0x01e0:
            r3 = 0
            goto L_0x014b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QN.<init>(android.view.View, android.view.View, X.28D, X.0iw, X.2eb, X.8QA, X.8K4, X.8BA, X.8LU, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8Fl, X.82p, X.86x, X.80D, X.8QG, X.88O, com.instagram.creation.capture.quickcapture.save.CachingVideoSaver, X.80U, X.8Jw, X.80x, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.Runnable, java.util.Map, X.0eK, X.0eK, X.0eK, int):void");
    }
}
