package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.E1b  reason: case insensitive filesystem */
public final class C47409E1b extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CaaLoginOneTapLogOutFragment";
    public C319606qt A00;
    public LinearLayout A01;
    public C319616qu A02;
    public final ArrayList A03 = AnonymousClass7TE.A1C();
    public final ArrayList A04 = AnonymousClass7TE.A1C();
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final ArrayList A06 = AnonymousClass7TE.A1C();
    public final HashMap A07 = AnonymousClass7TE.A1E();
    public final HashMap A08 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final String getModuleName() {
        return C273654mx.A00(589);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        IgdsListCell igdsListCell;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass0eM r1 = this.A09;
        C319606qt A012 = C319606qt.A01(DbT.A0X(r1));
        0qQ.A07(A012);
        0tB A002 = AnonymousClass0BO.A00(DbT.A0X(r1));
        List BO0 = A002.BO0();
        Set keySet = A002.A02.A03.keySet();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("uids", BO0.toString());
        A1E.put("uids_count", String.valueOf(BO0.size()));
        if (this.A02 != null) {
            0lg A0L = AnonymousClass7TF.A0L(r1, 0);
            Integer num = AnonymousClass05K.A01;
            C319616qu.A00(A0L, num, "logout_password_saving_multiaccount_viewed", "logout_spi", "spi", "logout_interaction", (String) null, A1E);
            LinearLayout linearLayout = this.A01;
            if (linearLayout != null) {
                AnonymousClass7TG.A0R(linearLayout, R.id.caa_login_bottom_sheet_text_message).setText(DbV.A05(this).getText(2131954420));
                LinearLayout linearLayout2 = this.A01;
                if (linearLayout2 != null) {
                    AnonymousClass7TG.A0R(linearLayout2, R.id.caa_login_sub_tittle).setText(DbV.A05(this).getText(2131954421));
                    Context requireContext = requireContext();
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : BO0) {
                        if (!keySet.contains(DbS.A0q(next))) {
                            A1C.add(next);
                        }
                    }
                    int i = 0;
                    for (Object next2 : A1C) {
                        int i2 = i + 1;
                        if (i < 0) {
                            0sr.A1T();
                            break;
                        }
                        User user = (User) next2;
                        DbU.A1Y(user.getId(), this.A07, A012.A0K(user.getId()));
                        HashMap hashMap = this.A08;
                        DbU.A1Y(user.getId(), hashMap, A012.A0K(user.getId()));
                        Boolean bool = (Boolean) DbV.A0r(user, hashMap);
                        if (bool != null) {
                            z = bool.booleanValue();
                            if (z) {
                                DbU.A1V(user, this.A03);
                            }
                            DbU.A1V(user, this.A04);
                        } else {
                            z = false;
                            DbU.A1V(user, this.A04);
                        }
                        if (DbV.A0r(user, hashMap) != null) {
                            igdsListCell = new IgdsListCell(requireContext, (AttributeSet) null);
                            igdsListCell.A0I(user.getUsername());
                            igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
                            FdT.A03(igdsListCell, user, this, 2);
                            igdsListCell.setChecked(z);
                        } else {
                            igdsListCell = null;
                        }
                        LinearLayout linearLayout3 = this.A01;
                        if (linearLayout3 != null) {
                            linearLayout3.addView(igdsListCell, i + 2);
                            i = i2;
                        }
                    }
                    ArrayList arrayList = this.A03;
                    if (arrayList.size() > 0) {
                        if (this.A02 != null) {
                            0lg A0X = DbT.A0X(r1);
                            HashMap A1E2 = AnonymousClass7TE.A1E();
                            A1E2.put("uids", arrayList.toString());
                            A1E2.put("uids_count", String.valueOf(arrayList.size()));
                            0qQ.A0B(A0X, 0);
                            C319616qu.A00(A0X, num, "logout_password_saving_multiaccount_existing_opt_in", "logout_spi", "spi", "logout_interaction", (String) null, A1E2);
                        }
                    }
                    ArrayList arrayList2 = this.A04;
                    if (arrayList2.size() <= 0) {
                        return;
                    }
                    if (this.A02 != null) {
                        0lg A0X2 = DbT.A0X(r1);
                        HashMap A1E3 = AnonymousClass7TE.A1E();
                        A1E3.put("uids", arrayList2.toString());
                        A1E3.put("uids_count", String.valueOf(arrayList2.size()));
                        0qQ.A0B(A0X2, 0);
                        C319616qu.A00(A0X2, num, "logout_password_saving_multiaccount_existing_opt_out", "logout_spi", "spi", "logout_interaction", (String) null, A1E3);
                        return;
                    }
                }
            }
            0qQ.A0F("linearLayout");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("caaLoginIgNativeLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.6qu, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1482260208);
        C47409E1b.super.onCreate(bundle);
        this.A00 = C319606qt.A01(DbT.A0X(this.A09));
        this.A02 = new Object();
        AnonymousClass0fD.A09(-1584959526, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-226627745);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.caa_login_one_tap_bottom_sheet, viewGroup, false);
        this.A01 = (LinearLayout) inflate.requireViewById(R.id.container);
        AnonymousClass0fD.A09(-388695454, A022);
        return inflate;
    }
}
