package X;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.K7x  reason: case insensitive filesystem */
public final class C61445K7x extends C273374mT implements 1DN {
    public static final 0bY A0B = new 1Q7("IgSecureUriParser").A00;
    public static final String __redex_internal_original_name = "VideoCropFragment";
    public View A00;
    public ColorFilterAlphaImageView A01;
    public C273554mm A02;
    public IgCaptureVideoPreviewView A03;
    public C339797kB A04;
    public AnonymousClass6ST A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public View A09;
    public ViewGroup A0A;

    public final String getModuleName() {
        return "video_crop";
    }

    private void A02() {
        if (this.A08) {
            AnonymousClass6ST r0 = this.A05;
            if (r0 != null) {
                r0.dismiss();
                this.A05 = null;
            }
            this.A03.A06();
            return;
        }
        AnonymousClass3Q2 A012 = A01(this);
        A012.getClass();
        ClipInfo clipInfo = A012.A1N;
        String str = clipInfo.A0F;
        str.getClass();
        this.A03.setVideoPath(AnonymousClass7TE.A0t(str).getAbsolutePath(), new KIL(this, clipInfo));
    }

    public static C3499682q A00(C61445K7x k7x) {
        C3499682q r0 = ((C267844cJ) k7x.requireContext()).Ajn().A00;
        r0.getClass();
        return r0;
    }

    public static AnonymousClass3Q2 A01(C61445K7x k7x) {
        return 28K.A00(k7x.getSession()).A03(A00(k7x).E2M());
    }

    public final void A03(String str) {
        if (isResumed()) {
            if (str != null && !str.equals("video_invalid_url")) {
                C59796JYp A012 = C59796JYp.A01(str, 0);
                if (ABQ.A01(A012, new AnonymousClass7IH(requireContext()), true, true)) {
                    C3499682q A0k = JTR.A0k(requireContext());
                    AnonymousClass3Q2 A013 = A01(this);
                    A013.getClass();
                    JZ1.A02(getSession(), A0k, A013, A012, JWE.A03(A0k).A00, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                    this.A06 = true;
                }
            }
            if (this.A06) {
                A02();
                return;
            }
            Activity activity = (Activity) requireContext();
            0qQ.A0B(activity, 0);
            C59689JTv.A07(activity.getApplicationContext(), 2131976482);
            activity.finish();
        }
    }

    public final void DWm(Map map) {
        Context requireContext = requireContext();
        if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") != C346927vz.GRANTED) {
            C339797kB r0 = this.A04;
            if (r0 != null) {
                r0.A06(map);
                return;
            }
            Context requireContext2 = requireContext();
            String A0K = 2Yu.A0K(requireContext2);
            ViewGroup viewGroup = this.A0A;
            viewGroup.getClass();
            C339797kB A0O = JTQ.A0O(viewGroup);
            A0O.A06(map);
            A0O.A05(DbW.A0h(requireContext2, A0K, 2131974231));
            A0O.A04(DbW.A0h(requireContext2, A0K, 2131974230));
            A0O.A02(2131974229);
            A0O.A03(LYG.A01(requireContext, this, 23));
            this.A04 = A0O;
        }
    }

