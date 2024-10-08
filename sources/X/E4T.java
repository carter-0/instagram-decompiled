package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;

public final class E4T extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacAccountRecoveryFragment";
    public Bundle A00;
    public View A01;
    public TextView A02;
    public ProgressButton A03;
    public boolean A04;
    public boolean A05;
    public View A06;
    public final 1P0 A07 = new C47699EDi(this, 18);
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final View.OnLongClickListener A09 = new FPT(this, 0);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131975614);
        DbX.A1A(new FP3((Object) this, 23), DbV.A0K(), r4);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.KHF, X.11X] */
    public static final void A01(E4T e4t) {
        if (Build.VERSION.SDK_INT >= 33 || 1DL.A07(e4t.requireActivity(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            1ES.A03(new KHF(A00(e4t), e4t));
        } else {
            1DL.A04(e4t.requireActivity(), new C50307FXm(e4t, 1), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final boolean onBackPressed() {
        if (this.A04) {
            DbX.A0N(requireActivity(), this.A08).A0G(AnonymousClass000.A00(116), 1);
            return true;
        }
        getParentFragmentManager().A13();
        return true;
    }

    public static final Bitmap A00(E4T e4t) {
        Context context = e4t.getContext();
        if (context != null) {
            View view = e4t.A06;
            if (view != null) {
                view.setBackground(new ColorDrawable(2Yu.A00(context)));
            }
            0qQ.A0F("rootLayout");
            throw AnonymousClass00P.createAndThrow();
        }
        View view2 = e4t.A06;
        if (view2 != null) {
            view2.setDrawingCacheEnabled(true);
            View view3 = e4t.A06;
            if (view3 != null) {
                if (view3.getDrawingCache() != null) {
                    View view4 = e4t.A06;
                    if (view4 != null) {
                        Bitmap drawingCache = view4.getDrawingCache();
                        0fO.A03(drawingCache);
                        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
                        0qQ.A07(createBitmap);
                        View view5 = e4t.A06;
                        if (view5 != null) {
                            view5.setDrawingCacheEnabled(false);
                            View view6 = e4t.A06;
                            if (view6 != null) {
                                view6.setBackground((Drawable) null);
                                return createBitmap;
                            }
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        0qQ.A0F("rootLayout");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-615888595);
        E4T.super.onCreate(bundle);
        this.A04 = requireArguments().getBoolean(Dbq.A05(0, 33, 94));
        this.A05 = requireArguments().getBoolean("arg_should_check_email");
        FCE.A02(AnonymousClass7TE.A0l(this.A08), "recovery_code");
        AnonymousClass0fD.A09(-1523392855, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1336526492);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_account_recovery_fragment_ui_updates_2020, viewGroup, false);
        this.A06 = inflate;
        if (inflate != null) {
            TextView A0G = DbU.A0G(inflate, R.id.backup_codes);
            A0G.setOnLongClickListener(this.A09);
            ArrayList<String> stringArrayList = requireArguments().getStringArrayList("arg_backup_codes");
            if (stringArrayList != null) {
                str = DbT.A0z("\n", stringArrayList, (0sP) null);
            } else {
                str = "";
            }
            A0G.setText(str);
            this.A02 = A0G;
            View view = this.A06;
            if (view != null) {
                FGN.A02(new ESx(this, Dbb.A06(this), 23), new ESx(this, Dbb.A06(this), 22), AnonymousClass7TG.A0R(view, R.id.screenshot_and_get_new), DbU.A0m(this, 2131975620), DbU.A0m(this, 2131975615));
                View view2 = this.A06;
                if (view2 != null) {
                    this.A01 = view2.requireViewById(R.id.row_divider);
                    View view3 = this.A06;
                    if (view3 != null) {
                        ProgressButton A0O = Dba.A0O(view3);
                        FP3.A00(A0O, 24, this);
                        this.A03 = A0O;
                        Dbb.A1N(this);
                        View view4 = this.A06;
                        if (view4 != null) {
                            AnonymousClass0fD.A09(1732003055, A022);
                            return view4;
                        }
                    }
                }
            }
        }
        0qQ.A0F("rootLayout");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1187203826);
        E4T.super.onStart();
        if (this.A04 || this.A05) {
            C48001EQk.A00(getParentFragmentManager(), this, FFP.A01(requireContext(), AnonymousClass7TE.A0l(this.A08)), 2);
        }
        AnonymousClass0fD.A09(293972346, A022);
    }
}
