package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8hG  reason: invalid class name and case insensitive filesystem */
public final class C362048hG implements AnonymousClass8QO, AnonymousClass8QW, C361698ge, C252203oj, C362058hH, C362078hJ, 1DN, AnonymousClass8ZY, C362018hC, C324246ys {
    public static final C71392co A1d = C71392co.A04(70.0d, 5.0d);
    public float A00;
    public View A01;
    public 2Fk A02;
    public 28D A03;
    public IgFrameLayout A04;
    public C279284yO A05;
    public MusicAssetModel A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public View A0H;
    public Integer A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Activity A0N;
    public final Context A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final ViewGroup A0S;
    public final ViewGroup A0T;
    public final ImageView A0U;
    public final GridLayoutManager A0V;
    public final C249403jg A0W;
    public final RecyclerView A0X;
    public final AnonymousClass4DH A0Y;
    public final AnonymousClass0iw A0Z;
    public final C348297yD A0a;
    public final C355608Qq A0b;
    public final UserSession A0c;
    public final IgTextView A0d;
    public final IgTextView A0e;
    public final C357638Yz A0f;
    public final C361508gL A0g;
    public final ClipsAssetHubViewModel A0h;
    public final C362478hy A0i;
    public final C362648iG A0j;
    public final C362848ia A0k;
    public final C362128hO A0l;
    public final C362488hz A0m;
    public final C362208hW A0n;
    public final C361998hA A0o;
    public final C362698iL A0p;
    public final C362158hR A0q;
    public final C362178hT A0r;
    public final C362818iX A0s;
    public final C362098hL A0t;
    public final AnonymousClass8XG A0u;
    public final C362198hV A0v;
    public final AnonymousClass8XA A0w;
    public final C361968h7 A0x;
    public final GalleryMemoriesViewModel A0y;
    public final C328777Ge A0z;
    public final AnonymousClass85O A10;
    public final AnonymousClass80U A11;
    public final ClipsCreationViewModel A12;
    public final C3511387s A13;
    public final C2801950r A14;
    public final C361568gR A15;
    public final AnonymousClass8QZ A16;
    public final C362088hK A17;
    public final C351818An A18;
    public final AnonymousClass8L4 A19;
    public final C229402nK A1A;
    public final C229402nK A1B;
    public final C362028hD A1C;
    public final AnonymousClass6ST A1D;
    public final C361778gm A1E;
    public final SlideInAndOutIconView A1F;
    public final Runnable A1G;
    public final AnonymousClass0eM A1H;
    public final AnonymousClass0eM A1I;
    public final AnonymousClass0eM A1J;
    public final AnonymousClass0eM A1K;
    public final AnonymousClass0eM A1L;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final View A1P;
    public final View A1Q;
    public final ViewGroup A1R;
    public final ViewGroup A1S;
    public final TextView A1T;
    public final AnonymousClass8HT A1U;
    public final C3499582p A1V;
    public final C362348hk A1W;
    public final AnonymousClass88V A1X;
    public final DirectShareTarget A1Y;
    public final C361558gQ A1Z;
    public final C362808iW A1a;
    public final String A1b;
    public final boolean A1c;

