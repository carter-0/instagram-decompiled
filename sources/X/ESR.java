package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

public final class ESR extends C47518E6c implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BackupCodesFragment";
    public Dialog A00;
    public UserSession A01;
    public EVZ A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public final 1P0 A06 = new C47699EDi(this, 4);

    public final String getModuleName() {
        return "backup_codes";
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        if (!this.A03) {
            return false;
        }
        this.mFragmentManager.A19((String) null, 1);
        this.A03 = false;
        return true;
    }

    public static ArrayList A06(ESR esr) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Bundle bundle = esr.mArguments;
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("backup_codes_key");
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                C50989Fmc.A01(esr.requireContext(), (View.OnClickListener) null, AnonymousClass7TE.A18(it), A1C);
            }
            C50989Fmc.A02(esr.requireContext(), FP1.A00(esr, 70), A1C, 2131953576);
            FGF.A00(esr, A1C, 2131953577);
            C50989Fmc.A02(esr.requireContext(), new FPF(51, (Object) esr, (Object) stringArrayList), A1C, 2131953575);
            C50989Fmc.A02(esr.requireContext(), new FP3((Object) esr, 0), A1C, 2131953581);
            FGF.A00(esr, A1C, 2131953580);
        }
        return A1C;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.KHE, X.11X] */
    public static void A07(ESR esr) {
        Activity parent = esr.getActivity().getParent();
        Activity activity = esr.getActivity();
        if (parent != null) {
            activity = activity.getParent();
        }
        if (Build.VERSION.SDK_INT >= 33 || 1DL.A07(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            esr.A04 = true;
            Dbb.A0u(esr);
            ViewGroup A0F = DbV.A0F(esr);
            Context context = esr.getContext();
            if (context != null) {
                A0F.setBackground(new ColorDrawable(2Yu.A00(context)));
            }
            A0F.setDrawingCacheEnabled(true);
            Bitmap drawingCache = A0F.getDrawingCache();
            0fO.A03(drawingCache);
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
            A0F.setDrawingCacheEnabled(false);
            A0F.setBackground((Drawable) null);
            1ES.A03(new KHE(createBitmap, esr));
            return;
        }
        1DL.A04(activity, new C50307FXm(esr, 0), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public final void configureActionBar(2da r3) {
        DbW.A1B(r3, 2131953578);
        r3.Ett((View.OnClickListener) null, this.A04);
        r3.setIsLoading(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1263254357);
        super.onCreate(bundle);
        this.A01 = DbX.A0U(this);
        AnonymousClass0fD.A09(-1004395708, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EVZ evz;
        int A022 = AnonymousClass0fD.A02(159627732);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            evz = EVZ.ARGUMENT_DEFAULT_FLOW;
        } else {
            evz = EVZ.values()[bundle2.getInt("flow_key")];
        }
        this.A02 = evz;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0fD.A09(-1132496796, A022);
        return onCreateView;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-959580197);
        ESR.super.onPause();
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(-1855505953, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(203759027);
        super.onResume();
        setItems(A06(this));
        if (EVZ.ARGUMENT_TWOFAC_FLOW == this.A02 && !DbT.A1a(DbV.A0d(), AnonymousClass000.A00(622)) && !this.A05) {
            this.A03 = true;
            Dialog dialog = this.A00;
            if (dialog == null) {
                C358248ab A0I = Dba.A0I(this);
                A0I.A09(2131975767);
                A0I.A08(2131975766);
                A0I.A0E(C50020FJf.A00(this, 7));
                A0I.A0C(C50020FJf.A00(this, 6));
                dialog = A0I.A02();
                this.A00 = dialog;
            }
            AnonymousClass0fN.A00(dialog);
        }
        DbZ.A1P(this, 8);
        AnonymousClass0fD.A09(1149290457, A022);
    }
}
