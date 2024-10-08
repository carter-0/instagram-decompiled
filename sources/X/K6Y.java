package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class K6Y extends AnonymousClass4DH implements 1DN, C66511MUp {
    public static final AnonymousClass0vF A0O = JTP.A0W(C61610nw.A00(), "image-preload-executor");
    public static final String __redex_internal_original_name = "CropFragment";
    public int A00;
    public Bitmap A01;
    public RectF A02;
    public Uri A03;
    public ImageView A04;
    public C273564mn A05;
    public CropImageView A06;
    public ExifImageData A07;
    public C339797kB A08;
    public AnonymousClass6ST A09;
    public C364808m2 A0A;
    public boolean A0B;
    public boolean A0C;
    public float[] A0D;
    public Uri A0E;
    public ViewGroup A0F;
    public MediaUploadMetadata A0G = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    public CropInfo A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public final Handler A0L = new Handler();
    public final ArrayList A0M = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0N = C227642jf.A02(this);

    public final /* synthetic */ void DHn(CropImageView cropImageView) {
    }

    public final /* synthetic */ void DHr(CropImageView cropImageView) {
    }

    public final void DWm(Map map) {
        0qQ.A0B(map, 0);
        Context context = getContext();
        JTO.A1Z(context);
        Object obj = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        if (obj != null && obj != C346927vz.GRANTED) {
            C339797kB r0 = this.A08;
            if (r0 != null) {
                r0.A06(map);
                return;
            }
            Context requireContext = requireContext();
            String A0K2 = 2Yu.A0K(requireContext);
            0qQ.A07(A0K2);
            ViewGroup viewGroup = this.A0F;
            if (viewGroup != null) {
                C339797kB A0O2 = JTQ.A0O(viewGroup);
                A0O2.A06(map);
                A0O2.A05(DbW.A0h(requireContext, A0K2, 2131974231));
                A0O2.A04(DbW.A0h(requireContext, A0K2, 2131974230));
                A0O2.A02(2131974229);
                A0O2.A03(LYG.A01(this, context, 39));
                this.A08 = A0O2;
            }
        }
    }

    public final String getModuleName() {
        return "crop";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        K6Y.super.onAttach(context);
        try {
            this.A05 = (C273564mn) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass7TF.A0l(" must implement CropFragmentListener", JTQ.A0d(context)));
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        float[] cropMatrixValues;
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        if (2Y9.A00) {
            CropImageView cropImageView = this.A06;
            if (cropImageView == null) {
                cropMatrixValues = this.A0D;
            } else {
                cropMatrixValues = cropImageView.getCropMatrixValues();
            }
            bundle.putFloatArray("CropFragment.CropMatrix", cropMatrixValues);
        }
    }

    public static final void A00(Uri uri, Uri uri2, K6Y k6y) {
        Location location;
        K6Y k6y2 = k6y;
        ExifImageData exifImageData = k6y2.A07;
        if (exifImageData != null && k6y2.A05 != null) {
            Double d = exifImageData.A01;
            Double d2 = exifImageData.A02;
            String str = null;
            if (d == null || d2 == null) {
                location = null;
            } else {
                location = new Location("photo");
                location.setLatitude(d.doubleValue());
                location.setLongitude(d2.doubleValue());
            }
            int i = k6y2.requireArguments().getInt("mediaSource", 0);
            C273564mn r5 = k6y2.A05;
            if (r5 != null) {
                CropInfo cropInfo = k6y2.A0H;
                int i2 = exifImageData.A00;
                HashMap hashMap = exifImageData.A03;
                MediaUploadMetadata mediaUploadMetadata = k6y2.A0G;
                String str2 = k6y2.A0J;
                if (uri2 != null) {
                    str = uri2.toString();
                }
                r5.DFe(location, uri, mediaUploadMetadata, cropInfo, str2, str, k6y2.A0I, hashMap, i2, i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.JVz, com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public static final void A01(K6Y k6y) {
        C364808m2 r8;
        Bitmap bitmap;
        RectF rectF;
        ExifImageData exifImageData;
        ? r11 = k6y.A06;
        if (r11 != 0 && r11.A04 != null && (r8 = k6y.A0A) != null && (bitmap = k6y.A01) != null && (rectF = k6y.A02) != null && (exifImageData = k6y.A07) != null && !k6y.A0K) {
            r11.A0H();
            int width = r8.getWidth();
            int height = r8.getHeight();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            int i = exifImageData.A00;
            RectF A002 = C59892JbH.A00(rectF, r11, width2, height2, i);
            Rect A052 = JW0.A05(A002);
            Rect A022 = JW0.A02(A052);
            Rect A062 = JW0.A06(A002, width, height, width2, height2);
            if (A052.width() == A052.height() && A062.width() != A062.height()) {
                A062 = JW0.A02(A062);
                A052 = A022;
            }
            if (LIa.A01(A062, A052, i)) {
                k6y.A0H = new CropInfo(A062, r8.getWidth(), r8.getHeight());
                k6y.A0K = true;
                U02 u02 = r11.A01;
                if (u02 != null) {
                    u02.A02();
                    r11.setOnTouchListener((View.OnTouchListener) null);
                    r11.A01 = null;
                }
                r11.A03 = null;
                k6y.A0D = r11.getCropMatrixValues();
                C59953JcJ.A00(AnonymousClass7TE.A0l(k6y.A0N)).A02(k6y.requireContext(), new CropInfo(A022, bitmap.getWidth(), bitmap.getHeight()), exifImageData.A00, false);
                r11.A04 = null;
                if (!k6y.A0B) {
                    CreationSession creationSession = ((JWE) JTR.A0k(k6y.requireContextAs(C267844cJ.class))).A01;
                    creationSession.A03 = bitmap;
                    creationSession.A04 = A052;
                    A00(r8.getUri(), r8.BZF(), k6y);
                    return;
                }
                String string = DbV.A05(k6y).getString(2131969783);
                M7A m7a = new M7A(A022, k6y);
                Handler handler = k6y.A0L;
                0qQ.A0B(handler, 4);
                ProgressDialog show = ProgressDialog.show(k6y.requireActivity(), (CharSequence) null, string, true, false);
                0qQ.A0A(show);
                new Thread(new MAP(show, handler, k6y, m7a)).start();
            }
        }
    }

    public final void DAm(boolean z) {
        AnonymousClass514 r1;
        if (this.A0C || z) {
            r1 = AnonymousClass514.SQUARE;
        } else {
            r1 = AnonymousClass514.FOUR_BY_FIVE;
        }
        ((JWE) JTR.A0k(requireContextAs(C267844cJ.class))).A01.A05 = r1;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1152511855);
        int A023 = AnonymousClass0fD.A02(613538219);
        Bundle bundle2 = bundle;
        K6Y.super.onCreate(bundle2);
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            it.next();
        }
        AnonymousClass0fD.A09(-50062549, A023);
        Bundle requireArguments = requireArguments();
        this.A03 = (Uri) requireArguments.getParcelable("output");
        this.A00 = requireArguments.getInt(AnonymousClass000.A00(217));
        this.A0E = (Uri) requireArguments.getParcelable(AnonymousClass000.A00(2189));
        String string = requireArguments.getString("media_info");
        MediaUploadMetadata A024 = C59778JXx.A02(DbT.A0X(this.A0N), requireArguments.getString("media_info"));
        if (A024 == null) {
            A024 = new MediaUploadMetadata((ImmersiveMediaFields) null, requireArguments.getString(AnonymousClass000.A00(370)), (String) null, (String) null, (String) null, string, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        }
        this.A0G = A024;
        this.A0J = requireArguments.getString(AnonymousClass000.A00(273));
        this.A0I = requireArguments.getString("android.intent.extra.TEXT");
        if (bundle != null && 2Y9.A00) {
            this.A0D = bundle2.getFloatArray("CropFragment.CropMatrix");
        }
        this.A0B = requireArguments().getBoolean(AnonymousClass000.A00(898), false);
        AnonymousClass0fD.A09(1093918010, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1120925585);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_crop, false);
        this.A0F = DbS.A0E(A0D2, R.id.preview_container);
        this.A06 = (CropImageView) A0D2.findViewById(R.id.crop_image_view);
        View A0G2 = AnonymousClass7TF.A0G(A0D2, R.id.button_back);
        LYF.A01(A0G2, 18, this);
        Resources.Theme theme = requireActivity().getTheme();
        0qQ.A07(theme);
        A0G2.setBackground(new AnonymousClass37N(theme, AnonymousClass05K.A00));
        LYF.A01(A0D2.requireViewById(R.id.save), 19, this);
        ImageView A0F2 = DbU.A0F(A0D2, R.id.croptype_toggle_button);
        this.A04 = A0F2;
        if (A0F2 != null) {
            LYF.A01(A0F2, 20, this);
        }
        AnonymousClass0fD.A09(-534905263, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-246818464);
        super.onDestroy();
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            MAP map = (MAP) it.next();
            Runnable runnable = map.A03;
            runnable.run();
            map.A01.removeCallbacks(runnable);
        }
        AnonymousClass0fD.A09(-1380922101, A022);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void onDestroyView() {
        U02 u02;
        C364808m2 r0;
        String AvM;
        int A022 = AnonymousClass0fD.A02(-1346653512);
        super.onDestroyView();
        if (!(this.A0K || (r0 = this.A0A) == null || (AvM = r0.AvM()) == null)) {
            A0O.ATE(new C386539kl(AvM));
        }
        this.A0K = false;
        ? r1 = this.A06;
        if (!(r1 == 0 || (u02 = r1.A01) == null)) {
            u02.A02();
            r1.setOnTouchListener((View.OnTouchListener) null);
            r1.A01 = null;
        }
        CropImageView cropImageView = this.A06;
        if (cropImageView != null) {
            cropImageView.A03 = null;
            cropImageView.A04 = null;
        }
        this.A06 = null;
        AnonymousClass6ST r02 = this.A09;
        if (r02 != null) {
            r02.dismiss();
        }
        this.A09 = null;
        this.A04 = null;
        C339797kB r03 = this.A08;
        if (r03 != null) {
            r03.A00();
        }
        this.A08 = null;
        this.A0F = null;
        AnonymousClass0fD.A09(44313364, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(-1265177340);
        K6Y.super.onDetach();
        this.A05 = null;
        AnonymousClass0fD.A09(-250967382, A022);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.K6Y, androidx.fragment.app.Fragment, X.1DN, X.4DH] */
    public final void onResume() {
        int i;
        int A022 = AnonymousClass0fD.A02(-1436633426);
        super.onResume();
        DbV.A0G(this).addFlags(1024);
        if (Build.VERSION.SDK_INT >= 33 || 1DL.A07(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            C339797kB r0 = this.A08;
            if (r0 != null) {
                r0.A00();
            }
            this.A08 = null;
            Uri uri = this.A0E;
            if (uri == null) {
                i = -1766371573;
                AnonymousClass0fD.A09(i, A022);
            }
            AnonymousClass07i.A00(this).A04(new C64327La2(uri, this), C228922mY.A00.getAndIncrement());
            if (this.A01 == null) {
                AnonymousClass6ST A0h = DbV.A0h(requireContext());
                this.A09 = A0h;
                DbU.A1L(this, A0h, 2131965491);
                AnonymousClass6ST r02 = this.A09;
                if (r02 != null) {
                    AnonymousClass0fN.A00(r02);
                }
            }
        } else {
            JTP.A11(requireActivity(), this, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!this.A0B) {
            AnonymousClass6SR.A01().A0L = true;
        }
        i = -1543652971;
        AnonymousClass0fD.A09(i, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1891831366);
        K6Y.super.onStart();
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            AnonymousClass0fN.A00(((MAP) it.next()).A00);
        }
        AnonymousClass0fD.A09(1756143558, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1645539146);
        K6Y.super.onStop();
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            ((MAP) it.next()).A00.hide();
        }
        AnonymousClass0fD.A09(576256733, A022);
    }
}