    public final void onAttach(Context context) {
        C61445K7x.super.onAttach(context);
        try {
            this.A02 = (C273554mm) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(002.A0R(context.toString(), " must implement NavigationDelegate"));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1236109557);
        C61445K7x.super.onCreate(bundle);
        AnonymousClass0fD.A09(1891887343, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(840702743);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_crop_video);
        this.A0A = DbS.A0E(A0C, R.id.preview_container);
        this.A03 = (IgCaptureVideoPreviewView) A0C.requireViewById(R.id.video_preview_view);
        this.A03.A01 = A00(this);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) A0C.requireViewById(R.id.croptype_toggle_button);
        this.A01 = colorFilterAlphaImageView;
        LYB.A00(colorFilterAlphaImageView, 1, this);
        View requireViewById = A0C.requireViewById(R.id.button_back);
        this.A09 = requireViewById;
        LYB.A00(requireViewById, 2, this);
        this.A09.setBackground(new AnonymousClass37N(requireActivity().getTheme(), AnonymousClass05K.A00));
        this.A00 = A0C.findViewById(R.id.button_next);
        AnonymousClass0fD.A09(108601844, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1053795695);
        super.onDestroyView();
        AnonymousClass6ST r0 = this.A05;
        if (r0 != null) {
            r0.dismiss();
            this.A05 = null;
        }
        this.A09.setOnClickListener((View.OnClickListener) null);
        this.A09 = null;
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
            this.A00 = null;
        }
        this.A06 = false;
        this.A08 = false;
        this.A03 = null;
        this.A0A = null;
        this.A01 = null;
        C339797kB r02 = this.A04;
        if (r02 != null) {
            r02.A00();
            this.A04 = null;
        }
        AnonymousClass0fD.A09(-1606446828, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(-632408795);
        C61445K7x.super.onDetach();
        this.A02 = null;
        AnonymousClass0fD.A09(24269809, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1496241522);
        C61445K7x.super.onPause();
        if (this.A08) {
            this.A03.A04();
        }
        AnonymousClass0fD.A09(-367024741, A022);
    }

    public final void onResume() {
        ContentProviderClient contentProviderClient;
        Cursor cursor;
        String string;
        List list;
        int A022 = AnonymousClass0fD.A02(-284310742);
        super.onResume();
        if (Build.VERSION.SDK_INT >= 33 || 1DL.A07(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            C339797kB r0 = this.A04;
            if (r0 != null) {
                r0.A00();
                this.A04 = null;
            }
            AnonymousClass6ST r1 = new AnonymousClass6ST(requireContext());
            this.A05 = r1;
            DbU.A1L(this, r1, 2131965491);
            AnonymousClass0fN.A00(this.A05);
            if (!this.A06) {
                String str = JWE.A03(A00(this)).A0H;
                0qQ.A07(str);
                Uri A012 = 0cp.A01(A0B, str);
                if (A012 != null) {
                    Context requireContext = requireContext();
                    if (!DocumentsContract.isDocumentUri(requireContext, A012) || !"com.android.providers.media.documents".equals(A012.getAuthority())) {
                        try {
                            contentProviderClient = C61990qh.A00(requireContext, A012);
                            if (contentProviderClient == null) {
                                JZ1.A01(requireContext, A012, C51965G9l.A0v(this));
                            } else {
                                cursor = contentProviderClient.query(A012, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
                            }
                        } catch (SQLiteException | RemoteException | IllegalArgumentException unused) {
                            JZ1.A01(requireContext, A012, C51965G9l.A0v(this));
                        }
                    } else {
                        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        0qQ.A08(uri);
                        contentProviderClient = C61990qh.A00(requireContext, uri);
                        if (contentProviderClient != null) {
                            try {
                                String documentId = DocumentsContract.getDocumentId(A012);
                                if (documentId != null) {
                                    List A0o = DbW.A0o(documentId, ":");
                                    if (!A0o.isEmpty()) {
                                        ListIterator A18 = C51968G9o.A18(A0o);
                                        while (true) {
                                            if (A18.hasPrevious()) {
                                                if (DbX.A06(A18) != 0) {
                                                    list = DbX.A0y(A0o, A18);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    list = 0sn.A00;
                                    cursor = contentProviderClient.query(uri, new String[]{"_data"}, "_id=?", new String[]{DbU.A1b(list, 0)[1]}, (String) null);
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            } catch (RemoteException unused2) {
                            }
                        }
                        A03(A012.getPath());
                    }
                    if (cursor != null) {
                        try {
                            cursor.moveToFirst();
                            int columnIndex = cursor.getColumnIndex("_data");
                            if (columnIndex < 0 || (string = cursor.getString(columnIndex)) == null) {
                                JZ1.A01(requireContext, A012, C51965G9l.A0v(this));
                            } else {
                                A03(string);
                            }
                        } finally {
                            contentProviderClient.release();
                            cursor.close();
                        }
                    }
                    A03(A012.getPath());
                }
            } else {
                A02();
            }
        } else {
            JTP.A11((Activity) requireContext(), this, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        AnonymousClass6SR.A01().A0L = true;
        AnonymousClass0fD.A09(610075994, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (A01(this) == null) {
            C273554mm r0 = this.A02;
            r0.getClass();
            ((MediaCaptureActivity) r0).onBackPressed();
        }
    }
}