    private final void A0A(GalleryItem galleryItem, String str) {
        GalleryItem galleryItem2 = galleryItem;
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            this.A15.A03(this.A0O, remoteMedia, this.A0c, AnonymousClass9PQ.A00((C279284yO) this.A0f.A08.A00), new C74189PqV((Object) galleryItem2, (Object) this, (Object) remoteMedia, str, 29), new C66309MMs(this, 12));
        }
    }

    public final void A0W() {
        this.A0B = false;
        C362178hT r5 = this.A0r;
        ((AnonymousClass8XW) r5.A0R.getValue()).A0A.A09.AHU();
        r5.A00 = (int) (System.currentTimeMillis() / 1000);
        this.A0m.Ecr((Integer) null, "", new ArrayList());
        A0h(false);
        this.A0z.clear();
        ((C348977zO) this.A0c.A01(C348977zO.class, C348967zN.A00)).A00.clear();
        C348297yD r0 = this.A0a;
        r0.A00 = false;
        r0.A01.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r7.A0v.A00() != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0c(X.28D r8) {
        /*
            r7 = this;
            r3 = 0
            X.0qQ.A0B(r8, r3)
            r7.A03 = r8
            X.8h7 r4 = r7.A0x
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0032
            com.instagram.common.session.UserSession r2 = r4.A06
            java.lang.Integer r1 = X.C3505485d.A00(r8, r2)
            java.lang.Integer r0 = r4.A01
            if (r0 == r1) goto L_0x0021
            r4.A01 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A03 = r0
            r0 = 0
            r4.A00 = r0
        L_0x0021:
            java.lang.Integer r1 = X.C3505585e.A00(r8, r2)
            java.lang.Integer r0 = r4.A02
            if (r0 == r1) goto L_0x0032
            r4.A02 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A04 = r0
            r0 = 0
            r4.A00 = r0
        L_0x0032:
            X.8Yz r0 = r7.A0f
            X.80m r5 = r0.A08
            java.lang.Object r4 = r5.A00
            X.4yO r4 = (X.C279284yO) r4
            com.instagram.common.session.UserSession r1 = r7.A0c
            X.8XA r2 = r7.A0w
            X.8Hx r0 = r2.A0a
            boolean r0 = r0.CKX()
            boolean r0 = X.AnonymousClass8X8.A02(r8, r1, r4, r0)
            r6 = 1
            if (r0 != 0) goto L_0x0054
            X.8hV r0 = r7.A0v
            boolean r0 = r0.A00()
            r1 = 0
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            r7.A0J = r1
            boolean r0 = r7.A1M
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r7.A1c
        L_0x005d:
            r7.A0F = r0
            X.8hO r1 = r7.A0l
            boolean r0 = r7.A0J
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r2.A0R()
            if (r0 != 0) goto L_0x00f8
            X.87s r0 = r7.A13
            X.4gw r0 = r0.A04
            if (r0 != 0) goto L_0x0079
            X.8hV r0 = r7.A0v
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0084
        L_0x0079:
            X.0eM r0 = r1.A04
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
        L_0x0084:
            r5 = 0
        L_0x0085:
            X.0eM r0 = r1.A03
            java.lang.Object r4 = r0.getValue()
            android.view.View r4 = (android.view.View) r4
            r0 = 4
            if (r5 == 0) goto L_0x0091
            r0 = 0
        L_0x0091:
            r4.setVisibility(r0)
            X.28D r0 = X.28D.A1l
            r5 = 0
            if (r8 != r0) goto L_0x009a
            r5 = 1
        L_0x009a:
            android.view.View r4 = r7.A0P
            r0 = 0
            if (r5 == 0) goto L_0x00a0
            r0 = 4
        L_0x00a0:
            r4.setVisibility(r0)
            if (r5 != 0) goto L_0x00ba
            boolean r0 = r2.A0R()
            if (r0 != 0) goto L_0x00ba
            X.8hV r0 = r7.A0v
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x00ba
            boolean r0 = A0T(r7)
            if (r0 != 0) goto L_0x00ba
            r6 = 0
        L_0x00ba:
            X.0eM r2 = r1.A07
            java.lang.Object r0 = r2.getValue()
            X.81w r0 = (X.C3498081w) r0
            if (r6 == 0) goto L_0x00e6
            X.81v r0 = (X.C3497981v) r0
            r0.setEnabled(r3)
            java.lang.Object r0 = r2.getValue()
            X.81w r0 = (X.C3498081w) r0
            X.81v r0 = (X.C3497981v) r0
            android.view.View r0 = r0.getView()
            android.view.View[] r1 = new android.view.View[]{r0}
            X.2co r0 = X.C315596kB.A02
            r2 = 4
            r1 = r1[r3]
            r0 = 0
            X.C294975nL.A03(r1, r0, r2, r3)
        L_0x00e2:
            A0G(r7)
            return
        L_0x00e6:
            r1 = 1
            X.81v r0 = (X.C3497981v) r0
            r0.setEnabled(r1)
            java.lang.Object r0 = r2.getValue()
            X.81w r0 = (X.C3498081w) r0
            X.81v r0 = (X.C3497981v) r0
            r0.Eql(r1, r3)
            goto L_0x00e2
        L_0x00f8:
            r5 = 1
            goto L_0x0085
        L_0x00fa:
            if (r1 != 0) goto L_0x010a
            X.28D r0 = X.28D.A5B
            if (r8 != r0) goto L_0x010d
            java.lang.Object r1 = r5.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x010d
        L_0x010a:
            r0 = 1
            goto L_0x005d
        L_0x010d:
            r0 = 0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362048hG.A0c(X.28D):void");
    }

    public final void A0e(String str, String str2, boolean z) {
        Bitmap bitmap;
        String str3 = str;
        0qQ.A0B(str3, 0);
        Uri parse = Uri.parse(str3);
        0qQ.A07(parse);
        ImageUrl A002 = C253833rU.A00(parse, -1, -1);
        RemoteMedia remoteMedia = new RemoteMedia(new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false), A002, A002, (Integer) null, (Integer) null, (Integer) null, str3, A002.getUrl(), 0, false, false, false);
        GalleryItem galleryItem = new GalleryItem((Draft) null, new GeneratedMediaMetadata(str2, z), (Medium) null, remoteMedia, (AnonymousClass8y3) null, remoteMedia.A04, (C352218Cl) null, (C349307zv) null, AnonymousClass05K.A0C, remoteMedia.A06, -1);
        View requireViewById = this.A0S.requireViewById(R.id.gallery_grid_item_thumbnail);
        0qQ.A07(requireViewById);
        ImageView imageView = (ImageView) requireViewById;
        0qQ.A0B(imageView, 1);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        } else {
            bitmap = null;
        }
        A06(bitmap, galleryItem, this);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.07Z, X.4DH] */
    public final void D3h(Integer num) {
        0qQ.A0B(num, 0);
        A0M(num);
        if (182.A06(0Tu.A05, this.A0c, 36328233549053028L)) {
            this.A07 = num;
            A0G(this);
        }
        if (num == AnonymousClass05K.A01) {
            1Eo.A05(AnonymousClass12T.A00.A04, new MG0(this, (AnonymousClass4D7) null, 10), AnonymousClass07a.A00(this.A0Y));
        }
    }

    public final /* synthetic */ void DBA(int i) {
    }

    public final /* synthetic */ void DG3(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    /* JADX WARNING: type inference failed for: r0v108, types: [java.lang.Object, X.2jA] */
    public final void DHa(float f, float f2) {
        C361388g9 r6;
        Object r4;
        float A042 = (float) AnonymousClass37Q.A04((double) f, 0.5d, 1.0d, 0.0d, 1.0d);
        this.A00 = f;
        View view = this.A1P;
        view.setAlpha(A042);
        View view2 = this.A0H;
        if (view2 != null) {
            view.setTranslationY(((float) view2.getHeight()) - f2);
            if (A0T(this)) {
                C362028hD r42 = this.A1C;
                float height = ((float) view2.getHeight()) - f2;
                QuickSnapArchiveViewModel quickSnapArchiveViewModel = (QuickSnapArchiveViewModel) r42.A0D.getValue();
                if (((C47177Drs) quickSnapArchiveViewModel.A0F.getValue()).A02 || quickSnapArchiveViewModel.A0C == AnonymousClass05K.A01) {
                    AnonymousClass0eM r1 = r42.A0F;
                    Object value = r1.getValue();
                    0qQ.A07(value);
                    ((View) value).setAlpha(A042);
                    Object value2 = r1.getValue();
                    0qQ.A07(value2);
                    ((View) value2).setTranslationY(height);
                }
                if (C362028hD.A01(r42)) {
                    AnonymousClass0eM r12 = r42.A0I;
                    Object value3 = r12.getValue();
                    0qQ.A07(value3);
                    ((View) value3).setAlpha(A042);
                    Object value4 = r12.getValue();
                    0qQ.A07(value4);
                    ((View) value4).setTranslationY(height);
                }
            }
        }
        ViewGroup viewGroup = this.A0l.A00;
        viewGroup.setAlpha(A042);
        this.A0T.setAlpha(A042);
        if (f2 > 0.0f) {
            A01();
            if (!this.A0C) {
                this.A0C = true;
                this.A0v.A01 = true;
                C362178hT r5 = this.A0r;
                r5.A00 = (int) (System.currentTimeMillis() / 1000);
                if (r5.A0T == null) {
                    ETJ(Integer.valueOf(2SP.A01.A03()));
                }
                if (A0T(this)) {
                    C362028hD r52 = this.A1C;
                    if (C362028hD.A01(r52)) {
                        AnonymousClass0eM r13 = r52.A0D;
                        ((QuickSnapArchiveViewModel) r13.getValue()).A05();
                        if (r52.A02 == null) {
                            r52.A02 = AnonymousClass11O.A03(AnonymousClass07a.A00(r52.A04.getViewLifecycleOwner()), new C61860pz(new C51648Fy7(r52, (AnonymousClass4D7) null, 46), ((QuickSnapArchiveViewModel) r13.getValue()).A0D));
                        }
                    }
                }
                UserSession userSession = this.A0c;
                27p.A01(userSession).A0J.A01(this.A14, "gallery_visible");
                A0F(this);
                Object obj = this.A0f.A08.A00;
                if ((obj instanceof C363138jC) || (obj instanceof AnonymousClass80O) || (obj instanceof AnonymousClass9QA)) {
                    Fragment fragment = this.A0Y;
                    Context context = fragment.getContext();
                    if (fragment.isVisible() && context != null) {
                        C339257jJ r43 = (C339257jJ) this.A1L.getValue();
                        AnonymousClass0xx A002 = C71772f0.A00(fragment.getLifecycle());
                        1Av A003 = 1Au.A00(userSession);
                        C227402jD A004 = AnonymousClass2jC.A00(context, userSession, new Object());
                        boolean A062 = 182.A06(0Tu.A06, userSession, 36322508357642468L);
                        0qQ.A0B(A003, 3);
                        0qQ.A0B(A004, 5);
                        if (r43.A00 == null && A062) {
                            1Eo.A05(((AnonymousClass12V) r43.A01.getValue()).AOJ(23341140, 3), new MGO(r43, A003, A004, context, A002, userSession, (AnonymousClass4D7) null, 3), A002);
                        }
                    }
                }
            }
        } else {
            this.A0x.A00(false, false);
            C362178hT r7 = this.A0r;
            if (r7.A06 != null) {
                2Nl A005 = 2Nk.A00(r7.A0J);
                A005.A01 = A005.A04.A06(CancelReason.USER_CANCELLED, "User exited before the gallery finished loading", 17638606, A005.A01);
                r7.A06 = null;
            }
            if (r7.A0T != null) {
                r7.A0T = null;
                29L r62 = 27p.A01(r7.A0J).A0J;
                C2801950r r53 = r7.A0O;
                if (r62.A05.Aji() == C279294yP.CLIPS && r53 == C2801950r.CLIPS) {
                    r62.A00 = r62.A04.A06(CancelReason.USER_CANCELLED, "User exited before the gallery finished loading", 585177795, r62.A00);
                }
            }
            this.A0C = false;
            this.A0v.A01 = false;
            this.A0X.removeCallbacks(this.A1G);
            viewGroup.setVisibility(8);
            A0a();
            if (!C3505585e.A01(this.A0c)) {
                A0h(false);
            }
            A0i(this.A0E);
            C361998hA r54 = this.A0o;
            Dc2 dc2 = r54.A07;
            if (dc2 != null) {
                1xC.A01.A00(new AnonymousClass3GR(dc2));
                r54.A07 = null;
            }
            if (A0T(this)) {
                this.A1C.A02();
            }
        }
        if (this.A00 == 1.0f) {
            boolean z = this.A1N;
            if (!z) {
                C362818iX r55 = this.A0s;
                boolean z2 = false;
                if (r55.A0A) {
                    A5G a5g = r55.A00;
                    if (a5g != null) {
                        MM9 mm9 = new MM9(r55, 8);
                        C66309MMs mMs = new C66309MMs(r55, 19);
                        boolean z3 = false;
                        C66479MTh mTh = a5g.A01;
                        int Ay4 = mTh.Ay4("share_fundraiser_educational_dialog");
                        if (Ay4 < 1 && ((Boolean) mm9.invoke()).booleanValue()) {
                            a5g.A00.A00(new C377089Km(mMs, 12));
                            z3 = true;
                            mTh.EJx("share_fundraiser_educational_dialog", Ay4 + 1);
                        }
                        GA1 ga1 = new GA1(22, r55, z3);
                        C66309MMs mMs2 = new C66309MMs(r55, 16);
                        int Ay42 = mTh.Ay4("long_reels_nux");
                        if (Ay42 < 1 && ((Boolean) ga1.invoke()).booleanValue()) {
                            a5g.A00.A00(new C377089Km(mMs2, 12));
                            mTh.EJx("long_reels_nux", Ay42 + 1);
                        }
                    }
                } else {
                    C362808iW r0 = r55.A08;
                    if (r0 != null && !r0.A00) {
                        r55.A07.A00(new C377089Km(new C66309MMs(r55, 17), 12));
                        z2 = true;
                    }
                    UserSession userSession2 = r55.A03;
                    C361588gT A006 = C361578gS.A00(userSession2);
                    if (!z2) {
                        if (r55.A06.A03.A02.A02 == -1 && r55.A05.A0K.getValue() == null) {
                            0qQ.A0B(A006, 0);
                            if ((!((C361628gX) A006.A07.getValue()).A02.isEmpty()) && 1Au.A00(userSession2).A01.getInt("meta_gallery_recents_nux_impression_count", 0) < 1) {
                                r6 = r55.A07;
                                r4 = new C66309MMs(r55, 18);
                                r6.A00(new C377089Km(r4, 12));
                            }
                        }
                        if ((r55.A04.A08.A00 instanceof AnonymousClass80O) && ((AnonymousClass9SS) r55.A09.getValue()).A01()) {
                            r6 = r55.A07;
                            r4 = new C377149Ks(r55, 3);
                            r6.A00(new C377089Km(r4, 12));
                        }
                    }
                }
            }
            C361998hA r14 = this.A0o;
            if (r14.A0G.A08.A00 instanceof AnonymousClass80O) {
                AnonymousClass72N r8 = r14.A0D;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - r8.A00 >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                    r8.A00 = currentTimeMillis;
                    C318136oS A007 = C318116oQ.A00(r8);
                    AnonymousClass9K5 r72 = new AnonymousClass9K5((Object) r8, (AnonymousClass4D7) null, 1, currentTimeMillis);
                    1Eo.A03(AnonymousClass05K.A00, 19B.A00, r72, A007);
                }
            }
            boolean z4 = true;
            if (!this.A13.A0L() && ((!this.A10.A03((C279284yO) this.A0f.A08.A00) && !(!this.A0z.Brk().isEmpty())) || A0Q())) {
                z4 = false;
            }
            A0h(z4);
            if (!z) {
                this.A0p.A00();
            }
            this.A0A = false;
            2eQ.A05(viewGroup, 500);
        }
    }

    public final boolean DHo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        boolean z3 = false;
        if (f2 < 0.0f) {
            z3 = true;
        }
        if (!A0T(this) || !z3) {
            return false;
        }
        C362028hD r1 = this.A1C;
        if (!C362028hD.A01(r1)) {
            return false;
        }
        C359098c0.A00(C391559tH.SWIPE_UP_TO_VIEW_ARCHIVE, ((QuickSnapArchiveViewModel) r1.A0D.getValue()).A07, (String) null);
        return false;
    }

    public final void DLy(GalleryItem galleryItem, MQT mqt, int i) {
        0qQ.A0B(mqt, 1);
        if (mqt instanceof C59787JYg) {
            A0h(true);
            A0b(((C59787JYg) mqt).A00, galleryItem, i);
        }
    }

    public final void DM8(View view, GalleryItem galleryItem, MQT mqt, int i) {
        0qQ.A0B(mqt, 1);
        if (mqt instanceof C59787JYg) {
            GalleryItem galleryItem2 = galleryItem;
            if (!A0R(galleryItem) && A0N()) {
                C362488hz r1 = this.A0m;
                if (!r1.A08.A0A && !this.A0D) {
                    if (!this.A0z.CbT(galleryItem)) {
                        r1.A01(galleryItem, ((C59787JYg) mqt).A00);
                        this.A0q.A00(galleryItem2, ((C362688iK) this.A1I.getValue()).A03.A02.A00(), "LONG_PRESS", i, true);
                        if (galleryItem.A09 == AnonymousClass05K.A0C && galleryItem.A00 == null) {
                            A0A(galleryItem, this.A0r.A04());
                        } else {
                            Medium medium = galleryItem.A00;
                            if (medium != null) {
                                medium.A0G.A01 = this.A0r.A04();
                            }
                        }
                        A08(galleryItem, i);
                    }
                    if (galleryItem.A04 != null) {
                        A09(galleryItem, AnonymousClass05K.A01);
                    }
                    A0h(true);
                    this.A16.A0C(true, true);
                    AnonymousClass2S0.A01.A05(10);
                }
            }
        }
    }

    public final void DMJ(AnonymousClass9SZ r8, int i) {
        0qQ.A0B(r8, 0);
        A02();
        if (this.A0z instanceof C328767Gd) {
            Object obj = this.A0f.A08.A00;
            if ((obj instanceof AnonymousClass80O) || (obj instanceof AnonymousClass9QA)) {
                C362488hz r5 = this.A0m;
                GalleryItem galleryItem = r8.A01;
                C362168hS r3 = r5.A08;
                C361698ge r2 = r5.A09;
                AnonymousClass9LG r0 = new AnonymousClass9LG(r5, 46);
                C362168hS.A00(galleryItem, r3);
                r3.A01(r0);
                r2.DMO(galleryItem, false);
            }
        }
    }

    public final void DMM(AnonymousClass9SZ r1, int i) {
    }

    public final void DMR(GalleryItem galleryItem, MQT mqt, int i, boolean z) {
        C318136oS A002;
        0sL mh1;
        Integer num;
        0qQ.A0B(mqt, 1);
        if ((mqt instanceof C59787JYg) && !A0R(galleryItem)) {
            AnonymousClass85O r3 = this.A10;
            Bitmap bitmap = ((C59787JYg) mqt).A00;
            r3.A01 = new WeakReference(bitmap);
            if (galleryItem.A09 != AnonymousClass05K.A0C) {
                Medium medium = galleryItem.A00;
                if (medium != null) {
                    num = Integer.valueOf(medium.A05);
                } else {
                    num = null;
                }
                r3.A00 = num;
            }
            if (z) {
                A0b(bitmap, galleryItem, i);
                A0G(this);
            } else if (!this.A0D) {
                A08(galleryItem, i);
                RemoteMedia remoteMedia = galleryItem.A04;
                if (remoteMedia != null && remoteMedia.A08) {
                    GalleryMemoriesViewModel galleryMemoriesViewModel = this.A0y;
                    String str = galleryItem.A0A;
                    0qQ.A0B(str, 0);
                    if (182.A06(0Tu.A05, galleryMemoriesViewModel.A01, 36327748217748130L)) {
                        A002 = C318116oQ.A00(galleryMemoriesViewModel);
                        mh1 = new C66164MGb(galleryMemoriesViewModel, (AnonymousClass4D7) null, i, 9);
                    } else {
                        1Xj A022 = galleryMemoriesViewModel.A02.A02(str);
                        if (A022 != null) {
                            A002 = C318116oQ.A00(galleryMemoriesViewModel);
                            mh1 = new MH1(A022, galleryMemoriesViewModel, (AnonymousClass4D7) null, 16);
                        }
                    }
                    1Eo.A05(19B.A00, mh1, A002);
                } else if (galleryItem.A00 == null) {
                    A0B(galleryItem, new C41567AwZ(24, galleryItem, this, mqt));
                } else {
                    27p.A01(this.A0c).A0J.A06(this.A14, "reels_gallery_thumbnail_tap", 1);
                    List singletonList = Collections.singletonList(new AnonymousClass9SZ(galleryItem, bitmap));
                    0qQ.A07(singletonList);
                    r3.A01(singletonList);
                }
            } else {
                A08(galleryItem, i);
                A06(bitmap, galleryItem, this);
            }
            if (galleryItem.A04 != null) {
                A09(galleryItem, AnonymousClass05K.A00);
            }
        }
    }

    public final void DSA(C357268Xf r2) {
        0qQ.A0B(r2, 0);
        this.A0r.DSA(r2);
    }

    public final void DUz(AppBarLayout appBarLayout, int i) {
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        this.A0K = z;
    }

    public final void DWm(Map map) {
        0qQ.A0B(map, 0);
        if (C2604245p.A00(map) == C346927vz.GRANTED || C2604245p.A03(this.A0N)) {
            AnonymousClass8HT r5 = this.A1U;
            String str = ((C279284yO) this.A0f.A08.A00).A02;
            29E r3 = r5.A03;
            long A032 = r3.A03(518928411, 12000);
            r5.A01 = A032;
            r3.A09(A032, "camera_destination", str);
            A0U();
        } else {
            A0a();
        }
        A0Z();
    }

    public final /* synthetic */ void DdF(String str) {
    }

    public final /* synthetic */ void DhL(float f, float f2, float f3, float f4, boolean z, boolean z2) {
    }

    public final /* synthetic */ void Dik() {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        int i = 0;
        0qQ.A0B(r5, 0);
        float f = (float) r5.A09.A00;
        ImageView imageView = this.A0U;
        imageView.setImageAlpha(AnonymousClass1GB.A01(255.0f * f));
        if (f <= 0.0f) {
            imageView.setImageBitmap((Bitmap) null);
            i = 4;
        }
        imageView.setVisibility(i);
    }

    public final void Dnm(Bitmap bitmap, String str) {
        0qQ.A0B(bitmap, 0);
        0qQ.A0B(str, 1);
        this.A0o.Dnm(bitmap, str);
    }

    public final /* synthetic */ void Du4() {
    }

    public final void EZk(boolean z) {
        this.A0D = false;
    }

    public final void onPause() {
    }

    public static final Medium A00(RemoteMedia remoteMedia, GalleryItem galleryItem, C362048hG r7, File file) {
        String str;
        Medium medium;
        C352218Cl r0;
        String str2;
        C361558gQ r02 = r7.A1Z;
        Medium A002 = C361558gQ.A00(remoteMedia, file);
        r02.A02(A002, remoteMedia);
        String str3 = null;
        if (remoteMedia.A09) {
            RemoteMedia remoteMedia2 = galleryItem.A04;
            if (remoteMedia2 != null) {
                str2 = remoteMedia2.A07;
            } else {
                str2 = null;
            }
            A002.A0a = str2;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file.getCanonicalPath());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String str4 = "0";
            if (extractMetadata == null) {
                extractMetadata = str4;
            }
            int parseInt = Integer.parseInt(extractMetadata);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null) {
                str4 = extractMetadata2;
            }
            int parseInt2 = Integer.parseInt(str4);
            mediaMetadataRetriever.release();
            A002.A0B = parseInt2;
            A002.A04 = parseInt;
        }
        MediaUploadMetadata mediaUploadMetadata = A002.A0G;
        RemoteMedia remoteMedia3 = galleryItem.A04;
        if (remoteMedia3 != null) {
            str3 = remoteMedia3.A02.A03;
        }
        mediaUploadMetadata.A09 = str3;
        String str5 = null;
        if ((remoteMedia3 == null || (str = remoteMedia3.A02.A08) == null) && (((medium = galleryItem.A00) == null || (str = medium.A0G.A08) == null) && ((r0 = galleryItem.A07) == null || (str = r0.A01().A08) == null))) {
            C349307zv r03 = galleryItem.A08;
            if (r03 != null) {
                str = r03.A02().A08;
            }
            mediaUploadMetadata.A08 = str5;
            A002.A0E = galleryItem.A03;
            return A002;
        }
        str5 = str;
        mediaUploadMetadata.A08 = str5;
        A002.A0E = galleryItem.A03;
        return A002;
    }

    private final void A02() {
        AnonymousClass8QZ r3 = this.A16;
        if (r3.A00 == 5 && r3.A0R.getCount() > 1 && r3.A08 == null) {
            UserSession userSession = r3.A0O;
            if (1Au.A00(userSession).A01.getInt("gallery_drag_thumbnail_tray_tooltip", 0) < 3 && !182.A06(0Tu.A06, userSession, 36328233548921954L)) {
                String string = r3.A0L.getContext().getString(2131962911);
                0qQ.A07(string);
                AnonymousClass8QZ.A06(r3, string, new AnonymousClass9L5(r3, 10));
            }
        }
        this.A10.A0A.Epw(Integer.valueOf(this.A0z.getCount()));
    }

    private final void A03() {
        if (AnonymousClass39V.A00(this.A0c).booleanValue() && !this.A0M) {
            C362028hD r7 = this.A1C;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - r7.A00 >= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                r7.A00 = currentTimeMillis;
                ((QuickSnapArchiveViewModel) r7.A0D.getValue()).A04();
            }
            this.A0M = true;
        }
    }

    private final void A04() {
        GridLayoutManager gridLayoutManager = this.A0V;
        gridLayoutManager.A1v(3);
        2Rw r2 = this.A0X.A0A;
        if (r2 != null) {
            gridLayoutManager.A01 = new C362638iF(r2, gridLayoutManager.A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A05(Bitmap bitmap, Medium medium, C362048hG r4) {
        if (!r4.A0D) {
            A07(bitmap, r4, medium.A07);
        }
        boolean A052 = medium.A05();
        AnonymousClass8XA r0 = r4.A0w;
        if (A052) {
            r0.A0E(medium, r4, false);
        } else {
            r0.A0F(medium, r4, false);
        }
    }

    public static final void A07(Bitmap bitmap, C362048hG r9, int i) {
        r9.A0I = AnonymousClass05K.A01;
        Bitmap blur = BlurUtil.blur(bitmap, 0.25f, 10);
        ImageView imageView = r9.A0U;
        imageView.setImageBitmap(blur);
        int width = blur.getWidth();
        int height = blur.getHeight();
        int width2 = imageView.getWidth();
        int height2 = imageView.getHeight();
        boolean z = 1MF.A02;
        Matrix matrix = new Matrix();
        1MF.A0J(matrix, width, height, width2, height2, i, false);
        imageView.setImageMatrix(matrix);
        imageView.setVisibility(0);
        ((2cs) r9.A1H.getValue()).A08(1.0d, true);
    }

    private final void A08(GalleryItem galleryItem, int i) {
        Medium medium;
        DirectShareTarget directShareTarget = this.A1Y;
        if (directShareTarget != null && (medium = galleryItem.A00) != null) {
            AnonymousClass7IR r4 = new AnonymousClass7IR(this.A0Z, this.A0c);
            C254783t2 r3 = directShareTarget.A09;
            r3.getClass();
            String str = null;
            if (medium.A05()) {
                str = "photo";
            } else if (medium.CeS()) {
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
            }
            r4.A01(r3, Long.valueOf((long) i), str);
        }
    }

    private final void A09(GalleryItem galleryItem, Integer num) {
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            List<AnonymousClass9SZ> Brk = this.A0z.Brk();
            ArrayList arrayList = new ArrayList(0Yv.A1E(Brk, 10));
            for (AnonymousClass9SZ r0 : Brk) {
                arrayList.add(r0.A01);
            }
            AnonymousClass9PQ.A02(this.A0Z, remoteMedia, this.A0c, num, AnonymousClass9PQ.A00((C279284yO) this.A0f.A08.A00), arrayList, this.A0L);
        }
    }

    private final void A0B(GalleryItem galleryItem, C62320sa r20) {
        GalleryItem galleryItem2 = galleryItem;
        RemoteMedia remoteMedia = galleryItem2.A04;
        if (remoteMedia != null) {
            Activity activity = this.A0N;
            UserSession userSession = this.A0c;
            C361568gR r6 = this.A15;
            String A002 = AnonymousClass9PQ.A00((C279284yO) this.A0f.A08.A00);
            C59137J7t j7t = new C59137J7t(5, this, galleryItem2, remoteMedia, r20);
            C59112J6u j6u = new C59112J6u(this, 24);
            0qQ.A0B(r6, 2);
            Object obj = new Object();
            String string = activity.getString(2131965491);
            0qQ.A07(string);
            AnonymousClass9WI A003 = C9857RiW.A00(activity, string, new MMQ(obj, 11));
            AnonymousClass0fN.A00(A003);
            r6.A03(activity, remoteMedia, userSession, A002, new J6W(23, obj, A003, j7t), new J6W(24, obj, A003, j6u));
        }
    }

    public static final void A0C(C362048hG r1) {
        if (!(r1.A0f.A08.A00 instanceof AnonymousClass80O)) {
            return;
        }
        if (!r1.A0v.A00() || r1.A1X.A07.size() <= 0) {
            r1.A0X();
        }
    }

    public static final void A0E(C362048hG r4) {
        String str;
        C362198hV r1 = r4.A0v;
        if (r1.A04() || !r1.A06()) {
            str = "draftsTabView";
            IgTextView igTextView = r4.A0o.A03;
            if (igTextView != null) {
                igTextView.setVisibility(8);
                if (r4.A08 == AnonymousClass05K.A01) {
                    r4.A0g(false);
                    return;
                }
                return;
            }
        } else {
            str = "draftsTabView";
            IgTextView igTextView2 = r4.A0o.A03;
            if (igTextView2 != null) {
                igTextView2.setVisibility(0);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A0c, 36327387440626064L) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r7.A08 != X.AnonymousClass05K.A01) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(X.C362048hG r7) {
        /*
            X.8h7 r3 = r7.A0x
            X.8Yz r6 = r7.A0f
            X.80m r0 = r6.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0015
            java.lang.Integer r2 = r7.A08
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 1
            if (r2 == r1) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r3.A00(r5, r0)
            X.28D r0 = r7.A03
            r7.A0c(r0)
            boolean r0 = r7.A0L
            r7.A0E = r0
            boolean r0 = r7.A0O()
            if (r0 == 0) goto L_0x0032
            r7.A0i(r4)
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x0032
            r7.A0Y()
        L_0x0032:
            boolean r0 = r7.A1M
            if (r0 == 0) goto L_0x004a
            X.8hT r0 = r7.A0r
            X.8XO r2 = X.AnonymousClass8XO.STATIC_PHOTO_ONLY
            X.0eM r0 = r0.A0R
            java.lang.Object r0 = r0.getValue()
            X.8XW r0 = (X.AnonymousClass8XW) r0
            X.8XZ r1 = r0.A08
            X.8XO r0 = r1.A02
            if (r0 == r2) goto L_0x004a
            r1.A02 = r2
        L_0x004a:
            X.8gm r0 = r7.A1E
            r0.A05()
            X.8hT r3 = r7.A0r
            X.8hz r0 = r7.A0m
            int r0 = r0.A00()
            if (r0 != 0) goto L_0x007b
            X.8hS r2 = r3.A0N
            X.0Ud r0 = r2.A0K
            java.lang.Object r0 = r0.getValue()
            r1 = 0
            if (r0 == 0) goto L_0x0065
            r1 = 1
        L_0x0065:
            X.2Fk r0 = r2.A0F
            java.lang.Object r0 = r0.A02()
            X.8gX r0 = (X.C361628gX) r0
            if (r0 == 0) goto L_0x01f2
            java.util.Set r0 = r0.A02
            if (r0 == 0) goto L_0x01f2
            boolean r0 = r0.isEmpty()
        L_0x0077:
            if (r1 == 0) goto L_0x01e9
            if (r0 == 0) goto L_0x01e9
        L_0x007b:
            r3.A0B = r4
            r7.A0a()
            boolean r0 = r6.A0P()
            if (r0 == 0) goto L_0x0095
            com.instagram.common.session.UserSession r3 = r7.A0c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327387440626064(0x810f9100043990, double:3.0369243238754496E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x009d
        L_0x0095:
            X.8hO r0 = r7.A0l
            android.view.ViewGroup r1 = r0.A00
            r0 = 0
            r1.setVisibility(r0)
        L_0x009d:
            r7.A0U()
            A0E(r7)
            boolean r0 = A0T(r7)
            if (r0 == 0) goto L_0x00b2
            r0 = 0
            r7.A0g(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0X
            X.C2808154f.A01(r0, r5)
        L_0x00b2:
            X.8hW r0 = r7.A0n
            r0.A02()
            r0.A01()
            X.8hV r2 = r7.A0v
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x0132
            com.instagram.common.session.UserSession r0 = r7.A0c
            X.27r r4 = X.27p.A01(r0)
            X.0wc r3 = r4.A01
            r0 = 1429(0x595, float:2.002E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0132
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A8k(r1, r0)
            r0 = 7
            java.lang.String r1 = "entity_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.4yP r1 = r4.A0J()
            java.lang.String r0 = "camera_destination"
            r3.A8M(r1, r0)
            X.283 r4 = r4.A04
            java.lang.String r1 = r4.A0L
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            X.80P r1 = X.AnonymousClass80P.THIRD_PARTY_MEDIA
            java.lang.String r0 = "camera_tool"
            r3.A8M(r1, r0)
            java.lang.String r1 = r4.A0M
            java.lang.String r0 = "composition_str_id"
            r3.AAJ(r0, r1)
            X.28D r1 = r4.A09
            java.lang.String r0 = "entry_point"
            r3.A8M(r1, r0)
            X.JVj r1 = X.C59725JVj.GALLERY
            java.lang.String r0 = "surface"
            r3.A8M(r1, r0)
            java.lang.String r1 = "giphy_clips_grid"
            java.lang.String r0 = "module"
            r3.AAJ(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x0132:
            com.instagram.common.session.UserSession r1 = r7.A0c
            X.7zp r0 = X.C349227zn.A00(r1)
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x01c8
            boolean r0 = r2.A08()
            if (r0 == 0) goto L_0x01c8
            X.27r r0 = X.27p.A01(r1)
            X.29a r3 = r0.A0G
            X.0wc r2 = r3.A01
            java.lang.String r1 = "ig_camera_ui_tool_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x01c8
            X.80P r1 = X.AnonymousClass80P.IMAGINE_BUNDLE_WITH_META_AI_INTENT
            java.lang.String r0 = "tool_type"
            r2.A8M(r1, r0)
            X.283 r4 = r3.A04
            java.lang.String r1 = r4.A0L
            if (r1 != 0) goto L_0x0167
            java.lang.String r1 = ""
        L_0x0167:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "MODIFY"
            java.lang.String r0 = "action"
            r2.AAJ(r0, r1)
            X.4yP r1 = X.C279294yP.STORY
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            X.28D r1 = r4.A09
            java.lang.String r0 = "entry_point"
            r2.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A8k(r1, r0)
            X.JVj r1 = X.C59725JVj.PRE_CAPTURE
            java.lang.String r0 = "surface"
            r2.A8M(r1, r0)
            X.28t r1 = r4.A0A
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.8fP r1 = r3.A0I()
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r2.AAJ(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            com.instagram.common.session.UserSession r1 = r3.A03
            X.02m r0 = r3.A00
            X.8aX r1 = X.2AL.A07(r0, r1)
            java.lang.String r0 = "system_info"
            r2.AAK(r1, r0)
            r2.Cgf()
        L_0x01c8:
            X.4DH r0 = r7.A0Y
            X.0xx r4 = X.AnonymousClass07a.A00(r0)
            X.12T r2 = X.AnonymousClass12T.A00
            r3 = 0
            r1 = 480314591(0x1ca104df, float:1.0655345E-21)
            r0 = 3
            X.0nV r2 = r2.CO6(r1, r0)
            r0 = 14
            X.9Jr r1 = new X.9Jr
            r1.<init>(r7, r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r2, r1, r4)
            A0D(r7)
            return
        L_0x01e9:
            boolean r0 = A0T(r7)
            if (r0 != 0) goto L_0x007b
            r4 = 1
            goto L_0x007b
        L_0x01f2:
            r0 = 0
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362048hG.A0F(X.8hG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0164, code lost:
        if (r1 > 0) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(X.C362048hG r9) {
        /*
            X.8Yz r0 = r9.A0f
            X.80m r4 = r0.A08
            java.lang.Object r1 = r4.A00
            X.9QA r2 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r2)
            r6 = 0
            r5 = 0
            if (r0 == 0) goto L_0x01ff
            X.8An r0 = r9.A18
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r0.A06
            if (r3 == 0) goto L_0x01f3
            com.instagram.api.schemas.StoryPromptType r1 = r3.A03()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            if (r1 != r0) goto L_0x01f3
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r3.A00
            java.lang.String r0 = r0.getText()
            if (r0 == 0) goto L_0x01f3
        L_0x0026:
            r8 = 0
        L_0x0027:
            r0 = 0
        L_0x0028:
            X.4DH r7 = r9.A0Y
            android.os.Bundle r3 = r7.mArguments
            if (r3 == 0) goto L_0x01f0
            java.lang.String r1 = "ARGS_GALLERY_SUBTITLE"
            java.lang.String r3 = r3.getString(r1)
            if (r3 == 0) goto L_0x01f0
            int r1 = r3.length()
            if (r1 == 0) goto L_0x01f0
            r6 = r3
        L_0x003d:
            X.8hO r3 = r9.A0l
            X.0eM r8 = r3.A05
            java.lang.Object r1 = r8.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r5)
            if (r6 == 0) goto L_0x0055
            java.lang.Object r1 = r8.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r6)
        L_0x0055:
            java.lang.Object r1 = r8.getValue()
            android.view.View r1 = (android.view.View) r1
            X.0nA.A0X(r1, r0)
            java.lang.Object r1 = r4.A00
            X.80N r0 = X.AnonymousClass80N.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            r4 = 0
            if (r0 != 0) goto L_0x0154
            X.80e r0 = X.C3493880e.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0154
            boolean r0 = X.0qQ.A0K(r1, r2)
            if (r0 == 0) goto L_0x011e
            X.8An r2 = r9.A18
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r2.A06
            if (r1 == 0) goto L_0x00dd
            com.instagram.api.schemas.StoryPromptType r0 = r1.A03()
            com.instagram.api.schemas.StoryPromptType r4 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            if (r0 != r4) goto L_0x00dd
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r1.A00
            java.lang.String r0 = r0.getText()
            if (r0 == 0) goto L_0x00dd
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r2.A06
            r0 = 0
            if (r2 == 0) goto L_0x009e
            com.instagram.api.schemas.StoryPromptType r1 = r2.A03()
            if (r1 != r4) goto L_0x009e
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r2.A00
            java.lang.String r0 = r0.getText()
        L_0x009e:
            X.0eM r3 = r3.A06
            java.lang.Object r1 = r3.getValue()
            X.0qQ.A07(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            java.lang.Object r0 = r3.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r2, r0)
            X.2dQ r2 = (X.C71492dQ) r2
            r0 = -1
            r2.A0F = r0
            r0 = -2
            r2.height = r0
            java.lang.Object r0 = r3.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.topMargin = r0
        L_0x00dc:
            return
        L_0x00dd:
            boolean r0 = r9.A1M
            if (r0 == 0) goto L_0x00f1
            X.8hK r1 = r9.A17
            X.8hK r0 = X.C362088hK.A09
            if (r1 != r0) goto L_0x00f1
            android.content.Context r1 = r9.A0O
            r0 = 2131965741(0x7f13372d, float:1.95683E38)
        L_0x00ec:
            java.lang.CharSequence r0 = r1.getText(r0)
            goto L_0x009e
        L_0x00f1:
            X.28D r1 = r9.A03
            X.28D r0 = X.28D.A3y
            if (r1 == r0) goto L_0x0103
            X.28D r0 = X.28D.A3z
            if (r1 == r0) goto L_0x0103
            X.28D r0 = X.28D.A5L
            if (r1 == r0) goto L_0x0103
            X.28D r0 = X.28D.A5M
            if (r1 != r0) goto L_0x0118
        L_0x0103:
            com.instagram.common.session.UserSession r4 = r9.A0c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322289314637869(0x810aee0007282d, double:3.0337002484720094E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0118
            android.content.Context r1 = r9.A0O
            r0 = 2131967965(0x7f133fdd, float:1.9572811E38)
            goto L_0x00ec
        L_0x0118:
            android.content.Context r1 = r9.A0O
            r0 = 2131952390(0x7f130306, float:1.9541221E38)
            goto L_0x00ec
        L_0x011e:
            X.80M r0 = X.AnonymousClass80M.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = r9.A09
            android.content.Context r2 = r9.A0O
            if (r0 == 0) goto L_0x013d
            r1 = 2131959731(0x7f131fb3, float:1.955611E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0, r4)
            goto L_0x009e
        L_0x013d:
            r0 = 2131959809(0x7f132001, float:1.9556269E38)
            goto L_0x014e
        L_0x0141:
            X.80K r0 = X.AnonymousClass80K.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00dc
            android.content.Context r2 = r9.A0O
            r0 = 2131971107(0x7f134c23, float:1.9579184E38)
        L_0x014e:
            java.lang.CharSequence r0 = r2.getText(r0)
            goto L_0x009e
        L_0x0154:
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x0168
            java.lang.String r0 = "ARGS_GALLERY_TITLE"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0168
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0168
            goto L_0x009e
        L_0x0168:
            X.87s r1 = r9.A13
            X.4gw r0 = r1.A04
            if (r0 == 0) goto L_0x0190
            boolean r0 = r1.A0L()
            android.content.Context r2 = r9.A0O
            if (r0 == 0) goto L_0x01ec
            r1 = 2131962935(0x7f132c37, float:1.956261E38)
            X.7Ge r0 = r9.A0z
            int r0 = r0.BPA()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x018b:
            X.0qQ.A0A(r0)
            goto L_0x009e
        L_0x0190:
            X.8XA r1 = r9.A0w
            boolean r0 = r1.A0R()
            if (r0 != 0) goto L_0x01ea
            X.8Hx r0 = r1.A0a
            boolean r0 = r0.CKX()
            if (r0 == 0) goto L_0x01aa
            android.content.Context r2 = r9.A0O
            r0 = 2131952387(0x7f130303, float:1.9541215E38)
        L_0x01a5:
            java.lang.CharSequence r0 = r2.getText(r0)
            goto L_0x018b
        L_0x01aa:
            java.lang.Integer r1 = r9.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x01b6
            android.content.Context r2 = r9.A0O
            r0 = 2131962988(0x7f132c6c, float:1.9562717E38)
            goto L_0x01a5
        L_0x01b6:
            com.instagram.common.session.UserSession r1 = r9.A0c
            X.28D r0 = r9.A03
            boolean r0 = X.C3505485d.A01(r0, r1)
            if (r0 != 0) goto L_0x01e4
            X.8hz r0 = r9.A0m
            X.8hS r1 = r0.A08
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x01ce
            android.content.Context r2 = r9.A0O
            r0 = 2131968293(0x7f134125, float:1.9573477E38)
            goto L_0x01a5
        L_0x01ce:
            X.7Ge r0 = r1.A0H
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x01ea
            X.8hV r0 = r9.A0v
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x01e4
            android.content.Context r2 = r9.A0O
            r0 = 2131962928(0x7f132c30, float:1.9562595E38)
            goto L_0x01a5
        L_0x01e4:
            android.content.Context r2 = r9.A0O
            r0 = 2131962929(0x7f132c31, float:1.9562597E38)
            goto L_0x01a5
        L_0x01ea:
            android.content.Context r2 = r9.A0O
        L_0x01ec:
            r0 = 2131962930(0x7f132c32, float:1.95626E38)
            goto L_0x01a5
        L_0x01f0:
            r5 = r8
            goto L_0x003d
        L_0x01f3:
            boolean r0 = r9.A1M
            if (r0 == 0) goto L_0x021d
            X.8hK r1 = r9.A17
            X.8hK r0 = X.C362088hK.A09
            if (r1 != r0) goto L_0x021d
            goto L_0x0026
        L_0x01ff:
            X.80K r0 = X.AnonymousClass80K.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x021d
            android.content.Context r1 = r9.A0O
            r0 = 2131971087(0x7f134c0f, float:1.9579143E38)
            java.lang.CharSequence r6 = r1.getText(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8 = 0
            goto L_0x0028
        L_0x021d:
            r8 = 8
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362048hG.A0G(X.8hG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r14.A08 != X.AnonymousClass05K.A00) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010f, code lost:
        if (r14.A0Q() != false) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0H(X.C362048hG r14, X.AnonymousClass85P r15) {
        /*
            X.8Yz r0 = r14.A0f
            X.80m r3 = r0.A08
            java.lang.Object r1 = r3.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0015
            java.lang.Integer r1 = r14.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r8 = 1
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            r8 = 0
        L_0x0016:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r5 = r14.A1F
            r0 = 8
            r5.setVisibility(r0)
            X.85P r0 = X.AnonymousClass85P.OPTION_NOT_ALLOWED
            r2 = 1
            r7 = 0
            if (r15 == r0) goto L_0x00e9
            android.app.Activity r6 = r14.A0N
            android.content.res.Resources r1 = r6.getResources()
            X.0qQ.A07(r1)
            X.85P r0 = X.AnonymousClass85P.ON
            if (r15 != r0) goto L_0x0042
            r4 = 1
            r0 = 2131238049(0x7f081ca1, float:1.8092366E38)
            android.graphics.drawable.Drawable r9 = r6.getDrawable(r0)
            if (r9 != 0) goto L_0x0058
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0042:
            r4 = 0
            r0 = 2131238049(0x7f081ca1, float:1.8092366E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            if (r0 == 0) goto L_0x0124
            android.graphics.drawable.Drawable r9 = r0.mutate()
            r0 = -1
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r9.setColorFilter(r0)
        L_0x0058:
            r13 = 0
            if (r8 == 0) goto L_0x0121
            r0 = 2131967727(0x7f133eef, float:1.9572329E38)
            if (r4 == 0) goto L_0x0063
            r0 = 2131967726(0x7f133eee, float:1.9572326E38)
        L_0x0063:
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A0A(r0)
            r9 = r13
            r13 = r0
            r12 = 1
        L_0x006d:
            r0 = 2131099951(0x7f06012f, float:1.781227E38)
            if (r4 == 0) goto L_0x0075
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
        L_0x0075:
            int r11 = r6.getColor(r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            if (r4 == 0) goto L_0x0081
            r0 = 2131099936(0x7f060120, float:1.781224E38)
        L_0x0081:
            int r10 = r6.getColor(r0)
            r0 = 2131962964(0x7f132c54, float:1.9562668E38)
            if (r4 == 0) goto L_0x008d
            r0 = 2131962907(0x7f132c1b, float:1.9562552E38)
        L_0x008d:
            java.lang.String r8 = r1.getString(r0)
            X.0qQ.A07(r8)
            r5.setText((java.lang.String) r13)
            r5.setIcon(r9)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            if (r4 == 0) goto L_0x00a2
            r0 = 2131099936(0x7f060120, float:1.781224E38)
        L_0x00a2:
            int r0 = r6.getColor(r0)
            r5.setIconColor(r0)
            r5.setBackgroundColor(r11)
            r5.setTextBold(r12)
            r5.setTextColor(r10)
            r5.setTextCapitalization(r7)
            r5.setContentDescription(r8)
            boolean r0 = X.C2604245p.A03(r6)
            if (r0 == 0) goto L_0x00c1
            r5.setVisibility(r7)
        L_0x00c1:
            if (r9 != 0) goto L_0x00cf
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r1 = r1.getDimensionPixelSize(r0)
            com.instagram.common.ui.text.TitleTextView r0 = r5.A0C
            r0.setPadding(r1, r7, r1, r7)
        L_0x00cf:
            boolean r0 = X.C2604245p.A03(r6)
            if (r0 == 0) goto L_0x00e9
            X.3NG r1 = new X.3NG
            r1.<init>(r5)
            r1.A01(r5)
            r1.A07 = r2
            X.7ix r0 = new X.7ix
            r0.<init>(r14, r4)
            r1.A04 = r0
            r1.A00()
        L_0x00e9:
            X.8QZ r0 = r14.A16
            java.lang.Integer r0 = r0.A0A
            r14.A0M(r0)
            X.85O r1 = r14.A10
            java.lang.Object r0 = r3.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x010a
            X.7Ge r0 = r14.A0z
            java.util.List r0 = r0.Brk()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0111
        L_0x010a:
            boolean r0 = r14.A0Q()
            r1 = 1
            if (r0 == 0) goto L_0x0112
        L_0x0111:
            r1 = 0
        L_0x0112:
            X.8hV r0 = r14.A0v
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x011d
            if (r1 != 0) goto L_0x011d
            r2 = 0
        L_0x011d:
            r14.A0h(r2)
            return
        L_0x0121:
            r12 = 0
            goto L_0x006d
        L_0x0124:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362048hG.A0H(X.8hG, X.85P):void");
    }

    public static final void A0I(C362048hG r2, String str) {
        if (r2.A0r.A0T == null) {
            r2.ETJ(Integer.valueOf(2SP.A01.A03()));
            27p.A01(r2.A0c).A0J.A02(r2.A14, str);
        }
    }

    public static final void A0J(C362048hG r9, List list) {
        r9.A0U.setVisibility(8);
        AnonymousClass8XA r8 = r9.A0w;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium medium = ((GalleryItem) it.next()).A00;
            String str = null;
            if (medium != null) {
                MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                String str2 = mediaUploadMetadata.A03;
                if (str2 == null) {
                    C62948Kp0 A002 = C59737JVv.A00((Context) null, r9.A0c, medium.A0X, medium.A05());
                    if (A002 != null) {
                        str = A002.A01();
                    }
                } else {
                    str = str2;
                }
                mediaUploadMetadata.A03 = str;
                arrayList.add(medium);
            }
        }
        r8.A0L(arrayList, false);
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [X.07Z, X.4DH] */
    public static final void A0K(C362048hG r35, List list) {
        C365798nh r4;
        C362048hG r3 = r35;
        r3.A0U.setVisibility(0);
        List list2 = list;
        if (!(r3.A0f.A08.A00 instanceof AnonymousClass80O) || !(!list2.isEmpty())) {
            int intValue = ((GalleryItem) list2.get(0)).A09.intValue();
            if (intValue == 2 || intValue == 0) {
                Medium medium = ((GalleryItem) list2.get(0)).A00;
                if (medium == null) {
                    return;
                }
                if (medium.A0G.A0B) {
                    C362848ia r32 = r3.A0k;
                    r32.A00 = list2;
                    1OO A0J2 = 1NK.A00().A0J(C253833rU.A01(new File(medium.A0X)), "GalleryGridController");
                    A0J2.A02(r32);
                    A0J2.A01();
                    return;
                }
                r3.A0b.A04(medium, new AYI(r3, list2));
            } else if (intValue == 5 || intValue == 6) {
                GalleryItem galleryItem = (GalleryItem) list2.get(0);
                int intValue2 = galleryItem.A09.intValue();
                if (intValue2 == 5) {
                    C352218Cl r0 = galleryItem.A07;
                    if (r0 != null) {
                        r4 = new C365798nh(r0);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (intValue2 == 6) {
                    C349307zv r02 = galleryItem.A08;
                    if (r02 != null) {
                        r4 = new C365798nh(r02);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new UnsupportedOperationException("Unsupported draft media type.");
                }
                C362478hy r5 = r3.A0i;
                WeakReference weakReference = new WeakReference(new C40308AZx(r3, list2));
                Map map = C362478hy.A05;
                String str = r4.A06;
                int i = r5.A01;
                int i2 = r5.A00;
                if (!map.containsKey(002.A0o(str, "?", "x", i, i2))) {
                    r5.A03.ATE(new C386839lF(r5, r4, weakReference));
                } else if (weakReference.get() != null && r4.A01() != null) {
                    C362478hy.A00(r5, r4, weakReference, ((Number) map.get(002.A0o(str, "?", "x", i, i2))).intValue());
                }
            } else {
                throw new UnsupportedOperationException("Unhandled media thumbnail item type.");
            }
        } else if (r3.A16.A0A == AnonymousClass05K.A01) {
            CreationSession creationSession = new CreationSession();
            AnonymousClass36W r52 = AnonymousClass36W.FOLLOWERS_SHARE;
            creationSession.A09 = new MediaCaptureConfig(new JWU(r52));
            creationSession.A0A = r52;
            boolean z = true;
            creationSession.A0M = true;
            UserSession userSession = r3.A0c;
            C3499582p A002 = JWD.A00(r3.A03, userSession, creationSession, new AnonymousClass82Y((C3499182k) null, (UserSession) null, (C357638Yz) null, (C3498682d) null, (C3498482b) null, (C3498382a) null, (C3499282m) null, (C3498882g) null, (C3498782e) null, (C3499382n) null, (ClipsCelebrationReshareViewModel) null, (AnonymousClass82f) null, (C2801950r) null, (SuperlativeStickerClientModel) null, (C3498982i) null, (C3498582c) null, (MusicAttributionConfig) null, (PendingRecipient) null, (C3499082j) null, (String) null, false, false, false, true, false, false, false, false));
            JX1 jx1 = new JX1(r3.A0N, AnonymousClass07i.A00(r3.A0Y), r3.A03, userSession, (C273594mq) null, (JX2) null, A002, (C273514mi) null, (C267834cI) null, 10001);
            Map map2 = JWX.A00(userSession).A04;
            0sm A0E2 = 0Yt.A0E();
            C363138jC r53 = C363138jC.A00;
            if (r3.A00 != 1.0f) {
                z = false;
            }
            C59895JbK.A0G(userSession, r53, z);
            C64154LQt.A00.A01(C279294yP.FEED, userSession, list2, map2, false);
            jx1.A05(C279294yP.CLIPS, (L0A) null, (Integer) null, list2, map2, A0E2, 1.0f, false, false, false);
        } else {
            A0J(r3, list2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        if (r11.isEmpty() != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cb, code lost:
        r4 = X.27p.A01(r10.A0c).A0B;
        r3 = r4.A01;
        r3 = r3.A00(r3.A00, "ig_camera_navigation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e3, code lost:
        r3.AAJ("step", "GALLERY_NEXT_BUTTON");
        r3.AAJ("legacy_falco_event_name", "IG_CAMERA_GALLERY_NEXT_BUTTON");
        r6 = r4.A04;
        r1 = r6.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f5, code lost:
        if (r1 != null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f9, code lost:
        r3.AAJ("camera_session_id", r1);
        r3.A8M(r4.A0J(), "camera_destination");
        r3.A8M(r6.A09, com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r3.A8k("event_type", 2);
        r3.A8M(X.C59725JVj.PRE_CAPTURE, "surface");
        r3.AAJ("module", X.27x.A08.getModuleName());
        r3.A9F("selected_photo_count", java.lang.Long.valueOf((long) r2));
        r3.A9F("selected_video_count", java.lang.Long.valueOf((long) r5));
        r3.AAJ("nav_chain", X.AnonymousClass1QI.A00.A02.A00);
        r3.AAK(X.2AL.A07(r4.A00, r4.A03), "system_info");
        r3.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017d, code lost:
        if (r3 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        r1 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0189, code lost:
        if (r1.hasNext() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0195, code lost:
        if (((com.instagram.common.gallery.model.GalleryItem) r1.next()).A03() == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0197, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0199, code lost:
        if (r2 >= 0) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0L(X.C362048hG r10, java.util.List r11, java.util.List r12) {
        /*
            X.82p r0 = r10.A1V
            X.82o r0 = r0.A02
            r6 = 1
            X.82Y r0 = r0.A01
            r0.A0U = r6
            X.8Yz r1 = r10.A0f
            X.80m r7 = r1.A08
            java.lang.Object r0 = r7.A00
            X.9QA r5 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            r2 = 0
            if (r0 == 0) goto L_0x009a
            X.8aL r0 = X.C358088aL.A0T
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x009a
            com.instagram.common.session.UserSession r4 = r10.A0c
            X.0Tu r3 = X.0Tu.A05
            r0 = 36331141241783209(0x8112fb000043a9, double:3.039298242842572E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x009a
            X.8XA r7 = r10.A0w
            r0 = 10
            int r0 = X.0Yv.A1E(r12, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r4 = r12.iterator()
        L_0x0044:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r4.next()
            X.9SZ r1 = (X.AnonymousClass9SZ) r1
            com.instagram.common.gallery.model.GalleryItem r0 = r1.A01
            com.instagram.common.gallery.Medium r0 = r0.A00
            if (r0 == 0) goto L_0x0063
            java.lang.String r3 = r0.A0X
        L_0x0058:
            android.graphics.Bitmap r1 = r1.A00
            X.0eP r0 = new X.0eP
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x0044
        L_0x0063:
            r3 = 0
            goto L_0x0058
        L_0x0065:
            java.util.Iterator r5 = r5.iterator()
        L_0x0069:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r5.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r4 = r0.A00
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.A01
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r4 == 0) goto L_0x0069
            if (r3 == 0) goto L_0x0069
            com.instagram.common.session.UserSession r0 = r7.A0F
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.8c4 r0 = new X.8c4
            r0.<init>(r3, r4)
            r1.A00(r0)
            goto L_0x0069
        L_0x0090:
            r7.A0M(r6)
            r10.A0X()
            r10.A0h(r2)
            goto L_0x00ba
        L_0x009a:
            java.lang.Object r0 = r7.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0242
            java.lang.Integer r1 = r10.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0242
            com.instagram.common.session.UserSession r1 = r10.A0c
            X.0Tu r0 = X.0Tu.A05
            r3 = 36330939378451292(0x8112cc0002435c, double:3.0391705836586294E-306)
            boolean r0 = X.182.A06(r0, r1, r3)
            if (r0 == 0) goto L_0x019c
            A0K(r10, r11)
        L_0x00ba:
            boolean r3 = r11 instanceof java.util.Collection
            if (r3 == 0) goto L_0x015a
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x015a
            r5 = 0
        L_0x00c5:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0181
        L_0x00cb:
            com.instagram.common.session.UserSession r0 = r10.A0c
            X.27r r0 = X.27p.A01(r0)
            X.29T r4 = r0.A0B
            X.0wc r3 = r4.A01
            java.lang.String r1 = "ig_camera_navigation"
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0159
            java.lang.String r1 = "GALLERY_NEXT_BUTTON"
            java.lang.String r0 = "step"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "IG_CAMERA_GALLERY_NEXT_BUTTON"
            java.lang.String r0 = "legacy_falco_event_name"
            r3.AAJ(r0, r1)
            X.283 r6 = r4.A04
            java.lang.String r1 = r6.A0L
            if (r1 != 0) goto L_0x00f9
            java.lang.String r1 = ""
        L_0x00f9:
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            X.4yP r1 = r4.A0J()
            java.lang.String r0 = "camera_destination"
            r3.A8M(r1, r0)
            X.28D r1 = r6.A09
            java.lang.String r0 = "entry_point"
            r3.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.JVj r1 = X.C59725JVj.PRE_CAPTURE
            java.lang.String r0 = "surface"
            r3.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r3.AAJ(r0, r1)
            long r0 = (long) r2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "selected_photo_count"
            r3.A9F(r0, r1)
            long r0 = (long) r5
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "selected_video_count"
            r3.A9F(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
            com.instagram.common.session.UserSession r1 = r4.A03
            X.02m r0 = r4.A00
            X.8aX r1 = X.2AL.A07(r0, r1)
            java.lang.String r0 = "system_info"
            r3.AAK(r1, r0)
            r3.Cgf()
        L_0x0159:
            return
        L_0x015a:
            java.util.Iterator r1 = r11.iterator()
            r5 = 0
        L_0x015f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r1.next()
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x015f
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x015f
        L_0x0175:
            X.0sr.A1S()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x017d:
            if (r3 == 0) goto L_0x0181
            goto L_0x00c5
        L_0x0181:
            java.util.Iterator r1 = r11.iterator()
        L_0x0185:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r1.next()
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0185
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x0185
            goto L_0x0175
        L_0x019c:
            android.app.Activity r4 = r10.A0N
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r3 = r11.iterator()
        L_0x01a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r3.next()
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            com.instagram.common.gallery.Medium r0 = r0.A00
            if (r0 == 0) goto L_0x01a7
            r9.add(r0)
            goto L_0x01a7
        L_0x01bb:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat r0 = com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat.LAYOUT
            r8.add(r0)
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat r0 = com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat.SEPARATE
            r8.add(r0)
            X.L0I r3 = new X.L0I
            r3.<init>(r10)
            X.7Pr r6 = new X.7Pr
            r6.<init>(r1)
            android.content.Context r5 = r4.getApplicationContext()
            r0 = 2131100247(0x7f060257, float:1.781287E38)
            int r0 = r5.getColor(r0)
            r6.A06 = r0
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0249
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0249
            X.K5J r5 = new X.K5J
            r5.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r1 = r1.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r7.putString(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            r0 = 3947(0xf6b, float:5.531E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.putParcelableArrayList(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            r0 = 3148(0xc4c, float:4.411E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.putParcelableArrayList(r0, r1)
            r5.setArguments(r7)
            X.L3v r0 = new X.L3v
            r0.<init>(r4, r3)
            r5.A02 = r0
            X.7Pu r0 = r6.A00()
            r0.A02(r4, r5)
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r1 = r0.A01(r4)
            if (r1 == 0) goto L_0x00ba
            X.AgT r0 = new X.AgT
            r0.<init>(r3)
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0H = r0
            goto L_0x00ba
        L_0x0242:
            X.85O r0 = r10.A10
            r0.A01(r12)
            goto L_0x00ba
        L_0x0249:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362048hG.A0L(X.8hG, java.util.List, java.util.List):void");
    }

    private final boolean A0N() {
        C362198hV r1 = this.A0v;
        if ((r1.A00() && !((Boolean) r1.A00.A01).booleanValue()) || !this.A0L || A0O() || this.A08 == AnonymousClass05K.A0C) {
            return false;
        }
        C357638Yz r4 = this.A0f;
        if (r4.A0P()) {
            if (182.A06(0Tu.A05, this.A0c, 36327387440626064L)) {
                return false;
            }
        }
        if (!(r4.A08.A00 instanceof AnonymousClass80O)) {
            return true;
        }
        if (!182.A06(0Tu.A05, this.A0c, 36328568556371376L)) {
            return true;
        }
        return false;
    }

    private final boolean A0O() {
        C3511387s r1 = this.A13;
        if ((r1.A04 == null || !r1.A0N() || r1.A0A == null) && !this.A0w.A0R()) {
            return false;
        }
        return true;
    }

    private final boolean A0P() {
        if (!(this.A0z instanceof C328767Gd)) {
            return false;
        }
        Object obj = this.A0f.A08.A00;
        if (obj instanceof AnonymousClass80O) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9QA)) {
            return false;
        }
        if (182.A06(0Tu.A05, this.A0c, 36329041003101956L)) {
            return true;
        }
        return false;
    }

    private final boolean A0Q() {
        if ((!0qQ.A0K(this.A0f.A08.A00, AnonymousClass9QA.A00) || this.A08 != AnonymousClass05K.A01 || !(!this.A0z.Brk().isEmpty())) && this.A0C && !A0O() && this.A0L) {
            return false;
        }
        return true;
    }

    private final boolean A0R(GalleryItem galleryItem) {
        int i;
        UserSession userSession = this.A0c;
        boolean z = false;
        if (galleryItem.A09 == AnonymousClass05K.A0C) {
            z = true;
        }
        boolean A062 = galleryItem.A06();
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            i = remoteMedia.A01;
        } else {
            i = 0;
        }
        if (!z || !A062 || !AJ5.A06(userSession, i)) {
            return false;
        }
        AnonymousClass9PQ.A08(this.A0Z, userSession, AnonymousClass000.A00(1489), AnonymousClass9PQ.A00((C279284yO) this.A0f.A08.A00), (Map) null);
        F5K.A00(this.A0N, userSession);
        return true;
    }

    private final boolean A0S(GalleryItem galleryItem) {
        Medium medium;
        if (galleryItem.A09 == AnonymousClass05K.A0C || (medium = galleryItem.A00) == null || !(this.A0f.A08.A00 instanceof AnonymousClass80O) || !medium.CeS() || medium.A03 <= 1800000) {
            return false;
        }
        return true;
    }

    public static final boolean A0T(C362048hG r2) {
        if ((r2.A0f.A08.A00 instanceof AnonymousClass80K) || r2.A08 == AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }

    public final void A0V() {
        AnonymousClass0eM r1 = this.A0r.A0R;
        if (((AnonymousClass8XW) r1.getValue()).A05) {
            Object obj = ((AnonymousClass8XW) r1.getValue()).A0B.get(-1);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (!(!((Folder) obj).A05.isEmpty())) {
                A0U();
            }
        }
    }

    public final void A0X() {
        while (true) {
            C328777Ge r1 = this.A0z;
            if (!r1.Brk().isEmpty()) {
                AnonymousClass9SZ BJM = r1.BJM(0);
                C362488hz r3 = this.A0m;
                GalleryItem galleryItem = BJM.A01;
                List list = C362488hz.A0H;
                r3.A01(galleryItem, (Bitmap) null);
            } else {
                r1.clear();
                ((C348977zO) this.A0c.A01(C348977zO.class, C348967zN.A00)).A00.clear();
                return;
            }
        }
    }

    public final void A0Y() {
        List Brk = this.A0z.Brk();
        if (Brk != null && !Brk.isEmpty()) {
            this.A10.A00();
            A0C(this);
            A0h(false);
        }
    }

    public final void A0Z() {
        AnonymousClass85P r0;
        AnonymousClass85O r1 = this.A10;
        boolean A0N2 = A0N();
        05G r12 = r1.A08;
        if (A0N2) {
            r0 = AnonymousClass85P.OFF;
        } else {
            r0 = AnonymousClass85P.OPTION_NOT_ALLOWED;
        }
        r12.Epw(r0);
    }

    public final void A0a() {
        View view;
        Context context;
        int i;
        String string;
        C362198hV r6 = this.A0v;
        C3494680m r8 = r6.A03.A08;
        if ((r8.A00 instanceof AnonymousClass9QA) && r6.A04()) {
            this.A0P.setVisibility(0);
        }
        if (!this.A0C) {
            this.A0R.setVisibility(8);
            this.A0X.setVisibility(8);
            this.A0d.setVisibility(8);
        } else if (A0T(this)) {
            this.A0X.setVisibility(0);
            this.A0d.setVisibility(4);
            this.A1P.setVisibility(8);
            C362098hL r1 = this.A0t;
            C339797kB r0 = r1.A00;
            if (r0 != null) {
                r0.A00();
            }
            r1.A00 = null;
            View view2 = this.A0H;
            if (view2 != null) {
                view2.setBackgroundColor(this.A0O.getColor(R.color.black));
                return;
            }
            return;
        } else {
            View view3 = this.A0H;
            if (view3 != null) {
                view3.setBackgroundColor(this.A0O.getColor(2Yu.A0H(this.A0N, R.attr.igds_color_media_background)));
            }
            UserSession userSession = this.A0c;
            if (AnonymousClass39V.A00(userSession).booleanValue()) {
                this.A1C.A02();
            }
            C362178hT r3 = this.A0r;
            if (r3.A0B) {
                this.A0R.setVisibility(0);
                this.A0X.setVisibility(0);
                this.A0d.setVisibility(4);
            } else if (!C2604245p.A03(this.A0N)) {
                this.A0R.setVisibility(8);
                this.A0X.setVisibility(8);
                this.A0d.setVisibility(8);
                this.A1P.setVisibility(8);
                this.A0t.A00(this.A1b);
                return;
            } else {
                int A002 = this.A0m.A00();
                this.A0R.setVisibility(8);
                RecyclerView recyclerView = this.A0X;
                if (A002 == 0) {
                    recyclerView.setVisibility(0);
                    if (r3.A06()) {
                        this.A1P.setVisibility(0);
                        TextView textView = this.A1T;
                        Context context2 = this.A0O;
                        0qQ.A0B(context2, 0);
                        0Tu r7 = 0Tu.A05;
                        long A012 = 182.A01(r7, userSession, 36598137885822061L);
                        Long valueOf = Long.valueOf(A012);
                        if (A012 == -1) {
                            string = context2.getString(2131962986);
                        } else {
                            string = context2.getString(2131962983, new Object[]{valueOf});
                        }
                        0qQ.A0A(string);
                        String string2 = context2.getString(2131962984);
                        0qQ.A07(string2);
                        textView.setText(LNH.A00(context2, userSession, string, string2, 182.A04(r7, userSession, 36882683762049482L)));
                        return;
                    }
                    IgTextView igTextView = this.A0d;
                    int i2 = ((C362688iK) this.A1I.getValue()).A03.A02.A02;
                    if (i2 == -9) {
                        context = this.A0O;
                        i = 2131962987;
                    } else if (i2 != -3) {
                        context = this.A0O;
                        i = 2131962989;
                        if (i2 != -2) {
                            i = 2131962982;
                        }
                    } else {
                        context = this.A0O;
                        i = 2131962990;
                    }
                    igTextView.setText(context.getString(i));
                    igTextView.setVisibility(0);
                    if ((r8.A00 instanceof AnonymousClass9QA) && r6.A04()) {
                        this.A0P.setVisibility(4);
                        return;
                    }
                    return;
                }
                recyclerView.setVisibility(0);
                this.A0d.setVisibility(4);
                this.A1P.setVisibility(8);
                view = this.A01;
                if (view == null) {
                    return;
                }
                view.setVisibility(8);
            }
        }
        view = this.A1P;
        view.setVisibility(8);
    }

    public final void A0b(Bitmap bitmap, GalleryItem galleryItem, int i) {
        GalleryItem galleryItem2 = galleryItem;
        if (A0S(galleryItem)) {
            C59689JTv.A06(this.A0O, 2131976481);
            return;
        }
        Integer num = galleryItem.A09;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2 && galleryItem.A00 == null) {
            A0A(galleryItem, this.A0r.A04());
        } else {
            Medium medium = galleryItem.A00;
            if (medium != null) {
                medium.A0G.A01 = this.A0r.A04();
            }
        }
        this.A0m.A01(galleryItem, bitmap);
        int i2 = i;
        if (num != num2) {
            this.A0q.A00(galleryItem2, ((C362688iK) this.A1I.getValue()).A03.A02.A00(), "TAP", i2, this.A0z.CbT(galleryItem));
        }
        if (this.A0z.CbT(galleryItem)) {
            A08(galleryItem, i);
        }
    }

    public final void A0d(String str) {
        int i;
        IgTextView igTextView = this.A0e;
        igTextView.setText(str);
        03v.A0B(igTextView, new C346457vD(this, str));
        View view = this.A1Q;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources resources = this.A0O.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        Drawable drawable = igTextView.getCompoundDrawables()[2];
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float) resources.getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding));
        layoutParams.width = Math.min(((int) textPaint.measureText(str)) + i + (dimensionPixelSize * 2) + dimensionPixelSize2, ((Number) this.A1J.getValue()).intValue()) + igTextView.getPaddingStart();
        view.setLayoutParams(layoutParams);
    }

    public final void A0f(List list, 0sP r24, boolean z) {
        if (182.A06(0Tu.A05, this.A0c, 36327387440560527L)) {
            this.A0m.A00 = new AnonymousClass9W1(this);
        }
        C362488hz r2 = this.A0m;
        if (z) {
            C362168hS r1 = r2.A08;
            0sm A0E2 = 0Yt.A0E();
            0qQ.A0B(A0E2, 0);
            r1.A07 = A0E2;
        }
        List<C381769cI> list2 = list;
        int A0L2 = 0se.A0L(0Yv.A1E(list2, 10));
        if (A0L2 < 16) {
            A0L2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2);
        for (C381769cI r7 : list2) {
            ImageUrl simpleImageUrl = new SimpleImageUrl(r7.A07);
            1NK.A00().A0J(simpleImageUrl, r2.A03.toString()).A01();
            String str = r7.A06;
            ImageUrl simpleImageUrl2 = new SimpleImageUrl(str);
            RemoteMedia A002 = AJ5.A00(r7);
            GalleryItem galleryItem = new GalleryItem((Draft) null, (GeneratedMediaMetadata) null, (Medium) null, A002, (AnonymousClass8y3) null, simpleImageUrl2, (C352218Cl) null, (C349307zv) null, AnonymousClass05K.A0C, A002.A06, -1);
            String str2 = r7.A05;
            int i = 1;
            if (r7.A09) {
                i = 3;
            }
            int i2 = r7.A01;
            C362168hS r12 = r2.A08;
            GalleryItem galleryItem2 = galleryItem;
            ImageUrl imageUrl = simpleImageUrl;
            String str3 = str2;
            String str4 = str;
            linkedHashMap.put(str2, new C361728gh(galleryItem2, imageUrl, str3, str4, r24, i, i2, r12.A0H.CMB(galleryItem), r12.A0A, false));
        }
        C362168hS r13 = r2.A08;
        LinkedHashMap A042 = 0Yt.A04(r13.A07, linkedHashMap);
        0qQ.A0B(A042, 0);
        r13.A07 = A042;
        r2.A02(r2.A00);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0145: MOVE  (r2v3 X.2t9) = (r2v2 X.2t9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    public final void A0g(boolean r7) {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.A08
            int r2 = r0.intValue()
            r3 = 1
            r1 = 0
            if (r2 == r3) goto L_0x01a7
            if (r2 == r1) goto L_0x017d
            r0 = 2
            if (r2 != r0) goto L_0x01ba
            androidx.recyclerview.widget.RecyclerView r2 = r6.A0X
            X.8iG r0 = r6.A0j
            r2.A15(r0)
        L_0x0016:
            if (r7 == 0) goto L_0x001d
            X.8gm r0 = r6.A1E
            r0.A05()
        L_0x001d:
            X.8Yz r0 = r6.A0f
            X.80m r0 = r0.A08
            java.lang.Object r2 = r0.A00
            boolean r0 = r2 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x00a4
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.A08 = r0
            androidx.recyclerview.widget.RecyclerView r2 = r6.A0X
            X.8hz r0 = r6.A0m
            X.2t9 r0 = r0.A06
            r2.setAdapter(r0)
            r2.setPadding(r1, r1, r1, r1)
            r2.setClipToPadding(r3)
        L_0x003a:
            r6.A04()
        L_0x003d:
            X.8hA r3 = r6.A0o
            com.instagram.common.ui.base.IgTextView r1 = r3.A01
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = "draftInstructions"
        L_0x0045:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004d:
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r0 = r3.A03
            java.lang.String r1 = "draftsTabView"
            if (r0 == 0) goto L_0x0045
            r0.setSelected(r7)
            com.instagram.common.ui.base.IgTextView r2 = r3.A03
            if (r2 == 0) goto L_0x0045
            android.content.Context r1 = r3.A0A
            if (r7 == 0) goto L_0x009d
            r0 = 2131099846(0x7f0600c6, float:1.7812057E38)
        L_0x0066:
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
            android.content.Context r3 = r6.A0O
            android.app.Activity r2 = r6.A0N
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r7 != 0) goto L_0x0079
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x0079:
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r3.getColor(r0)
            com.instagram.common.ui.base.IgTextView r1 = r6.A0e
            r1.setTextColor(r0)
            if (r7 != 0) goto L_0x009b
            int r0 = X.2Yu.A07(r2)
            int r0 = r3.getColor(r0)
        L_0x0090:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setCompoundDrawableTintList(r0)
            r6.A0Z()
            return
        L_0x009b:
            r0 = 0
            goto L_0x0090
        L_0x009d:
            android.app.Activity r0 = r3.A09
            int r0 = X.2Yu.A08(r0)
            goto L_0x0066
        L_0x00a4:
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x012b
            if (r7 == 0) goto L_0x00f9
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A08 = r0
            X.8hA r5 = r6.A0o
            androidx.recyclerview.widget.RecyclerView r4 = r6.A0X
            X.0qQ.A0B(r4, r1)
            X.8hl r3 = r5.A06
            if (r3 == 0) goto L_0x01b6
            com.instagram.common.session.UserSession r2 = r3.A04
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            X.L9c r0 = new X.L9c
            r0.<init>(r2, r1)
            r3.A00 = r0
            X.8hs r0 = r3.A08
            X.2t9 r0 = r0.A01
            r4.setAdapter(r0)
            X.85O r1 = r6.A10
            X.8hl r0 = r5.A06
            if (r0 == 0) goto L_0x01b6
            boolean r3 = r0.A02
        L_0x00da:
            X.05G r2 = r1.A08
        L_0x00dc:
            java.lang.Object r1 = r2.getValue()
            X.85P r0 = X.AnonymousClass85P.OPTION_NOT_ALLOWED
            if (r1 == r0) goto L_0x00e8
            if (r3 == 0) goto L_0x00f6
            X.85P r0 = X.AnonymousClass85P.ON
        L_0x00e8:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x00dc
            X.2Fk r0 = r6.A02
            if (r0 != 0) goto L_0x011e
            java.lang.String r1 = "optionTogglesLiveData"
            goto L_0x0045
        L_0x00f6:
            X.85P r0 = X.AnonymousClass85P.OFF
            goto L_0x00e8
        L_0x00f9:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.A08 = r0
            X.8hA r0 = r6.A0o
            X.8hl r1 = r0.A06
            if (r1 == 0) goto L_0x01b6
            r0 = 0
            r1.A00 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r6.A0X
            X.8hz r0 = r6.A0m
            X.2t9 r0 = r0.A06
            r1.setAdapter(r0)
            X.85O r1 = r6.A10
            X.7Ge r0 = r6.A0z
            java.util.List r0 = r0.Brk()
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            goto L_0x00da
        L_0x011e:
            java.lang.Object r0 = r0.A02()
            X.85P r0 = (X.AnonymousClass85P) r0
            if (r0 == 0) goto L_0x003a
            A0H(r6, r0)
            goto L_0x003a
        L_0x012b:
            X.80K r0 = X.AnonymousClass80K.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r6.A08 = r0
            X.8hD r4 = r6.A1C
            androidx.recyclerview.widget.RecyclerView r3 = r6.A0X
            X.0qQ.A0B(r3, r1)
            X.2Rw r2 = r3.A0A
            boolean r0 = r2 instanceof X.AnonymousClass2t9
            r1 = 0
            if (r0 == 0) goto L_0x014b
            X.2t9 r2 = (X.AnonymousClass2t9) r2
            if (r2 == 0) goto L_0x014b
            java.lang.Object r1 = r2.A05
        L_0x014b:
            r0 = 465(0x1d1, float:6.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0164
            X.0eM r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            X.8hs r0 = (X.C362428hs) r0
            X.2t9 r0 = r0.A01
            r3.setAdapter(r0)
        L_0x0164:
            r6.A04()
            X.8iG r0 = r6.A0j
            r3.A16(r0)
            X.8hL r1 = r6.A0t
            X.7kB r0 = r1.A00
            if (r0 == 0) goto L_0x0175
            r0.A00()
        L_0x0175:
            r0 = 0
            r1.A00 = r0
            r6.A03()
            goto L_0x003d
        L_0x017d:
            X.87s r0 = r6.A13
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0196
            r6.A0h(r3)
            X.85O r0 = r6.A10
            X.05G r2 = r0.A08
            X.85P r0 = X.AnonymousClass85P.ON
            r2.Epw(r0)
        L_0x0191:
            A0C(r6)
            goto L_0x0016
        L_0x0196:
            X.8hz r0 = r6.A0m
            X.8hS r0 = r0.A08
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0191
            X.85O r0 = r6.A10
            r0.A00()
            r6.A0h(r1)
            goto L_0x0191
        L_0x01a7:
            X.8hA r0 = r6.A0o
            X.8hl r0 = r0.A06
            if (r0 == 0) goto L_0x01b6
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            r6.A0h(r1)
            goto L_0x0016
        L_0x01b6:
            java.lang.String r1 = "storyDraftsAdapter"
            goto L_0x0045
        L_0x01ba:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362048hG.A0g(boolean):void");
    }

    public final void A0h(boolean z) {
        boolean z2;
        Object value;
        AnonymousClass85P r0;
        int intValue = this.A08.intValue();
        if (intValue == 1) {
            C362488hz r2 = this.A0m;
            List list = C362488hz.A0H;
            r2.A03(false, false, false);
            C362358hl r02 = this.A0o.A06;
            if (r02 == null) {
                0qQ.A0F("storyDraftsAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            r02.A02(z);
            this.A16.A0A(true);
        } else if (intValue == 0) {
            C362488hz r22 = this.A0m;
            C362198hV r1 = this.A0v;
            if (r1.A00()) {
                z2 = ((Boolean) r1.A00.A02).booleanValue();
            } else {
                z2 = false;
            }
            AnonymousClass85O r3 = this.A10;
            r22.A03(z, z2, r3.A02((C279284yO) this.A0f.A08.A00));
            AnonymousClass8QZ r23 = this.A16;
            if (z) {
                int i = 0;
                r23.A0B(true);
                if (A0P()) {
                    i = 5;
                }
                r23.A00 = i;
            } else {
                r23.A0A(true);
            }
            05G r24 = r3.A08;
            do {
                value = r24.getValue();
                r0 = AnonymousClass85P.OPTION_NOT_ALLOWED;
                if (value != r0) {
                    if (z) {
                        r0 = AnonymousClass85P.ON;
                    } else {
                        r0 = AnonymousClass85P.OFF;
                    }
                }
            } while (!r24.AIY(value, r0));
            A0G(this);
        } else if (intValue != 2) {
            throw new RuntimeException();
        }
    }

    public final void A0i(boolean z) {
        this.A0L = z;
        if (z) {
            this.A0z.A91(this);
        }
        if (!C3505585e.A01(this.A0c) && !this.A10.A02((C279284yO) this.A0f.A08.A00)) {
            A0h(false);
        }
    }

    public final void A0j(boolean z) {
        this.A0D = z;
        AnonymousClass8XA r2 = this.A0w;
        if (z) {
            r2.A0Z.E3H(new Object());
            r2.A0O(true);
        } else {
            27r A012 = 27p.A01(r2.A0F);
            C279284yO r6 = (C279284yO) r2.A0G.A08.A00;
            0wc r3 = A012.A01;
            0Aj A002 = r3.A00(r3.A00, "ig_camera_gallery_enter_button_tap");
            if (A002.isSampled()) {
                String str = A012.A04.A0L;
                if (str != null) {
                    A002.A8M(r6.A00, "camera_destination");
                    A002.AAJ("camera_session_id", str);
                    A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A002.AAK(2AL.A07(A012.A00, A012.A03), "system_info");
                    A002.Cgf();
                } else {
                    0kD.A01("IgCameraLoggerImpl", "logGalleryEnterButtonTap() cameraSession is null");
                }
            }
            AnonymousClass88F r1 = r2.A0L.A0N;
            if (r1 == null || r1.A0f) {
                if (!((C352568Dw) r2.A0M.A00.A00()).DHP()) {
                    r2.A0Z.E3H(new Object());
                    r2.A0O(true);
                }
            } else if (!r1.A0f) {
                r1.A06();
            }
        }
        A0i(this.A0L);
    }

    public final Integer Aso() {
        return this.A0r.A0T;
    }

    public final boolean CKC() {
        C361628gX r0;
        C362178hT r2 = this.A0r;
        if (!r2.A06() || (r0 = (C361628gX) r2.A0N.A0F.A02()) == null || !r0.A03) {
            return false;
        }
        return true;
    }

    public final void CLL(boolean z) {
        2cs r1 = (2cs) this.A1H.getValue();
        if (z) {
            r1.A06(0.0d);
        } else {
            r1.A08(0.0d, true);
        }
    }

    public final boolean CUA() {
        C65075Lmv lmv;
        if (this.A0I == AnonymousClass05K.A0C || (((lmv = this.A0w.A00) != null && lmv.A00((ViewGroup) null).getParent() != null) || this.A13.A04 != null)) {
            return false;
        }
        return true;
    }

    public final boolean CV4() {
        return this.A0D;
    }

    public final boolean CV5() {
        return this.A1M;
    }

    public final boolean CXX() {
        return this.A0r.A06();
    }

    public final boolean Cdb() {
        C3511387s r2 = this.A13;
        boolean z = false;
        if (r2.A04 != null) {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (!r2.A0N() || r2.A0A == null) {
            return true;
        }
        return false;
    }

    public final void DCO(boolean z) {
        if (!z) {
            A0U();
        }
    }

    public final void DDR() {
        if (this.A08 == AnonymousClass05K.A01) {
            if (C3505585e.A01(this.A0c)) {
                return;
            }
        } else if (A0T(this)) {
            this.A0M = false;
        } else {
            return;
        }
        A0g(false);
    }

    public final void DMO(GalleryItem galleryItem, boolean z) {
        if (this.A0z.Brk().isEmpty() && !this.A10.A03((C279284yO) this.A0f.A08.A00)) {
            A0h(false);
        }
    }

    public final void DSb() {
        if (this.A0m.A00() != 0) {
            GridLayoutManager gridLayoutManager = this.A0V;
            int A022 = C240113Jq.A02(gridLayoutManager);
            for (int A012 = C240113Jq.A01(gridLayoutManager); A012 <= A022; A012++) {
                C249703kE A0X2 = this.A0X.A0X(A012, false);
                if (A0X2 instanceof B1G) {
                    ((B1G) A0X2).DSb();
                }
            }
        }
    }

    public final void DsQ(float f, float f2) {
        this.A0I = AnonymousClass05K.A00;
    }

    public final void Du1(C53401GnY gnY) {
        C328777Ge r4 = this.A0z;
        int size = r4.Brk().size();
        if (size != 0) {
            if (size == 1) {
                27p.A01(this.A0c).A0J.A06(this.A14, "reels_gallery_next_button_tap", size);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < size; i++) {
                if (r4.Brm(i).A00 != null || (this.A0m.A08.A0A && this.A0r.A08 != null)) {
                    arrayList.add(r4.BJM(i).A01);
                    arrayList2.add(r4.Brm(i));
                    Medium medium = r4.BJM(i).A01.A00;
                    if (medium != null) {
                        this.A1V.A02.A01.A0n.add(medium);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RemoteMedia remoteMedia = ((GalleryItem) it.next()).A04;
                if (remoteMedia != null) {
                    arrayList3.add(remoteMedia);
                }
            }
            if (!arrayList3.isEmpty()) {
                C394949yx.A00(this.A0N, this.A15, arrayList3, new C41567AwZ(25, arrayList, this, arrayList2));
            } else {
                A0L(this, arrayList, arrayList2);
            }
        }
    }

    public final void ETJ(Integer num) {
        this.A0r.A0T = num;
    }

    public final boolean EtH() {
        if (this.A13.A04 != null || this.A0f.A08.A00 != AnonymousClass80N.A00 || this.A0v.A00() || !this.A12.A0s()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r2 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A0c, 36323010868685553L) != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0099, code lost:
        if (r1 != -1) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean FJb(float r8, float r9, float r10) {
        /*
            r7 = this;
            java.lang.Integer r1 = r7.A0I
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2 = 1
            if (r1 == r0) goto L_0x000d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x000c
            r2 = 0
        L_0x000c:
            return r2
        L_0x000d:
            float r0 = r7.A00
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r5 = 0
            if (r0 != 0) goto L_0x0016
            r5 = 1
        L_0x0016:
            X.87s r4 = r7.A13
            X.4gw r0 = r4.A04
            if (r0 != 0) goto L_0x0064
            boolean r0 = r7.A1M
            if (r0 == 0) goto L_0x002b
            if (r5 == 0) goto L_0x002b
            boolean r2 = r7.A1c
            if (r2 == 0) goto L_0x0065
        L_0x0026:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0028:
            r7.A0I = r0
            return r2
        L_0x002b:
            X.8XA r0 = r7.A0w
            boolean r0 = r0.A0R()
            if (r0 != 0) goto L_0x0064
            X.8Yz r0 = r7.A0f
            X.80m r3 = r0.A08
            java.lang.Object r1 = r3.A00
            X.80L r0 = X.AnonymousClass80L.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.Object r1 = r3.A00
            X.80g r0 = X.C3494080g.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00a1
        L_0x004b:
            X.4gw r0 = r4.A04
            if (r0 != 0) goto L_0x0064
            X.8gm r0 = r7.A1E
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0068
            com.instagram.common.session.UserSession r4 = r7.A0c
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323010868685553(0x810b9600002af1, double:3.03415656215723E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0068
        L_0x0064:
            r2 = 0
        L_0x0065:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0028
        L_0x0068:
            float r1 = r7.A00
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            android.view.ViewGroup r0 = r7.A0S
            int r0 = r0.getTop()
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            X.8hV r0 = r7.A0v
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x008c
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x008c
            goto L_0x0064
        L_0x008c:
            int r1 = r7.A0G
            androidx.recyclerview.widget.GridLayoutManager r0 = r7.A0V
            if (r1 != r2) goto L_0x009c
            int r1 = X.C240113Jq.A01(r0)
        L_0x0096:
            if (r1 == 0) goto L_0x0026
            r0 = -1
            if (r1 != r0) goto L_0x0064
            goto L_0x0026
        L_0x009c:
            int r1 = X.C240113Jq.A00(r0)
            goto L_0x0096
        L_0x00a1:
            if (r5 == 0) goto L_0x004b
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362048hG.FJb(float, float, float):boolean");
    }

    public final boolean getCanHaveEmptySegments() {
        if (this.A13.A04 != null) {
            return true;
        }
        return false;
    }

    public final int getColumnCount() {
        return this.A0G;
    }

    private final void A01() {
        if (!A0T(this)) {
            Activity activity = this.A0N;
            UserSession userSession = this.A0c;
            if (C361378g8.A00(activity, userSession)) {
                IgFrameLayout igFrameLayout = this.A04;
                if (igFrameLayout != null) {
                    KHN khn = new KHN(activity);
                    C63134Ks2.A00(activity, userSession, khn, true, true);
                    igFrameLayout.addView(khn);
                    return;
                }
                return;
            }
        }
        IgFrameLayout igFrameLayout2 = this.A04;
        if (igFrameLayout2 != null && igFrameLayout2.getChildCount() > 0) {
            igFrameLayout2.removeAllViews();
        }
    }

    public static final void A06(Bitmap bitmap, GalleryItem galleryItem, C362048hG r9) {
        C62320sa r1;
        Medium medium;
        int i;
        AnonymousClass8L4 r4;
        String str;
        if (r9.A0S(galleryItem)) {
            C59689JTv.A06(r9.A0O, 2131976481);
            29L r3 = 27p.A01(r9.A0c).A0J;
            C2801950r r2 = r9.A14;
            if (r3.A05.Aji() == C279294yP.CLIPS && r2 == C2801950r.CLIPS) {
                r3.A01 = r3.A04.A06(CancelReason.SYSTEM_CANCELLED, "Video is too long", 585185740, r3.A01);
                return;
            }
            return;
        }
        Medium medium2 = galleryItem.A00;
        if (medium2 != null) {
            medium2.A0G.A01 = r9.A0r.A04();
        }
        Integer num = null;
        if (!r9.A0D) {
            C357638Yz r12 = r9.A0f;
            if (r12.A0V(C358088aL.A0T)) {
                if (galleryItem.A06()) {
                    C59689JTv.A01(r9.A0N, (String) null, 2131962995, 1);
                } else {
                    Integer num2 = galleryItem.A09;
                    if (num2 == AnonymousClass05K.A0C) {
                        r9.A0B(galleryItem, new C41567AwZ(23, galleryItem, r9, bitmap));
                    } else {
                        int intValue = num2.intValue();
                        if (intValue == 0) {
                            Medium medium3 = galleryItem.A00;
                            if (medium3 != null) {
                                str = medium3.A0X;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else if (intValue == 5) {
                            C352218Cl r0 = galleryItem.A07;
                            if (r0 == null || (str = r0.A06()) == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalArgumentException("Unsupported media type for Layout gallery upload.");
                        }
                        AnonymousClass8XA r32 = r9.A0w;
                        if (bitmap != null) {
                            0qQ.A0B(str, 1);
                            AnonymousClass1Nd.A00(r32.A0F).A00(new C359138c4(bitmap, str));
                            r32.A0M(true);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                27p.A01(r9.A0c).A0J.A00(r9.A14);
                return;
            }
            C3494680m r42 = r12.A08;
            if (r42.A00 instanceof AnonymousClass80O) {
                AnonymousClass85O r22 = r9.A10;
                r22.A01 = new WeakReference(bitmap);
                if (galleryItem.A09 != AnonymousClass05K.A0C) {
                    Medium medium4 = galleryItem.A00;
                    if (medium4 != null) {
                        num = Integer.valueOf(medium4.A05);
                    }
                    r22.A00 = num;
                } else if (galleryItem.A00 == null) {
                    r1 = new MJ9(20, galleryItem, r9);
                    r9.A0B(galleryItem, r1);
                    return;
                }
                List singletonList = Collections.singletonList(galleryItem);
                0qQ.A07(singletonList);
                A0J(r9, singletonList);
                return;
            }
            Medium medium5 = galleryItem.A00;
            if (medium5 != null && galleryItem.A06() && (i = medium5.A03) < 15000) {
                if ((((float) medium5.A0B) * 1.0f) / ((float) medium5.A04) > 0.5625f && (r42.A00 instanceof AnonymousClass9QA) && (r4 = r9.A19) != null) {
                    r4.A00(medium5.A0X, (long) i);
                }
            }
        }
        r9.A1V.A02.A01.A0U = !r9.A0D;
        int intValue2 = galleryItem.A09.intValue();
        if (intValue2 == 2) {
            medium = galleryItem.A00;
            if (medium == null) {
                r1 = new C41567AwZ(22, galleryItem, r9, bitmap);
                r9.A0B(galleryItem, r1);
                return;
            } else if (bitmap == null) {
                return;
            }
        } else if (intValue2 != 0) {
            if (intValue2 != 5) {
                if (intValue2 != 6) {
                    throw new UnsupportedOperationException("Unhandled media thumbnail item type.");
                } else if (bitmap != null) {
                    C361998hA r13 = r9.A0o;
                    C349307zv r02 = galleryItem.A08;
                    if (r02 != null) {
                        r13.A01(bitmap, (C369988ve) null, r02);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                } else {
                    return;
                }
            } else if (bitmap != null) {
                C361998hA r14 = r9.A0o;
                C352218Cl r03 = galleryItem.A07;
                if (r03 != null) {
                    r14.A00(bitmap, (C369988ve) null, r03);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } else {
                return;
            }
        } else if (bitmap != null) {
            medium = galleryItem.A00;
            if (medium == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            return;
        }
        A05(bitmap, medium, r9);
    }

    public static final void A0D(C362048hG r4) {
        GridLayoutManager gridLayoutManager;
        C362638iF r0;
        if (A0T(r4)) {
            gridLayoutManager = r4.A0V;
            gridLayoutManager.A1v(3);
            r0 = new C362638iF(((C362428hs) r4.A1C.A07.getValue()).A01, 3);
        } else {
            if (r4.A0G != 3) {
                gridLayoutManager = r4.A0V;
                gridLayoutManager.A1v(3);
                AnonymousClass2t9 r2 = r4.A0m.A06;
                int i = gridLayoutManager.A00;
                0qQ.A0B(r2, 0);
                r0 = new C362638iF(r2, i);
            }
            r4.A0G = r4.A0V.A00;
        }
        gridLayoutManager.A01 = r0;
        r4.A0G = r4.A0V.A00;
    }

    private final void A0M(Integer num) {
        C328777Ge r2;
        int i;
        int intValue = num.intValue();
        if (intValue == 0) {
            r2 = this.A0z;
            C3511387s r1 = this.A13;
            if (r1.A04 == null) {
                i = 10;
                if (this.A0f.A08.A00 instanceof AnonymousClass80O) {
                    i = 50;
                }
            } else if (!r1.A0N() || r1.A0A == null) {
                i = ((Number) r1.A0D.getValue()).intValue();
            } else {
                i = 1;
            }
        } else if (intValue == 1) {
            r2 = this.A0z;
            i = this.A16.A0F;
        } else {
            throw new RuntimeException();
        }
        r2.Eco(i);
    }

    public final void A0U() {
        if (A0T(this)) {
            A0g(false);
            A03();
            return;
        }
        if (C2604245p.A03(this.A0N)) {
            IgTextView igTextView = this.A0o.A03;
            if (igTextView == null) {
                0qQ.A0F("draftsTabView");
                throw AnonymousClass00P.createAndThrow();
            } else if (igTextView.isSelected()) {
                A0g(true);
            } else if (!this.A1O || this.A0C) {
                this.A0r.A05();
            }
        } else if (this.A0C) {
            this.A0r.A0B = false;
            A0a();
            C362098hL r1 = this.A0t;
            if (!r1.A02) {
                r1.A02 = true;
                C2604245p.A01(r1.A03, r1);
            }
        }
        C362178hT r0 = this.A0r;
        AnonymousClass2jC.A00(r0.A0G, r0.A0J, r0.A0P).A01();
    }

    public final void DMA(int i, int i2) {
        if (A0P()) {
            C362488hz r3 = this.A0m;
            r3.A08.A01(new C66309MMs(r3, 13));
        }
    }

    public final void DMW() {
        A02();
    }

    public final void onResume() {
        A01();
        this.A0r.A00 = (int) (System.currentTimeMillis() / 1000);
        if (this.A0C) {
            A0I(this, "gallery_resume");
            C362098hL r1 = this.A0t;
            if (C2604245p.A03(r1.A03)) {
                r1.A04.A00();
                C339797kB r0 = r1.A00;
                if (r0 != null) {
                    r0.A00();
                }
                r1.A00 = null;
                r1.A05.A0U();
            }
            A0U();
        }
    }

    public final void DMZ(List list) {
        A02();
    }

    public final void DLn(AnonymousClass9SZ r1, int i) {
        A02();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.7Gd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: X.7Gd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: X.7Gd} */
    /* JADX WARNING: type inference failed for: r3v27, types: [X.8hk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r10v19, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r5v32, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r5v33, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x051a A[Catch:{ all -> 0x072e }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x058d A[Catch:{ all -> 0x072e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x05e4 A[Catch:{ all -> 0x072e }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x06f9 A[Catch:{ all -> 0x072e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0713 A[Catch:{ all -> 0x072e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0749  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0819  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x084c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x08bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C362048hG(android.app.Activity r62, android.view.ViewGroup r63, android.view.ViewGroup r64, android.widget.ImageView r65, X.AnonymousClass4DH r66, X.AnonymousClass0iw r67, X.C355608Qq r68, com.instagram.common.session.UserSession r69, X.C357638Yz r70, X.C361508gL r71, X.AnonymousClass8HT r72, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r73, X.C3499582p r74, X.C361998hA r75, X.AnonymousClass8XG r76, X.AnonymousClass8XA r77, X.C361968h7 r78, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r79, X.AnonymousClass85O r80, X.AnonymousClass80U r81, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r82, X.AnonymousClass88V r83, X.C3511387s r84, X.C2801950r r85, X.C362088hK r86, X.C351818An r87, X.AnonymousClass8L4 r88, com.instagram.model.direct.DirectShareTarget r89, X.C362028hD r90, X.AnonymousClass8XW r91, java.lang.String r92, boolean r93, boolean r94, boolean r95, boolean r96, boolean r97, boolean r98, boolean r99) {
        /*
            r61 = this;
            r22 = 1
            r21 = 2
            r28 = 3
            r0 = 4
            r13 = r63
            X.0qQ.A0B(r13, r0)
            r0 = 5
            r1 = r65
            X.0qQ.A0B(r1, r0)
            r0 = 6
            r14 = r64
            X.0qQ.A0B(r14, r0)
            r24 = 8
            r45 = 21
            r0 = 22
            r8 = r78
            X.0qQ.A0B(r8, r0)
            r27 = 24
            r23 = 25
            r2 = 27
            r57 = r72
            r0 = r57
            X.0qQ.A0B(r0, r2)
            r9 = 30
            r0 = 35
            r2 = r81
            X.0qQ.A0B(r2, r0)
            r0 = r61
            r0.<init>()
            r11 = r69
            r0.A0c = r11
            r3 = r74
            r0.A1V = r3
            r12 = r62
            r0.A0N = r12
            r0.A0S = r13
            r0.A0U = r1
            r0.A1R = r14
            r49 = r77
            r1 = r49
            r0.A0w = r1
            r50 = r70
            r1 = r50
            r0.A0f = r1
            r1 = r80
            r0.A10 = r1
            r39 = r82
            r1 = r39
            r0.A12 = r1
            r10 = r84
            r0.A13 = r10
            r1 = r87
            r0.A18 = r1
            r60 = r66
            r1 = r60
            r0.A0Y = r1
            r59 = r67
            r1 = r59
            r0.A0Z = r1
            r26 = r95
            r1 = r26
            r0.A1M = r1
            r1 = r86
            r0.A17 = r1
            r58 = r68
            r1 = r58
            r0.A0b = r1
            r1 = r88
            r0.A19 = r1
            r1 = r76
            r0.A0u = r1
            r0.A0x = r8
            r1 = r83
            r0.A1X = r1
            r46 = r79
            r1 = r46
            r0.A0y = r1
            r1 = r73
            r0.A0h = r1
            r1 = r71
            r0.A0g = r1
            r1 = r57
            r0.A1U = r1
            r6 = r75
            r0.A0o = r6
            r1 = r90
            r0.A1C = r1
            r48 = r85
            r1 = r48
            r0.A14 = r1
            r1 = r97
            r0.A1N = r1
            r47 = r92
            r1 = r47
            r0.A1b = r1
            r0.A11 = r2
            r1 = r89
            r0.A1Y = r1
            r1 = 2131433469(0x7f0b17fd, float:1.8488725E38)
            android.view.View r1 = r13.requireViewById(r1)
            X.0qQ.A07(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.A0X = r1
            r2 = 2131433448(0x7f0b17e8, float:1.8488682E38)
            android.view.View r2 = r13.requireViewById(r2)
            X.0qQ.A07(r2)
            r0.A0R = r2
            X.4gw r2 = r10.A04
            if (r2 == 0) goto L_0x073c
            X.8iT r5 = new X.8iT
            r5.<init>()
            java.util.List r3 = r2.BrX()
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r5.A02 = r3
            X.C362778iT.A01(r5)
        L_0x00f8:
            X.7Ge r5 = (X.C328777Ge) r5
            r0.A0z = r5
            r7 = 0
            r2 = 0
            X.8gR r3 = new X.8gR
            r3.<init>(r7, r2)
            r0.A15 = r3
            X.8gQ r3 = X.C361538gO.A00(r11)
            r0.A1Z = r3
            r3 = 2131433402(0x7f0b17ba, float:1.8488589E38)
            android.view.View r4 = r13.requireViewById(r3)
            X.0qQ.A07(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            X.8hL r3 = new X.8hL
            r15 = r3
            r16 = r12
            r17 = r4
            r18 = r11
            r19 = r57
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            r0.A0t = r3
            r3 = r22
            r0.A0K = r3
            X.8hN r4 = new X.8hN
            r4.<init>(r0)
            X.8hO r3 = new X.8hO
            r3.<init>(r14, r4)
            r0.A0l = r3
            r3 = 2131433350(0x7f0b1786, float:1.8488483E38)
            android.view.View r4 = r13.requireViewById(r3)
            X.0qQ.A07(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.A0T = r4
            r3 = 2131433476(0x7f0b1804, float:1.8488739E38)
            android.view.View r18 = r13.requireViewById(r3)
            X.0qQ.A07(r18)
            r3 = r18
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r18 = r3
            r0.A1S = r3
            r13 = 31
            X.9LC r3 = new X.9LC
            r3.<init>(r0, r13)
            X.0t0 r3 = X.AnonymousClass0eN.A01(r3)
            r0.A1J = r3
            java.lang.Integer r19 = X.AnonymousClass05K.A00
            r3 = r19
            r0.A0I = r3
            X.28D r3 = X.28D.A5J
            r0.A03 = r3
            r3 = r19
            r0.A08 = r3
            X.8hR r3 = new X.8hR
            r3.<init>(r11)
            r0.A0q = r3
            r3 = 0
            r38 = r91
            if (r91 != 0) goto L_0x0181
            r3 = 1
        L_0x0181:
            r0.A1O = r3
            android.content.Context r30 = r12.getApplicationContext()
            X.0qQ.A07(r30)
            int r12 = X.AnonymousClass8XE.A00(r12)
            X.8hS r3 = new X.8hS
            r3.<init>(r11, r5, r12)
            X.8hT r5 = new X.8hT
            r29 = r5
            r31 = r60
            r32 = r59
            r33 = r11
            r34 = r50
            r35 = r57
            r36 = r3
            r37 = r48
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r0.A0r = r5
            X.7yD r25 = new X.7yD
            r25.<init>()
            r3 = r25
            r0.A0a = r3
            X.0eO r12 = X.0eO.A02
            X.8hU r3 = X.C362188hU.A00
            X.0eM r3 = X.AnonymousClass0eN.A00(r12, r3)
            r0.A1L = r3
            com.instagram.common.session.UserSession r14 = r0.A0c
            r3 = 32
            X.9LC r13 = new X.9LC
            r13.<init>(r0, r3)
            r3 = 33
            X.9LC r11 = new X.9LC
            r11.<init>(r0, r3)
            X.8hS r3 = r5.A0N
            r56 = r3
            X.8hV r3 = new X.8hV
            r40 = r94
            r43 = r96
            r42 = r98
            r44 = r99
            r29 = r3
            r30 = r60
            r31 = r14
            r32 = r50
            r33 = r56
            r34 = r49
            r35 = r46
            r36 = r39
            r37 = r10
            r38 = r13
            r39 = r11
            r41 = r26
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0.A0v = r3
            X.9LC r10 = new X.9LC
            r10.<init>(r0, r9)
            X.0t0 r20 = X.AnonymousClass0eN.A01(r10)
            r9 = r20
            r0.A1I = r9
            android.app.Activity r14 = r0.A0N
            android.view.ViewGroup r13 = r0.A0S
            com.instagram.common.session.UserSession r11 = r0.A0c
            r9 = 29
            X.9LC r10 = new X.9LC
            r10.<init>(r0, r9)
            X.8hW r9 = new X.8hW
            r29 = r9
            r30 = r14
            r31 = r13
            r32 = r4
            r33 = r11
            r34 = r50
            r35 = r0
            r36 = r3
            r37 = r49
            r38 = r46
            r39 = r20
            r40 = r10
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0.A0n = r9
            com.instagram.common.session.UserSession r9 = r0.A0c
            X.8hk r3 = new X.8hk
            r3.<init>()
            r3.A01 = r9
            r9 = r60
            r3.A00 = r9
            r0.A1W = r3
            r9 = r19
            r0.A07 = r9
            r10 = 34
            X.9LC r9 = new X.9LC
            r9.<init>(r0, r10)
            X.0eM r9 = X.AnonymousClass0eN.A00(r12, r9)
            r0.A1K = r9
            r5.A04 = r0
            r6.A05 = r0
            android.app.Activity r12 = r6.A09
            com.instagram.common.session.UserSession r13 = r6.A0F
            int r10 = X.AnonymousClass8XE.A00(r12)
            int r9 = X.AnonymousClass8XE.A01(r12)
            android.content.Context r14 = r6.A0A
            X.0qQ.A06(r14)
            X.8XH r11 = new X.8XH
            r11.<init>(r13, r9, r10)
            X.0iw r9 = r6.A0E
            java.lang.String r35 = r9.getModuleName()
            X.8XC r9 = r6.A0J
            X.0Ud r9 = r9.A01
            java.lang.Object r10 = r9.getValue()
            java.util.List r10 = (java.util.List) r10
            X.8hl r9 = new X.8hl
            r29 = r9
            r30 = r14
            r31 = r13
            r32 = r11
            r33 = r6
            r34 = r6
            r36 = r10
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r6.A06 = r9
            android.view.ViewGroup r10 = r6.A0B
            r9 = 2131432034(0x7f0b1262, float:1.8485814E38)
            android.view.View r11 = r10.requireViewById(r9)
            com.instagram.common.ui.base.IgTextView r11 = (com.instagram.common.ui.base.IgTextView) r11
            r6.A01 = r11
            if (r11 != 0) goto L_0x02a9
            java.lang.String r0 = "draftInstructions"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
        L_0x02a8:
            throw r1
        L_0x02a9:
            r9 = 2131961045(0x7f1324d5, float:1.9558776E38)
            r11.setText(r9)
            X.6ST r11 = new X.6ST
            r9 = r22
            r11.<init>(r12, r9)
            r6.A08 = r11
            r9 = 2131432049(0x7f0b1271, float:1.8485844E38)
            android.view.View r11 = r10.requireViewById(r9)
            com.instagram.common.ui.base.IgTextView r11 = (com.instagram.common.ui.base.IgTextView) r11
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            X.2eS.A04(r11, r9)
            r11.setSelected(r2)
            X.8ht r9 = new X.8ht
            r9.<init>(r11, r6)
            X.AnonymousClass0fU.A00(r9, r11)
            r6.A03 = r11
            X.72N r9 = r6.A0D
            X.0r6 r9 = r9.A0D
            X.8hu r11 = new X.8hu
            r11.<init>(r6, r9)
            r12 = 28
            X.9Jz r9 = new X.9Jz
            r9.<init>(r6, r7, r12)
            X.0pz r12 = new X.0pz
            r12.<init>(r9, r11)
            X.4DH r11 = r6.A0C
            X.0xx r9 = X.AnonymousClass07a.A00(r11)
            X.AnonymousClass11O.A03(r9, r12)
            X.07U r53 = X.07U.A05
            X.07Z r52 = r11.getViewLifecycleOwner()
            X.0xx r11 = X.AnonymousClass07a.A00(r52)
            r55 = 23
            X.9KF r9 = new X.9KF
            r50 = r9
            r51 = r6
            r54 = r7
            r50.<init>(r51, r52, r53, r54, r55)
            X.19B r15 = X.19B.A00
            r12 = r19
            X.1Eo.A03(r12, r15, r9, r11)
            r9 = 2131433364(0x7f0b1794, float:1.8488512E38)
            android.view.View r9 = r10.requireViewById(r9)
            X.3oV r10 = X.2b1.A01(r9, r2, r2)
            X.8hw r9 = new X.8hw
            r9.<init>(r6)
            r10.EeU(r9)
            r6.A04 = r10
            r16 = 1
            boolean r6 = com.facebook.systrace.Systrace.A0E(r16)
            if (r6 == 0) goto L_0x0334
            r9 = 1147875527(0x446b30c7, float:940.76215)
            java.lang.String r6 = "igcam_gallery_grid_controller"
            X.0fS.A01(r6, r9)
        L_0x0334:
            X.02m r9 = X.02m.A0p     // Catch:{ all -> 0x072e }
            r6 = 17629202(0x10d0012, float:2.589766E-38)
            r9.markerStart(r6)     // Catch:{ all -> 0x072e }
            r57.A00()     // Catch:{ all -> 0x072e }
            android.app.Activity r6 = r0.A0N     // Catch:{ all -> 0x072e }
            android.content.Context r9 = r6.getApplicationContext()     // Catch:{ all -> 0x072e }
            r0.A0O = r9     // Catch:{ all -> 0x072e }
            X.9LC r10 = new X.9LC     // Catch:{ all -> 0x072e }
            r6 = r23
            r10.<init>(r0, r6)     // Catch:{ all -> 0x072e }
            X.0t0 r6 = X.AnonymousClass0eN.A01(r10)     // Catch:{ all -> 0x072e }
            r0.A1H = r6     // Catch:{ all -> 0x072e }
            X.8hx r6 = new X.8hx     // Catch:{ all -> 0x072e }
            r6.<init>(r0)     // Catch:{ all -> 0x072e }
            r0.A1G = r6     // Catch:{ all -> 0x072e }
            android.app.Activity r6 = r0.A0N     // Catch:{ all -> 0x072e }
            android.content.res.Resources r10 = r6.getResources()     // Catch:{ all -> 0x072e }
            r6 = 2131165200(0x7f070010, float:1.794461E38)
            r10.getDimensionPixelSize(r6)     // Catch:{ all -> 0x072e }
            android.app.Activity r6 = r0.A0N     // Catch:{ all -> 0x072e }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x072e }
            r10 = 2131165247(0x7f07003f, float:1.7944706E38)
            int r6 = r6.getDimensionPixelSize(r10)     // Catch:{ all -> 0x072e }
            float r6 = (float) r6     // Catch:{ all -> 0x072e }
            r11 = 1058013184(0x3f100000, float:0.5625)
            float r6 = r6 * r11
            int r11 = (int) r6     // Catch:{ all -> 0x072e }
            android.app.Activity r6 = r0.A0N     // Catch:{ all -> 0x072e }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x072e }
            int r10 = r6.getDimensionPixelSize(r10)     // Catch:{ all -> 0x072e }
            r6 = r21
            float r6 = X.0nA.A04(r9, r6)     // Catch:{ all -> 0x072e }
            int r6 = (int) r6     // Catch:{ all -> 0x072e }
            r46 = r6
            com.instagram.common.session.UserSession r9 = r0.A0c     // Catch:{ all -> 0x072e }
            X.8hy r6 = new X.8hy     // Catch:{ all -> 0x072e }
            r6.<init>(r9, r11, r10)     // Catch:{ all -> 0x072e }
            r0.A0i = r6     // Catch:{ all -> 0x072e }
            java.lang.String r6 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout"
            X.0qQ.A0C(r4, r6)     // Catch:{ all -> 0x072e }
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4     // Catch:{ all -> 0x072e }
            r4.A02(r0)     // Catch:{ all -> 0x072e }
            java.util.List r4 = X.C362488hz.A0H     // Catch:{ all -> 0x072e }
            android.app.Activity r11 = r0.A0N     // Catch:{ all -> 0x072e }
            com.instagram.common.session.UserSession r10 = r0.A0c     // Catch:{ all -> 0x072e }
            X.8XA r4 = r0.A0w     // Catch:{ all -> 0x072e }
            X.8i0 r9 = new X.8i0     // Catch:{ all -> 0x072e }
            r9.<init>(r4)     // Catch:{ all -> 0x072e }
            r26 = 26
            X.9LC r6 = new X.9LC     // Catch:{ all -> 0x072e }
            r4 = r26
            r6.<init>(r0, r4)     // Catch:{ all -> 0x072e }
            android.content.Context r4 = r0.A0O     // Catch:{ all -> 0x072e }
            boolean r42 = X.0oI.A0E(r4)     // Catch:{ all -> 0x072e }
            X.8hz r4 = new X.8hz     // Catch:{ all -> 0x072e }
            r29 = r4
            r30 = r11
            r31 = r59
            r32 = r25
            r33 = r58
            r34 = r10
            r35 = r0
            r36 = r56
            r37 = r48
            r38 = r0
            r39 = r47
            r40 = r9
            r41 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x072e }
            X.2t9 r6 = r4.A06     // Catch:{ all -> 0x072e }
            r29 = r6
            r9 = r6
            r6 = r22
            r9.setHasStableIds(r6)     // Catch:{ all -> 0x072e }
            r0.A0m = r4     // Catch:{ all -> 0x072e }
            X.07U r43 = X.07U.A04     // Catch:{ all -> 0x072e }
            X.07Z r42 = r60.getViewLifecycleOwner()     // Catch:{ all -> 0x072e }
            X.0xx r9 = X.AnonymousClass07a.A00(r42)     // Catch:{ all -> 0x072e }
            r25 = 0
            X.9KF r6 = new X.9KF     // Catch:{ all -> 0x072e }
            r40 = r6
            r41 = r0
            r44 = r7
            r40.<init>(r41, r42, r43, r44, r45)     // Catch:{ all -> 0x072e }
            X.1Eo.A03(r12, r15, r6, r9)     // Catch:{ all -> 0x072e }
            X.8Yz r6 = r0.A0f     // Catch:{ all -> 0x072e }
            X.80m r6 = r6.A08     // Catch:{ all -> 0x072e }
            java.lang.Object r11 = r6.A00     // Catch:{ all -> 0x072e }
            X.4yO r11 = (X.C279284yO) r11     // Catch:{ all -> 0x072e }
            boolean r10 = r0.A0C     // Catch:{ all -> 0x072e }
            X.0qQ.A0B(r11, r2)     // Catch:{ all -> 0x072e }
            X.8hS r9 = r4.A08     // Catch:{ all -> 0x072e }
            X.4yO r6 = r9.A02     // Catch:{ all -> 0x072e }
            if (r6 != 0) goto L_0x0722
            r9.A02 = r11     // Catch:{ all -> 0x072e }
        L_0x0415:
            r9.A0C = r2     // Catch:{ all -> 0x072e }
        L_0x0417:
            X.0r6 r6 = r8.A0B     // Catch:{ all -> 0x072e }
            X.8iD r9 = new X.8iD     // Catch:{ all -> 0x072e }
            r9.<init>(r0, r6)     // Catch:{ all -> 0x072e }
            X.9Jz r8 = new X.9Jz     // Catch:{ all -> 0x072e }
            r6 = r27
            r8.<init>(r0, r7, r6)     // Catch:{ all -> 0x072e }
            X.0pz r6 = new X.0pz     // Catch:{ all -> 0x072e }
            r6.<init>(r8, r9)     // Catch:{ all -> 0x072e }
            X.4DH r8 = r0.A0Y     // Catch:{ all -> 0x072e }
            X.0xx r8 = X.AnonymousClass07a.A00(r8)     // Catch:{ all -> 0x072e }
            X.AnonymousClass11O.A03(r8, r6)     // Catch:{ all -> 0x072e }
            android.app.Activity r9 = r0.A0N     // Catch:{ all -> 0x072e }
            androidx.recyclerview.widget.GridLayoutManager r14 = new androidx.recyclerview.widget.GridLayoutManager     // Catch:{ all -> 0x072e }
            r8 = r28
            r6 = r22
            r14.<init>((android.content.Context) r9, (int) r8, (int) r6, (boolean) r2)     // Catch:{ all -> 0x072e }
            X.8iF r9 = new X.8iF     // Catch:{ all -> 0x072e }
            r6 = r29
            r9.<init>(r6, r8)     // Catch:{ all -> 0x072e }
            r14.A01 = r9     // Catch:{ all -> 0x072e }
            r0.A0V = r14     // Catch:{ all -> 0x072e }
            X.9LC r8 = new X.9LC     // Catch:{ all -> 0x072e }
            r6 = r27
            r8.<init>(r0, r6)     // Catch:{ all -> 0x072e }
            X.8iG r13 = new X.8iG     // Catch:{ all -> 0x072e }
            r13.<init>(r14, r4, r5, r8)     // Catch:{ all -> 0x072e }
            r0.A0j = r13     // Catch:{ all -> 0x072e }
            int r6 = r14.A00     // Catch:{ all -> 0x072e }
            r0.A0G = r6     // Catch:{ all -> 0x072e }
            X.0eM r6 = r5.A0R     // Catch:{ all -> 0x072e }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x072e }
            X.8XW r6 = (X.AnonymousClass8XW) r6     // Catch:{ all -> 0x072e }
            r6.A0C(r4)     // Catch:{ all -> 0x072e }
            int r6 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION     // Catch:{ all -> 0x072e }
            android.app.Activity r6 = r0.A0N     // Catch:{ all -> 0x072e }
            r8 = r6
            com.instagram.common.session.UserSession r6 = r0.A0c     // Catch:{ all -> 0x072e }
            r11 = r6
            java.lang.String r6 = "stories_gallery"
            X.0xG r10 = new X.0xG     // Catch:{ all -> 0x072e }
            r10.<init>(r6)     // Catch:{ all -> 0x072e }
            r9 = 23592975(0x168000f, float:4.2611712E-38)
            X.2nK r12 = new X.2nK     // Catch:{ all -> 0x072e }
            r12.<init>(r8, r10, r11, r9)     // Catch:{ all -> 0x072e }
            r0.A1B = r12     // Catch:{ all -> 0x072e }
            android.app.Activity r6 = r0.A0N     // Catch:{ all -> 0x072e }
            r11 = r6
            com.instagram.common.session.UserSession r6 = r0.A0c     // Catch:{ all -> 0x072e }
            r10 = r6
            java.lang.String r8 = "reels_gallery"
            X.0xG r9 = new X.0xG     // Catch:{ all -> 0x072e }
            r9.<init>(r8)     // Catch:{ all -> 0x072e }
            r8 = 23603921(0x1682ad1, float:4.264239E-38)
            X.2nK r6 = new X.2nK     // Catch:{ all -> 0x072e }
            r6.<init>(r11, r9, r10, r8)     // Catch:{ all -> 0x072e }
            r0.A1A = r6     // Catch:{ all -> 0x072e }
            r1.setItemAnimator(r7)     // Catch:{ all -> 0x072e }
            r1.setLayoutManager(r14)     // Catch:{ all -> 0x072e }
            r6 = r29
            r1.setAdapter(r6)     // Catch:{ all -> 0x072e }
            r6 = r21
            r1.setOverScrollMode(r6)     // Catch:{ all -> 0x072e }
            X.8gZ r8 = new X.8gZ     // Catch:{ all -> 0x072e }
            r6 = r46
            r8.<init>(r6, r2)     // Catch:{ all -> 0x072e }
            r1.A11(r8)     // Catch:{ all -> 0x072e }
            r1.A15(r12)     // Catch:{ all -> 0x072e }
            r1.A15(r13)     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            r6 = 2131433473(0x7f0b1801, float:1.8488733E38)
            android.view.View r8 = r8.requireViewById(r6)     // Catch:{ all -> 0x072e }
            r0.A0P = r8     // Catch:{ all -> 0x072e }
            r6 = 2131433454(0x7f0b17ee, float:1.8488694E38)
            android.view.View r6 = r8.requireViewById(r6)     // Catch:{ all -> 0x072e }
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r6 = (com.instagram.ui.widget.slideouticon.SlideInAndOutIconView) r6     // Catch:{ all -> 0x072e }
            r0.A1F = r6     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            r6 = 2131433382(0x7f0b17a6, float:1.8488548E38)
            android.view.View r6 = r8.requireViewById(r6)     // Catch:{ all -> 0x072e }
            r0.A1P = r6     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            r6 = 2131433383(0x7f0b17a7, float:1.848855E38)
            android.view.View r8 = r8.requireViewById(r6)     // Catch:{ all -> 0x072e }
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch:{ all -> 0x072e }
            r0.A1T = r8     // Catch:{ all -> 0x072e }
            X.03v.A07(r8)     // Catch:{ all -> 0x072e }
            android.text.method.MovementMethod r6 = android.text.method.LinkMovementMethod.getInstance()     // Catch:{ all -> 0x072e }
            r8.setMovementMethod(r6)     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            r6 = 2131433381(0x7f0b17a5, float:1.8488546E38)
            android.view.View r6 = r8.requireViewById(r6)     // Catch:{ all -> 0x072e }
            com.instagram.common.ui.base.IgTextView r6 = (com.instagram.common.ui.base.IgTextView) r6     // Catch:{ all -> 0x072e }
            r0.A0d = r6     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            r6 = 2131433356(0x7f0b178c, float:1.8488495E38)
            android.view.View r6 = r8.findViewById(r6)     // Catch:{ all -> 0x072e }
            r0.A0H = r6     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            r6 = 2131433389(0x7f0b17ad, float:1.8488562E38)
            android.view.View r8 = r8.findViewById(r6)     // Catch:{ all -> 0x072e }
            r0.A0Q = r8     // Catch:{ all -> 0x072e }
            r6 = 2131433390(0x7f0b17ae, float:1.8488564E38)
            android.view.View r9 = r8.findViewById(r6)     // Catch:{ all -> 0x072e }
            if (r9 == 0) goto L_0x0713
            android.view.View r8 = r8.requireViewById(r6)     // Catch:{ all -> 0x072e }
        L_0x051e:
            r0.A1Q = r8     // Catch:{ all -> 0x072e }
            r6 = 2131433392(0x7f0b17b0, float:1.8488568E38)
            android.view.View r11 = r8.requireViewById(r6)     // Catch:{ all -> 0x072e }
            com.instagram.common.ui.base.IgTextView r11 = (com.instagram.common.ui.base.IgTextView) r11     // Catch:{ all -> 0x072e }
            r0.A0e = r11     // Catch:{ all -> 0x072e }
            android.app.Activity r9 = r0.A0N     // Catch:{ all -> 0x072e }
            X.6ST r8 = new X.6ST     // Catch:{ all -> 0x072e }
            r6 = r22
            r8.<init>(r9, r6)     // Catch:{ all -> 0x072e }
            android.content.Context r9 = r8.getContext()     // Catch:{ all -> 0x072e }
            r6 = 2131965491(0x7f133633, float:1.9567793E38)
            java.lang.String r6 = r9.getString(r6)     // Catch:{ all -> 0x072e }
            r8.A00(r6)     // Catch:{ all -> 0x072e }
            r0.A1D = r8     // Catch:{ all -> 0x072e }
            android.app.Activity r13 = r0.A0N     // Catch:{ all -> 0x072e }
            com.instagram.common.session.UserSession r12 = r0.A0c     // Catch:{ all -> 0x072e }
            java.lang.Object r10 = r20.getValue()     // Catch:{ all -> 0x072e }
            X.8iK r10 = (X.C362688iK) r10     // Catch:{ all -> 0x072e }
            X.8Yz r9 = r0.A0f     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            X.8iL r6 = new X.8iL     // Catch:{ all -> 0x072e }
            r27 = r6
            r28 = r13
            r29 = r8
            r30 = r12
            r31 = r11
            r32 = r9
            r33 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x072e }
            r0.A0p = r6     // Catch:{ all -> 0x072e }
            X.8gT r12 = r5.A0L     // Catch:{ all -> 0x072e }
            X.0Ud r6 = r12.A07     // Catch:{ all -> 0x072e }
            androidx.lifecycle.CoroutineLiveData r9 = X.C226292g8.A00(r15, r6)     // Catch:{ all -> 0x072e }
            X.4DH r10 = r5.A0H     // Catch:{ all -> 0x072e }
            X.9Ks r8 = new X.9Ks     // Catch:{ all -> 0x072e }
            r8.<init>(r5, r2)     // Catch:{ all -> 0x072e }
            X.8iO r6 = new X.8iO     // Catch:{ all -> 0x072e }
            r6.<init>(r8)     // Catch:{ all -> 0x072e }
            r9.A06(r10, r6)     // Catch:{ all -> 0x072e }
            com.instagram.common.session.UserSession r13 = r5.A0J     // Catch:{ all -> 0x072e }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ all -> 0x072e }
            r8 = 36316662907540027(0x8105d00008123b, double:3.030142085967611E-306)
            boolean r8 = X.182.A06(r6, r13, r8)     // Catch:{ all -> 0x072e }
            if (r8 == 0) goto L_0x059c
            X.8Yz r8 = r5.A0K     // Catch:{ all -> 0x072e }
            X.80m r8 = r8.A08     // Catch:{ all -> 0x072e }
            java.lang.Object r8 = r8.A00     // Catch:{ all -> 0x072e }
            X.4yO r8 = (X.C279284yO) r8     // Catch:{ all -> 0x072e }
            java.lang.String r8 = X.AnonymousClass9PQ.A00(r8)     // Catch:{ all -> 0x072e }
            r12.A04(r8)     // Catch:{ all -> 0x072e }
        L_0x059c:
            r8 = r56
            X.2Fk r13 = r8.A0F     // Catch:{ all -> 0x072e }
            X.9Ks r9 = new X.9Ks     // Catch:{ all -> 0x072e }
            r8 = r22
            r9.<init>(r5, r8)     // Catch:{ all -> 0x072e }
            X.8iO r8 = new X.8iO     // Catch:{ all -> 0x072e }
            r8.<init>(r9)     // Catch:{ all -> 0x072e }
            r13.A06(r10, r8)     // Catch:{ all -> 0x072e }
            X.0Ud r8 = r12.A06     // Catch:{ all -> 0x072e }
            androidx.lifecycle.CoroutineLiveData r12 = X.C226292g8.A00(r15, r8)     // Catch:{ all -> 0x072e }
            X.9Ks r9 = new X.9Ks     // Catch:{ all -> 0x072e }
            r8 = r21
            r9.<init>(r5, r8)     // Catch:{ all -> 0x072e }
            X.8iO r5 = new X.8iO     // Catch:{ all -> 0x072e }
            r5.<init>(r9)     // Catch:{ all -> 0x072e }
            r12.A06(r10, r5)     // Catch:{ all -> 0x072e }
            r11.setVisibility(r2)     // Catch:{ all -> 0x072e }
            X.3NG r8 = new X.3NG     // Catch:{ all -> 0x072e }
            r8.<init>(r11)     // Catch:{ all -> 0x072e }
            r8.A06 = r2     // Catch:{ all -> 0x072e }
            X.8iP r5 = new X.8iP     // Catch:{ all -> 0x072e }
            r5.<init>(r0)     // Catch:{ all -> 0x072e }
            r8.A04 = r5     // Catch:{ all -> 0x072e }
            r8.A00()     // Catch:{ all -> 0x072e }
            android.app.Activity r12 = r0.A0N     // Catch:{ all -> 0x072e }
            android.content.res.Resources r8 = r12.getResources()     // Catch:{ all -> 0x072e }
            X.87s r5 = r0.A13     // Catch:{ all -> 0x072e }
            X.4gw r5 = r5.A04     // Catch:{ all -> 0x072e }
            if (r5 == 0) goto L_0x06f9
            r5 = 2131165208(0x7f070018, float:1.7944627E38)
            int r43 = r8.getDimensionPixelSize(r5)     // Catch:{ all -> 0x072e }
            r5 = 2131165217(0x7f070021, float:1.7944645E38)
            int r11 = r8.getDimensionPixelSize(r5)     // Catch:{ all -> 0x072e }
            r5 = 2130970254(0x7f04068e, float:1.7549213E38)
            int r45 = X.2Yu.A0H(r12, r5)     // Catch:{ all -> 0x072e }
            r46 = 2131165230(0x7f07002e, float:1.7944671E38)
            r40 = 1059201570(0x3f222222, float:0.6333333)
        L_0x05ff:
            com.instagram.common.session.UserSession r5 = r0.A0c     // Catch:{ all -> 0x072e }
            r21 = r5
            X.0iw r5 = r0.A0Z     // Catch:{ all -> 0x072e }
            r14 = r5
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            r5 = 2131433451(0x7f0b17eb, float:1.8488688E38)
            android.view.View r8 = r8.requireViewById(r5)     // Catch:{ all -> 0x072e }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x072e }
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r8 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r8     // Catch:{ all -> 0x072e }
            X.7Ge r13 = r0.A0z     // Catch:{ all -> 0x072e }
            r5 = 27
            X.9LC r10 = new X.9LC     // Catch:{ all -> 0x072e }
            r10.<init>(r0, r5)     // Catch:{ all -> 0x072e }
            r5 = 28
            X.9LC r9 = new X.9LC     // Catch:{ all -> 0x072e }
            r9.<init>(r0, r5)     // Catch:{ all -> 0x072e }
            r41 = 2131968361(0x7f134169, float:1.9573614E38)
            X.8QZ r5 = new X.8QZ     // Catch:{ all -> 0x072e }
            r27 = r5
            r28 = r12
            r29 = r7
            r30 = r14
            r31 = r21
            r32 = r8
            r33 = r7
            r34 = r13
            r36 = r7
            r37 = r7
            r38 = r10
            r39 = r9
            r42 = r2
            r44 = r11
            r47 = r2
            r48 = r2
            r49 = r2
            r50 = r2
            r51 = r2
            r52 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ all -> 0x072e }
            r0.A16 = r5     // Catch:{ all -> 0x072e }
            X.4DH r5 = r0.A0Y     // Catch:{ all -> 0x072e }
            X.07Z r10 = r5.getViewLifecycleOwner()     // Catch:{ all -> 0x072e }
            X.85O r11 = r0.A10     // Catch:{ all -> 0x072e }
            X.2Fk r9 = r11.A03     // Catch:{ all -> 0x072e }
            r0.A02 = r9     // Catch:{ all -> 0x072e }
            r5 = 45
            X.9LG r8 = new X.9LG     // Catch:{ all -> 0x072e }
            r8.<init>(r0, r5)     // Catch:{ all -> 0x072e }
            X.8iR r5 = new X.8iR     // Catch:{ all -> 0x072e }
            r5.<init>(r8)     // Catch:{ all -> 0x072e }
            r9.A06(r10, r5)     // Catch:{ all -> 0x072e }
            X.05G r5 = r11.A07     // Catch:{ all -> 0x072e }
            androidx.lifecycle.CoroutineLiveData r5 = X.C226292g8.A00(r15, r5)     // Catch:{ all -> 0x072e }
            X.2gB r9 = X.AnonymousClass72Y.A00(r5)     // Catch:{ all -> 0x072e }
            X.8iS r8 = new X.8iS     // Catch:{ all -> 0x072e }
            r8.<init>(r0)     // Catch:{ all -> 0x072e }
            X.8iR r5 = new X.8iR     // Catch:{ all -> 0x072e }
            r5.<init>(r8)     // Catch:{ all -> 0x072e }
            r9.A06(r10, r5)     // Catch:{ all -> 0x072e }
            X.0r6 r9 = r11.A06     // Catch:{ all -> 0x072e }
            r8 = 27
            X.9Jz r5 = new X.9Jz     // Catch:{ all -> 0x072e }
            r5.<init>(r0, r7, r8)     // Catch:{ all -> 0x072e }
            X.0pz r8 = new X.0pz     // Catch:{ all -> 0x072e }
            r8.<init>(r5, r9)     // Catch:{ all -> 0x072e }
            X.0xx r5 = X.AnonymousClass07a.A00(r10)     // Catch:{ all -> 0x072e }
            X.AnonymousClass11O.A03(r5, r8)     // Catch:{ all -> 0x072e }
            X.4DH r5 = r0.A0Y     // Catch:{ all -> 0x072e }
            X.07Z r11 = r5.getViewLifecycleOwner()     // Catch:{ all -> 0x072e }
            X.87s r5 = r0.A13     // Catch:{ all -> 0x072e }
            X.0Ud r10 = r5.A0T     // Catch:{ all -> 0x072e }
            X.9Jz r9 = new X.9Jz     // Catch:{ all -> 0x072e }
            r5 = r26
            r9.<init>(r0, r7, r5)     // Catch:{ all -> 0x072e }
            X.0pz r8 = new X.0pz     // Catch:{ all -> 0x072e }
            r8.<init>(r9, r10)     // Catch:{ all -> 0x072e }
            X.0xx r5 = X.AnonymousClass07a.A00(r11)     // Catch:{ all -> 0x072e }
            X.AnonymousClass11O.A03(r5, r8)     // Catch:{ all -> 0x072e }
            com.instagram.common.session.UserSession r10 = r0.A0c     // Catch:{ all -> 0x072e }
            X.8gi r9 = new X.8gi     // Catch:{ all -> 0x072e }
            r9.<init>(r1)     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = r0.A0S     // Catch:{ all -> 0x072e }
            r5 = 2131432651(0x7f0b14cb, float:1.8487065E38)
            android.view.View r27 = r8.requireViewById(r5)     // Catch:{ all -> 0x072e }
            X.0qQ.A07(r27)     // Catch:{ all -> 0x072e }
            X.8gk r5 = new X.8gk     // Catch:{ all -> 0x072e }
            r5.<init>(r4, r9, r4)     // Catch:{ all -> 0x072e }
            X.8gm r8 = new X.8gm     // Catch:{ all -> 0x072e }
            r26 = r8
            r28 = r10
            r29 = r4
            r30 = r5
            r31 = r9
            r32 = r4
            r26.<init>(r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x072e }
            r0.A1E = r8     // Catch:{ all -> 0x072e }
            r4 = 750(0x2ee, double:3.705E-321)
            r8.A01 = r4     // Catch:{ all -> 0x072e }
            X.8iV r4 = new X.8iV     // Catch:{ all -> 0x072e }
            r4.<init>(r0)     // Catch:{ all -> 0x072e }
            r0.A0W = r4     // Catch:{ all -> 0x072e }
            r1.A15(r4)     // Catch:{ all -> 0x072e }
            r1 = r93
            r0.A0i(r1)     // Catch:{ all -> 0x072e }
            goto L_0x0743
        L_0x06f9:
            r5 = 2131165232(0x7f070030, float:1.7944675E38)
            int r43 = r8.getDimensionPixelSize(r5)     // Catch:{ all -> 0x072e }
            r5 = 2131165195(0x7f07000b, float:1.79446E38)
            int r5 = r8.getDimensionPixelSize(r5)     // Catch:{ all -> 0x072e }
            int r11 = r5 / 2
            r45 = 2131099798(0x7f060096, float:1.781196E38)
            r46 = 2131165195(0x7f07000b, float:1.79446E38)
            r40 = 1058013184(0x3f100000, float:0.5625)
            goto L_0x05ff
        L_0x0713:
            r6 = 2131443844(0x7f0b4084, float:1.8509768E38)
            android.view.View r6 = r8.requireViewById(r6)     // Catch:{ all -> 0x072e }
            android.view.ViewStub r6 = (android.view.ViewStub) r6     // Catch:{ all -> 0x072e }
            android.view.View r8 = r6.inflate()     // Catch:{ all -> 0x072e }
            goto L_0x051e
        L_0x0722:
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x072e }
            if (r6 != 0) goto L_0x0415
            r9.A02 = r11     // Catch:{ all -> 0x072e }
            r9.A0C = r10     // Catch:{ all -> 0x072e }
            goto L_0x0417
        L_0x072e:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x02a8
            r0 = 1714213397(0x662cd215, float:2.040306E23)
            X.0fS.A00(r0)
            throw r1
        L_0x073c:
            X.7Gd r5 = new X.7Gd
            r5.<init>(r11)
            goto L_0x00f8
        L_0x0743:
            boolean r1 = com.facebook.systrace.Systrace.A0E(r16)
            if (r1 == 0) goto L_0x074f
            r1 = 560360907(0x21666dcb, float:7.807234E-19)
            X.0fS.A00(r1)
        L_0x074f:
            X.82p r1 = r0.A1V
            X.82o r1 = r1.A02
            X.82Y r1 = r1.A01
            X.82j r1 = r1.A0j
            if (r1 == 0) goto L_0x0762
            android.app.Activity r4 = r0.A0N
            X.8iW r25 = new X.8iW
            r1 = r25
            r1.<init>(r4)
        L_0x0762:
            r1 = r25
            r0.A1a = r1
            android.app.Activity r9 = r0.A0N
            com.instagram.common.session.UserSession r8 = r0.A0c
            X.8Yz r5 = r0.A0f
            java.lang.Object r10 = r20.getValue()
            X.8iK r10 = (X.C362688iK) r10
            X.0iw r4 = r0.A0Z
            X.8iX r1 = new X.8iX
            r26 = r1
            r27 = r9
            r28 = r4
            r29 = r8
            r30 = r5
            r31 = r56
            r32 = r10
            r33 = r25
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r0.A0s = r1
            X.8Yz r4 = r0.A0f
            X.8iY r1 = new X.8iY
            r1.<init>(r0)
            r4.A0F(r1)
            android.view.ViewGroup r4 = r0.A0S
            r1 = 2131433460(0x7f0b17f4, float:1.8488706E38)
            android.view.View r1 = r4.requireViewById(r1)
            com.instagram.common.ui.base.IgFrameLayout r1 = (com.instagram.common.ui.base.IgFrameLayout) r1
            r0.A04 = r1
            r0.A01()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r0.A12
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            X.2Fk r8 = r1.A06
            X.4DH r5 = r0.A0Y
            r1 = 44
            X.9LG r4 = new X.9LG
            r4.<init>(r0, r1)
            X.8iR r1 = new X.8iR
            r1.<init>(r4)
            r8.A06(r5, r1)
            com.instagram.common.session.UserSession r1 = r0.A0c
            boolean r1 = X.AnonymousClass8IK.A06(r1)
            if (r1 == 0) goto L_0x07f6
            X.4DH r1 = r0.A0Y
            X.07Z r9 = r1.getViewLifecycleOwner()
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r5 = r0.A0h
            X.0pa r8 = r5.A08
            r4 = 22
            X.9KF r1 = new X.9KF
            r1.<init>(r0, r7, r4)
            X.0pz r4 = new X.0pz
            r4.<init>(r1, r8)
            X.0xx r1 = X.AnonymousClass07a.A00(r9)
            X.AnonymousClass11O.A03(r1, r4)
            X.0pa r8 = r5.A09
            X.9Jz r5 = new X.9Jz
            r1 = r23
            r5.<init>(r0, r7, r1)
            X.0pz r4 = new X.0pz
            r4.<init>(r5, r8)
            X.0xx r1 = X.AnonymousClass07a.A00(r9)
            X.AnonymousClass11O.A03(r1, r4)
        L_0x07f6:
            X.8hA r9 = r0.A0o
            X.72N r1 = r9.A0D
            X.2Fk r8 = r1.A01
            X.4DH r5 = r9.A0C
            r1 = 49
            X.9LG r4 = new X.9LG
            r4.<init>(r9, r1)
            X.8iZ r1 = new X.8iZ
            r1.<init>(r4)
            r8.A06(r5, r1)
            com.instagram.common.session.UserSession r1 = r0.A0c
            java.lang.Boolean r1 = X.AnonymousClass39V.A00(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0837
            X.8hD r1 = r0.A1C
            X.4DH r4 = r1.A04
            X.07Z r55 = r4.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r55)
            r57 = 14
            X.MH5 r4 = new X.MH5
            r52 = r4
            r54 = r1
            r56 = r7
            r52.<init>(r53, r54, r55, r56, r57)
            r1 = r19
            X.1Eo.A03(r1, r15, r4, r5)
        L_0x0837:
            com.instagram.common.session.UserSession r1 = r3.A01
            r4 = 36328830549376626(0x8110e100003e72, double:3.0378369516602375E-306)
            boolean r1 = X.182.A06(r6, r1, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x08bf
            android.view.ViewGroup r7 = r0.A0S
            r1 = 2131433476(0x7f0b1804, float:1.8488739E38)
            android.view.View r7 = r7.requireViewById(r1)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L_0x08a5
            com.instagram.common.session.UserSession r1 = r3.A01
            boolean r1 = X.182.A06(r6, r1, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x08a5
            com.instagram.common.session.UserSession r1 = r3.A01
            boolean r1 = X.182.A06(r6, r1, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x08a5
            X.4DH r3 = r3.A00
            X.0hq r1 = r3.getChildFragmentManager()
            java.lang.String r5 = "DIRECT_IMPORT_FRAGMENT"
            androidx.fragment.app.Fragment r1 = r1.A0R(r5)
            if (r1 != 0) goto L_0x08a5
            X.K4E r4 = new X.K4E
            r4.<init>()
            X.0hq r1 = r3.getChildFragmentManager()
            X.0s1 r3 = new X.0s1
            r3.<init>(r1)
            r4.mContainer = r7
            r1 = r22
            r4.mInDynamicContainer = r1
            int r1 = r7.getId()
            r3.A0C(r4, r5, r1)
            r3.A00()
        L_0x08a5:
            r1 = r18
            r1.setVisibility(r2)
            com.instagram.common.session.UserSession r3 = r0.A0c
            r1 = 36319918494129906(0x8108c6001d1ef2, double:3.032200932036246E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            r0.A1c = r1
            X.8ia r1 = new X.8ia
            r1.<init>(r0)
            r0.A0k = r1
            return
        L_0x08bf:
            X.4DH r4 = r3.A00
            X.0hq r2 = r4.getChildFragmentManager()
            java.lang.String r1 = "DIRECT_IMPORT_FRAGMENT"
            androidx.fragment.app.Fragment r3 = r2.A0R(r1)
            if (r3 == 0) goto L_0x08dc
            X.0hq r2 = r4.getChildFragmentManager()
            X.0s1 r1 = new X.0s1
            r1.<init>(r2)
            r1.A03(r3)
            r1.A00()
        L_0x08dc:
            r2 = r24
            goto L_0x08a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362048hG.<init>(android.app.Activity, android.view.ViewGroup, android.view.ViewGroup, android.widget.ImageView, X.4DH, X.0iw, X.8Qq, com.instagram.common.session.UserSession, X.8Yz, X.8gL, X.8HT, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel, X.82p, X.8hA, X.8XG, X.8XA, X.8h7, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel, X.85O, X.80U, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel, X.88V, X.87s, X.50r, X.8hK, X.8An, X.8L4, com.instagram.model.direct.DirectShareTarget, X.8hD, X.8XW, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
