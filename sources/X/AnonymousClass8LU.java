package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import go.Seq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8LU  reason: invalid class name */
public final class AnonymousClass8LU implements AnonymousClass0iw, AnonymousClass7TJ, AnonymousClass85Y, AnonymousClass8KC, AnonymousClass8LV, AnonymousClass8KA, C354048Kl, C3493580b, AnonymousClass8LW {
    public static final String __redex_internal_original_name = "VideoViewController";
    public float A00;
    public 2Fk A01;
    public AnonymousClass2gO A02;
    public C367508qr A03;
    public AnonymousClass80G A04;
    public C279284yO A05;
    public AnonymousClass8QA A06;
    public C66540MVu A07;
    public C366668pT A08;
    public AnonymousClass8YU A09;
    public C354038Kk A0A;
    public C378369Pn A0B;
    public FilterGroupModel A0C;
    public AnonymousClass3Q2 A0D;
    public Runnable A0E;
    public Runnable A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public Toast A0P;
    public AnonymousClass2gO A0Q;
    public AnonymousClass80G A0R;
    public AnonymousClass80G A0S;
    public C39641A3f A0T;
    public C378379Po A0U;
    public boolean A0V;
    public final Activity A0W;
    public final ViewGroup A0X;
    public final 28D A0Y;
    public final C3503284f A0Z;
    public final C3511787w A0a;
    public final 1a8 A0b;
    public final UserSession A0c;
    public final C357638Yz A0d;
    public final C3510387i A0e;
    public final AnonymousClass8BA A0f;
    public final AnonymousClass8L1 A0g;
    public final AnonymousClass888 A0h;
    public final TargetViewSizeProvider A0i;
    public final C3506485o A0j;
    public final C3499582p A0k;
    public final AnonymousClass80D A0l;
    public final AnonymousClass8LR A0m;
    public final C354428Lz A0n;
    public final C354188Kz A0o;
    public final C352268Cr A0p;
    public final C353788Jb A0q;
    public final C351958Bc A0r;
    public final AnonymousClass80U A0s;
    public final AnonymousClass835 A0t;
    public final ClipsCreationViewModel A0u;
    public final AnonymousClass8M1 A0v;
    public final C2801950r A0w;
    public final AnonymousClass8M8 A0x;
    public final AnonymousClass861 A0y;
    public final AnonymousClass88F A0z;
    public final AnonymousClass8L4 A10;
    public final List A11;
    public final AnonymousClass0eK A12;
    public final AnonymousClass0eK A13;
    public final AnonymousClass0eM A14;
    public final AnonymousClass0eM A15;
    public final Fragment A16;
    public final AnonymousClass8MA A17;
    public final AnonymousClass4DR A18;
    public final C353828Ji A19;
    public final C3510587k A1A = new AnonymousClass8LX(this);
    public final AnonymousClass8LQ A1B;
    public final C3503684j A1C;
    public final CachingVideoSaver A1D;
    public final AnonymousClass89Z A1E;
    public final C354388Lv A1F;
    public final ClipsCreationDraftViewModel A1G;
    public final C3510287h A1H;
    public final C3495780x A1I;
    public final C353858Jp A1J;
    public final AnonymousClass8KX A1K;

    public final void A0P(LD4 ld4, C381779cJ r17, Integer num, String str, String str2, boolean z) {
        A0O(ld4, r17, (L8M) null, (AnonymousClass8VT) null, (Boolean) null, num, str, (String) null, (String) null, str2, (List) null, (List) null, 1, z);
    }

    public final /* synthetic */ void DDu() {
    }

    public final /* synthetic */ void DDv(int i) {
    }

    public final void onResume() {
        AnonymousClass3Q2 r0;
        C378369Pn r1;
        C378459Pw r12;
        this.A0K = true;
        AnonymousClass80G r13 = this.A04;
        if (r13.A0D != null) {
            r13.A06().A01();
        }
        this.A0M = this.A0V;
        C378369Pn r02 = this.A0B;
        if (r02 != null) {
            r02.A03();
        }
        for (C3506985v DNQ : this.A11) {
            DNQ.DNQ();
        }
        if (this.A09 == AnonymousClass8YU.PAUSED && (r1 = this.A0B) != null && (this.A05 instanceof AnonymousClass80O) && (r12 = r1.A08) != null) {
            boolean z = r12 instanceof C388789oO;
            C388789oO r14 = r12;
            if (z) {
                C388789oO r15 = (C388789oO) r12;
                STU stu = r15.A05;
                r14 = r15;
                if (stu == null) {
                    r15.A09 = true;
                    r14 = r15;
                }
            }
            r14.A0O();
        }
        AnonymousClass8L4 r3 = this.A10;
        if (r3 != null && (r0 = this.A0D) != null && r0.A1N.A0F != null) {
            05G r2 = this.A0r.A02;
            if (r2.getValue() != C351968Bd.SMART_TRACKING_FILL && r2.getValue() != C351968Bd.SMART_TRACKING_FIT && r2.getValue() != C351968Bd.SMART_TRACKING_FREE_TRANSFORM) {
                r2.Epw(C351968Bd.SMART_TRACKING_PROCESSING);
                ClipInfo clipInfo = this.A0D.A1N;
                r3.A00(clipInfo.A0F, clipInfo.A0A);
            }
        }
    }

    public static 1GK A00(AnonymousClass8LU r4) {
        AnonymousClass3Q2 r0;
        Bitmap A022 = ((C353838Jj) r4.A19.A00.A00()).A02(true);
        if (A022 == null || (r0 = r4.A0D) == null) {
            return null;
        }
        return AEI.A01(r4.A0W, AEI.A00(A022, r0.A02), r4.A0c, true);
    }

    public static AnonymousClass80G A01(AnonymousClass8LU r4) {
        if (r4.A05 instanceof AnonymousClass80O) {
            if (182.A06(0Tu.A05, r4.A0c, 36316190465069131L)) {
                AnonymousClass80G r1 = r4.A0R;
                if (r1 != null) {
                    return r1;
                }
                ViewGroup viewGroup = r4.A0X;
                SurfaceView surfaceView = (SurfaceView) viewGroup.findViewById(R.id.camera_video_preview_surface_view);
                if (surfaceView == null) {
                    surfaceView = (SurfaceView) ((ViewStub) viewGroup.requireViewById(R.id.camera_video_preview_surface_view_stub)).inflate().requireViewById(R.id.camera_video_preview_surface_view);
                }
                AnonymousClass80G r12 = new AnonymousClass80G(surfaceView);
                r4.A0R = r12;
                return r12;
            }
        }
        AnonymousClass80G r13 = r4.A0S;
        if (r13 != null) {
            return r13;
        }
        ViewGroup viewGroup2 = r4.A0X;
        MultiListenerTextureView multiListenerTextureView = (MultiListenerTextureView) viewGroup2.findViewById(R.id.camera_video_preview_texture_view);
        if (multiListenerTextureView == null) {
            multiListenerTextureView = (MultiListenerTextureView) ((ViewStub) viewGroup2.requireViewById(R.id.camera_video_preview_texture_view_stub)).inflate().requireViewById(R.id.camera_video_preview_texture_view);
        }
        AnonymousClass80G r14 = new AnonymousClass80G(multiListenerTextureView);
        r4.A0S = r14;
        return r14;
    }

