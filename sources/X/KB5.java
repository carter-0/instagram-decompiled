package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.album.AlbumPostCapCropToggleButton;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class KB5 extends C252233om implements AnonymousClass4DR, C252203oj, C273534mk, MV0 {
    public static final C71392co A0d = C71392co.A04(80.0d, 9.0d);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public View A07;
    public FrameLayout A08;
    public IgSimpleImageView A09;
    public L00 A0A;
    public C64905Lk5 A0B;
    public C64276LYc A0C;
    public AnonymousClass514 A0D;
    public List A0E;
    public AtomicInteger A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int A0J;
    public View A0K;
    public C60477Jm9 A0L;
    public final int A0M;
    public final Context A0N;
    public final FragmentActivity A0O;
    public final UserSession A0P;
    public final C60009JdI A0Q = new C60009JdI(Looper.getMainLooper(), this);
    public final C66545MVz A0R;
    public final CreationSession A0S;
    public final AlbumEditFragment A0T;
    public final AlbumEditFragment A0U;
    public final C63625L0n A0V;
    public final C273514mi A0W;
    public final C267834cI A0X;
    public final 2cs A0Y;
    public final C273584mp A0Z;
    public final C60478JmA A0a;
    public final C3499582p A0b;
    public final Map A0c;

    public static C64905Lk5 A01(View view, KB5 kb5, MediaSession mediaSession, AnonymousClass3Q2 r19) {
        String valueOf;
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(true);
        AnonymousClass3Q2 r9 = r19;
        int i = r9.A0H;
        int i2 = r9.A0G;
        KB5 kb52 = kb5;
        float f = kb52.A0S.A00;
        if (f == 0.0f) {
            f = 1.0f;
        }
        Rect A002 = JW0.A00(f, i, i2, 0, false);
        surfaceCropFilter.A0K(A002, r9.A0H, r9.A0G, 0, true);
        UserSession userSession = kb52.A0P;
        MediaSession mediaSession2 = mediaSession;
        if (!182.A06(0Tu.A05, userSession, 36328564261404079L) || mediaSession2.B5r() == null) {
            FilterGroupModelImpl A003 = AnonymousClass9TB.A00();
            A003.EWj(surfaceCropFilter.A00, 3);
            mediaSession2.EWm(A003);
            r9.A1D = A003;
            mediaSession2.ETK(new CropInfo(A002, r9.A0H, r9.A0G));
        }
        String str = r9.A33;
        if (str == null) {
            valueOf = "_empty_file";
        } else {
            valueOf = String.valueOf(str.hashCode());
        }
        String A0g = 002.A0g(mediaSession2.BbR(), "_", valueOf);
        if (str == null) {
            str = kb52.A02(r9, kb52.A03, kb52.A02);
            r9.A33 = str;
        }
        JWH jwh = ((MediaCaptureActivity) kb52.A0Z).A08;
        jwh.getClass();
        0qQ.A0B(A0g, 0);
        MVM ALj = jwh.A07.ALj(A0g, str);
        if (ALj == null) {
            Object obj = jwh.A09.get(A0g);
            if (obj != null) {
                ALj = (MVM) obj;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return new C64905Lk5(view, userSession, ALj, mediaSession2.B5r(), r9, kb52.A03, kb52.A02);
    }

    public static void A03(Context context, UserSession userSession, KB5 kb5, C64905Lk5 lk5, FilterGroupModel filterGroupModel) {
        C378369Pn r0;
        C378459Pw r02;
        0qQ.A0B(userSession, 0);
        Context context2 = context;
        FilterGroupModel filterGroupModel2 = filterGroupModel;
        lk5.A03(new C378379Po(context2, userSession, filterGroupModel2, AnonymousClass000.A00(3120), false, 182.A06(0Tu.A05, userSession, 36318183327668184L)));
        if (kb5.A0G && (r0 = lk5.A01) != null && (r02 = r0.A08) != null) {
            r02.A09();
        }
    }

    public static void A0C(KB5 kb5, C66539MVt mVt) {
        FilterGroupModel filterGroupModel = null;
        if (mVt == null || !mVt.CeS()) {
            C64905Lk5 lk5 = kb5.A0B;
            if (lk5 != null) {
                C64905Lk5.A01(lk5);
                kb5.A0B = null;
                return;
            }
            return;
        }
        C64905Lk5 lk52 = kb5.A0B;
        if (lk52 == null || !lk52.equals(mVt)) {
            C64905Lk5 lk53 = kb5.A0B;
            if (lk53 != null) {
                C64905Lk5.A01(lk53);
            }
            C64905Lk5 lk54 = (C64905Lk5) mVt;
            kb5.A0B = lk54;
            FilterGroupModel filterGroupModel2 = lk54.A07;
            if (filterGroupModel2 == null) {
                filterGroupModel2 = ((MediaSession) Collections.unmodifiableList(kb5.A0S.A0E).get(kb5.A0R.Atv())).B5r();
            }
            if (filterGroupModel2 != null && ((FilterGroupModelImpl) filterGroupModel2).A04) {
                filterGroupModel = filterGroupModel2;
            }
            A03(kb5.A0N, kb5.A0P, kb5, lk54, filterGroupModel);
            return;
        }
        C64905Lk5 lk55 = (C64905Lk5) mVt;
        if (lk55.A02) {
            lk55.A02 = false;
            C378369Pn r0 = lk55.A01;
            if (r0 != null) {
                r0.A03();
            }
            lk55.A03 = true;
        }
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public static C64906Lk6 A00(View view, KB5 kb5, MediaSession mediaSession) {
        C273514mi r1 = kb5.A0W;
        C364848m7 Blh = r1.Blh(mediaSession.B5g());
        UserSession userSession = kb5.A0P;
        FilterGroupModel B5r = mediaSession.B5r();
        C3499582p r6 = kb5.A0b;
        JWG jwg = ((MediaCaptureActivity) r1).A07;
        jwg.getClass();
        C64906Lk6 lk6 = new C64906Lk6(view, userSession, mediaSession, jwg, r6, Blh, B5r);
        if (Blh.CUZ()) {
            Blh.Eij(new C63694L3e(kb5, lk6));
        }
        return lk6;
    }

    public static void A04(View view, KB5 kb5, Integer num) {
        Integer num2;
        if (num == AnonymousClass05K.A00) {
            num2 = AnonymousClass05K.A0G;
        } else {
            num2 = AnonymousClass05K.A0H;
        }
        JWG jwg = ((MediaCaptureActivity) kb5.A0W).A07;
        jwg.getClass();
        jwg.A0A(LV0.A00(kb5, view, 13), num2);
    }

    public static void A05(View view, KB5 kb5, boolean z) {
        int indexOfChild;
        UserSession userSession = kb5.A0P;
        if (LHq.A00(userSession).booleanValue()) {
            C66545MVz mVz = kb5.A0R;
            indexOfChild = mVz.indexOfChild(view);
            if (indexOfChild != -1 && !kb5.A0I(indexOfChild)) {
                CreationSession creationSession = kb5.A0S;
                creationSession.A0E.remove(indexOfChild);
                creationSession.A0H = true;
                JX9 A002 = JWX.A00(userSession);
                if (indexOfChild >= 0) {
                    List list = A002.A03;
                    if (indexOfChild < list.size()) {
                        list.remove(indexOfChild);
                    }
                }
                mVz.removeItem(indexOfChild);
                View view2 = kb5.A06;
                if (view2 != null) {
                    view2.setVisibility(0);
                    kb5.A06 = null;
                }
                kb5.A0U.A0N();
                A07(kb5);
                AnonymousClass6SR.A01().A01++;
                27p.A01(userSession).A23(z);
            }
            A0H(kb5, Collections.unmodifiableList(kb5.A0S.A0E), false);
            return;
        }
        C66545MVz mVz2 = kb5.A0R;
        indexOfChild = mVz2.indexOfChild(view);
        if (indexOfChild != -1) {
            List list2 = kb5.A0E;
            if (indexOfChild != list2.size()) {
                CreationSession creationSession2 = kb5.A0S;
                List list3 = creationSession2.A0E;
                list3.remove(indexOfChild);
                creationSession2.A0H = true;
                JX9 A003 = JWX.A00(userSession);
                if (indexOfChild >= 0) {
                    List list4 = A003.A03;
                    if (indexOfChild < list4.size()) {
                        list4.remove(indexOfChild);
                    }
                }
                list2.remove(indexOfChild);
                mVz2.removeView(view);
                int AnH = mVz2.AnH() - 1;
                if (indexOfChild < AnH) {
                    View AnC = mVz2.AnC(indexOfChild);
                    if (AnC != null) {
                        TranslateAnimation translateAnimation = new TranslateAnimation(AnonymousClass7TE.A02(AnC), 0.0f, 0.0f, 0.0f);
                        translateAnimation.setDuration(400);
                        AnC.startAnimation(translateAnimation);
                        if (indexOfChild < AnH - 1) {
                            int i = indexOfChild + 1;
                            if (mVz2.AnC(i) != null) {
                                mVz2.AnC(i).startAnimation(translateAnimation);
                            }
                        }
                    } else {
                        mVz2.requestLayout();
                    }
                } else {
                    mVz2.EKk(mVz2.CDb());
                }
                View view3 = kb5.A06;
                if (view3 != null) {
                    view3.setVisibility(0);
                    kb5.A06 = null;
                }
                kb5.A0U.A0N();
                A07(kb5);
                AnonymousClass6SR.A01().A01++;
                27p.A01(userSession).A23(z);
                if (Collections.unmodifiableList(list3).size() <= 2 && 182.A06(0Tu.A05, userSession, 36324080315543322L)) {
                    for (int i2 = 0; i2 < Collections.unmodifiableList(list3).size(); i2++) {
                        View AnC2 = mVz2.AnC(i2);
                        AnC2.getClass();
                        DbX.A1B(AnC2, R.id.filter_delete_view);
                    }
                }
            }
        }
        A0H(kb5, Collections.unmodifiableList(kb5.A0S.A0E), false);
        return;
        A09(kb5);
        AnonymousClass514 r0 = kb5.A0D;
        AnonymousClass514 r1 = AnonymousClass514.ORIGINAL;
        if (r0 == r1 && kb5.A0I) {
            int i3 = kb5.A05;
            if (i3 == indexOfChild) {
                A0D(kb5, r1);
            } else if (indexOfChild < i3) {
                kb5.A05 = i3 - 1;
            }
        }
    }

    public static void A08(KB5 kb5) {
        if (kb5.A06 != null) {
            int i = kb5.A01;
            C66545MVz mVz = kb5.A0R;
            View AnC = mVz.AnC(i);
            int indexOfChild = mVz.indexOfChild(kb5.A06);
            if (AnC != null && AnC != kb5.A06 && !kb5.A0I(i) && indexOfChild >= 0) {
                int width = AnC.getWidth();
                if (indexOfChild > i) {
                    width = -width;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation((float) width, 0.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(400);
                AnC.startAnimation(translateAnimation);
                View view = kb5.A06;
                mVz.removeView(view);
                mVz.addView(view, i);
                mVz.requestLayout();
                List list = kb5.A0E;
                list.add(i, list.remove(indexOfChild));
                JX9.A00(kb5, indexOfChild, i);
            }
        }
    }

    public static void A09(KB5 kb5) {
        float f;
        AnonymousClass514 r1;
        float A002;
        IgSimpleImageView igSimpleImageView = kb5.A09;
        if (igSimpleImageView != null) {
            int i = 0;
            if (igSimpleImageView instanceof AlbumPostCapCropToggleButton) {
                AlbumPostCapCropToggleButton albumPostCapCropToggleButton = (AlbumPostCapCropToggleButton) igSimpleImageView;
                List unmodifiableList = Collections.unmodifiableList(kb5.A0S.A0E);
                AnonymousClass514 r6 = kb5.A0D;
                UserSession userSession = kb5.A0P;
                int A1b = C51973G9u.A1b(unmodifiableList, r6, userSession);
                ArrayList A0r = AnonymousClass7TG.A0r(unmodifiableList);
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    MediaSession A0Z2 = JTO.A0Z(it);
                    CropInfo Asr = A0Z2.Asr();
                    if (Asr == null) {
                        A002 = AnonymousClass514.SQUARE.A00;
                    } else {
                        int i2 = Asr.A01;
                        float f2 = (float) Asr.A00;
                        float f3 = f2;
                        float f4 = (float) i2;
                        if (A0Z2.B2U().getValue() % 180 == 0) {
                            f2 = f4;
                            f4 = f3;
                        }
                        A002 = C63471Kxa.A00(userSession, (Float) null, f2 / f4);
                    }
                    JTP.A1V(A0r, A002);
                }
                boolean A062 = 182.A06(0Tu.A06, userSession, 36325222777369328L);
                Number number = (Number) 00k.A0J(A0r);
                if (number != null) {
                    f = number.floatValue();
                } else {
                    f = AnonymousClass514.SQUARE.A00;
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                AnonymousClass514 A003 = C63123Krr.A00(f);
                AnonymousClass514 r2 = AnonymousClass514.SQUARE;
                if (A003 != r2) {
                    if (f > r2.A00) {
                        r1 = AnonymousClass514.LANDSCAPE;
                    } else {
                        r1 = AnonymousClass514.PORTRAIT;
                    }
                    A1C.add(r1);
                }
                A1C.add(r2);
                if (!A062) {
                    List A0c2 = 00k.A0c(A0r, A1b);
                    if (!(A0c2 instanceof Collection) || !A0c2.isEmpty()) {
                        Iterator it2 = A0c2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (AnonymousClass7TE.A04(it2.next()) > f) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                } else {
                    A1C.add(AnonymousClass514.ORIGINAL);
                }
                LMI lmi = new LMI(r6, A1C);
                albumPostCapCropToggleButton.setUiState(lmi);
                if (lmi.A01.size() <= A1b) {
                    i = 8;
                }
            }
            igSimpleImageView.setVisibility(i);
        }
    }

    public static void A0A(KB5 kb5) {
        CreationSession creationSession = kb5.A0S;
        Iterator A0h = JTQ.A0h(creationSession.A0E);
        while (A0h.hasNext()) {
            if (JTO.A0Z(A0h).Bsu() == AnonymousClass05K.A00) {
                PhotoSession A022 = creationSession.A02();
                A022.getClass();
                FilterGroupModel filterGroupModel = A022.A07;
                filterGroupModel.getClass();
                SurfaceCropFilter A002 = C395019z4.A00(filterGroupModel, "AlbumRenderViewController_updateScaleInfo()");
                C62927Kof kof = (C62927Kof) creationSession.A0R.get(A022.A0B);
                if (!(A002 == null || kof == null)) {
                    kof.A00 = A002.A00.A06.A06;
                }
            }
        }
    }

    public static void A0B(KB5 kb5, int i) {
        if (kb5.A06 != null) {
            C66545MVz mVz = kb5.A0R;
            View AnC = mVz.AnC(i);
            int indexOfChild = mVz.indexOfChild(kb5.A06);
            if (AnC != null && AnC != kb5.A06 && !kb5.A0I(i) && indexOfChild >= 0) {
                mVz.EzF(indexOfChild, i);
                mVz.EKf(i);
                JX9.A00(kb5, indexOfChild, i);
                kb5.A01 = i;
            }
        }
    }

    public static void A0D(KB5 kb5, AnonymousClass514 r16) {
        String str;
        String A022;
        float f;
        AnonymousClass514 r8 = r16;
        KB5 kb52 = kb5;
        kb5.A0D = r8;
        float f2 = r8.A00;
        CreationSession creationSession = kb5.A0S;
        List list = creationSession.A0E;
        if (!Collections.unmodifiableList(list).isEmpty()) {
            MediaSession mediaSession = (MediaSession) AnonymousClass7TE.A13(Collections.unmodifiableList(list));
            AnonymousClass3Q2 BbQ = kb5.A0X.BbQ(creationSession.A0C);
            if (r8 == AnonymousClass514.ORIGINAL && BbQ != null) {
                if (kb5.A0I) {
                    BbQ.A04 = 2;
                    UserSession userSession = kb5.A0P;
                    Iterator it = list.iterator();
                    MediaSession mediaSession2 = null;
                    float f3 = Float.MAX_VALUE;
                    while (it.hasNext()) {
                        MediaSession A0Z2 = JTO.A0Z(it);
                        CropInfo Asr = A0Z2.Asr();
                        if (Asr != null) {
                            int i = Asr.A01;
                            float f4 = (float) Asr.A00;
                            float f5 = f4;
                            float f6 = (float) i;
                            if (A0Z2.B2U().getValue() % 180 == 0) {
                                f4 = f6;
                                f6 = f5;
                            }
                            f = C63471Kxa.A00(userSession, (Float) null, f4 / f6);
                        } else {
                            f = Float.MAX_VALUE;
                        }
                        if (f < f3) {
                            mediaSession2 = A0Z2;
                            f3 = f;
                        }
                        if (f3 == 0.8f) {
                            break;
                        }
                    }
                    if (mediaSession2 != null) {
                        kb52.A05 = Collections.unmodifiableList(list).indexOf(mediaSession2);
                        mediaSession = mediaSession2;
                    }
                } else {
                    BbQ.A04 = 1;
                }
            }
            CropInfo Asr2 = mediaSession.Asr();
            if (r8.A04 && Asr2 != null) {
                UserSession userSession2 = kb52.A0P;
                int i2 = Asr2.A01;
                float f7 = (float) Asr2.A00;
                float f8 = f7;
                float f9 = (float) i2;
                if (mediaSession.B2U().getValue() % 180 == 0) {
                    f7 = f9;
                    f9 = f8;
                }
                f2 = C63471Kxa.A00(userSession2, (Float) null, f7 / f9);
            }
        }
        int i3 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        int i4 = kb52.A0M;
        if (i3 < 0) {
            kb52.A03 = (int) (((float) i4) * f2);
        } else {
            kb52.A03 = i4;
            i4 = (int) (((float) i4) / f2);
        }
        kb52.A02 = i4;
        creationSession.A00 = f2;
        Iterator A0h = JTQ.A0h(list);
        while (A0h.hasNext()) {
            MediaSession A0Z3 = JTO.A0Z(A0h);
            if (A0Z3.Bsu().intValue() != 0) {
                ((VideoSession) A0Z3).A00 = f2;
                AnonymousClass3Q2 A0N2 = JTQ.A0N(A0Z3, kb52.A0X);
                if (A0N2 != null) {
                    A0N2.A02 = f2;
                    A0N2.A1N.A00 = f2;
                    String BbR = A0Z3.BbR();
                    int ordinal = kb52.A0D.ordinal();
                    if (ordinal == 0) {
                        str = "_square";
                    } else if (ordinal != 1) {
                        str = "_ninesixteen";
                    } else {
                        str = "_fourfive";
                    }
                    String A0R2 = 002.A0R(BbR, str);
                    Map map = kb52.A0c;
                    if (map.containsKey(A0R2)) {
                        A022 = DbT.A11(A0R2, map);
                    } else {
                        A022 = kb52.A02(A0N2, kb52.A03, kb52.A02);
                        map.put(A0R2, A022);
                    }
                    A0N2.A33 = A022;
                }
            } else {
                PhotoSession A032 = creationSession.A03(A0Z3.B5g());
                if (A032 != null) {
                    A0F(kb52, r8, A032, true);
                }
            }
        }
        creationSession.A05 = kb52.A0D;
        A0H(kb52, Collections.unmodifiableList(list), true);
        kb52.A0M();
        kb52.A0L();
        kb52.A0U.A0O();
    }

    public static void A0E(KB5 kb5, AnonymousClass514 r5, MediaSession mediaSession, AnonymousClass3Q2 r7) {
        String str;
        int i = kb5.A0M;
        String A022 = kb5.A02(r7, (int) (((float) i) * r5.A00), i);
        String BbR = mediaSession.BbR();
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            str = "_square";
        } else if (ordinal != 1) {
            str = "_ninesixteen";
        } else {
            str = "_fourfive";
        }
        kb5.A0c.put(002.A0R(BbR, str), A022);
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [X.Kof, java.lang.Object] */
    public static void A0F(KB5 kb5, AnonymousClass514 r20, PhotoSession photoSession, boolean z) {
        Rect A002;
        KB5 kb52 = kb5;
        PhotoSession photoSession2 = photoSession;
        C364848m7 Blh = kb52.A0W.Blh(photoSession2.A0B);
        UserSession userSession = kb52.A0P;
        if (2Ht.A03(userSession)) {
            if (!z && Blh.CQu()) {
                CreationSession creationSession = kb52.A0S;
                String str = photoSession2.A0B;
                Map map = creationSession.A0R;
                if (map.get(str) != null) {
                    FilterGroupModel filterGroupModel = photoSession2.A07;
                    filterGroupModel.getClass();
                    SurfaceCropFilter A003 = C395019z4.A00(filterGroupModel, "AlbumRenderViewController_initRenderViews()");
                    if (A003 != null) {
                        SurfaceCropFilterModel.FitTransformParams fitTransformParams = new SurfaceCropFilterModel.FitTransformParams();
                        A003.A0L(fitTransformParams);
                        String str2 = photoSession2.A0B;
                        PointF pointF = new PointF(fitTransformParams.A00, fitTransformParams.A01);
                        float f = fitTransformParams.A02;
                        ? obj = new Object();
                        obj.A01 = pointF;
                        obj.A00 = f;
                        map.put(str2, obj);
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (!z) {
            float f2 = kb52.A0D.A00;
            float f3 = kb52.A0S.A00;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            if (f2 == f3 && Blh.CQu()) {
                return;
            }
        }
        float f4 = kb52.A0D.A00;
        AnonymousClass514 r13 = r20;
        if (r13.A04 || 2Ht.A00) {
            f4 = kb52.A0S.A00;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
        }
        FilterGroupModel filterGroupModel2 = photoSession2.A07;
        filterGroupModel2.getClass();
        C66434MRo mRo = photoSession2.A0D;
        int value = mRo.getValue();
        CropInfo cropInfo = photoSession2.A05;
        if (cropInfo != null) {
            int i = cropInfo.A01;
            int i2 = cropInfo.A00;
            Context context = kb52.A0N;
            AnonymousClass84L A004 = AnonymousClass84K.A00(context, userSession);
            CropInfo cropInfo2 = photoSession2.A05;
            int i3 = cropInfo2.A01;
            int i4 = cropInfo2.A00;
            int value2 = mRo.getValue();
            String str3 = photoSession2.A0B;
            0qQ.A0B(str3, 3);
            A004.A01(str3, C59902JbR.A00, i3, i4, value2);
            Rect A005 = AnonymousClass84K.A00(context, userSession).A00(photoSession2.A0B);
            if (kb52.A0D == AnonymousClass514.ORIGINAL && kb52.A0H) {
                int i5 = photoSession2.A01;
                Float valueOf = Float.valueOf(f4);
                int i6 = i5 % 180;
                float f5 = (float) i2;
                float f6 = f5;
                float f7 = (float) i;
                if (i6 == 0) {
                    f5 = f7;
                    f7 = f6;
                }
                f4 = C63471Kxa.A00(userSession, valueOf, f5 / f7);
            }
            if (A005 == null || r13.A03) {
                A002 = JW0.A00(f4, i, i2, value, false);
            } else {
                A002 = JW0.A03(A005, f4, i, i2, value);
            }
            CropInfo cropInfo3 = photoSession2.A05;
            CropInfo cropInfo4 = new CropInfo(A002, cropInfo3.A01, cropInfo3.A00);
            photoSession2.A05 = cropInfo4;
            Blh.ETK(new CropInfo(A002, cropInfo4.A01, cropInfo4.A00));
            SurfaceCropFilter A006 = C395019z4.A00(filterGroupModel2, "AlbumRenderViewController_initRenderViews()");
            if (A006 != null) {
                A006.A0K(A002, i, i2, value, z);
                CreationSession creationSession2 = kb52.A0S;
                String str4 = photoSession2.A0B;
                Map map2 = creationSession2.A0R;
                C62927Kof kof = (C62927Kof) map2.get(str4);
                if (kof != null) {
                    boolean A022 = 2Ht.A02(userSession);
                    float f8 = kof.A00;
                    PointF pointF2 = kof.A01;
                    if (A022) {
                        A006.A0J(pointF2, f8);
                        return;
                    }
                    synchronized (A006) {
                        SurfaceCropFilterModel surfaceCropFilterModel = A006.A00;
                        SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
                        float f9 = fullTransform.A06;
                        if (f8 != f9) {
                            if (surfaceCropFilterModel.A0D) {
                                fullTransform.A06 = f8;
                            } else {
                                fullTransform.A06 = f9 * f8;
                            }
                        }
                        SurfaceCropFilter.A09(A006, pointF2.x, pointF2.y);
                        SurfaceCropFilter.A08(A006);
                    }
                    String str5 = photoSession2.A0B;
                    if (map2.containsKey(str5)) {
                        map2.remove(str5);
                    }
                }
            }
        }
    }

    public static void A0H(KB5 kb5, List list, boolean z) {
        Object obj;
        PhotoSession A032;
        UserSession userSession = kb5.A0P;
        List list2 = list;
        if (LHq.A00(userSession).booleanValue()) {
            C63610Kzy kzy = new C63610Kzy(kb5);
            C66545MVz mVz = kb5.A0R;
            mVz.CNC(kzy, list2, kb5.A03, kb5.A02, z);
            mVz.EaX(new C63611Kzz(kb5));
            return;
        }
        C66545MVz mVz2 = kb5.A0R;
        mVz2.EDK();
        List list3 = kb5.A0E;
        list3.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession A0Z2 = JTO.A0Z(it);
            Context context = kb5.A0N;
            View inflate = LayoutInflater.from(context).inflate(R.layout.album_preview_view, (ViewGroup) mVz2.Bq9(), false);
            View requireViewById = inflate.requireViewById(R.id.album_filter_view_container);
            requireViewById.getLayoutParams().width = kb5.A03;
            requireViewById.getLayoutParams().height = kb5.A02;
            C63625L0n l0n = kb5.A0V;
            GridLinesView gridLinesView = (GridLinesView) inflate.requireViewById(R.id.straighten_grid_overlay_3);
            int color = context.getResources().getColor(2Yu.A0H(context, R.attr.igds_color_separator_or_stroke_on_media));
            int i = kb5.A03;
            int i2 = kb5.A02;
            0qQ.A0B(gridLinesView, 0);
            gridLinesView.getLayoutParams().width = i;
            gridLinesView.getLayoutParams().height = i2;
            gridLinesView.setInnerStrokeColor(color);
            l0n.A00.put(requireViewById, gridLinesView);
            LY8.A00(requireViewById, 36, kb5, A0Z2);
            mVz2.AAf(inflate);
            AnonymousClass3Q2 A0N2 = JTQ.A0N(A0Z2, kb5.A0X);
            if (A0Z2.Bsu().intValue() == 0) {
                obj = A00(inflate, kb5, A0Z2);
                if (2Ht.A02(userSession) && (A032 = kb5.A0S.A03(A0Z2.B5g())) != null) {
                    A0F(kb5, kb5.A0D, A032, false);
                }
            } else if (A0N2 == null) {
                0kD.A01("AlbumRenderViewController", 002.A0u("pendingMedia is null and path for media type video mediasession, ", A0Z2.B5g(), "pendingMediakey value ", A0Z2.BbR()));
            } else {
                obj = A01(inflate, kb5, A0Z2, A0N2);
            }
            requireViewById.setOnLongClickListener(new LYW(0, inflate, kb5, obj));
            list3.add(obj);
            if (Collections.unmodifiableList(kb5.A0S.A0E).size() > 2 && 182.A06(0Tu.A05, userSession, 36324080315543322L)) {
                View requireViewById2 = inflate.requireViewById(R.id.filter_delete_view);
                requireViewById2.setVisibility(0);
                LYA.A01(requireViewById2, A0Z2, kb5, inflate, 7);
            }
        }
    }

    public static boolean A0J(Bitmap bitmap, View view, KB5 kb5) {
        LPC lpc = C63515KyQ.A00;
        if (lpc.A06() || kb5.A0T.A0Q()) {
            return false;
        }
        Rect A0W2 = AnonymousClass7TE.A0W();
        Point point = new Point();
        view.getGlobalVisibleRect(A0W2, point);
        if (LHq.A01(kb5)) {
            bitmap = 0fO.A00(bitmap, kb5.A03, kb5.A02, false);
        }
        lpc.A04(new C61690KHy(bitmap, view, (float) point.x, (float) point.y));
        return true;
    }

    public final void A0L() {
        UserSession userSession = this.A0P;
        if (LHq.A00(userSession).booleanValue()) {
            A0C(this, this.A0R.Au6());
        } else if (this.A06 != null) {
        } else {
            if (this.A0R.CDb() < 500.0f) {
                int i = this.A01;
                List list = this.A0E;
                FilterGroupModel filterGroupModel = null;
                if (i >= list.size() || !((C66539MVt) list.get(this.A01)).CeS()) {
                    C64905Lk5 lk5 = this.A0B;
                    if (lk5 != null) {
                        C64905Lk5.A01(lk5);
                        this.A0B = null;
                        return;
                    }
                    return;
                }
                C64905Lk5 lk52 = (C64905Lk5) list.get(this.A01);
                C64905Lk5 lk53 = this.A0B;
                if (lk53 == null || !lk53.equals(lk52)) {
                    C64905Lk5 lk54 = this.A0B;
                    if (lk54 != null) {
                        C64905Lk5.A01(lk54);
                    }
                    this.A0B = lk52;
                    FilterGroupModel B5r = ((MediaSession) Collections.unmodifiableList(this.A0S.A0E).get(this.A01)).B5r();
                    if (B5r != null && ((FilterGroupModelImpl) B5r).A04) {
                        filterGroupModel = B5r;
                    }
                    A03(this.A0N, userSession, this, lk52, filterGroupModel);
                } else if (lk52.A02) {
                    lk52.A02 = false;
                    C378369Pn r0 = lk52.A01;
                    if (r0 != null) {
                        r0.A03();
                    }
                    lk52.A03 = true;
                }
            } else {
                C60009JdI jdI = this.A0Q;
                if (!jdI.hasMessages(1)) {
                    jdI.sendEmptyMessageDelayed(1, 100);
                }
            }
        }
    }

    public final void A0N(boolean z, int i) {
        if (this.A0A == null) {
            this.A0A = new L00(this);
        }
        C60477Jm9 jm9 = this.A0L;
        if (jm9 == null) {
            UserSession userSession = this.A0P;
            Context context = this.A0N;
            View findViewById = this.A0O.findViewById(R.id.layout_container_main);
            findViewById.getClass();
            L00 l00 = this.A0A;
            l00.getClass();
            jm9 = new C60477Jm9(context, (ViewGroup) findViewById, userSession, l00);
            this.A0L = jm9;
        }
        List list = this.A0E;
        C64276LYc lYc = this.A0C;
        0qQ.A0B(list, 0);
        ViewGroup viewGroup = jm9.A0C;
        View view = jm9.A0B;
        viewGroup.addView(view);
        view.setAlpha(0.0f);
        DbY.A0G(view).setDuration(200).setListener((Animator.AnimatorListener) null);
        jm9.A07 = z;
        if (z) {
            jm9.A01 = i;
            jm9.A02 = lYc;
            if (lYc != null) {
                RecyclerView recyclerView = jm9.A0E;
                0qQ.A0B(recyclerView, 0);
                lYc.A00.add(recyclerView);
            }
        }
        if (list.size() <= 2) {
            jm9.A0A.setVisibility(8);
        }
        C60423JlG jlG = jm9.A03;
        if (jlG == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        jlG.A00 = new L65(jm9, list);
        jlG.notifyDataSetChanged();
        int size = list.size();
        RecyclerView recyclerView2 = jm9.A0E;
        Resources resources = recyclerView2.getResources();
        int A012 = (resources.getDisplayMetrics().widthPixels / (jlG.A01() + resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material))) / 2;
        if (1 > i || i > size - A012) {
            recyclerView2.A0o(i);
        } else {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            int A013 = jlG.A01();
            C252553pI r1 = recyclerView2.A0D;
            0qQ.A0C(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) r1).A1p(i, (A013 + dimensionPixelSize) * A012);
        }
        KB5 kb5 = jm9.A0G.A00;
        kb5.A0W.BQ1().setVisibility(8);
        kb5.A0R.setVisibility(4);
    }

    public final void AGc() {
        AtomicInteger atomicInteger = this.A0F;
        atomicInteger.getClass();
        if (atomicInteger.decrementAndGet() == 0) {
            this.A0U.A0L();
        }
    }

    public final void AGe() {
        this.A0U.A0M();
    }

    public final void DAX(View view, boolean z) {
        this.A0Y.A0B(this);
        if (this.A0K != null) {
            this.A0K = null;
        }
        FrameLayout frameLayout = this.A08;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            DbT.A1F(this.A0W.BQ1(), R.id.creation_secondary_actions, 0);
        }
        View view2 = this.A06;
        if (view2 != null) {
            view2.setVisibility(0);
            this.A06 = null;
        }
        this.A0Q.removeCallbacksAndMessages((Object) null);
        A0L();
        AnonymousClass514 r0 = this.A0D;
        AnonymousClass514 r1 = AnonymousClass514.ORIGINAL;
        if (r0 == r1 && !this.A0I && !LHq.A01(this)) {
            A0D(this, r1);
        }
        A09(this);
    }

    public final void DAi() {
        View view = this.A0K;
        if (view == null || this.A0Y.A01 != 0.0d) {
            View view2 = this.A06;
            if (!(view2 == null || this.A0J == this.A0R.indexOfChild(view2))) {
                AnonymousClass6SR.A01().A09++;
            }
        } else {
            view.setVisibility(4);
            View view3 = this.A07;
            view3.getClass();
            view3.setScaleX(1.0f);
            this.A07.setScaleY(1.0f);
            View view4 = this.A06;
            view4.getClass();
            A05(view4, this, true);
        }
        this.A0Q.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAj(android.view.View r4, float r5, float r6, boolean r7, boolean r8) {
        /*
            r3 = this;
            r3.A00 = r5
            r3.A0K = r4
            X.2cs r2 = r3.A0Y
            if (r8 == 0) goto L_0x004c
            r0 = 0
            r2.A06 = r0
            r0 = 0
        L_0x000d:
            r2.A06(r0)
            boolean r0 = A0K(r3, r5)
            if (r0 == 0) goto L_0x002c
            X.JdI r2 = r3.A0Q
            r1 = 2
        L_0x0019:
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto L_0x0022
            r2.sendEmptyMessage(r1)
        L_0x0022:
            boolean r0 = X.LHq.A01(r3)
            if (r0 != 0) goto L_0x002b
            A08(r3)
        L_0x002b:
            return
        L_0x002c:
            boolean r0 = X.LHq.A01(r3)
            if (r0 == 0) goto L_0x0049
            X.MVz r0 = r3.A0R
            int r1 = r0.Atv()
        L_0x0038:
            int r0 = r3.A0M
            int r0 = r0 / 2
            float r0 = (float) r0
            float r5 = r5 - r0
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0022
            if (r1 <= 0) goto L_0x0022
            X.JdI r2 = r3.A0Q
            r1 = 3
            goto L_0x0019
        L_0x0049:
            int r1 = r3.A01
            goto L_0x0038
        L_0x004c:
            r0 = 1
            r2.A06 = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KB5.DAj(android.view.View, float, float, boolean, boolean):void");
    }

    public final void DmB(2cs r9) {
        if (r9.A01 == 0.0d) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            FrameLayout frameLayout = this.A08;
            frameLayout.getClass();
            frameLayout.getLocationInWindow(iArr);
            View view = this.A0K;
            view.getClass();
            view.getLocationInWindow(iArr2);
            float measuredWidth = (float) (iArr[0] + (this.A08.getMeasuredWidth() / 2));
            float measuredHeight = (float) (iArr[1] + (this.A08.getMeasuredHeight() / 2));
            float measuredWidth2 = (float) (iArr2[0] + (this.A0K.getMeasuredWidth() / 2));
            float measuredHeight2 = (float) (iArr2[1] + (this.A0K.getMeasuredHeight() / 2));
            View view2 = this.A0K;
            view2.setPivotX(((float) (view2.getMeasuredWidth() / 2)) + (measuredWidth - measuredWidth2));
            View view3 = this.A0K;
            view3.setPivotY(((float) (view3.getMeasuredHeight() / 2)) + (measuredHeight - measuredHeight2));
            AnonymousClass2S0.A01.A05(20);
        }
    }

    public final void DmE(2cs r14) {
        View view = this.A0K;
        if (view != null) {
            C71412ct r3 = r14.A09;
            float A032 = (float) AnonymousClass37Q.A03(r3.A00, 0.5d, 1.0d);
            view.setScaleY(A032);
            view.setScaleX(A032);
            float A033 = (float) AnonymousClass37Q.A03(1.0d - r3.A00, 1.0d, 1.5d);
            View view2 = this.A07;
            view2.getClass();
            view2.setScaleX(A033);
            this.A07.setScaleY(A033);
        }
    }

    public final boolean onBackPressed() {
        C60477Jm9 jm9 = this.A0L;
        if (jm9 != null) {
            return C60477Jm9.A00(jm9, true);
        }
        return false;
    }

    public final void onDestroyView() {
        this.A0R.EDx(this.A0a);
        C64905Lk5 lk5 = this.A0B;
        if (lk5 != null) {
            C64905Lk5.A01(lk5);
            lk5.A02 = false;
            this.A0B = null;
        }
    }

    public final void onPause() {
        C64905Lk5 lk5 = this.A0B;
        if (lk5 != null) {
            lk5.A02();
        }
        FrameLayout frameLayout = this.A08;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.A07 = null;
            this.A08 = null;
        }
        C63515KyQ.A00.A03(this, C61690KHy.class);
    }

    public final void onStop() {
        C60477Jm9 jm9 = this.A0L;
        if (jm9 != null) {
            C60477Jm9.A00(jm9, false);
        }
    }

    private String A02(AnonymousClass3Q2 r6, int i, int i2) {
        File A012 = AnonymousClass457.A01();
        UserSession userSession = this.A0P;
        int A042 = DbS.A04(AnonymousClass7TF.A0H(userSession), userSession, 36609382108567394L);
        if (A042 == 0) {
            A042 = LTE.A00(this.A03);
        }
        C64188LSv.A02(r6, A012, i, i2, A042);
        return A012.getPath();
    }

    public static void A06(KB5 kb5) {
        int width;
        int height;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        CreationSession creationSession = kb5.A0S;
        Iterator A0h = JTQ.A0h(creationSession.A0E);
        while (A0h.hasNext()) {
            MediaSession A0Z2 = JTO.A0Z(A0h);
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            if (A0Z2.Bsu().intValue() != 0) {
                AnonymousClass3Q2 A0N2 = JTQ.A0N(A0Z2, kb5.A0X);
                if (A0N2 != null) {
                    A1C3 = AnonymousClass7TE.A1C();
                    AnonymousClass7TE.A1Y(A1C3, (long) A0N2.A0G);
                    AnonymousClass7TE.A1Y(A1C3, (long) A0N2.A0H);
                    A1C4 = AnonymousClass7TE.A1C();
                    AnonymousClass7TE.A1Y(A1C4, (long) A0N2.A0B);
                    AnonymousClass7TE.A1Y(A1C4, (long) A0N2.A0C);
                }
            } else {
                PhotoSession A022 = creationSession.A02();
                A022.getClass();
                int value = A022.A0D.getValue();
                CropInfo cropInfo = A022.A05;
                if (cropInfo == null) {
                    0kD.A01("AlbumRenderViewController", "Null cropInfo when logging crop button tap.");
                } else {
                    int i = cropInfo.A01;
                    int i2 = cropInfo.A00;
                    Rect rect = cropInfo.A02;
                    int i3 = value % 180;
                    int i4 = i;
                    if (i3 == 0) {
                        i4 = i2;
                    }
                    AnonymousClass7TE.A1Y(A1C3, (long) i4);
                    if (i3 != 0) {
                        i = i2;
                    }
                    AnonymousClass7TE.A1Y(A1C3, (long) i);
                    if (i3 == 0) {
                        width = rect.height();
                    } else {
                        width = rect.width();
                    }
                    AnonymousClass7TE.A1Y(A1C4, (long) width);
                    if (i3 == 0) {
                        height = rect.width();
                    } else {
                        height = rect.height();
                    }
                    AnonymousClass7TE.A1Y(A1C4, (long) height);
                }
            }
            A1C.add(A1C3);
            A1C2.add(A1C4);
        }
        29R A0b2 = JTO.A0b(kb5.A0P);
        1Ln A0N3 = JTO.A0N(A0b2);
        if (DbT.A1Y(A0N3)) {
            JTO.A1V(A0N3);
            AnonymousClass283 A0N4 = JTT.A0N(A0N3, A0b2, "TOGGLE_ASPECT_RATIO");
            A0N3.A0U();
            JTQ.A1A(A0N3);
            A0N3.A0c(A0N4.A0A);
            A0N3.A0S("original_height_width", A1C);
            A0N3.A0S("height_width", A1C2);
            JTS.A1E(A0N3);
        }
    }

    public static void A07(KB5 kb5) {
        if (LHq.A01(kb5)) {
            kb5.A0R.EFE();
            return;
        }
        List list = kb5.A0E;
        int min = Math.min(C51966G9m.A06(list), kb5.A01 + 1);
        for (int max = Math.max(0, kb5.A01 - 1); max <= min; max++) {
            ((C66539MVt) list.get(max)).Cn5();
        }
    }

    public static void A0G(KB5 kb5, Iterator it) {
        if (!it.hasNext() || !((C66539MVt) it.next()).E2V(new C64912LkC(kb5, it))) {
            kb5.A0U.A0L();
        }
    }

    private boolean A0I(int i) {
        int size;
        if (LHq.A01(this)) {
            size = this.A0R.AnH();
        } else {
            size = this.A0E.size();
        }
        if (i < size) {
            return false;
        }
        return true;
    }

    public static boolean A0K(KB5 kb5, float f) {
        int i;
        if (LHq.A01(kb5)) {
            i = kb5.A0R.Atv();
        } else {
            i = kb5.A01;
        }
        if (f + ((float) (kb5.A0M / 2)) <= ((float) kb5.A0R.getWidth()) || kb5.A0I(i)) {
            return false;
        }
        return true;
    }

    public final void A0M() {
        if (!LHq.A01(this)) {
            for (C66539MVt Ee2 : this.A0E) {
                Ee2.Ee2();
            }
        }
        A07(this);
    }

    public final void DAe(View view, float f, float f2) {
        int i;
        if (LHq.A01(this)) {
            i = this.A0R.indexOfChild(view);
        } else {
            i = this.A01;
        }
        this.A0J = i;
        this.A06 = view;
        view.setVisibility(4);
        if (Collections.unmodifiableList(this.A0S.A0E).size() > 2) {
            if (this.A08 == null) {
                FragmentActivity fragmentActivity = this.A0O;
                View findViewById = fragmentActivity.findViewById(R.id.view_drag_overlay);
                findViewById.getClass();
                this.A08 = (FrameLayout) findViewById;
                int height = ((C273524mj) fragmentActivity).BQ1().getHeight();
                this.A08.getLayoutParams().height = height;
                this.A08.getLayoutParams().width = height;
                this.A08.setVisibility(0);
                this.A08.setClipChildren(false);
                LayoutInflater.from(this.A0N).inflate(R.layout.drag_delete_trash_can, this.A08);
                this.A07 = this.A08.findViewById(R.id.album_trash_can);
            }
            FrameLayout frameLayout = this.A08;
            frameLayout.getClass();
            frameLayout.setVisibility(0);
            DbT.A1F(this.A0W.BQ1(), R.id.creation_secondary_actions, 4);
            2cs r0 = this.A0Y;
            r0.A0A(this);
            r0.A02();
        }
        C64905Lk5 lk5 = this.A0B;
        if (lk5 != null) {
            C64905Lk5.A01(lk5);
            this.A0B = null;
        }
    }

    public final void onResume() {
        A0M();
        A0L();
        C63515KyQ.A00.A02(this, C61690KHy.class);
    }

    public KB5(Context context, View view, FragmentActivity fragmentActivity, C273584mp r13, C66545MVz mVz, CreationSession creationSession, C3499582p r16, AlbumEditFragment albumEditFragment, AlbumEditFragment albumEditFragment2, C273514mi r19, C267834cI r20) {
        List list;
        AnonymousClass3Q2 A0N2;
        AnonymousClass514 r5 = AnonymousClass514.SQUARE;
        this.A0D = r5;
        this.A0c = AnonymousClass7TE.A1E();
        this.A0G = false;
        this.A0V = new C63625L0n();
        this.A05 = -1;
        this.A0O = fragmentActivity;
        Bundle A062 = DbU.A06(fragmentActivity);
        A062.getClass();
        UserSession A063 = 09i.A0A.A06(A062);
        this.A0P = A063;
        this.A0N = context;
        0Tu r3 = 0Tu.A05;
        this.A0H = 182.A06(r3, A063, 36325222776845032L);
        this.A0W = r19;
        C267834cI r6 = r20;
        this.A0X = r6;
        this.A0b = r16;
        this.A0S = creationSession;
        this.A0U = albumEditFragment;
        this.A0T = albumEditFragment2;
        this.A0E = AnonymousClass7TE.A1C();
        this.A0Z = r13;
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(A0d);
        this.A0Y = A0J2;
        C60478JmA jmA = new C60478JmA(this);
        this.A0a = jmA;
        this.A0R = mVz;
        mVz.A97(jmA);
        this.A01 = mVz.Atv();
        ViewGroup.LayoutParams BLw = mVz.BLw();
        BLw.height = AnonymousClass0nB.A01(context);
        mVz.Ebw(BLw);
        mVz.EjA(true);
        int i = (int) (((float) 0nA.A0H(context).widthPixels) * 0.8f);
        this.A0M = i;
        float f = creationSession.A00;
        f = f == 0.0f ? 1.0f : f;
        if (f < 1.0f) {
            this.A03 = (int) (((float) i) * f);
        } else {
            this.A03 = i;
            i = (int) (((float) i) / f);
        }
        this.A02 = i;
        AnonymousClass514 r0 = creationSession.A05;
        AnonymousClass514 r1 = r0;
        if (!(r0 == null ? r5 : r0).A04) {
            if (this.A0H) {
                r1 = C63123Krr.A00(f);
            } else {
                r1 = f != 1.0f ? AnonymousClass514.FOUR_BY_FIVE : r1;
            }
            creationSession.A05 = r1;
        }
        this.A0D = r1 == null ? r5 : r1;
        Iterator A0h = JTQ.A0h(creationSession.A0E);
        while (A0h.hasNext()) {
            MediaSession A0Z2 = JTO.A0Z(A0h);
            if (A0Z2.Bsu() == AnonymousClass05K.A01 && (A0N2 = JTQ.A0N(A0Z2, r6)) != null) {
                0nY.A00().ATE(new C61704KIu(this, A0Z2, A0N2));
            }
        }
        if (this.A09 == null) {
            if (C59961JcU.A00(this.A0P)) {
                Iterator A0h2 = JTQ.A0h(this.A0S.A0E);
                while (true) {
                    if (!A0h2.hasNext()) {
                        break;
                    }
                    A6E BsX = JTO.A0Z(A0h2).BsX();
                    if (BsX != null && (list = BsX.A02) != null && list.size() > 0) {
                        break;
                    }
                }
            }
            if (this.A0H) {
                AlbumPostCapCropToggleButton albumPostCapCropToggleButton = (AlbumPostCapCropToggleButton) view.requireViewById(R.id.album_post_capture_crop_toggle_button_v2);
                Context context2 = this.A0N;
                albumPostCapCropToggleButton.setColorFilter(context2.getColor(2Yu.A0E(context2)), PorterDuff.Mode.SRC_IN);
                0nA.A0n(albumPostCapCropToggleButton, view, R.dimen.account_discovery_bottom_gap);
                UserSession userSession = this.A0P;
                MBK mbk = new MBK(this, 2);
                LY1 ly1 = new LY1(this, 57);
                0qQ.A0B(userSession, 0);
                albumPostCapCropToggleButton.A01 = mbk;
                albumPostCapCropToggleButton.setOnClickListener(new ID0(1, (Object) ly1, (Object) userSession, (Object) albumPostCapCropToggleButton));
                this.A09 = albumPostCapCropToggleButton;
                if (this.A0D == AnonymousClass514.ORIGINAL) {
                    boolean A064 = 182.A06(r3, userSession, 36325222777369328L);
                    this.A0I = A064;
                    if (A064) {
                        A0D(this, this.A0D);
                    }
                }
            } else {
                IgSimpleImageView A0T2 = JTP.A0T(view, R.id.album_post_capture_crop_toggle_button);
                Context context3 = this.A0N;
                A0T2.setColorFilter(context3.getColor(2Yu.A0E(context3)), PorterDuff.Mode.SRC_IN);
                0nA.A0n(A0T2, view, R.dimen.account_discovery_bottom_gap);
                LY1.A00(A0T2, 56, this);
                this.A09 = A0T2;
            }
            A09(this);
        }
        A0H(this, Collections.unmodifiableList(this.A0S.A0E), false);
        A0M();
        if (!LHq.A01(this) && this.A0R.AnH() > 0) {
            View AnC = this.A0R.AnC(0);
            AnC.getClass();
            UserSession userSession2 = this.A0P;
            1Av A002 = 1Au.A00(userSession2);
            0s0 r02 = A002.A3N;
            AnonymousClass0YZ[] r62 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(A002, r02, r62, 479) && 182.A06(r3, userSession2, 36324647251357896L)) {
                ViewGroup viewGroup = (ViewGroup) AnC;
                View inflate = LayoutInflater.from(this.A0N).inflate(R.layout.album_preview_nux_view, viewGroup, false);
                inflate.setOnTouchListener(new C64286LYm(inflate, 6));
                viewGroup.addView(inflate);
                1Av A003 = 1Au.A00(userSession2);
                AnonymousClass7TF.A1J(A003, A003.A3N, r62, 479, true);
            }
        }
        if (this.A09 != null) {
            UserSession userSession3 = this.A0P;
            1Av A004 = 1Au.A00(userSession3);
            if (AnonymousClass7TG.A1a(A004, A004.A5R, 1Av.A8a, 330)) {
                return;
            }
            if (this.A0D == AnonymousClass514.ORIGINAL && 182.A06(r3, userSession3, 36325222777041643L)) {
                AnonymousClass7TF.A0D().post(new M26(this));
            } else if (182.A06(r3, userSession3, 36325222777238254L)) {
                this.A09.post(new M27(this));
            }
        }
    }
}
