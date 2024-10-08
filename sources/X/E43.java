package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import java.util.ArrayList;

public final class E43 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectManageFoldersEditFolderFragment";
    public ActionButton A00;
    public C70933OSg A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public ArrayList A06;
    public IgTextView A07;
    public IgFormField A08;
    public String A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final String A0B = C66579MXk.A00(782);

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbW.A1B(r4, 2131959694);
        ActionButton A002 = C59904JbT.A00(FPI.A00(this, 49), r4, new Object());
        this.A00 = A002;
        A002.setEnabled(false);
    }

    public final String getModuleName() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean onBackPressed() {
        ActionButton actionButton = this.A00;
        if (actionButton == null) {
            0qQ.A0F("saveButton");
            throw AnonymousClass00P.createAndThrow();
        } else if (!actionButton.isEnabled()) {
            return false;
        } else {
            C358248ab A0V = DbW.A0V(this);
            A0V.A09(2131959689);
            A0V.A08(2131959686);
            A0V.A0L(C50023FJi.A00(this, 37), 2131959687);
            A0V.A0G((DialogInterface.OnClickListener) null, 2131959688);
            DbT.A1V(A0V);
            return true;
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1792074367);
        E43.super.onCreate(bundle);
        C70933OSg oSg = new C70933OSg(AnonymousClass7TE.A0l(this.A0A));
        this.A01 = oSg;
        String str = this.A05;
        if (str == null) {
            0qQ.A0F("serverMode");
            throw AnonymousClass00P.createAndThrow();
        }
        C70933OSg.A00(oSg, "inbox_folders_edit_screen_impression", AnonymousClass7TF.A0w("server_mode", str));
        AnonymousClass0fD.A09(765333913, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1583027892);
        0qQ.A0B(layoutInflater, 0);
        E43.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.direct_manage_folders_edit_folder_fragment, viewGroup, false);
        boolean z = requireArguments().getBoolean(C66579MXk.A00(1137));
        this.A02 = C320236s2.A01(requireArguments(), "folder_id");
        this.A05 = C320236s2.A01(requireArguments(), "server_mode");
        this.A03 = C320236s2.A01(requireArguments(), AnonymousClass000.A00(1369));
        this.A09 = C320236s2.A01(requireArguments(), C66579MXk.A00(1024));
        Bundle requireArguments = requireArguments();
        String A002 = C66579MXk.A00(1026);
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList(A002);
        C320236s2.A03(requireArguments, stringArrayList, A002);
        this.A06 = stringArrayList;
        if (z) {
            IgdsButton igdsButton = (IgdsButton) AnonymousClass7TF.A0F(inflate, R.id.folder_delete_button);
            igdsButton.setTextColor(DbV.A05(this).getColor(R.color.igds_error_or_destructive));
            FPI.A01(igdsButton, 48, this);
            igdsButton.setVisibility(0);
        }
        IgTextView A0a = DbT.A0a(inflate, R.id.folder_original_name);
        this.A07 = A0a;
        String str = this.A09;
        String str2 = "originalFolderName";
        if (str != null) {
            if (str.length() > 0) {
                if (A0a == null) {
                    str2 = "originalNameTextView";
                } else {
                    A0a.setText(Html.fromHtml(DbV.A0z(this, str, 2131959693)));
                }
            }
            IgFormField A0d = DbT.A0d(inflate, R.id.folder_name_form_field);
            this.A08 = A0d;
            str2 = "folderNameFormField";
            if (A0d != null) {
                String str3 = this.A03;
                if (str3 == null) {
                    str2 = "initialFolderName";
                } else {
                    A0d.setText(str3);
                    IgFormField igFormField = this.A08;
                    if (igFormField != null) {
                        igFormField.setRuleChecker(new C50497Fcj(this, 1));
                        AnonymousClass0fD.A09(1808325968, A022);
                        return inflate;
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
