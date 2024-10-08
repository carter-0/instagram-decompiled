package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class E5N extends AnonymousClass4DH implements G8F, G99, G7N, C227272iw, G9d {
    public static final String __redex_internal_original_name = "DirectVisualMessageCreateGroupFragment";
    public C48140EZi A00;
    public UserSession A01;
    public FZ0 A02;
    public C47574E8m A03;
    public C49916FEq A04;
    public IgdsButton A05;
    public C14221Ts1 A06;
    public String A07 = "";
    public String A08;
    public long A09;
    public EditText A0A;
    public DirectShareTarget A0B;
    public String A0C;
    public String A0D;
    public final ArrayList A0E = AnonymousClass7TE.A1C();
    public final AnonymousClass7g1 A0F = new AnonymousClass7g1();

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final boolean COC() {
        return true;
    }

    public final /* synthetic */ void CxW(View view) {
    }

    public final void D8y(DirectShareTarget directShareTarget) {
    }

    public final boolean Dbo(DirectShareTarget directShareTarget) {
        return false;
    }

    public final /* synthetic */ void Dbs(View view) {
    }

    public final /* synthetic */ void Dbt() {
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final void DeM(C268654dm r1, String str) {
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dhe() {
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final boolean Es2(DirectShareTarget directShareTarget) {
        return false;
    }

    public final String getModuleName() {
        return "direct_story_create_group";
    }

    public final void onFocusChange(View view, boolean z) {
    }

    public static long A00(E5N e5n, Object obj) {
        int indexOf = e5n.A03.A01.indexOf(obj);
        if (indexOf >= 0) {
            return (long) indexOf;
        }
        return -1;
    }

    public static void A01(E5N e5n) {
        String A0f = AnonymousClass7TF.A0f(e5n.A0A);
        if (C48877Eld.A00(e5n.requireContext(), A0f, true, true)) {
            Dba.A0A(e5n).ARJ(false);
            IgdsButton igdsButton = e5n.A05;
            if (igdsButton != null) {
                igdsButton.setEnabled(false);
            }
            ArrayList arrayList = e5n.A0E;
            if (arrayList.size() >= 2) {
                C46445Df7.A01(e5n, true);
                UserSession userSession = e5n.A01;
                String A0s = DbV.A0s();
                String trim = A0f.trim();
                ArrayList A022 = FFJ.A02(arrayList);
                0qQ.A0B(userSession, 0);
                1OC A0D2 = DirectThreadApi.A0D(userSession, A0s, trim, A022);
                A0D2.A00 = new C47371Dwh(e5n.A01, e5n, 3);
                1ES.A03(A0D2);
            }
        }
    }

    private void A03(List list) {
        C46445Df7.A00(this.mView, false);
        C47574E8m e8m = this.A03;
        List list2 = e8m.A01;
        list2.clear();
        list2.addAll(list);
        e8m.A0C();
        this.A04.A02.Dwm(list);
    }

    public final 1OC AMx(String str, String str2) {
        String str3;
        UserSession userSession = this.A01;
        String str4 = this.A07;
        if (TextUtils.isEmpty(str)) {
            str3 = "raven";
        } else {
            str3 = "default_no_interop";
        }
        return C49755F5g.A00(userSession, str4, str3, (String) null, (String) null, 0, 0, 0, 0, false);
    }

    public final boolean CbW(DirectShareTarget directShareTarget) {
        return this.A0E.contains(directShareTarget);
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final boolean Cdh(DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = this.A0B;
        if (directShareTarget2 == null || !directShareTarget2.equals(directShareTarget)) {
            return false;
        }
        return true;
    }

    public final void Dbj(DirectShareTarget directShareTarget) {
        C48136EZe eZe;
        DirectShareTarget directShareTarget2 = directShareTarget;
        int i = 0;
        if (this.A03.A01.indexOf(directShareTarget2) >= 0) {
            i = 6;
        }
        UserSession userSession = this.A01;
        String A002 = C69838Nt2.A00(i);
        String A082 = directShareTarget2.A08();
        long A003 = A00(this, directShareTarget2);
        long A004 = A00(this, directShareTarget2);
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A0C;
        if (!TextUtils.isEmpty(str.trim())) {
            eZe = C48136EZe.CREATE_GROUP_QUERY_STATE;
        } else {
            eZe = C48136EZe.CREATE_GROUP_NULL_STATE;
        }
        C3265677h.A0C(eZe, this, userSession, directShareTarget2, A002, A082, "recipient_bar", str, str2, (String) null, str3, (String) null, (String) null, (String) null, "DIRECT_RESHARE_SHEET", A003, A004);
        ArrayList arrayList = this.A0E;
        arrayList.add(directShareTarget2);
        this.A04.A01(arrayList, true);
        A02(this);
    }

    public final void Dbk(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        int i4;
        long j;
        C48136EZe eZe;
        DirectShareTarget directShareTarget2 = directShareTarget;
        int indexOf = this.A03.A01.indexOf(directShareTarget2);
        if (indexOf >= 0) {
            i4 = 6;
            j = (long) indexOf;
        } else {
            i4 = 0;
            j = -1;
        }
        FZ0 fz0 = this.A02;
        if (fz0 != null) {
            UserSession userSession = this.A01;
            long j2 = this.A09;
            String str = this.A0C;
            if (!TextUtils.isEmpty(this.A07.trim())) {
                eZe = C48136EZe.CREATE_GROUP_QUERY_STATE;
            } else {
                eZe = C48136EZe.CREATE_GROUP_NULL_STATE;
            }
            fz0.A09(eZe, this, userSession, directShareTarget2, str, this.A0D, (String) null, this.A07, (String) null, i4, j, j, j2, false);
        }
    }

    public final boolean Dbl(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        ArrayList arrayList = this.A0E;
        if (!arrayList.contains(directShareTarget)) {
            Context requireContext = requireContext();
            UserSession userSession = this.A01;
            if (arrayList.size() + 1 < 250) {
                Dbj(directShareTarget);
                return true;
            }
            C3265677h.A0M(this, userSession);
            C358248ab A0Y = DbS.A0Y(requireContext);
            UserSession userSession2 = this.A01;
            0Tu r3 = 0Tu.A05;
            boolean A1Y = Dbb.A1Y(r3, userSession2);
            int i4 = 2131959723;
            if (A1Y) {
                i4 = 2131959722;
            }
            A0Y.A09(i4);
            Resources resources = requireContext.getResources();
            boolean A1Y2 = Dbb.A1Y(r3, this.A01);
            int i5 = R.plurals.direct_group_max_size;
            if (A1Y2) {
                i5 = R.plurals.direct_chat_max_size;
            }
            A0Y.A0q(DbV.A0v(resources, 249, i5, 249));
            Dba.A1L(A0Y);
            return false;
        }
        Dbp(directShareTarget);
        return true;
    }

    public final void Dbp(DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        int i = 0;
        if (this.A03.A01.indexOf(directShareTarget2) >= 0) {
            i = 6;
        }
        C3265677h.A0H(this, this.A01, directShareTarget2, C69838Nt2.A00(i), directShareTarget2.A08(), "recipient_bar", (String) null, this.A0C, (String) null, (String) null, (String) null, "DIRECT_RESHARE_SHEET", A00(this, directShareTarget2), A00(this, directShareTarget2));
        ArrayList arrayList = this.A0E;
        arrayList.remove(directShareTarget2);
        this.A04.A01(arrayList, false);
        A02(this);
        Dhx("", false);
    }

    public final void DeW(String str) {
        C46445Df7.A00(this.mView, false);
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r2, String str) {
        C47366Dwc dwc = (C47366Dwc) r2;
        if (this.A07.equals(str)) {
            A03(C46503Dg6.A02(AnonymousClass7TE.A1D(dwc.A05)));
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(AnonymousClass4v0.A00(this.A01));
    }

    public final void searchTextChanged(String str) {
        this.A07 = str;
        AnonymousClass9P5 BiX = this.A0F.BiX(str);
        int intValue = BiX.A01.intValue();
        if (intValue == 0) {
            C46445Df7.A01(this, true);
        } else if (intValue == 1) {
            A03(C46503Dg6.A02(BiX.A06));
        } else if (intValue == 2) {
            A03(C46503Dg6.A02(BiX.A06));
            return;
        } else {
            return;
        }
        this.A06.A06(this.A07);
    }

    public static void A02(E5N e5n) {
        FragmentActivity activity = e5n.getActivity();
        if (activity != null) {
            boolean z = false;
            if (e5n.A0E.size() >= 2) {
                z = true;
            }
            DbT.A0K(activity).ARJ(z);
            IgdsButton igdsButton = e5n.A05;
            if (igdsButton != null) {
                igdsButton.setEnabled(z);
            }
        }
    }

    public final void Dhx(String str, boolean z) {
        String A012 = 0mp.A01(str.toLowerCase());
        A012.getClass();
        searchTextChanged(A012);
    }

    public final void configureActionBar(2da r6) {
        r6.Eom(2131959842);
        boolean z = true;
        r6.Eu5(new FP8(this, 37), true);
        if (!DbY.A1Y(0Tu.A05, this.A01, 36324385258287162L)) {
            ActionButton ErD = r6.ErD(new FP8(this, 38), R.drawable.instagram_check_pano_outline_24);
            if (this.A0E.size() < 2) {
                z = false;
            }
            ErD.setEnabled(z);
            DbT.A1A(DbV.A05(this), ErD, 2131959845);
        }
    }

    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        int A022 = AnonymousClass0fD.A02(-265355883);
        E5N.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0U = DbX.A0U(this);
        this.A01 = A0U;
        Integer num = AnonymousClass05K.A0C;
        AnonymousClass7g1 r10 = this.A0F;
        0qQ.A0B(r10, 0);
        this.A06 = C14225Ts5.A01(A0U, this, (C337247fx) null, this, r10, num, false);
        this.A03 = new C47574E8m(requireContext(), this, this.A01, this);
        this.A08 = AnonymousClass7TF.A0b();
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        synchronized (userSession.A01(C72213Oye.class, new C73907Pli(userSession, 0))) {
        }
        C47574E8m e8m = this.A03;
        e8m.A01.clear();
        e8m.A0C();
        C46445Df7.A00(this.mView, true);
        this.A06.A06(this.A07);
        C49916FEq fEq = this.A04;
        if (fEq != null) {
            fEq.A02.EIM();
        }
        String string = requireArguments.getString("DirectVisualMessageCreateGroupFragment.DIRECT_MODULE");
        if (string != null) {
            this.A02 = C49757F5i.A00(DbS.A0O(string), this.A01);
        }
        this.A09 = requireArguments.getLong("DirectVisualMessageCreateGroupFragment.MEDIA_TYPE_LOGGING_VALUE", -1);
        this.A0D = requireArguments.getString("DirectVisualMessageCreateGroupFragment.SEND_TYPE_LOGGING_VALUE", (String) null);
        this.A0C = requireArguments.getString("DirectVisualMessageCreateGroupFragment.REQUEST_ID_LOGGING_VALUE", (String) null);
        this.A00 = (C48140EZi) requireArguments.getSerializable("bundle_extra_serializable_group_creation_entry_point");
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            if (DbY.A1Y(0Tu.A05, this.A01, 36324385258287162L)) {
                Dbb.A0w(this);
            }
        }
        if (DbY.A1Y(0Tu.A05, this.A01, 36324385258221625L) && (parcelableArrayList = requireArguments.getParcelableArrayList("bundle_extra_parcelable_new_group_selected_recipients")) != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                this.A0E.add(new DirectShareTarget((PendingRecipient) it.next()));
            }
        }
        AnonymousClass0fD.A09(-1499525894, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1853287512);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_expiring_media_create_group_fragment_layout);
        AnonymousClass0fD.A09(143649107, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1474046112);
        super.onDestroy();
        FZ0 fz0 = this.A02;
        if (fz0 != null) {
            fz0.A08();
        }
        AnonymousClass0fD.A09(1677794411, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((AbsListView) view.requireViewById(16908298)).setAdapter(this.A03);
        0nA.A0c(view, AnonymousClass3D4.A00(requireContext()));
        requireContext();
        this.A04 = new C49916FEq((ViewGroup) DbY.A0F(view, R.id.user_search_bar_stub), this.A01, this);
        this.A0A = DbU.A0E(view, R.id.group_name);
        A02(this);
        02m.A0p.markerEnd(145766898, 2);
        ArrayList arrayList = this.A0E;
        boolean z = true;
        if (!arrayList.isEmpty()) {
            if (DbY.A1Y(0Tu.A05, this.A01, 36324385258221625L)) {
                this.A04.A01(arrayList, true);
            }
        }
        ViewStub A0F2 = DbS.A0F(view, R.id.send_to_group_button);
        if (A0F2 != null) {
            if (DbY.A1Y(0Tu.A05, this.A01, 36324385258287162L)) {
                IgdsButton igdsButton = (IgdsButton) A0F2.inflate();
                this.A05 = igdsButton;
                igdsButton.setVisibility(0);
                IgdsButton igdsButton2 = this.A05;
                if (arrayList.size() < 2) {
                    z = false;
                }
                igdsButton2.setEnabled(z);
                AnonymousClass0fU.A00(new FP8(this, 36), this.A05);
            }
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1962186496);
        super.onViewStateRestored(bundle);
        G8J g8j = this.A04.A02;
        if (g8j != null) {
            g8j.DzK();
        }
        AnonymousClass0fD.A09(1304872437, A022);
    }

    public final void Dbr(DirectShareTarget directShareTarget) {
        this.A0B = directShareTarget;
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