    public static LBC A02(1GK r16, AnonymousClass8LU r17, AD8 ad8, AnonymousClass3Q2 r19, Map map, boolean z, boolean z2) {
        String str;
        boolean z3;
        C266864aT r0;
        AnonymousClass51W r12;
        AnonymousClass8LU r1 = r17;
        UserSession userSession = r1.A0c;
        Activity activity = r1.A0W;
        AnonymousClass3Q2 r14 = r19;
        SSv.A01(activity, userSession, r14, C343127pi.A00(activity));
        r14.A2V = C363828kP.A00(r1.A0k.A02.A03());
        C357638Yz r6 = r1.A0d;
        boolean A002 = C379509Ue.A00(r6);
        boolean z4 = false;
        if (r14.A10 != null) {
            z4 = true;
        }
        C354188Kz r4 = r1.A0o;
        TransformMatrixConfig A062 = r4.A06(ad8, A002, C305756Jk.A00(activity), z4);
        try {
            r14.A60 = A002;
            if (r6 == null) {
                z3 = false;
            } else {
                z3 = r6.A08.A00 instanceof AnonymousClass80O;
            }
            r14.A61 = z3;
            if (r1.A0C == null) {
                r0 = null;
            } else {
                r1.A03.getClass();
                FilterChain A003 = ((FilterGroupModelImpl) r1.A0C).A02.deepCopy();
                if (A062 != null) {
                    AEQ.A02(A003, "VideoViewController#serializeFilterModel", A062.C5o());
                    C366708pX.A01(A003, A062.A08, A062.C5o());
                    r0 = new C266864aT(A003);
                } else {
                    throw new IllegalArgumentException("transformMatrixConfig should not be null for a non-square crop");
                }
            }
            r14.A1K = r0;
            0qQ.A0B(activity, 1);
            0qQ.A0B(userSession, 2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map2 = map;
            if (map != null) {
                linkedHashMap.putAll(map2);
            }
            AnonymousClass3QS A0H2 = r1.A0H();
            0qQ.A0B(A0H2, 0);
            if (r1.A05 instanceof AnonymousClass80O) {
                r12 = r1.A0t.A03.A02();
            } else {
                r12 = null;
            }
            boolean z5 = false;
            if (r1.A05 == AnonymousClass9QA.A00) {
                z5 = true;
            }
            return new LBC(activity, userSession, r16, A062, r12, A0H2, r14, linkedHashMap, z2, z5, z);
        } catch (IllegalArgumentException e) {
            try {
                str = AnonymousClass3Q1.A00(r14);
            } catch (IOException e2) {
                str = 002.A0R("unable to retrieve pendingMediaJson: ", e2.getMessage());
            }
            StringBuilder sb = new StringBuilder();
            String obj = r4.A0F.A01.toString();
            0qQ.A07(obj);
            sb.append(obj);
            sb.append("\n");
            sb.append(str);
            sb.append("\n");
            sb.append("can transform media: ");
            C366398or r02 = r4.A04;
            boolean z6 = true;
            if (r02 == null || !r02.A00) {
                z6 = false;
            }
            sb.append(z6);
            0kD.A01("VideoViewController_nullTransformMatrixConfig", sb.toString());
            throw e;
        }
    }

    public static AnonymousClass3Q2 A03(AnonymousClass8LU r17, C349307zv r18) {
        String str;
        int width;
        int height;
        C59796JYp jYp;
        AnonymousClass3QG r0;
        String str2;
        AnonymousClass8LU r1 = r17;
        boolean z = r1.A0l.A3m;
        UserSession userSession = r1.A0c;
        C352218Cl r02 = r1.A0f.A0O;
        if (r02 != null) {
            str = r02.A06();
        } else {
            str = null;
        }
        C349307zv r9 = r18;
        if (z) {
            width = r9.A0K;
            height = r9.A08;
        } else {
            AnonymousClass81W r03 = ((NineSixteenLayoutConfigImpl) r1.A0i).A0K;
            width = r03.getWidth();
            height = r03.getHeight();
        }
        if (Q0Y.A03(r9.A0k)) {
            jYp = new C59796JYp(r9.A0k, 0, -3, true);
        } else {
            jYp = null;
        }
        ClipInfo A002 = AnonymousClass9T4.A00(userSession, r9, jYp, width, height);
        28D r4 = r1.A0Y;
        r1.A0k.A02.A01.A0X.getClass();
        AnonymousClass3Q2 A012 = C59797JYq.A01(r4, r1.A0q.A00(), userSession, (TransformMatrixConfig) null, A002, r9, str, (String) null, z);
        String str3 = (String) r1.A1G.A0O.getValue();
        if (r1.A05 == AnonymousClass9QA.A00) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36320751716148030L) && (str2 = 27p.A01(userSession).A04.A0L) != null) {
                A012.A2g = str2;
            }
        }
        if (str3 != null && A012.A2g == null) {
            A012.A2g = str3;
        }
        AnonymousClass3Q2 r04 = r1.A0D;
        if (!(r04 == null || (r0 = r04.A1i) == null)) {
            A012.A1i = r0;
        }
        return A012;
    }

    private void A04() {
        AnonymousClass3Q2 r0;
        AtomicBoolean atomicBoolean;
        AnonymousClass8L4 r4 = this.A10;
        if (r4 != null && (r0 = this.A0D) != null && r0.A1N.A0F != null) {
            C351958Bc r5 = this.A0r;
            05G r2 = r5.A02;
            if (r2.getValue() != C351968Bd.SMART_TRACKING_FILL && r2.getValue() != C351968Bd.SMART_TRACKING_FIT && r2.getValue() != C351968Bd.SMART_TRACKING_FREE_TRANSFORM) {
                r2.Epw(C351968Bd.SMART_TRACKING_PROCESSING_INVALID);
                r5.A03.Epw(0);
                String str = this.A0D.A1N.A0F;
                0qQ.A0B(str, 0);
                HashMap hashMap = r4.A02.A04;
                if (hashMap.containsKey(str) && (atomicBoolean = (AtomicBoolean) hashMap.get(str)) != null) {
                    atomicBoolean.set(true);
                }
            }
        }
    }

    private void A05() {
        if (this.A0U != null) {
            C349307zv A042 = this.A0k.A02.A01.A04();
            A042.getClass();
            C353788Jb r2 = this.A0q;
            int i = A042.A0F;
            C366068o8 r0 = r2.A04;
            if (r0 != null) {
                r0.A00 = i;
                r0.A02 = this;
            }
            AnonymousClass9YG r02 = r2.A03;
            if (r02 != null) {
                r02.A00 = i;
                r02.A02 = this;
            }
        }
    }

    public static void A06(CameraAREffect cameraAREffect, AnonymousClass8LU r5) {
        C368528sn AXb;
        String str;
        if (cameraAREffect != null && cameraAREffect.A0H()) {
            C66540MVu mVu = r5.A07;
            if (mVu == null) {
                C279284yO r4 = r5.A05;
                Fragment fragment = r5.A16;
                mVu = C63154KsN.A00(fragment.requireActivity(), fragment.getViewLifecycleOwner(), r5.A0c, r4, r5.A0k);
                r5.A07 = mVu;
                if (mVu == null) {
                    return;
                }
            }
            if (r5.A0Q == null) {
                r5.A0Q = new C40044APa(r5);
            }
            2Fk C85 = mVu.C85();
            r5.A01 = C85;
            C85.A06(r5.A16.getViewLifecycleOwner(), r5.A0Q);
            C349307zv A042 = r5.A0k.A02.A01.A04();
            if (A042 != null && ((str = r5.A0H) == null || !str.equals(A042.A07()))) {
                r5.A0H = A042.A07();
                A0B(r5, 2131964544);
                r5.A07.AUS(r5.A0W);
            }
            if (r5.A0T == null) {
                r5.A0T = new C39641A3f(r5);
            }
            C368528sn AXb2 = ((C3503584i) r5.A0Z.A00.A00()).AXb();
            if (AXb2 != null) {
                C39641A3f a3f = r5.A0T;
                Set set = AXb2.A05;
                if (set == null) {
                    set = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
                    AXb2.A05 = set;
                }
                set.add(a3f);
            }
        } else if (r5.A0T != null && (AXb = ((C3503584i) r5.A0Z.A00.A00()).AXb()) != null) {
            C39641A3f a3f2 = r5.A0T;
            Set set2 = AXb.A05;
            if (set2 != null) {
                set2.remove(a3f2);
            }
        }
    }

    public static void A07(AnonymousClass8LU r2) {
        Runnable r0;
        if (r2.A0B != null) {
            Iterator it = r2.A11.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C3506985v) it.next()).AFv(r2)) {
                        r2.A0B.A09(false);
                        r0 = new C40781AjD(r2);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C378369Pn r02 = r2.A0B;
        if (r02 != null) {
            r02.CnC();
        }
        r0 = new AnonymousClass9RN(r2);
        11Z.A02(r0);
    }

    public static void A08(AnonymousClass8LU r2) {
        if (r2.A04.A05().getParent() != null) {
            r2.A04.A05().setVisibility(8);
            ViewGroup viewGroup = r2.A0X;
            viewGroup.removeView(r2.A04.A05());
            viewGroup.setTranslationY(0.0f);
            r2.A04.A0E.A00.clear();
        }
    }

    public static void A09(AnonymousClass8LU r8) {
        SurfaceView surfaceView;
        SurfaceHolder holder;
        MultiListenerTextureView multiListenerTextureView;
        AnonymousClass8L4 r0;
        if (r8.A0N) {
            r8.A0x.A01();
        }
        AnonymousClass8QA r1 = r8.A06;
        if (r1 != null) {
            r1.A0E(false);
        }
        AnonymousClass80G r12 = r8.A04;
        if (r12.A0D != null) {
            r12.A06().A00.A00();
        }
        r8.A0X.removeCallbacks(r8.A0F);
        r8.A0F = null;
        C354188Kz r02 = r8.A0o;
        r02.A05 = null;
        r02.A0F.A00("onStopVideoRendering nullified");
        C3506485o r2 = r8.A0j;
        C3510587k r13 = r8.A1A;
        0qQ.A0B(r13, 0);
        r2.A0C.remove(r13);
        for (C3506985v DnX : r8.A11) {
            DnX.DnX();
        }
        C378369Pn r22 = r8.A0B;
        if (!(r22 == null || (r0 = r8.A10) == null)) {
            AnonymousClass8L9 r14 = r0.A01;
            r22.A0N.remove(r14);
            C378459Pw r03 = r22.A08;
            if (r03 != null) {
                r03.A0A.remove(r14);
            }
        }
        r8.A04();
        if (r8.A0B != null) {
            if (r8.A0U != null) {
                AnonymousClass80G r23 = r8.A04;
                TextureView.SurfaceTextureListener surfaceTextureListener = r23.A08;
                if (!(surfaceTextureListener == null || (multiListenerTextureView = r23.A0D) == null)) {
                    multiListenerTextureView.A00.A00.remove(surfaceTextureListener);
                }
                SurfaceHolder.Callback callback = r23.A07;
                if (!(callback == null || (surfaceView = r23.A0C) == null || (holder = surfaceView.getHolder()) == null)) {
                    holder.removeCallback(callback);
                }
            }
            r8.A0U = null;
            r8.A0B.A00();
            C378369Pn r24 = r8.A0B;
            r24.A06((C41838B2t) null);
            r24.A05((A67) null, (Runnable) null, (Runnable) null, (Runnable) null, (Runnable) null);
            r24.A0B = null;
            C378459Pw r04 = r24.A08;
            if (r04 != null) {
                r04.A06 = null;
            }
            r24.A05 = null;
            if (r04 != null) {
                r04.A02 = null;
            }
            r24.A0N.clear();
            C378459Pw r05 = r24.A08;
            if (r05 != null) {
                r05.A0A.clear();
            }
            r8.A0B = null;
        }
        A08(r8);
        r8.A0P = null;
    }

    public static void A0B(AnonymousClass8LU r3, int i) {
        Toast toast = r3.A0P;
        if (toast != null) {
            toast.cancel();
        }
        r3.A0P = C59689JTv.A01(r3.A0W, (String) null, i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        if (r5.A0R == -1) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.AnonymousClass8LU r12, boolean r13) {
        /*
            X.82p r0 = r12.A0k
            X.82o r0 = r0.A02
            X.82Y r2 = r0.A01
            X.8Yz r0 = r2.A0X
            r0.getClass()
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x00ba
            X.3Q2 r0 = r12.A0D
            if (r0 == 0) goto L_0x00ba
            X.7zv r0 = r2.A04()
            if (r0 == 0) goto L_0x00ba
            X.3Q2 r0 = r12.A0D
            r0.getClass()
            X.8LQ r1 = r12.A1B
            X.3Q2 r0 = r12.A0D
            com.instagram.pendingmedia.model.ClipInfo r7 = r0.A1N
            r7.getClass()
            X.7zv r0 = r2.A04()
            r0.getClass()
            java.util.List r8 = r0.A0v
            X.80R r0 = r1.A00
            X.6if r6 = r0.A1y
            if (r6 == 0) goto L_0x009e
            java.lang.Object r5 = r6.get()
            X.8cb r5 = (X.C359318cb) r5
            r4 = 0
            if (r13 == 0) goto L_0x0065
            com.instagram.common.session.UserSession r0 = r5.A0b
            X.8A2 r3 = X.AnonymousClass8A1.A01(r0)
            X.50r r2 = r5.A0w
            X.8Yz r0 = r5.A0d
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r1 = r0.A02
            X.28D r0 = r5.A0Y
            r3.A05(r0, r2, r1, r8)
            X.8ZP r0 = r5.A0q
            X.1QP r3 = r0.A02
            long r0 = r0.A01
            java.lang.String r2 = "NAVIGATED_TO_REELS_POST_CAPTURE"
            r3.flowMarkPoint(r0, r2)
        L_0x0065:
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x007d
            com.instagram.common.session.UserSession r0 = r5.A0b
            X.8A2 r0 = X.AnonymousClass8A1.A01(r0)
            X.1QP r3 = r0.A0J
            long r1 = r0.A02
            X.AE4 r0 = new X.AE4
            r0.<init>(r3)
            r0.A01 = r1
            r0.A02()
        L_0x007d:
            r9 = -1
            r7.A03 = r9
            r5.A0G = r7
            boolean r0 = r5.A0P
            if (r0 == 0) goto L_0x00bb
            X.C359318cb.A0B(r5)
        L_0x0089:
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r0 = r5.A0g
            X.6nz r0 = r0.A01
            if (r0 == 0) goto L_0x009e
            X.0eM r0 = r5.A1B
            java.lang.Object r1 = r0.getValue()
            X.Hrl r1 = (X.C56038Hrl) r1
            if (r1 == 0) goto L_0x009e
            X.9rn r0 = X.C390759rn.AssetHubCutoutTextSticker
            r1.A01(r0)
        L_0x009e:
            X.9Pn r0 = r12.A0B
            if (r0 == 0) goto L_0x00ba
            if (r6 == 0) goto L_0x00ba
            java.lang.Object r0 = r6.get()
            if (r0 == 0) goto L_0x00ba
            X.9Pn r0 = r12.A0B
            java.lang.Object r1 = r6.get()
            X.8cb r1 = (X.C359318cb) r1
            r0.A06 = r1
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x00ba
            r0.A03 = r1
        L_0x00ba:
            return
        L_0x00bb:
            r2 = 1
            r5.A0P = r2
            boolean r10 = r5.A1D
            if (r10 != 0) goto L_0x00c7
            int r1 = r5.A0R
            r0 = 1
            if (r1 != r9) goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            r7 = 0
            if (r0 == 0) goto L_0x026f
            android.content.Context r0 = r5.A0S
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r1 = 2131626983(0x7f0e0be7, float:1.8881218E38)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r5.A0F
            android.view.View r1 = r3.inflate(r1, r0, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.0oe.A02(r1, r0, r4)
        L_0x00df:
            r5.A02 = r1
            boolean r0 = r5.A0P()
            if (r0 != 0) goto L_0x00ef
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A0s
            boolean r0 = r0.A0u()
            if (r0 == 0) goto L_0x014c
        L_0x00ef:
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r3 = r5.A0e
            r0 = 2131430134(0x7f0b0af6, float:1.848196E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.content.Context r0 = r3.getContext()
            X.0qQ.A07(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = X.AnonymousClass8PT.A00(r0, r1)
            r3.A01 = r0
            r3.addView(r0)
            r3.A0F(r7)
            r5.A0F = r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A0s
            boolean r0 = r0.A0u()
            r3 = 2131955443(0x7f130ef3, float:1.9547414E38)
            if (r0 == 0) goto L_0x011b
            r3 = 2131955455(0x7f130eff, float:1.9547438E38)
        L_0x011b:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r5.A0F
            if (r1 == 0) goto L_0x012c
            android.content.Context r0 = r5.A0S
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r3)
            r1.setLabel(r0)
        L_0x012c:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = r5.A0F
            if (r3 == 0) goto L_0x0140
            android.content.Context r0 = r5.A0S
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131955442(0x7f130ef2, float:1.9547412E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setContentDescription(r0)
        L_0x0140:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r5.A0F
            if (r1 == 0) goto L_0x014c
            X.AMJ r0 = new X.AMJ
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x014c:
            android.content.Context r4 = r5.A0S
            r11 = 2
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = X.AnonymousClass8PT.A00(r4, r7)
            r5.A0E = r3
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131955433(0x7f130ee9, float:1.9547393E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setLabel(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r5.A0E
            if (r1 == 0) goto L_0x016f
            X.AMK r0 = new X.AMK
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x016f:
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r3 = r5.A0e
            r8 = 8
            X.9I9 r1 = new X.9I9
            r1.<init>(r11, r8, r2)
            com.instagram.igds.components.mediabutton.IgdsMediaButton[] r0 = new com.instagram.igds.components.mediabutton.IgdsMediaButton[]{r7}
            r3.A0E(r1, r0)
            if (r10 != 0) goto L_0x0196
            boolean r0 = r5.A0P()
            if (r0 == 0) goto L_0x0196
            int r0 = r5.A0R
            if (r0 == r9) goto L_0x023c
            if (r0 == 0) goto L_0x022c
            if (r0 != r2) goto L_0x0196
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x0196
            X.C359318cb.A03(r0, r5)
        L_0x0196:
            r10 = 0
            boolean r0 = r5.A0P()
            if (r0 == 0) goto L_0x01b5
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r5.A0F
            if (r2 == 0) goto L_0x01b5
            X.0eM r0 = r5.A1A
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x01b2
            r0 = 8
        L_0x01b2:
            r2.setVisibility(r0)
        L_0x01b5:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r5.A0E
            if (r2 == 0) goto L_0x01c5
            X.50r r1 = r5.A0w
            X.50r r0 = X.C2801950r.CLIPS
            if (r1 != r0) goto L_0x01c2
            r5.A0P()
        L_0x01c2:
            r2.setVisibility(r8)
        L_0x01c5:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r5.A10
            if (r2 == 0) goto L_0x0203
            r2.A05()
            X.9kY r0 = new X.9kY
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r2)
            com.instagram.common.session.UserSession r9 = r5.A0b
            X.0Tu r8 = X.0Tu.A05
            r0 = 36329041003036419(0x81111200043f03, double:3.0379700434021195E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 != 0) goto L_0x0223
            boolean r0 = X.C355698Qz.A00(r9)
            if (r0 != 0) goto L_0x0223
            X.5pj r0 = X.C296235pj.CREATION_FLOW_BLUE_DARK_BACKGROUND_OVERRIDE
            r2.setButtonStyle(r0)
            X.Khx r0 = X.C62567Khx.CREATION_ARROW
        L_0x01f0:
            r2.setEndAddOn(r0)
            android.widget.TextView r0 = r2.A00
            int r0 = r0.getCompoundDrawablePadding()
            int r0 = r0 / 2
            r2.setCompoundDrawablePadding(r0)
            if (r10 == 0) goto L_0x0214
            r2.setLabel(r7)
        L_0x0203:
            X.C359318cb.A0B(r5)
            r3.A0F(r7)
            X.50r r1 = r5.A0w
            X.50r r0 = X.C2801950r.CLIPS
            if (r1 != r0) goto L_0x0089
            r5.A0P()
            goto L_0x0089
        L_0x0214:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131955521(0x7f130f41, float:1.9547572E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setLabel(r0)
            goto L_0x0203
        L_0x0223:
            r10 = 1
            X.5pj r0 = X.C296235pj.PRIMARY
            r2.setButtonStyle(r0)
            X.Khx r0 = X.C62567Khx.CREATION_ARROW_FILLED
            goto L_0x01f0
        L_0x022c:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r9 = r5.A0F
            if (r9 == 0) goto L_0x0196
            X.AkH r2 = new X.AkH
            r2.<init>(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r9.postDelayed(r2, r0)
            goto L_0x0196
        L_0x023c:
            X.50r r1 = r5.A0w
            X.50r r0 = X.C2801950r.FEED_POST
            if (r1 != r0) goto L_0x0196
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r5.A0F
            if (r0 == 0) goto L_0x0196
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0196
            android.view.View r9 = r5.A0V     // Catch:{ RuntimeException -> 0x0265 }
            r0 = 2131430134(0x7f0b0af6, float:1.848196E38)
            android.view.View r2 = r9.requireViewById(r0)     // Catch:{ RuntimeException -> 0x0265 }
            X.0qQ.A07(r2)     // Catch:{ RuntimeException -> 0x0265 }
            X.846 r0 = r5.A0x     // Catch:{ RuntimeException -> 0x0265 }
            X.7zw r1 = r0.A00()     // Catch:{ RuntimeException -> 0x0265 }
            X.8pz r0 = X.C366978pz.A0q     // Catch:{ RuntimeException -> 0x0265 }
            r1.A01(r9, r2, r0)     // Catch:{ RuntimeException -> 0x0265 }
            goto L_0x0196
        L_0x0265:
            r2 = move-exception
            java.lang.String r1 = "ClipsPostCaptureController"
            java.lang.String r0 = "failed to show reels post parity tooltip"
            X.0KC.A0F(r1, r0, r2)
            goto L_0x0196
        L_0x026f:
            r1 = r7
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8LU.A0C(X.8LU, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: X.9uE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: X.9uE} */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.8or, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02be, code lost:
        if (r10.equals(X.AnonymousClass9QA.A00) == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c0, code lost:
        r36 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02cb, code lost:
        if (X.182.A06(r8, r4, 36320751716344639L) != false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02cd, code lost:
        r36 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02cf, code lost:
        r29 = X.C305756Jk.A01(r4);
        r12 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d5, code lost:
        if (r30 == false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d7, code lost:
        if (r5 != false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d9, code lost:
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02db, code lost:
        if (r36 == false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02dd, code lost:
        r32 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02df, code lost:
        r11 = r0.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e3, code lost:
        if (r1.A1I != false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e7, code lost:
        if (r1.A13 != false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02eb, code lost:
        if (r1.A15 != false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ed, code lost:
        r5 = r1.A18;
        r8 = r0.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02f1, code lost:
        if (r5 == false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f3, code lost:
        r5 = "video_import";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f9, code lost:
        if (X.AnonymousClass888.A00(r8, r5) == false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02fb, code lost:
        r8 = new X.C368028rx(r13.getApplicationContext(), new X.AnonymousClass9TW(r17), X.0tS.A00().A0a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0313, code lost:
        r21 = new X.C378379Po(r13, r8, r4, r12, r11, r27, r28, r29, r30, r31, r32, true, false, false, r36);
        r0.A0U = r21;
        r8 = r0.A0B;
        X.0qQ.A0B(r8, 0);
        r21.A06 = r8;
        r8 = r0.A0U;
        r5 = r0.A0Z;
        X.0qQ.A0B(r5, 0);
        r8.A02 = r5;
        r11 = r1.A0K;
        r10 = r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0340, code lost:
        if (r11 <= 0) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0342, code lost:
        if (r10 > 0) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0344, code lost:
        X.0kD.A01(X.002.A02(r11, r10, "VideoViewController: invalid video dimension:", "x"), X.002.A0R("path=", r1.A0k));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0357, code lost:
        r8 = r0.A0U;
        r8.A01 = r11;
        r8.A00 = r10;
        r0.A04.A08(r8);
        r0.A04.A05().setVisibility(0);
        r13 = new java.util.ArrayList(X.C353948Ka.A00(r4).A02(r0.A05 instanceof X.AnonymousClass80O));
        r5 = r0.A0B;
        r5.getClass();
        r12 = new X.AnonymousClass9TJ(r5);
        r11 = r0.A1F;
        r10 = ((X.AnonymousClass80T) r0.A0s).A02;
        X.0qQ.A0B(r10, 2);
        r5 = new X.AnonymousClass8YQ(r11, r12, new X.C354008Kh(X.28t.A05, r4, r10, r13), r13);
        r0.A0A = r5;
        r5.A04.add(r0);
        r14 = r0.A0U;
        r15 = r0.A0C;
        r15.getClass();
        r13 = new X.C354068Kn();
        r5 = r0.A0A;
        r5.getClass();
        r12 = new X.C354088Kp(r5);
        r11 = new X.C354118Ks(r4, r2);
        r10 = ((com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r15).A02;
        r5 = new X.C366578pK(r10, new X.C366568pJ(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03cf, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03d2, code lost:
        r5 = "video_recording";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d6, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d9, code lost:
        r8 = r0.A0h;
        r5 = "boomerang_capture";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r12.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0488, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0489, code lost:
        r11.A00 = r15;
        r5 = r13.A00;
        r5.add(r12);
        r5.add(r11);
        r14.A04 = r13;
        r5 = r0.A1J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0497, code lost:
        if (r5 == null) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0499, code lost:
        ((X.C354128Kt) r5.A00.getValue()).A02 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04a5, code lost:
        r12 = r1.A0K;
        r11 = r1.A08;
        r0.A03 = new X.C367508qr(r12, r11);
        r2.A02 = r17;
        r2.A03 = r16;
        r5 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04ba, code lost:
        if (r5 == null) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04be, code lost:
        if (r5.A00 != true) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04c0, code lost:
        r10 = r2.A06;
        r2.A0A(r12, r11, r1.A09, "front".equals(r1.A0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04cf, code lost:
        if (r10 == null) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04d9, code lost:
        if (r10.A00.A02() != X.C351968Bd.FILL) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04db, code lost:
        r2.A0B(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04de, code lost:
        r12 = r2.A0E.A02.A01;
        r5 = r12.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04e6, code lost:
        if (r5 == null) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04e8, code lost:
        r11 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ea, code lost:
        r10 = true;
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04ee, code lost:
        if (r11 != X.C379289Tg.A04) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04f0, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04f3, code lost:
        if (r12.A0Z != null) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04f5, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04f6, code lost:
        if (r8 != false) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04f8, code lost:
        if (r10 == false) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04fa, code lost:
        r5 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04fc, code lost:
        if (r5 == null) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04fe, code lost:
        r5.A00 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0500, code lost:
        r0.A08 = r2.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0506, code lost:
        if (r6 == null) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0508, code lost:
        r13 = r6.A01;
        r12 = r0.A0D;
        r11 = r0.A0i;
        X.0qQ.A0B(r12, 2);
        X.0qQ.A0B(r11, 3);
        r13.A04 = r1;
        r13.A01 = r2;
        r1 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x051c, code lost:
        if (r1 == null) goto L_0x0566;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x051e, code lost:
        r23 = r1.A05;
        r24 = r1.A03;
        r21 = r1.A04;
        r20 = r1.A07;
        r17 = r1.A06;
        r14 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams(r1.A08);
        r21 = r14;
        r13.A02 = new com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig(r21, "SmartTrackingOnScreenRenderController", r23, r24, r21, r20, r17, r1.A0A, r1.A0F, r1.A0C, r1.A0G, r1.A0D, r1.A0E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0566, code lost:
        r13.A03 = r12;
        r13.A00 = r11;
        r0.A0B.A07(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0573, code lost:
        if (r37 != X.C2801950r.FEED_POST) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0579, code lost:
        if (r0.A0E() <= 0) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0585, code lost:
        if (r0.A0E() > X.C3495980z.A00(r4).A01) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0587, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0588, code lost:
        r1 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x058a, code lost:
        if (r1 == null) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x058c, code lost:
        r1.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x058e, code lost:
        r3 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0590, code lost:
        if (r3 == null) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0592, code lost:
        r1 = r0.A0D;
        r1.A16 = r3;
        r1.A5z = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0598, code lost:
        r0.A0X.setTranslationY(0.0f);
        r5 = r0.A0j;
        r3 = r0.A1A;
        X.0qQ.A0B(r3, 0);
        r5.A0C.add(r3);
        r5 = r0.A11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05b6, code lost:
        if (r5.hasNext() == false) goto L_0x0627;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05b8, code lost:
        ((X.C3506985v) r5.next()).Djd(r0.A0E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05c6, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05c9, code lost:
        r10 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05cb, code lost:
        if (r10 == null) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05cd, code lost:
        r11 = X.0oY.A00(r1.A0U);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05d5, code lost:
        if ((r10 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) == false) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05d7, code lost:
        if (r11 == null) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05d9, code lost:
        r8 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r10;
        r8.A08 = X.C366558pG.A00(r11.A01);
        r8.A07 = X.C366558pG.A00(r11.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05ec, code lost:
        ((com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r10).A03 = r1.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05f2, code lost:
        X.C354188Kz.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05f7, code lost:
        if (r11 == null) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05f9, code lost:
        r10 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r10;
        r10.A03("u_topColor", X.C369398uX.A00(r11.A01));
        r10.A03("u_bottomColor", X.C369398uX.A00(r11.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0611, code lost:
        r8 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0613, code lost:
        if (r8 == null) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0615, code lost:
        r8.A00 = r1.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x061a, code lost:
        r2.A05 = null;
        r2.A0F.A00("onSetupVideoRendering nullified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0627, code lost:
        r5 = r0.A0v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0629, code lost:
        if (r5 == null) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x062b, code lost:
        r6 = r0.A0n;
        r1 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x062f, code lost:
        if (r1 == null) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0631, code lost:
        r8 = X.AnonymousClass9T9.A00(r1, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x063b, code lost:
        if (r8.A00() == false) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x064b, code lost:
        if (X.C39899AIg.A04((X.AnonymousClass831) r5.A04.A0F.A02()) == false) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x064d, code lost:
        X.AnonymousClass8M1.A03(r8, (X.C376429Hy) null, r5, (java.lang.Integer) null, false);
        r10 = new X.C376429Hy(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
        r6.A04 = false;
        r2.A09(r10.A03, r10.A02, r10.A00, r10.A01);
        r6.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x066f, code lost:
        X.27p.A01(r4).A0J.A05(r37, "setup_video_rendering_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x067c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0684, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (r9 == X.AnonymousClass05K.A15) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029b, code lost:
        if (X.182.A06(r8, r4, 36318183327274967L) != false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029f, code lost:
        if (r5 == false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a7, code lost:
        if (X.AnonymousClass9TC.A00(r4, r0.A05) != false) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a9, code lost:
        r31 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b1, code lost:
        if (X.AnonymousClass9TC.A00(r4, r0.A05) == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b3, code lost:
        r10 = r0.A05;
        X.0qQ.A0B(r10, 1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0D(X.AnonymousClass8LU r37, X.C349307zv r38, int r39, boolean r40) {
        /*
            r0 = r37
            X.9Pn r1 = r0.A0B
            r3 = 0
            if (r1 != 0) goto L_0x00c1
            com.instagram.common.session.UserSession r4 = r0.A0c
            X.27r r1 = X.27p.A01(r4)
            X.29L r5 = r1.A0J
            X.50r r1 = r0.A0w
            r37 = r1
            java.lang.String r2 = "setup_video_rendering_start"
            r5.A05(r1, r2)
            X.8Kz r2 = r0.A0o
            X.82p r1 = r0.A0k
            X.82o r8 = r1.A02
            boolean r5 = r8.A0E()
            X.8or r1 = new X.8or
            r1.<init>()
            r1.A00 = r5
            r2.A04 = r1
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r6 = r2.A05
            if (r6 == 0) goto L_0x003a
            r5 = 0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = r6.A08
            r1.A00 = r5
            r6.A04(r5)
            r6.A05(r5)
        L_0x003a:
            X.82Y r6 = r8.A01
            java.lang.Integer r9 = r6.A0D
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            r7 = 1
            if (r9 == r1) goto L_0x0048
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            r5 = 0
            if (r9 != r1) goto L_0x0049
        L_0x0048:
            r5 = 1
        L_0x0049:
            r1 = r38
            r1.A1C = r5
            X.80D r5 = r0.A0l
            com.instagram.creation.base.CropInfo r9 = r5.A0T
            if (r9 == 0) goto L_0x006c
            boolean r5 = r9.A03
            if (r5 == 0) goto L_0x006c
            android.graphics.Rect r9 = r9.A02
            X.0qQ.A0B(r9, r3)
            int r5 = r9.left
            r1.A03 = r5
            int r5 = r9.top
            r1.A05 = r5
            int r5 = r9.right
            r1.A04 = r5
            int r5 = r9.bottom
            r1.A02 = r5
        L_0x006c:
            boolean r5 = r8.A0A()
            if (r5 == 0) goto L_0x0074
            r1.A15 = r7
        L_0x0074:
            android.app.Activity r13 = r0.A0W
            android.content.Context r5 = r13.getApplicationContext()
            X.7IH r10 = new X.7IH
            r10.<init>(r5)
            X.4yO r5 = r0.A05
            boolean r5 = r5 instanceof X.AnonymousClass80O
            if (r5 != 0) goto L_0x00d8
            int r9 = r1.A00
            if (r9 != r7) goto L_0x00d8
            java.lang.String r9 = r1.A0k
            X.JYp r9 = X.C59796JYp.A01(r9, r3)
            X.50r r12 = X.C2801950r.FEED_POST
            r11 = r37
            if (r11 != r12) goto L_0x00c2
            r16 = 500(0x1f4, double:2.47E-321)
            r18 = 900000(0xdbba0, double:4.44659E-318)
            r14 = r9
            r15 = r10
            r20 = r3
            boolean r9 = X.ABQ.A00(r14, r15, r16, r18, r20)
        L_0x00a2:
            if (r9 != 0) goto L_0x00d8
            X.27r r1 = X.27p.A01(r4)
            X.29L r5 = r1.A0J
            java.lang.String r4 = "Invalid video"
            r2 = 0
            r1 = r37
            r5.A07(r1, r4, r2, r2)
            android.view.ViewGroup r2 = r0.A0X
            X.4DR r1 = r0.A18
            r1.getClass()
            X.AjG r0 = new X.AjG
            r0.<init>(r1)
            r2.post(r0)
        L_0x00c1:
            return r3
        L_0x00c2:
            java.lang.Integer r11 = r6.A0D
            r11.getClass()
            java.lang.String r12 = X.C394519yF.A00(r11)
            java.lang.String r11 = "reel_igtv_reshare"
            boolean r11 = r12.equals(r11)
            r11 = r11 ^ 1
            boolean r9 = X.ABQ.A01(r9, r10, r3, r11)
            goto L_0x00a2
        L_0x00d8:
            X.82f r9 = r6.A0f
            if (r9 == 0) goto L_0x00f8
            X.1Xj r9 = r9.A03
            boolean r9 = X.AnonymousClass3ZJ.A0D(r4, r9)
            if (r9 == 0) goto L_0x00f8
            r0.A0L = r7
            r11 = 2131955768(0x7f131038, float:1.9548073E38)
            X.AoG r9 = new X.AoG
            r9.<init>(r10, r11)
            X.11Z.A02(r9)
            X.85o r9 = r0.A0j
            r9.A0B = r7
            X.C3506485o.A00(r9, r3)
        L_0x00f8:
            X.80G r9 = r0.A04
            android.view.View r9 = r9.A05()
            android.view.ViewParent r9 = r9.getParent()
            if (r9 != 0) goto L_0x010f
            android.view.ViewGroup r10 = r0.A0X
            X.80G r9 = r0.A04
            android.view.View r9 = r9.A05()
            r10.addView(r9)
        L_0x010f:
            X.28D r11 = r0.A0Y
            if (r5 == 0) goto L_0x0130
            X.8A2 r15 = X.AnonymousClass8A1.A01(r4)
            X.4yO r9 = r0.A05
            java.lang.String r10 = r9.A02
            r9 = r37
            X.0qQ.A0B(r9, r3)
            r9 = 2
            X.0qQ.A0B(r11, r9)
            java.lang.String r18 = "init_vvp_vpd"
            java.lang.String r19 = "1"
            r14 = r11
            r16 = r37
            r17 = r10
            X.AnonymousClass8A2.A00(r14, r15, r16, r17, r18, r19)
        L_0x0130:
            X.4yO r10 = r0.A05
            boolean r9 = r10 instanceof X.AnonymousClass9QA
            if (r9 == 0) goto L_0x045a
            X.1Xj r9 = r6.A08
            if (r9 == 0) goto L_0x0432
            boolean r9 = r9.A5v()
            if (r9 == 0) goto L_0x0432
            java.lang.String r28 = "reel_memory_share_stories"
        L_0x0142:
            com.facebook.common.math.matrix.Matrix4 r6 = X.C378369Pn.A0R
            X.AeS r11 = new X.AeS
            r11.<init>(r0)
            r19 = 0
            if (r5 == 0) goto L_0x042e
            X.9UF r10 = new X.9UF
            r10.<init>(r0)
        L_0x0152:
            r31 = 1
            if (r5 != 0) goto L_0x042a
            X.4yO r6 = r0.A05
            boolean r6 = X.AnonymousClass9TC.A00(r4, r6)
            if (r6 != 0) goto L_0x042a
            java.lang.Integer r21 = X.AnonymousClass05K.A00
        L_0x0160:
            X.8MA r8 = r0.A17
            X.9Pn r6 = new X.9Pn
            r9 = r40
            r14 = r6
            r15 = r13
            r16 = r8
            r17 = r4
            r18 = r10
            r20 = r11
            r22 = r28
            r23 = r9
            r24 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.A0B = r6
            X.8LQ r6 = r0.A1B
            X.80R r6 = r6.A00
            X.6if r8 = r6.A1y
            if (r8 == 0) goto L_0x01a1
            java.lang.Object r6 = r8.get()
            if (r6 == 0) goto L_0x01a1
            X.4yO r6 = r0.A05
            boolean r6 = X.AnonymousClass9TC.A00(r4, r6)
            if (r6 == 0) goto L_0x01a1
            X.9Pn r6 = r0.A0B
            java.lang.Object r8 = r8.get()
            X.8cb r8 = (X.C359318cb) r8
            r6.A06 = r8
            X.9Pw r6 = r6.A08
            if (r6 == 0) goto L_0x01a1
            r6.A03 = r8
        L_0x01a1:
            r0.A0O = r3
            X.9Pn r12 = r0.A0B
            X.A67 r11 = new X.A67
            r11.<init>(r0, r1, r9)
            X.9RU r10 = new X.9RU
            r10.<init>(r0)
            X.9TF r9 = new X.9TF
            r9.<init>(r0)
            X.9TH r8 = new X.9TH
            r8.<init>(r0)
            X.9TG r6 = new X.9TG
            r6.<init>(r0)
            r20 = r12
            r21 = r11
            r22 = r10
            r23 = r9
            r24 = r8
            r25 = r6
            r20.A05(r21, r22, r23, r24, r25)
            X.9Sq r6 = new X.9Sq
            r6.<init>(r0, r5)
            r12.A05 = r6
            X.9Pw r9 = r12.A08
            if (r9 == 0) goto L_0x01da
            r9.A02 = r6
        L_0x01da:
            X.9TE r8 = new X.9TE
            r8.<init>(r0, r5)
            r12.A0B = r8
            if (r9 == 0) goto L_0x01ea
            X.9T2 r6 = new X.9T2
            r6.<init>(r12, r8)
            r9.A06 = r6
        L_0x01ea:
            X.0nO r8 = X.0nY.A00()
            r20 = 3
            X.9kg r6 = new X.9kg
            r6.<init>(r0)
            r8.ATE(r6)
            X.3Q2 r6 = A03(r0, r1)
            r0.A0D = r6
            X.8L4 r6 = r0.A10
            if (r6 == 0) goto L_0x022f
            X.8Bc r10 = r0.A0r
            X.4yO r9 = r0.A05
            X.9QA r8 = X.AnonymousClass9QA.A00
            if (r9 != r8) goto L_0x0426
            java.lang.String r9 = r1.A0k
            X.0qQ.A0B(r9, r3)
            com.instagram.common.session.UserSession r8 = r6.A00
            X.8LG r8 = X.AnonymousClass8LF.A00(r8)
            X.A7z r8 = r8.A00(r9)
            if (r8 == 0) goto L_0x03e6
            X.8Bd r9 = X.C351968Bd.SMART_TRACKING_FIT
        L_0x021d:
            X.05G r8 = r10.A02
            r8.Epw(r9)
            X.8Bd r8 = X.C351968Bd.SMART_TRACKING_PROCESSING_INVALID
            if (r9 != r8) goto L_0x022f
            X.05G r9 = r10.A03
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r9.Epw(r8)
        L_0x022f:
            X.9Pn r9 = r0.A0B
            X.3Q2 r8 = r0.A0D
            r10 = r39
            r9.A08(r8, r10)
            r18 = 0
            X.0qQ.A0B(r4, r3)
            X.0Tu r8 = X.0Tu.A05
            r9 = 36324243525021604(0x810cb5000b2fa4, double:3.034936098987657E-306)
            boolean r9 = X.182.A06(r8, r4, r9)
            if (r9 == 0) goto L_0x03df
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float[] r21 = X.C369398uX.A00(r9)
            float[] r22 = X.C369398uX.A00(r9)
            r23 = 0
            r24 = r23
            r25 = r23
            r26 = r3
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r17 = X.C369408uY.A02(r21, r22, r23, r24, r25, r26)
        L_0x0260:
            X.9uE r16 = new X.9uE
            r16.<init>()
            r10 = r19
            r9 = r16
            r9.A00 = r10
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r9 = X.AnonymousClass9TB.A01(r17)
            r0.A0C = r9
            X.80G r10 = r0.A04
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r9 = r10.A0D
            if (r9 == 0) goto L_0x027e
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r9 = r10.A06()
            r9.setOpaque(r3)
        L_0x027e:
            android.content.Context r9 = r13.getApplicationContext()
            java.lang.Integer r27 = X.AnonymousClass9TI.A00(r9, r4, r5)
            if (r5 != 0) goto L_0x029d
            X.4yO r9 = r0.A05
            boolean r9 = X.AnonymousClass9TC.A00(r4, r9)
            if (r9 != 0) goto L_0x029d
            r9 = 36318183327274967(0x810732001c17d7, double:3.031103605530226E-306)
            boolean r9 = X.182.A06(r8, r4, r9)
            r30 = 0
            if (r9 == 0) goto L_0x02a1
        L_0x029d:
            r30 = 1
            if (r5 != 0) goto L_0x02ab
        L_0x02a1:
            X.4yO r9 = r0.A05
            boolean r9 = X.AnonymousClass9TC.A00(r4, r9)
            if (r9 != 0) goto L_0x02ab
            r31 = 0
        L_0x02ab:
            X.4yO r9 = r0.A05
            boolean r9 = X.AnonymousClass9TC.A00(r4, r9)
            if (r9 == 0) goto L_0x02cd
            X.4yO r10 = r0.A05
            X.0qQ.A0B(r10, r7)
            X.9QA r9 = X.AnonymousClass9QA.A00
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x02cd
            r9 = 36320751716344639(0x8109880007233f, double:3.0327278651199594E-306)
            boolean r8 = X.182.A06(r8, r4, r9)
            r36 = 1
            if (r8 != 0) goto L_0x02cf
        L_0x02cd:
            r36 = 0
        L_0x02cf:
            boolean r29 = X.C305756Jk.A01(r4)
            X.80G r12 = r0.A04
            if (r30 == 0) goto L_0x02dd
            if (r5 != 0) goto L_0x02dd
            r32 = 1
            if (r36 == 0) goto L_0x02df
        L_0x02dd:
            r32 = 0
        L_0x02df:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r11 = r0.A0C
            boolean r5 = r1.A1I
            if (r5 != 0) goto L_0x03d9
            boolean r5 = r1.A13
            if (r5 != 0) goto L_0x03d9
            boolean r5 = r1.A15
            if (r5 != 0) goto L_0x03d6
            boolean r5 = r1.A18
            X.888 r8 = r0.A0h
            if (r5 == 0) goto L_0x03d2
            java.lang.String r5 = "video_import"
        L_0x02f5:
            boolean r5 = X.AnonymousClass888.A00(r8, r5)
            if (r5 == 0) goto L_0x03d6
            X.9TW r5 = new X.9TW
            r8 = r17
            r5.<init>(r8)
            android.content.Context r10 = r13.getApplicationContext()
            X.0tS r8 = X.0tS.A00()
            boolean r9 = r8.A0a()
            X.8rx r8 = new X.8rx
            r8.<init>(r10, r5, r9)
        L_0x0313:
            X.9Po r5 = new X.9Po
            r23 = r8
            r24 = r4
            r25 = r12
            r26 = r11
            r33 = r7
            r34 = r3
            r35 = r3
            r21 = r5
            r22 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r0.A0U = r5
            X.9Pn r8 = r0.A0B
            X.0qQ.A0B(r8, r3)
            r5.A06 = r8
            X.9Po r8 = r0.A0U
            X.84f r5 = r0.A0Z
            X.0qQ.A0B(r5, r3)
            r8.A02 = r5
            int r11 = r1.A0K
            int r10 = r1.A08
            if (r11 <= 0) goto L_0x0344
            if (r10 > 0) goto L_0x0357
        L_0x0344:
            java.lang.String r8 = "VideoViewController: invalid video dimension:"
            java.lang.String r5 = "x"
            java.lang.String r9 = X.002.A02(r11, r10, r8, r5)
            java.lang.String r8 = "path="
            java.lang.String r5 = r1.A0k
            java.lang.String r5 = X.002.A0R(r8, r5)
            X.0kD.A01(r9, r5)
        L_0x0357:
            X.9Po r8 = r0.A0U
            r8.A01 = r11
            r8.A00 = r10
            X.80G r5 = r0.A04
            r5.A08(r8)
            X.80G r5 = r0.A04
            android.view.View r5 = r5.A05()
            r5.setVisibility(r3)
            X.1Yt r8 = X.C353948Ka.A00(r4)
            X.4yO r5 = r0.A05
            boolean r5 = r5 instanceof X.AnonymousClass80O
            java.util.List r5 = r8.A02(r5)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r5)
            X.9Pn r5 = r0.A0B
            r5.getClass()
            X.9TJ r12 = new X.9TJ
            r12.<init>(r5)
            X.8Lv r11 = r0.A1F
            X.80U r5 = r0.A0s
            X.80T r5 = (X.AnonymousClass80T) r5
            X.80W r10 = r5.A02
            r9 = 2
            X.0qQ.A0B(r10, r9)
            X.28t r5 = X.28t.A05
            X.8Kh r8 = new X.8Kh
            r8.<init>(r5, r4, r10, r13)
            X.8YQ r5 = new X.8YQ
            r5.<init>(r11, r12, r8, r13)
            r0.A0A = r5
            java.util.ArrayList r5 = r5.A04
            r5.add(r0)
            X.9Po r14 = r0.A0U
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r15 = r0.A0C
            r15.getClass()
            X.8Kn r13 = new X.8Kn
            r13.<init>()
            X.8Kk r5 = r0.A0A
            r5.getClass()
            X.8Kp r12 = new X.8Kp
            r12.<init>(r5)
            X.8Ks r11 = new X.8Ks
            r11.<init>(r4, r2)
            r5 = r15
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r5 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r5
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r10 = r5.A02
            X.8pJ r8 = new X.8pJ
            r8.<init>(r10)
            X.8pK r5 = new X.8pK
            r5.<init>(r10, r8)
            monitor-enter(r12)
            goto L_0x0486
        L_0x03d2:
            java.lang.String r5 = "video_recording"
            goto L_0x02f5
        L_0x03d6:
            r8 = 0
            goto L_0x0313
        L_0x03d9:
            X.888 r8 = r0.A0h
            java.lang.String r5 = "boomerang_capture"
            goto L_0x02f5
        L_0x03df:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r17 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            r17.<init>()
            goto L_0x0260
        L_0x03e6:
            X.8L5 r8 = r6.A02
            X.8L6 r9 = r8.A03
            X.8L7 r8 = r9.A01
            X.84M r8 = r8.A01
            java.lang.String r8 = r8.A03
            if (r8 == 0) goto L_0x0422
            X.8L8 r8 = r9.A00
            X.84a r9 = r8.A01
            java.lang.String r8 = r9.A03
            if (r8 == 0) goto L_0x0422
            java.lang.String r8 = r9.A04
            if (r8 == 0) goto L_0x0422
            X.3Q2 r8 = r0.A0D
            if (r8 == 0) goto L_0x0422
            com.instagram.pendingmedia.model.ClipInfo r11 = r8.A1N
            if (r11 == 0) goto L_0x0422
            long r8 = r11.A0A
            r14 = 15000(0x3a98, double:7.411E-320)
            int r12 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0422
            int r9 = r11.A09
            int r11 = r11.A06
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = (float) r9
            float r9 = r9 * r8
            float r8 = (float) r11
            float r9 = r9 / r8
            r8 = 1058013184(0x3f100000, float:0.5625)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0422
            X.8Bd r9 = X.C351968Bd.SMART_TRACKING_PROCESSING
            goto L_0x021d
        L_0x0422:
            X.8Bd r9 = X.C351968Bd.SMART_TRACKING_PROCESSING_INVALID
            goto L_0x021d
        L_0x0426:
            X.8Bd r9 = X.C351968Bd.FIT
            goto L_0x021d
        L_0x042a:
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            goto L_0x0160
        L_0x042e:
            X.B2y r10 = X.C378459Pw.A0E
            goto L_0x0152
        L_0x0432:
            boolean r9 = r8.A0F()
            if (r9 == 0) goto L_0x043c
            java.lang.String r28 = "mention_reshare_stories"
            goto L_0x0142
        L_0x043c:
            com.instagram.user.model.User r9 = r6.A0A
            if (r9 == 0) goto L_0x0444
            java.lang.String r28 = "shoutout_share_stories"
            goto L_0x0142
        L_0x0444:
            X.82d r6 = r6.A0Y
            if (r6 == 0) goto L_0x044c
            java.lang.String r28 = "igtv_share_stories"
            goto L_0x0142
        L_0x044c:
            boolean r6 = r8.A0B()
            if (r6 == 0) goto L_0x0456
            java.lang.String r28 = "reels_reshare_stories"
            goto L_0x0142
        L_0x0456:
            java.lang.String r28 = "post_cap_stories"
            goto L_0x0142
        L_0x045a:
            boolean r6 = r10 instanceof X.AnonymousClass80M
            if (r6 == 0) goto L_0x0462
            java.lang.String r28 = "post_cap_direct"
            goto L_0x0142
        L_0x0462:
            boolean r6 = r10 instanceof X.AnonymousClass80O
            if (r6 != 0) goto L_0x0476
            boolean r6 = r10 instanceof X.C3494080g
            if (r6 != 0) goto L_0x0476
            boolean r6 = r10 instanceof X.C363138jC
            if (r6 == 0) goto L_0x0472
            java.lang.String r28 = "feed"
            goto L_0x0142
        L_0x0472:
            java.lang.String r28 = "unknown"
            goto L_0x0142
        L_0x0476:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r6 = r0.A1G
            boolean r6 = r6.A0G()
            if (r6 == 0) goto L_0x0482
            java.lang.String r28 = "post_cap_draft"
            goto L_0x0142
        L_0x0482:
            java.lang.String r28 = "post_cap"
            goto L_0x0142
        L_0x0486:
            r12.A00 = r5     // Catch:{ all -> 0x0685 }
            monitor-exit(r12)
            r11.A00 = r15
            java.util.LinkedHashSet r5 = r13.A00
            r5.add(r12)
            r5.add(r11)
            r14.A04 = r13
            X.8Jp r5 = r0.A1J
            if (r5 == 0) goto L_0x04a5
            X.0eM r5 = r5.A00
            java.lang.Object r8 = r5.getValue()
            X.8Kt r8 = (X.C354128Kt) r8
            X.8Kk r5 = r0.A0A
            r8.A02 = r5
        L_0x04a5:
            int r12 = r1.A0K
            int r11 = r1.A08
            X.8qr r5 = new X.8qr
            r5.<init>(r12, r11)
            r0.A03 = r5
            r5 = r17
            r2.A02 = r5
            r5 = r16
            r2.A03 = r5
            X.8or r5 = r2.A04
            if (r5 == 0) goto L_0x061a
            boolean r5 = r5.A00
            if (r5 != r7) goto L_0x061a
            X.8Bc r10 = r2.A06
            int r13 = r1.A09
            java.lang.String r8 = r1.A0f
            java.lang.String r5 = "front"
            boolean r5 = r5.equals(r8)
            r2.A0A(r12, r11, r13, r5)
            if (r10 == 0) goto L_0x05c9
            X.2Fk r5 = r10.A00
            java.lang.Object r8 = r5.A02()
            X.8Bd r5 = X.C351968Bd.FILL
            if (r8 != r5) goto L_0x05c9
            r2.A0B(r10)
        L_0x04de:
            X.82p r5 = r2.A0E
            X.82o r5 = r5.A02
            X.82Y r12 = r5.A01
            X.82i r5 = r12.A0h
            if (r5 == 0) goto L_0x05c6
            X.9Tg r11 = r5.A02
        L_0x04ea:
            X.9Tg r5 = X.C379289Tg.CLIPS
            r10 = 1
            r8 = 0
            if (r11 != r5) goto L_0x04f1
            r8 = 1
        L_0x04f1:
            X.82a r5 = r12.A0Z
            if (r5 != 0) goto L_0x04f6
            r10 = 0
        L_0x04f6:
            if (r8 != 0) goto L_0x04fa
            if (r10 == 0) goto L_0x0500
        L_0x04fa:
            X.8or r5 = r2.A04
            if (r5 == 0) goto L_0x067d
            r5.A00 = r3
        L_0x0500:
            X.8pT r5 = r2.A07()
            r0.A08 = r5
            if (r6 == 0) goto L_0x056f
            X.8L9 r13 = r6.A01
            X.3Q2 r12 = r0.A0D
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r11 = r0.A0i
            X.0qQ.A0B(r12, r9)
            r5 = r20
            X.0qQ.A0B(r11, r5)
            r13.A04 = r1
            r13.A01 = r2
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r1 = r2.A05
            if (r1 == 0) goto L_0x0566
            java.lang.String r22 = "SmartTrackingOnScreenRenderController"
            int r5 = r1.A05
            r23 = r5
            int r5 = r1.A03
            r24 = r5
            int r5 = r1.A04
            r21 = r5
            int r5 = r1.A07
            r20 = r5
            int r5 = r1.A06
            r17 = r5
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r5 = r1.A08
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r14 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r14.<init>(r5)
            boolean r5 = r1.A0A
            r16 = r5
            boolean r15 = r1.A0F
            boolean r10 = r1.A0C
            boolean r8 = r1.A0G
            boolean r6 = r1.A0D
            boolean r5 = r1.A0E
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r1 = new com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig
            r25 = r21
            r26 = r20
            r27 = r17
            r28 = r16
            r29 = r15
            r30 = r10
            r31 = r8
            r32 = r6
            r33 = r5
            r20 = r1
            r21 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r13.A02 = r1
        L_0x0566:
            r13.A03 = r12
            r13.A00 = r11
            X.9Pn r1 = r0.A0B
            r1.A07(r13)
        L_0x056f:
            X.50r r5 = X.C2801950r.FEED_POST
            r1 = r37
            if (r1 != r5) goto L_0x058e
            int r1 = r0.A0E()
            if (r1 <= 0) goto L_0x0588
            int r5 = r0.A0E()
            X.80y r1 = X.C3495980z.A00(r4)
            int r1 = r1.A01
            if (r5 > r1) goto L_0x0588
            r3 = 1
        L_0x0588:
            X.8or r1 = r2.A04
            if (r1 == 0) goto L_0x058e
            r1.A00 = r3
        L_0x058e:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r3 = r2.A05
            if (r3 == 0) goto L_0x0598
            X.3Q2 r1 = r0.A0D
            r1.A16 = r3
            r1.A5z = r7
        L_0x0598:
            android.view.ViewGroup r1 = r0.A0X
            r11 = 0
            r1.setTranslationY(r11)
            X.85o r5 = r0.A0j
            X.87k r3 = r0.A1A
            r1 = r18
            X.0qQ.A0B(r3, r1)
            java.util.Set r1 = r5.A0C
            r1.add(r3)
            java.util.List r1 = r0.A11
            java.util.Iterator r5 = r1.iterator()
        L_0x05b2:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0627
            java.lang.Object r3 = r5.next()
            X.85v r3 = (X.C3506985v) r3
            int r1 = r0.A0E()
            r3.Djd(r1)
            goto L_0x05b2
        L_0x05c6:
            r11 = 0
            goto L_0x04ea
        L_0x05c9:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r10 = r2.A02
            if (r10 == 0) goto L_0x05f2
            X.0v6 r5 = r1.A0U
            com.instagram.common.util.gradient.BackgroundGradientColors r11 = X.0oY.A00(r5)
            boolean r5 = r10 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            if (r5 == 0) goto L_0x05f7
            if (r11 == 0) goto L_0x05ec
            r8 = r10
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r8 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r8
            int r5 = r11.A01
            float[] r5 = X.C366558pG.A00(r5)
            r8.A08 = r5
            int r5 = r11.A00
            float[] r5 = X.C366558pG.A00(r5)
            r8.A07 = r5
        L_0x05ec:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r10 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r10
            android.graphics.Bitmap r5 = r1.A0N
            r10.A03 = r5
        L_0x05f2:
            X.C354188Kz.A03(r2)
            goto L_0x04de
        L_0x05f7:
            if (r11 == 0) goto L_0x0611
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r10 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r10
            int r5 = r11.A01
            float[] r8 = X.C369398uX.A00(r5)
            java.lang.String r5 = "u_topColor"
            r10.A03(r5, r8)
            int r5 = r11.A00
            float[] r8 = X.C369398uX.A00(r5)
            java.lang.String r5 = "u_bottomColor"
            r10.A03(r5, r8)
        L_0x0611:
            X.9uE r8 = r2.A03
            if (r8 == 0) goto L_0x05f2
            android.graphics.Bitmap r5 = r1.A0N
            r8.A00 = r5
            goto L_0x05f2
        L_0x061a:
            r5 = r19
            r2.A05 = r5
            X.8L0 r8 = r2.A0F
            java.lang.String r5 = "onSetupVideoRendering nullified"
            r8.A00(r5)
            goto L_0x0500
        L_0x0627:
            X.8M1 r5 = r0.A0v
            if (r5 == 0) goto L_0x066f
            X.8Lz r6 = r0.A0n
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r1 = r2.A05
            if (r1 == 0) goto L_0x066f
            r0 = 1065353216(0x3f800000, float:1.0)
            X.9Hy r8 = X.AnonymousClass9T9.A00(r1, r0)
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x066f
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A04
            X.2gB r0 = r0.A0F
            java.lang.Object r0 = r0.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            boolean r0 = X.C39899AIg.A04(r0)
            if (r0 == 0) goto L_0x066f
            r3 = r19
            r0 = r18
            X.AnonymousClass8M1.A03(r8, r3, r5, r3, r0)
            r13 = 15
            X.9Hy r10 = new X.9Hy
            r12 = r11
            r14 = r11
            r15 = r9
            r16 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r6.A04 = r0
            float r5 = r10.A03
            float r3 = r10.A02
            float r1 = r10.A00
            float r0 = r10.A01
            r2.A09(r5, r3, r1, r0)
            r6.A04 = r7
        L_0x066f:
            X.27r r0 = X.27p.A01(r4)
            X.29L r2 = r0.A0J
            java.lang.String r1 = "setup_video_rendering_end"
            r0 = r37
            r2.A05(r0, r1)
            return r7
        L_0x067d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0685:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8LU.A0D(X.8LU, X.7zv, int, boolean):boolean");
    }

    public final int A0E() {
        AnonymousClass3Q2 r0 = this.A0D;
        if (r0 != null) {
            ClipInfo clipInfo = r0.A1N;
            int i = clipInfo.A07;
            int i2 = clipInfo.A05;
            int i3 = i2 - i;
            if (i3 >= 0) {
                return i3;
            }
            0kD.A01(__redex_internal_original_name, 002.A02(i, i2, "video duration is negative. start time: ", ", end time: "));
        }
        return 0;
    }

    public final Bitmap A0F(Bitmap bitmap, RectF rectF, AnonymousClass9X8 r20) {
        Bitmap A032;
        int i;
        C378459Pw r0;
        RectF rectF2 = rectF;
        if (rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            rectF2.set(0.0f, 0.0f, (float) this.A04.A05().getWidth(), (float) this.A04.A05().getHeight());
            0kD.A01("VideoViewController#takeScreenshot:invalidScalingRect", "");
        }
        AnonymousClass80G r3 = this.A04;
        Bitmap bitmap2 = bitmap;
        if (bitmap == null) {
            int width = (int) rectF2.width();
            int height = (int) rectF2.height();
            MultiListenerTextureView multiListenerTextureView = r3.A0D;
            if (multiListenerTextureView != null) {
                A032 = multiListenerTextureView.getBitmap(width, height);
            } else {
                A032 = null;
            }
        } else {
            A032 = r3.A03(bitmap2);
        }
        if (A032 != null) {
            Canvas canvas = new Canvas(A032);
            C353838Jj r6 = (C353838Jj) this.A19.A00.A00();
            C378369Pn r02 = this.A0B;
            if (r02 == null || (r0 = r02.A08) == null) {
                i = -1;
            } else {
                i = r0.A07();
            }
            Bitmap A012 = r6.A01(bitmap2, rectF2, r20, 1.0f, 1.0f, i, false, true, true, true);
            if (A012 != null) {
                canvas.drawBitmap(A012, 0.0f, 0.0f, (Paint) null);
            }
        }
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass8PW A0G() {
        /*
            r5 = this;
            X.8BA r4 = r5.A0f
            X.87h r3 = r5.A1H
            X.8Kk r2 = r5.A0A
            X.3Q2 r0 = r5.A0D
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.A5F
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            X.8PW r0 = X.AnonymousClass8MD.A00(r4, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8LU.A0G():X.8PW");
    }

    public final AnonymousClass3QS A0H() {
        if (!(this.A05 instanceof AnonymousClass80O)) {
            if (!182.A06(0Tu.A05, this.A0c, 36317955692369614L)) {
                return new AnonymousClass3QS();
            }
        }
        return this.A1E.A02();
    }

    public final void A0I() {
        C353858Jp r0 = this.A1J;
        if (r0 != null) {
            C354128Kt r1 = (C354128Kt) r0.A00.getValue();
            if (r1.A04) {
                2cs r3 = r1.A06;
                r3.A08(r3.A01, true);
            }
        }
    }

    public final void A0J() {
        C349307zv A042;
        AnonymousClass80D r0;
        DirectCameraViewModel directCameraViewModel;
        if (this.A0D != null && (A042 = this.A0k.A02.A01.A04()) != null && (r0 = this.A0l) != null && (directCameraViewModel = r0.A1I) != null && directCameraViewModel.A00 == 8) {
            UserSession userSession = this.A0c;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36323625049795912L)) {
                A0D(this, A042, 0, false);
                this.A1D.A01((MV5) null, A042.A07(), new C41408AtU(this), true, true);
            }
        }
    }

    public final void A0K(int i) {
        C378369Pn r0 = this.A0B;
        if (r0 != null) {
            C378459Pw r02 = r0.A08;
            if (r02 != null) {
                r02.A0H(i);
            }
            for (C3506985v DyD : this.A11) {
                DyD.DyD(i);
            }
        }
    }

    public final void A0L(int i, int i2) {
        C378369Pn r2 = this.A0B;
        if (r2 != null) {
            r2.A03 = i;
            r2.A02 = i2;
            int i3 = r2.A04;
            if (i3 < i || (i2 != -1 && i3 > i2)) {
                r2.A04 = i;
            }
            C378459Pw r0 = r2.A08;
            if (r0 != null) {
                r0.A0I(i, i2);
            }
        }
    }

    public final void A0M(C53401GnY gnY, 1GK r20, LD4 ld4, C381779cJ r22, A6R a6r, AnonymousClass3Q2 r24, C349307zv r25, Map map, boolean z, boolean z2) {
        UserSession userSession = this.A0c;
        if (C305756Jk.A01(userSession)) {
            onPause();
        }
        C53401GnY gnY2 = gnY;
        LD4 ld42 = ld4;
        C381779cJ r10 = r22;
        A6R a6r2 = a6r;
        C349307zv r5 = r25;
        if (r25 != null) {
            A0D(this, r5, 0, false);
            if (z && !z2) {
                0qQ.A0B(userSession, 0);
                if (182.A06(0Tu.A05, userSession, 36323625049533764L)) {
                    AnonymousClass8L1 r1 = this.A0g;
                    String str = r5.A0k;
                    0qQ.A0B(ld42, 0);
                    0qQ.A0B(str, 1);
                    C66551pM.A00().EMy(gnY2, r1.A02, new C40340AaZ(this, r1, ld42), ld42, r10, a6r2, (AnonymousClass3Q2) null, str);
                    if (C305756Jk.A01(userSession)) {
                        onResume();
                        return;
                    }
                    return;
                }
            }
        }
        C40359Aas aas = new C40359Aas(gnY2, this, ld42, r10, a6r2);
        C41451AuB auB = new C41451AuB(r20, this, r24, map);
        if (r25 != null) {
            this.A1D.A01(aas, r5.A07(), auB, false, true);
            return;
        }
        0qQ.A0B(userSession, 0);
        boolean A062 = 182.A06(0Tu.A05, userSession, 36319132513344439L);
        LBC lbc = (LBC) auB.invoke();
        if (A062) {
            0qQ.A0B(lbc, 0);
            LS1.A01(lbc, aas);
            return;
        }
        0qQ.A0B(lbc, 0);
        1ES.A03(LS1.A00(lbc, aas));
    }

    public final void A0N(AnonymousClass8QA r7, boolean z) {
        C306386Ly r1;
        this.A14.getValue();
        this.A06 = r7;
        AnonymousClass82Y r0 = this.A0k.A02.A01;
        C349307zv A042 = r0.A04();
        A042.getClass();
        int i = r0.A04().A0G;
        this.A06.getClass();
        AnonymousClass9TD r12 = new AnonymousClass9TD(this, A042, i, z);
        this.A0F = r12;
        0nA.A0p(this.A0X, r12);
        AnonymousClass80R r5 = this.A1B.A00;
        C314676if r4 = r5.A1y;
        if (r4 != null) {
            AnonymousClass8LU r2 = r5.A0g;
            r2.A11.add(((C359318cb) r4.get()).A0k);
            C359318cb r3 = (C359318cb) r4.get();
            List<Drawable> list = r3.A15;
            if (!list.isEmpty()) {
                for (Drawable A0L2 : list) {
                    r3.A0L(A0L2);
                }
                C359318cb.A09(r3);
                list.clear();
            }
            C353508Hx r13 = r5.A1j;
            if ((r13 instanceof C353498Hw) && ((C353498Hw) r13).A0o) {
                InteractiveDrawableContainer interactiveDrawableContainer = r5.A2B;
                Integer num = AnonymousClass05K.A01;
                if (interactiveDrawableContainer.A13(num)) {
                    C359318cb r42 = (C359318cb) r4.get();
                    Iterator it = r42.A13.A0V(AnonymousClass5MH.class).iterator();
                    while (it.hasNext()) {
                        AnonymousClass5MH r22 = (AnonymousClass5MH) it.next();
                        Drawable drawable = r22.A0A;
                        if ((drawable instanceof C306386Ly) && (r1 = (C306386Ly) drawable) != null && r1.A0M == num) {
                            C359318cb.A02(r22, r42);
                            C359318cb.A01(r22, r42);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r34 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(X.LD4 r31, X.C381779cJ r32, X.L8M r33, X.AnonymousClass8VT r34, java.lang.Boolean r35, java.lang.Integer r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.util.List r41, java.util.List r42, int r43, boolean r44) {
        /*
            r30 = this;
            r9 = r31
            com.instagram.model.direct.DirectShareTarget r3 = r9.A00
            r15 = r33
            r16 = r34
            if (r3 == 0) goto L_0x00a5
            com.instagram.pendingmedia.model.constants.ShareType r1 = r9.A02
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            if (r1 != r0) goto L_0x00a5
        L_0x0010:
            if (r33 != 0) goto L_0x0015
            r1 = 1
            if (r34 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            java.lang.String r0 = "storyXShareParams and highlightsInfo are not valid with Direct shares"
            X.02V.A06(r1, r0)
        L_0x001b:
            r7 = r30
            X.8L1 r6 = r7.A0g
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x009f
            r7.A0I()
            r21 = 0
            r14 = r32
            if (r32 == 0) goto L_0x00a0
            java.lang.String r1 = r14.A00
            if (r1 == 0) goto L_0x00a0
        L_0x0030:
            X.80D r2 = r7.A0l
            if (r2 == 0) goto L_0x0038
            com.instagram.model.direct.camera.DirectCameraViewModel r13 = r2.A1I
            if (r13 != 0) goto L_0x003a
        L_0x0038:
            r13 = r21
        L_0x003a:
            X.82p r5 = r7.A0k
            X.82o r0 = r5.A02
            X.82Y r4 = r0.A01
            X.7zv r0 = r4.A04()
            if (r0 == 0) goto L_0x0050
            X.7zv r0 = r4.A04()
            int r0 = r0.A0F
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
        L_0x0050:
            X.28D r4 = r5.A01
            X.28D r0 = X.28D.A2S
            if (r4 != r0) goto L_0x006b
            boolean r0 = r2.A3B
            if (r0 != 0) goto L_0x006b
            X.8KX r0 = r7.A1K
            java.lang.Integer r22 = X.AnonymousClass05K.A1I
            r17 = r0
            r18 = r3
            r19 = r13
            r20 = r14
            r23 = r1
            r17.A00(r18, r19, r20, r21, r22, r23)
        L_0x006b:
            X.8PW r10 = r7.A0G()
            X.8LR r0 = r7.A0m
            X.80R r0 = r0.A00
            X.8MC r0 = r0.A0h
            X.8pV r8 = r0.A00()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r12 = r7.A0C
            X.8BA r0 = r7.A0f
            boolean r27 = r0.A0p()
            boolean r0 = r2.A3B
            r11 = 0
            r25 = r42
            r24 = r41
            r28 = r44
            r26 = r43
            r17 = r35
            r18 = r36
            r19 = r37
            r20 = r38
            r21 = r39
            r22 = r40
            r23 = r1
            r29 = r0
            r6.A06(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x009f:
            return
        L_0x00a0:
            java.lang.String r1 = X.HZX.A00()
            goto L_0x0030
        L_0x00a5:
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x001b
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8LU.A0O(X.LD4, X.9cJ, X.L8M, X.8VT, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, boolean):void");
    }

    public final void A0Q(C349307zv r15, int i, boolean z) {
        if (this.A0B != null) {
            C3499482o r2 = this.A0k.A02;
            C349307zv A042 = r2.A01.A04();
            A042.getClass();
            if (!A042.equals(r15)) {
                r2.A09(Collections.singletonList(new C365798nh(r15, r2.A00().A06)));
            }
            int i2 = i;
            boolean z2 = z;
            if (A042.A0K == r15.A0K && A042.A08 == r15.A08 && (this.A05 instanceof AnonymousClass80O)) {
                MediaComposition mediaComposition = r15.A0O;
                if (mediaComposition != null) {
                    C378369Pn r1 = this.A0B;
                    C378459Pw r5 = r1.A08;
                    if (r5 != null) {
                        if (r5 instanceof C388789oO) {
                            C388789oO r52 = (C388789oO) r5;
                            AnonymousClass3Q2 r0 = r52.A09;
                            if (r0 != null) {
                                r0.A0r = mediaComposition;
                                r52.A00 = i2;
                                STU stu = r52.A05;
                                if (stu != null) {
                                    ClipInfo clipInfo = r0.A1N;
                                    if (clipInfo != null) {
                                        int i3 = clipInfo.A09;
                                        int i4 = clipInfo.A06;
                                        C378369Pn r02 = r52.A0F.A00;
                                        stu.A0A(mediaComposition, i3, i4, r02.A03, r02.A02, i2, stu.A09);
                                        if (z) {
                                            stu.A06();
                                        } else {
                                            stu.A05();
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                }
                            }
                            int i5 = r1.A03;
                            if (!(i5 == -1 && r1.A02 == -1)) {
                                r1.A08.A0I(i5, r1.A02);
                            }
                        } else {
                            throw new UnsupportedOperationException();
                        }
                    }
                } else {
                    0kD.A01("VideoViewController#loadVideo:video", "loadVideo called for VVP with null media composition");
                }
                this.A0D = A03(this, r15);
                A0C(this, false);
            } else {
                A09(this);
                this.A06.getClass();
                AnonymousClass9TD r12 = new AnonymousClass9TD(this, r15, i2, z2);
                this.A0F = r12;
                0nA.A0p(this.A0X, r12);
            }
            C354428Lz r13 = this.A0n;
            if (r13.A03 != null) {
                r13.A03 = 0;
            }
        }
    }

    public final int Au0() {
        C354038Kk r0 = this.A0A;
        if (r0 == null) {
            return Integer.MAX_VALUE;
        }
        return r0.Au0();
    }

    public final void CjC(CharSequence charSequence, boolean z) {
        AnonymousClass8KX r2 = this.A1K;
        String charSequence2 = charSequence.toString();
        0qQ.A0B(charSequence2, 0);
        if (z) {
            r2.A01.A01(charSequence2);
        }
    }

    public final void DDq() {
        C378369Pn r0 = this.A0B;
        if (r0 != null) {
            r0.CnC();
        }
    }

    public final void DDs(int i) {
        C378369Pn r0 = this.A0B;
        if (r0 != null) {
            r0.CnC();
        }
    }

    public final void DDt() {
        C378369Pn r1 = this.A0B;
        if (r1 != null) {
            r1.A09(false);
        }
    }

    public final void DYN(CameraAREffect cameraAREffect) {
        AnonymousClass3Q2 r0 = this.A0D;
        if (r0 != null) {
            r0.A10 = cameraAREffect;
            A06(cameraAREffect, this);
        }
        if (cameraAREffect != null && C305756Jk.A01(this.A0c)) {
            AnonymousClass80G r1 = this.A04;
            if (r1.A0D != null) {
                MultiListenerTextureView A062 = r1.A06();
                A062.A00 = new AnonymousClass5MS(A062, A062.A00);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        boolean z;
        C378459Pw r5;
        boolean z2;
        Intent intent;
        String str;
        int i;
        AnonymousClass80V r3 = (AnonymousClass80V) obj;
        AnonymousClass80V r2 = (AnonymousClass80V) obj2;
        int ordinal = r3.ordinal();
        Object obj4 = obj3;
        if (ordinal == 6) {
            this.A04.A05().setOnTouchListener((View.OnTouchListener) null);
        } else if (ordinal == 79) {
            C378369Pn r52 = this.A0B;
            if (!(r52 == null || (r5 = r52.A08) == null)) {
                r5.A0D();
            }
        } else if (ordinal == 39 || ordinal == 41) {
            boolean z3 = obj4 instanceof C356438Tw;
            if (!z3 || !((i = ((C356438Tw) obj4).A00) == 9685 || i == 9683)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.A0K && !z2) {
                onResume();
            }
            Integer num = AnonymousClass05K.A01;
            Integer num2 = num;
            Integer num3 = null;
            if (z3) {
                C356438Tw r6 = (C356438Tw) obj4;
                num3 = Integer.valueOf(r6.A00);
                intent = r6.A01;
            } else if (obj4 instanceof C356458Ty) {
                C356458Ty r7 = (C356458Ty) obj4;
                int i2 = 0;
                if (r7.A01) {
                    i2 = -1;
                }
                num3 = Integer.valueOf(i2);
                intent = r7.A00;
                num = AnonymousClass05K.A0N;
            } else {
                intent = null;
            }
            C3499482o r62 = this.A0k.A02;
            AnonymousClass82Y r53 = r62.A01;
            Integer num4 = r53.A0B;
            0qQ.A07(num4);
            if (num4 == num2 && r62.A01() == C365758nd.A07 && intent != null && num3 != null && num3.intValue() == -1) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets");
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("bundle_extra_user_story_targets");
                boolean booleanExtra = intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false);
                C39892ADt aDt = new C39892ADt(parcelableArrayListExtra, parcelableArrayListExtra2);
                IngestSessionShim ingestSessionShim = (IngestSessionShim) intent.getParcelableExtra("bundle_extra_ingest_session");
                if (ingestSessionShim == null) {
                    Integer num5 = r53.A0D;
                    if (num5 != null) {
                        str = C394519yF.A00(num5);
                    } else {
                        str = "null";
                    }
                    C357638Yz r54 = r53.A0X;
                    r54.getClass();
                    0kD.A01(__redex_internal_original_name, 002.A13("onExitRecipientPicker(): null ingestSession | mediaSource=", str, " | cameraDestination=", ((C279284yO) r54.A08.A00).A02, " | captureFormat=", C363828kP.A00(r62.A03())));
                } else {
                    this.A0g.A05((Bitmap) null, this, ingestSessionShim, (C39651A3r) null, aDt, num, booleanExtra);
                    if (!intent.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHARE_SHEET_LOGGING_REWRITE_IS_ENABLED", false) && parcelableArrayListExtra != null) {
                        UserSession userSession = this.A0c;
                        C56293Hw6.A01(this, userSession, userSession.A06, parcelableArrayListExtra);
                    }
                }
            } else {
                Integer num6 = r53.A0B;
                0qQ.A07(num6);
                if (num6 == AnonymousClass05K.A0C && r62.A01() == C365758nd.A07 && intent != null && num3 != null && num3.intValue() == -1) {
                    intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets");
                    ArrayList parcelableArrayListExtra3 = intent.getParcelableArrayListExtra("bundle_extra_user_story_targets");
                    Object obj5 = this.A12.get();
                    UserStoryTarget userStoryTarget = UserStoryTarget.A07;
                    if (!(parcelableArrayListExtra3 == null || !parcelableArrayListExtra3.contains(userStoryTarget) || obj5 == 28D.A3y || obj5 == 28D.A3z || obj5 == 28D.A5L || obj5 == 28D.A5M)) {
                        this.A0l.A0l.CqO("media_posted_to_highlight");
                    }
                }
            }
        } else if (ordinal == 58 && r2 == AnonymousClass80V.MEDIA_EDIT) {
            A0C(this, false);
        }
        switch (r2.ordinal()) {
            case 4:
                A05();
                return;
            case 6:
                A05();
                C378369Pn r0 = this.A0B;
                if (r0 != null) {
                    r0.CnC();
                }
                this.A04.A05().setOnTouchListener(new C40036AOs(this));
                return;
            case 39:
                A0I();
                z = this.A0K;
                break;
            case Seq.NULL_REFNUM:
                z = !(obj4 instanceof C355988Sd);
                if (!this.A0K) {
                    return;
                }
                break;
            case 57:
                if (r3 == AnonymousClass80V.MEDIA_EDIT) {
                    A0C(this, false);
                    return;
                }
                return;
            case 79:
                C378369Pn r02 = this.A0B;
                if (r02 != null) {
                    r02.A09(true);
                    return;
                }
                return;
            default:
                return;
        }
        if (z) {
            onPause();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r7 == 114) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dpt(int r7) {
        /*
            r6 = this;
            X.3Q2 r0 = r6.A0D
            if (r0 == 0) goto L_0x0075
            X.0eM r0 = r6.A14
            java.lang.Object r0 = r0.getValue()
            X.2nK r0 = (X.C229402nK) r0
            r4 = 1
            r0.A02(r4)
            r0 = 112(0x70, float:1.57E-43)
            if (r7 == r0) goto L_0x001a
            r0 = 114(0x72, float:1.6E-43)
            r5 = 100
            if (r7 != r0) goto L_0x001c
        L_0x001a:
            r5 = 60
        L_0x001c:
            com.instagram.common.session.UserSession r0 = r6.A0c
            X.1Yt r0 = X.C353948Ka.A00(r0)
            X.8Kd r0 = r0.A01(r7)
            java.lang.String r3 = r0.A04
            X.3Q2 r0 = r6.A0D
            X.3QG r2 = r0.A1i
            X.3QG r1 = new X.3QG
            r1.<init>()
            r1.A00 = r5
            r1.A01 = r7
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L_0x006e
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x003d:
            r1.A03 = r0
            java.util.List r0 = r2.A02
            if (r0 == 0) goto L_0x006c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x0047:
            r1.A02 = r0
            X.3Q2 r0 = r6.A0D
            r0.A1i = r1
            X.84j r2 = r6.A1C
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A04(r3, r0)
            X.8BA r0 = r6.A0f
            java.util.Set r0 = r0.A1u
            java.util.Iterator r1 = r0.iterator()
        L_0x005c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()
            X.8Cz r0 = (X.C352348Cz) r0
            r0.DBP(r4)
            goto L_0x005c
        L_0x006c:
            r0 = 0
            goto L_0x0047
        L_0x006e:
            r0 = 0
            goto L_0x003d
        L_0x0070:
            android.app.Activity r0 = r6.A0W
            X.C394839ym.A00(r0, r3)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8LU.Dpt(int):void");
    }

    public final void Dpx() {
        ((C229402nK) this.A14.getValue()).A02(false);
        this.A1C.A05(false);
    }

    public final void Dqt() {
        AnonymousClass80G r1 = this.A04;
        if (r1.A0D != null) {
            MultiListenerTextureView A062 = r1.A06();
            A062.A00 = new AnonymousClass4X6(A062.A00);
        }
    }

    public final String getModuleName() {
        C279284yO r1 = this.A05;
        if (r1 == AnonymousClass9QA.A00) {
            return "stories_postcapture_camera";
        }
        if (r1 == AnonymousClass80M.A00) {
            return "direct_postcapture_camera";
        }
        if (r1 == C3494180h.A00) {
            return "note_postcapture_camera";
        }
        return "clips_postcapture_camera";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r0.A0N() == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r3 = this;
            X.9Pn r0 = r3.A0B
            if (r0 == 0) goto L_0x000f
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.A0N()
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r3.A0V = r0
            r3.A0I()
            r1 = 0
            r3.A0K = r1
            X.0eM r0 = r3.A15
            java.lang.Object r0 = r0.getValue()
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            r3.A0M = r1
            X.9Pn r2 = r3.A0B
            if (r2 == 0) goto L_0x0043
            X.9Pw r0 = r2.A08
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0N()
            r1 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            r2.A0E = r1
            X.9Pw r0 = r2.A08
            if (r0 == 0) goto L_0x003e
            r0.A0K(r1)
        L_0x003e:
            X.9Pn r0 = r3.A0B
            r0.A01()
        L_0x0043:
            java.util.List r0 = r3.A11
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r1.next()
            X.85v r0 = (X.C3506985v) r0
            r0.DNP()
            goto L_0x0049
        L_0x0059:
            r3.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8LU.onPause():void");
    }

    public static void A0A(AnonymousClass8LU r1, int i) {
        C378459Pw r0;
        r1.A0K(i);
        C378369Pn r02 = r1.A0B;
        if (r02 != null && !r02.CnC() && (r0 = r1.A0B.A08) != null) {
            r0.A0D();
        }
    }

    public final void Exk() {
        A07(this);
    }

    public AnonymousClass8LU(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2, Fragment fragment, C3503284f r24, AnonymousClass4DR r25, UserSession userSession, C357638Yz r27, C3510387i r28, C353828Ji r29, AnonymousClass8BA r30, AnonymousClass8L1 r31, AnonymousClass888 r32, TargetViewSizeProvider targetViewSizeProvider, C3506485o r34, C3499582p r35, AnonymousClass80D r36, AnonymousClass8LR r37, AnonymousClass8LQ r38, C3503684j r39, C354188Kz r40, AnonymousClass88O r41, C352268Cr r42, C3506885u r43, C353788Jb r44, CachingVideoSaver cachingVideoSaver, AnonymousClass80U r46, C2801950r r47, C3510287h r48, C3495780x r49, AnonymousClass88F r50, C353858Jp r51, AnonymousClass8L4 r52, AnonymousClass0eK r53, AnonymousClass0eK r54) {
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        ArrayList arrayList = new ArrayList();
        this.A11 = arrayList;
        this.A15 = AnonymousClass0eN.A01(new AnonymousClass8LY(this));
        this.A0b = new 1a8(C318146oT.A01);
        this.A0V = true;
        this.A00 = 1.0f;
        this.A0L = false;
        C3499582p r3 = r35;
        this.A0k = r3;
        UserSession userSession2 = userSession;
        this.A0c = userSession2;
        AnonymousClass80U r0 = r46;
        this.A0s = r0;
        r0.A7w(this);
        C357638Yz r2 = r27;
        this.A0d = r2;
        Fragment fragment2 = fragment;
        this.A16 = fragment2;
        Activity activity2 = activity;
        this.A0W = activity2;
        this.A05 = (C279284yO) r2.A08.A00;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.requireViewById(R.id.post_capture_texture_view_container);
        this.A0X = viewGroup3;
        C3510387i r17 = r28;
        this.A0e = r17;
        AnonymousClass8LZ.A00(viewGroup3);
        this.A04 = A01(this);
        AnonymousClass80D r6 = r36;
        this.A0l = r6;
        this.A0i = targetViewSizeProvider2;
        this.A13 = r53;
        this.A1B = r38;
        this.A0m = r37;
        this.A0j = r34;
        AnonymousClass8BA r02 = r30;
        this.A0f = r02;
        r02.A07 = this;
        this.A12 = r54;
        this.A1H = r48;
        this.A0z = r50;
        C353828Ji r7 = r29;
        this.A19 = r7;
        C354188Kz r13 = r40;
        this.A0o = r13;
        Set set = r13.A0G;
        set.add(r41);
        set.add(new C354208Lb(this));
        this.A1C = r39;
        this.A0Z = r24;
        this.A0q = r44;
        this.A0p = r42;
        this.A0w = r47;
        this.A1J = r51;
        this.A18 = r25;
        this.A1K = AnonymousClass8KW.A00(userSession2);
        this.A0h = r32;
        C3506885u r1 = r43;
        arrayList.add(r1);
        r1.A00 = new C354218Lc(this);
        this.A14 = AnonymousClass0eN.A01(new C354238Le(this));
        this.A0Y = r6.A0B;
        ViewGroup viewGroup4 = viewGroup;
        arrayList.add(new C354248Lf(viewGroup4, fragment2, userSession2, this));
        AnonymousClass861 A002 = new 2YN(fragment2.requireActivity()).A00(AnonymousClass860.class).A00("post_capture");
        this.A0y = A002;
        A002.A0A.A06(fragment2, new C354358Ls(this));
        A002.A01.A06(fragment2, new C319096q2(new C354368Lt(this)));
        FragmentActivity fragmentActivity = (FragmentActivity) activity2;
        this.A1E = new 2YN(new AnonymousClass8IG(userSession2, fragmentActivity), fragmentActivity).A00(AnonymousClass89Z.class);
        Class<ClipsCreationViewModel> cls = ClipsCreationViewModel.class;
        ClipsCreationViewModel A003 = new 2YN(new C3500182v(userSession2, fragmentActivity), fragmentActivity).A00(cls);
        C354388Lv A004 = new 2YN(new C354378Lu(fragmentActivity, userSession2, A003.A0Q), fragmentActivity).A00(C354388Lv.class);
        this.A1F = A004;
        A004.A00 = r3;
        C226292g8.A00(19B.A00, A004.A07).A06(fragment2, new C354408Lx(this));
        C3511787w A005 = new 2YN(new C3511687v(userSession2, fragmentActivity), fragmentActivity).A00(C3511787w.class);
        this.A0a = A005;
        if (C305756Jk.A01(userSession2)) {
            A005.A02.A06(fragment2.requireActivity(), new C354418Ly(this));
        }
        this.A0n = new C354428Lz();
        ClipsCreationViewModel A006 = new 2YN(new C3500182v(userSession2, fragmentActivity), fragmentActivity).A00(cls);
        this.A0u = A006;
        AnonymousClass8M1 A007 = new 2YN(new AnonymousClass8M0(fragmentActivity, userSession2, A006), fragmentActivity).A00(AnonymousClass8M1.class);
        this.A0v = A007;
        this.A1G = new 2YN(new C351868As(fragmentActivity, userSession2, (C62320sa) null), fragment2).A00(ClipsCreationDraftViewModel.class);
        A007.A01.A06(fragment2, new C319096q2(new AnonymousClass8M3(this)));
        r13.A07 = new AnonymousClass8M4(this, r13);
        this.A0t = C3500382y.A00(activity2.getApplication(), userSession2).A00(A003.A0S);
        C351958Bc A008 = new 2YN(fragmentActivity).A00(C351958Bc.class);
        this.A0r = A008;
        A008.A00.A06(fragment2, new AnonymousClass8M5(this));
        AnonymousClass82Y r12 = r3.A02.A01;
        if (r12.A04 != null && !1NM.A03(userSession2)) {
            r12.A04.A06.A06(fragment2, new AnonymousClass9PO(this));
        }
        r2.A0F(new AnonymousClass8M6(this));
        this.A1I = r49;
        this.A0g = r31;
        AnonymousClass8L4 r03 = r52;
        this.A10 = r03;
        if (r52 != null) {
            r03.A02.A00.add(new AnonymousClass8M7(this));
        }
        this.A0x = new AnonymousClass8M8(new C71662eb((ViewStub) viewGroup4.findViewById(R.id.video_screenshot_view_stub)), this.A04, r3);
        AnonymousClass81W r04 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K;
        this.A17 = new AnonymousClass8M9(r17, r7, r04.getWidth(), r04.getHeight());
        if (r6.A3m) {
            this.A0L = true;
        }
        this.A1D = cachingVideoSaver;
    }
}
