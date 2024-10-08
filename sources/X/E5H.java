package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class E5H extends AnonymousClass4DH implements G9Y {
    public static final String __redex_internal_original_name = "DirectRecipientPickerFragment";
    public int A00 = 0;
    public TextWatcher A01;
    public C48140EZi A02;
    public 2dZ A03;
    public UserSession A04;
    public IgEditText A05;
    public IgTextView A06;
    public IgImageView A07;
    public ChannelCreationSource A08;
    public C50338FYv A09;
    public EEP A0A;
    public AnonymousClass2Ep A0B;
    public 2Dm A0C;
    public IgdsButton A0D;
    public IgdsButton A0E;
    public IgFormField A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Integer A0I;
    public Integer A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N = false;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S = true;
    public boolean A0T;
    public View A0U;
    public View A0V;
    public IgButton A0W;
    public IgLinearLayout A0X;
    public C67089Mi7 A0Y;
    public C46730DkJ A0Z = null;
    public boolean A0a;
    public boolean A0b = false;
    public final AnonymousClass4DS A0c = new FTS(this, 1);

    public static void A08(E5H e5h) {
        e5h.A0B = null;
        if (e5h.A0W != null && e5h.A0R) {
            if (EEP.A00(e5h.A0A) > 1 && !e5h.A0A.A0S()) {
                e5h.A0C.getClass();
                AnonymousClass3U9 B35 = e5h.A0C.B35(FFJ.A01(e5h.A0A.A0N()));
                if (B35 != null && !B35.Ca9()) {
                    e5h.A0B = B35;
                }
            }
            e5h.A05();
        }
        e5h.A0A.A0Q();
        e5h.A0A.A0P();
        EEP eep = e5h.A0A;
        EEP.A08(eep, R.id.direct_ff_group_chat_entry_point, EEP.A0J(eep));
    }

    public static void A0A(E5H e5h, C254783t2 r14, List list, boolean z) {
        E5H e5h2 = e5h;
        C254783t2 r5 = r14;
        e5h.A0Y.getClass();
        DbZ.A1Y(e5h);
        C67089Mi7 mi7 = e5h.A0Y;
        String str = null;
        mi7.A09 = list;
        mi7.A08 = null;
        boolean z2 = z;
        if (r14 == null) {
            r5 = e5h.A01(list, z2);
        }
        if (!z || list.size() != 1 || !((DirectShareTarget) list.get(0)).A0S()) {
            str = A02(e5h, list);
        }
        if (list.size() != 1 || !((DirectShareTarget) list.get(0)).A0Q()) {
            1pE A012 = 1pE.A01(e5h.requireActivity(), e5h, e5h.A04, "inbox_new_message");
            A012.A0B = r5;
            A012.A0q = true;
            A012.A01 = e5h;
            A012.A0v = true;
            A012.A0j = str;
            C50399Fb7.A00(A012, e5h, 5);
            return;
        }
        UserSession userSession = e5h.A04;
        boolean A062 = 182.A06(DbS.A0J(userSession, 0), userSession, 36324831934820747L);
        new AiAgentThreadLauncher(e5h.A04).A0A(e5h.requireActivity(), (C68112N1a) null, e5h2, new C50399Fb7(e5h2, 3), (DirectShareTarget) list.get(0), (C273414mX) null, "inbox_new_message", (String) null, A062, false, false, false);
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(3009);
    }

    public static F0V A00(E5H e5h) {
        String str;
        ChannelCreationSource channelCreationSource = e5h.A08;
        if (channelCreationSource != null) {
            str = channelCreationSource.A00;
        } else {
            str = "";
        }
        EEP eep = e5h.A0A;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = eep.A0N().iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            if (A0f.A0I()) {
                A1C.add(A0f.A0L);
            }
        }
        int size = A1C.size();
        boolean z = true;
        int i = 0;
        Boolean valueOf = Boolean.valueOf(AnonymousClass7TF.A1R(size));
        Boolean bool = e5h.A0H;
        Integer valueOf2 = Integer.valueOf(e5h.A00);
        Integer num = e5h.A0I;
        if (num == null || num.intValue() != 2) {
            z = false;
        }
        Boolean valueOf3 = Boolean.valueOf(z);
        Boolean bool2 = e5h.A0G;
        Integer num2 = e5h.A0J;
        if (num2 != null) {
            i = num2.intValue();
        }
        return new F0V(bool2, valueOf3, bool, valueOf, valueOf2, Integer.valueOf(i), str);
    }

    private C254783t2 A01(List list, boolean z) {
        String C6C;
        AnonymousClass2Ep r1 = this.A0B;
        if (list.size() > 1 && r1 != null && r1.C6C() != null && this.A0R && (C6C = r1.C6C()) != null) {
            return new C254763t0(C6C);
        }
        ArrayList A012 = FFJ.A01(list);
        if (z) {
            List A013 = OXK.A01(A012);
            return new PIO(C254923tH.ACT, MsysThreadSubtype.Standard.A00, A013);
        } else if (list.size() != 1) {
            return new C291175gg(A012);
        } else {
            ((DirectShareTarget) list.get(0)).A01();
            return DbS.A0c((DirectShareTarget) list.get(0));
        }
    }

    private void A05() {
        IgButton igButton;
        int i;
        if (this.A0W != null) {
            int A002 = EEP.A00(this.A0A);
            int i2 = 1;
            if (this.A0O) {
                i2 = 2;
                if (A002 < 2 || ((this.A02 == C48140EZi.THREAD_DETAILS && this.A0B != null) || this.A0b)) {
                    this.A0W.setVisibility(8);
                    return;
                }
            }
            boolean z = false;
            this.A0W.setVisibility(0);
            IgButton igButton2 = this.A0W;
            if (A002 >= i2) {
                z = true;
            }
            igButton2.setEnabled(z);
            if (A002 > 1) {
                DbZ.A1Y(this);
                igButton = this.A0W;
                i = 2131960128;
                if (this.A0B != null) {
                    i = 2131960138;
                }
            } else {
                igButton = this.A0W;
                i = 2131960127;
            }
            igButton.setText(i);
        }
    }

    public static void A06(E5H e5h) {
        e5h.A04.getClass();
        UserSession userSession = e5h.A04;
        ChannelCreationSource channelCreationSource = ChannelCreationSource.OMNIPICKER;
        0qQ.A0B(userSession, 0);
        FC2.A00(userSession, new ChannelCreationFlowExtraArgs((CategorySelectionScreenArgs) null, (String) null, (String) null), channelCreationSource, (EV0) null, false).A00().CfS(e5h.requireActivity());
    }

    public static void A07(E5H e5h) {
        if (!e5h.A0P) {
            e5h.A0L = A02(e5h, e5h.A0A.A0N());
        }
        e5h.requireActivity();
        2dZ r0 = e5h.A03;
        if (r0 == null) {
            r0 = Dba.A0A(e5h);
        }
        r0.A0T();
    }

    public static void A0B(E5H e5h, String str, boolean z) {
        String str2;
        e5h.A09.getClass();
        C50338FYv fYv = e5h.A09;
        F0V A002 = A00(e5h);
        1Ln A003 = C50338FYv.A00(fYv);
        if (DbT.A1Y(A003)) {
            if (z) {
                str2 = "thread_create_successful";
            } else {
                str2 = "thread_create_error";
            }
            C50338FYv.A04(A003, fYv);
            Dba.A1D(A003, str2);
            A003.A0p("create_public_chat_button");
            C50338FYv.A05(A003, fYv, "invite_people");
            A003.A0w(C50338FYv.A03(A002, fYv));
            if (str != null) {
                A003.A0i(AnonymousClass7TE.A10(str));
            }
            A003.Cgf();
        }
    }

    public final C46730DkJ BIm() {
        return this.A0Z;
    }

    public final void Dbv() {
        String str;
        UserSession userSession = this.A04;
        if (userSession != null) {
            DbZ.A1Y(this);
            if (!this.A0O && !this.A0Q) {
                ArrayList A012 = FFJ.A01(this.A0A.A0N());
                C254783t2 A013 = A01(this.A0A.A0N(), false);
                1pE A014 = 1pE.A01(requireActivity(), this, userSession, AnonymousClass000.A00(1282));
                A014.A0B = A013;
                IgLinearLayout igLinearLayout = this.A0X;
                if (A012.size() < 1 || igLinearLayout == null) {
                    IgLinearLayout igLinearLayout2 = this.A0X;
                    if (igLinearLayout2 != null) {
                        igLinearLayout2.setVisibility(8);
                        View view = this.A0U;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                        View view2 = this.A0V;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        this.A0X.removeAllViews();
                    }
                } else {
                    igLinearLayout.setVisibility(0);
                    View view3 = this.A0U;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    View view4 = this.A0V;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                    FragmentActivity requireActivity = requireActivity();
                    C254783t2 A015 = A01(this.A0A.A0N(), false);
                    boolean z = true;
                    if (EEP.A00(this.A0A) > 1 && !this.A0A.A0S()) {
                        this.A0C.getClass();
                        AnonymousClass3U9 B35 = this.A0C.B35(FFJ.A01(this.A0A.A0N()));
                        if (B35 != null && !B35.Ca9()) {
                            z = false;
                        }
                    }
                    A014.A07(requireActivity, this.A0Y, A015, R.id.dynamic_fragment_container, true, z);
                }
            }
        }
        A08(this);
        if (this.A0Q) {
            this.A00 = this.A0A.A0O.size();
            2dZ r0 = this.A03;
            if (r0 == null) {
                r0 = Dba.A0A(this);
            }
            r0.A0X(this.A0c);
        }
        A07(this);
        IgFormField igFormField = this.A0F;
        if (igFormField != null) {
            AnonymousClass2Ep r02 = this.A0B;
            if (r02 != null) {
                if (r02.C6f() == null) {
                    List A0N2 = this.A0A.A0N();
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    for (int i = 0; i < A0N2.size(); i++) {
                        A1A.append(DbT.A0y((DirectShareTarget) A0N2.get(i)));
                        DbY.A1V(A1A, A0N2, i);
                    }
                    str = A1A.toString();
                } else {
                    str = this.A0B.C6f();
                }
                this.A0F.setText(str);
                this.A0F.A0F();
                this.A0N = true;
            } else if (!igFormField.getText().toString().isEmpty() && this.A0N) {
                this.A0F.setText("");
                this.A0N = false;
                IgFormField igFormField2 = this.A0F;
                igFormField2.A0I = false;
                igFormField2.A0H = false;
                W7n w7n = igFormField2.A0E;
                String str2 = "ruleManager";
                if (w7n != null) {
                    w7n.A05 = false;
                    C71662eb r03 = igFormField2.A0D;
                    if (r03 == null) {
                        str2 = "pickerIconViewStub";
                    } else {
                        r03.A03(8);
                        View view5 = igFormField2.A04;
                        if (view5 != null) {
                            view5.setVisibility(8);
                            igFormField2.getMEditText().setEnabled(true);
                            igFormField2.getPrismFormFieldContainer().setEnabled(true);
                            igFormField2.getMEditText().setFocusable(true);
                            DbT.A17(igFormField2.getTopLabel().getContext(), igFormField2.getMEditText(), 2Yu.A07(igFormField2.getContext()));
                            igFormField2.setOnClickListener((View.OnClickListener) null);
                            View view6 = igFormField2.A04;
                            if (view6 != null) {
                                view6.setOnClickListener((View.OnClickListener) null);
                                W7n w7n2 = igFormField2.A0E;
                                if (w7n2 != null) {
                                    W0n.A03(igFormField2, !0qQ.A0K(w7n2.A0A.A01, "valid"), false);
                                    igFormField2.setBackgroundResource(0);
                                    2eS.A04(igFormField2, AnonymousClass05K.A0Y);
                                    return;
                                }
                            }
                        }
                        0qQ.A0F("prismComboPicker");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void Dhg(View view, boolean z) {
        if (z) {
            A03();
        }
    }

    public final boolean onBackPressed() {
        if (this.A0A.A0N() == null || EEP.A00(this.A0A) <= 1 || this.A0T) {
            return this.A0A.A0T();
        }
        C358248ab A0U2 = DbW.A0U(this);
        A0U2.A09(2131960132);
        A0U2.A08(2131960131);
        A0U2.A0K(C50023FJi.A00(this, 39), 2131960130);
        A0U2.A0r(true);
        A0U2.A0s(true);
        A0U2.A05();
        DbT.A1V(A0U2);
        return true;
    }

    public static String A02(E5H e5h, List list) {
        EditText editText;
        DbZ.A1Y(e5h);
        IgFormField igFormField = e5h.A0F;
        if (igFormField != null) {
            editText = igFormField.getMEditText();
        } else {
            editText = e5h.A05;
        }
        if (editText != null) {
            return AnonymousClass7TF.A0f(editText);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        for (int i = 0; i < list.size(); i++) {
            A1A.append(DbT.A0y((DirectShareTarget) list.get(i)));
            DbY.A1V(A1A, list, i);
        }
        return A1A.toString();
    }

    private void A03() {
        IgImageView igImageView;
        if (A0D(this)) {
            AnonymousClass7TH.A0R(this.A0F);
            this.A0S = false;
            A07(this);
            C49916FEq fEq = this.A0A.A0B;
            if (!(fEq == null || (igImageView = fEq.A01) == null)) {
                igImageView.setVisibility(0);
            }
            C49916FEq fEq2 = this.A0A.A0B;
            if (fEq2 != null && (fEq2.A02 instanceof C50422FbV)) {
                if (182.A06(0Tu.A05, fEq2.A04, 36330303723160117L)) {
                    C50422FbV.A00((C50422FbV) fEq2.A02);
                }
            }
            this.A0b = true;
            A05();
        }
    }

    private void A04() {
        if (A0D(this)) {
            AnonymousClass7TF.A16(this.A0F);
            this.A0S = true;
            A07(this);
            C49916FEq fEq = this.A0A.A0B;
            if (fEq != null) {
                AnonymousClass7TH.A0R(fEq.A01);
            }
            C49916FEq fEq2 = this.A0A.A0B;
            if (fEq2 != null && (fEq2.A02 instanceof C50422FbV)) {
                if (182.A06(0Tu.A05, fEq2.A04, 36330303723160117L)) {
                    C50422FbV fbV = (C50422FbV) fEq2.A02;
                    if (fbV.A02.getItemCount() > 0 && fbV.A00.getVisibility() == 8) {
                        C50422FbV.A01(fbV, C51775G1k.A00);
                    }
                }
            }
            C49916FEq fEq3 = this.A0A.A0B;
            if (fEq3 != null) {
                fEq3.A02.AHd();
            }
            C49916FEq fEq4 = this.A0A.A0B;
            if (fEq4 != null) {
                fEq4.A02.CLU();
            }
            this.A0A.A0O();
            this.A0b = false;
            A05();
            C49916FEq fEq5 = this.A0A.A0B;
            if (fEq5 != null) {
                fEq5.A02.AHt();
            }
        }
    }

    public static void A09(E5H e5h, C370538wd r4) {
        DbZ.A1Y(e5h);
        C67089Mi7 mi7 = e5h.A0Y;
        if (mi7 != null) {
            List A0N2 = e5h.A0A.A0N();
            ArrayList A1D = AnonymousClass7TE.A1D(e5h.A0A.A0O);
            mi7.A09 = A0N2;
            mi7.A08 = A1D;
        }
        IgdsButton igdsButton = e5h.A0D;
        if (igdsButton != null) {
            igdsButton.setLoading(false);
        }
        1pE A012 = 1pE.A01(e5h.requireActivity(), e5h, e5h.A04, C273654mx.A00(670));
        DbZ.A1Z(A012, r4.A1D);
        A012.A0q = true;
        A012.A01 = e5h;
        A012.A0v = true;
        A012.A0o = e5h.A0Q;
        String str = e5h.A0K;
        A012.A0O = str;
        A012.A0j = str;
        C50399Fb7.A00(A012, e5h, 6);
    }

    public static void A0C(E5H e5h, List list, boolean z) {
        if (list.size() == 1) {
            C254783t2 A0c2 = DbS.A0c((DirectShareTarget) AnonymousClass7TE.A13(list));
            if (A0c2 instanceof C254763t0) {
                if (e5h.A0a) {
                    DbZ.A1Y(e5h);
                    AnonymousClass7VT.A00(e5h.A04).A02((C254763t0) A0c2, DbT.A14((DirectShareTarget) list.get(0)), new C51589Fwd(e5h, list, 0, z), true);
                    return;
                }
                A0A(e5h, A0c2, list, e5h.A0A.A0S());
                return;
            } else if (!(A0c2 instanceof MsysThreadId) || !e5h.A0a) {
                z = e5h.A0A.A0S();
            } else {
                DbZ.A1Y(e5h);
                AnonymousClass7VT.A00(e5h.A04).A03((MsysThreadId) A0c2, new C51589Fwd(e5h, list, 1, z));
                return;
            }
        }
        A0A(e5h, (C254783t2) null, list, z);
    }

    public static boolean A0D(E5H e5h) {
        DbZ.A1Y(e5h);
        C48140EZi eZi = e5h.A02;
        if (eZi == null || eZi != C48140EZi.OMNIPICKET_CREATE_GROUP_CHAT_ROW) {
            return false;
        }
        if (DbY.A1Y(0Tu.A05, e5h.A04, 36330303723160117L)) {
            return true;
        }
        return false;
    }

    public final void CxV() {
        A04();
    }

    public final void Dbt() {
        A04();
    }

    public final void Dhe() {
        A03();
    }

    public final void E0n() {
        A06(this);
    }

    public final void E0p(String str, String str2) {
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putBoolean(AnonymousClass000.A00(587), true);
        A0a2.putString(AnonymousClass000.A00(104), str);
        A0a2.putString(C66579MXk.A00(759), str2);
        A0a2.putInt(AnonymousClass000.A00(430), 33);
        DbZ.A1Y(this);
        DbS.A0b(requireActivity(), A0a2, this.A04, ModalActivity.class, C273654mx.A00(664)).A0D(this, 8834);
    }

    public final void E0q() {
        A06(this);
    }

    public final void E0v() {
        A06(this);
    }

    public final void E1C(DirectShareTarget directShareTarget) {
        A0C(this, Collections.singletonList(directShareTarget), true);
    }

    public final void E1L(DirectShareTarget directShareTarget) {
        A0C(this, Collections.singletonList(directShareTarget), false);
    }

    public final void E1M(DirectShareTarget directShareTarget) {
        DbZ.A1Y(this);
        1pE A012 = 1pE.A01(requireActivity(), this, this.A04, "inbox_new_message");
        A012.A0B = DbS.A0c(directShareTarget);
        A012.A0q = true;
        A012.A01 = this;
        A012.A0v = true;
        C50399Fb7.A00(A012, this, 4);
    }

    public final AnonymousClass0wW getSession() {
        DbZ.A1Y(this);
        return this.A04;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7319) {
            DbT.A1J(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: X.G9Y} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a1, code lost:
        if (X.182.A06(X.AnonymousClass7TF.A0H(r4), r4, 36320416709091731L) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01db, code lost:
        if (X.182.A06(r2, r4, 36319398801317078L) == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0053, code lost:
        if ("groups_creation_entry_point".equals(r3) != false) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r32) {
        /*
            r31 = this;
            r0 = -1512536275(0xffffffffa5d8872d, float:-3.7561626E-16)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r9 = r31
            r0 = r32
            X.E5H.super.onCreate(r0)
            android.os.Bundle r1 = r9.mArguments
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r9.A0M = r0
            r15 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r9.A0H = r0
            r9.A0G = r0
            r2 = 1
            if (r1 == 0) goto L_0x0204
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r9)
            r9.A04 = r0
            X.2Dm r0 = X.1bJ.A00(r0)
            r9.A0C = r0
            java.lang.String r3 = X.DbS.A0l(r1)
            java.lang.String r0 = "help_center"
            boolean r0 = r0.equals(r3)
            r12 = r0 ^ 1
            r0 = 781(0x30d, float:1.094E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r13 = r1.getBoolean(r0)
            java.lang.String r0 = "direct_is_creating_group_chat"
            boolean r0 = r1.getBoolean(r0, r15)
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "groups_creation_entry_point"
            boolean r3 = r0.equals(r3)
            r0 = 0
            if (r3 == 0) goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            r9.A0O = r0
            java.lang.String r0 = "direct_is_creating_group_chat_from_existing_thread"
            boolean r0 = r1.getBoolean(r0, r15)
            r9.A0P = r0
            r0 = 587(0x24b, float:8.23E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r15)
            r9.A0Q = r0
            java.lang.String r0 = "direct_channel_creation_title"
            java.lang.String r0 = r1.getString(r0)
            r9.A0K = r0
            java.lang.String r0 = "social_channel_creation_source"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = (com.instagram.direct.channels.analytics.ChannelCreationSource) r0
            r9.A08 = r0
            java.lang.String r0 = "direct_channel_creation_should_pin_to_profile"
            boolean r0 = r1.getBoolean(r0, r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0H = r0
            java.lang.String r0 = "direct_channel_creation_duration_type"
            java.lang.Integer r0 = X.DbV.A0o(r1, r0)
            r9.A0J = r0
            r0 = 758(0x2f6, float:1.062E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.Integer r0 = X.DbV.A0o(r1, r0)
            r9.A0I = r0
            java.lang.String r0 = "direct_channel_has_chat_photo"
            boolean r0 = r1.getBoolean(r0, r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0G = r0
            java.lang.String r0 = "direct_group_creation_entrypoint"
            java.io.Serializable r0 = r1.getSerializable(r0)
            X.EZi r0 = (X.C48140EZi) r0
            r9.A02 = r0
            com.instagram.common.session.UserSession r1 = r9.A04
            boolean r0 = r9.A0Q
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.Mi7 r0 = X.C67089Mi7.A00(r1, r0)
            r9.A0Y = r0
        L_0x00c2:
            X.DbZ.A1Y(r9)
            X.Mi7 r0 = r9.A0Y
            r0.getClass()
            boolean r0 = r9.A0Q
            if (r0 == 0) goto L_0x00e4
            com.instagram.common.session.UserSession r0 = r9.A04
            X.FYv r0 = X.C69866NtU.A00(r0)
            r9.A09 = r0
            X.Mi7 r1 = r9.A0Y
            java.lang.String r0 = r1.A07
            if (r0 == 0) goto L_0x00df
            r1.A03()
        L_0x00df:
            X.Mi7 r0 = r9.A0Y
            r0.A04(r2)
        L_0x00e4:
            android.content.Context r1 = r9.requireContext()
            com.instagram.common.session.UserSession r0 = r9.A04
            r0.getClass()
            boolean r0 = X.C267044ar.A01(r1, r0)
            if (r0 == 0) goto L_0x0118
            android.content.Context r0 = r9.requireContext()
            android.content.Context r2 = r0.getApplicationContext()
            android.app.Application r2 = (android.app.Application) r2
            com.instagram.common.session.UserSession r1 = r9.A04
            X.EEz r0 = new X.EEz
            r0.<init>(r2, r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r9)
            java.lang.Class<X.DkJ> r0 = X.C46730DkJ.class
            X.2YL r1 = r1.A00(r0)
            X.DkJ r1 = (X.C46730DkJ) r1
            r9.A0Z = r1
            X.EZn r0 = X.C48145EZn.DIRECT_MESSAGE_OMNIPICKER
            r1.A0E(r0)
        L_0x0118:
            com.instagram.common.session.UserSession r8 = r9.A04
            java.lang.String r1 = r9.A0M
            boolean r14 = r9.A0Q
            boolean r3 = r9.A0O
            X.Mi7 r10 = r9.A0Y
            boolean r0 = r9 instanceof X.C47822EIu
            if (r0 == 0) goto L_0x0186
            X.AnonymousClass7TF.A1H(r8, r1)
            r0 = 6
            X.0qQ.A0B(r10, r0)
            r7 = 0
            X.EEP r6 = new X.EEP
            r11 = r7
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x013e:
            r9.A0A = r6
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x0183
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0146:
            r6.A0G = r0
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L_0x0158
            X.DbZ.A1Y(r9)
            boolean r0 = r9.A0O
            if (r0 != 0) goto L_0x0157
            boolean r0 = r9.A0Q
            if (r0 == 0) goto L_0x0158
        L_0x0157:
            r15 = 1
        L_0x0158:
            r9.A0R = r15
            com.instagram.common.session.UserSession r3 = r9.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342156064350996112(0x20810288002b0690, double:4.059697225785784E-152)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            r9.A0a = r0
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()
            if (r0 == 0) goto L_0x017c
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x017c
            boolean r0 = r9.A0R
            if (r0 == 0) goto L_0x017c
            X.Dbb.A0w(r9)
        L_0x017c:
            r0 = -974552992(0xffffffffc5e98060, float:-7472.047)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        L_0x0183:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0146
        L_0x0186:
            X.DbZ.A1Y(r9)
            if (r3 != 0) goto L_0x0201
            X.DbZ.A1Y(r9)
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x01a3
            com.instagram.common.session.UserSession r4 = r9.A04
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36320416709091731(0x81093a000a2193, double:3.0325160051842545E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0201
        L_0x01a3:
            r26 = 1
        L_0x01a5:
            com.instagram.common.session.UserSession r4 = r9.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314811776305969(0x81042100030b31, double:3.028971423121286E-306)
            boolean r27 = X.DbY.A1Y(r2, r4, r0)
            r21 = 0
            if (r3 != 0) goto L_0x01fe
            X.DbZ.A1Y(r9)
            boolean r0 = r9.A0O
            if (r0 != 0) goto L_0x01fe
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L_0x01fe
            r28 = 1
        L_0x01c3:
            com.instagram.common.session.UserSession r4 = r9.A04
            X.0qQ.A0B(r4, r15)
            java.lang.Integer r1 = X.AnonymousClass9B8.A00(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x01dd
            r0 = 36319398801317078(0x81084d00021cd6, double:3.031872276208778E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r29 = 1
            if (r0 != 0) goto L_0x01df
        L_0x01dd:
            r29 = 0
        L_0x01df:
            boolean r1 = r9.A0P
            X.EZi r0 = r9.A02
            X.EEP r6 = new X.EEP
            r16 = r6
            r17 = r0
            r18 = r8
            r19 = r9
            r20 = r10
            r22 = r12
            r23 = r13
            r24 = r14
            r25 = r3
            r30 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x013e
        L_0x01fe:
            r28 = 0
            goto L_0x01c3
        L_0x0201:
            r26 = 0
            goto L_0x01a5
        L_0x0204:
            r12 = 1
            r13 = 0
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5H.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1825476547);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_direct_recipient_picker);
        AnonymousClass0fD.A09(1844537032, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(117365456);
        super.onDestroy();
        this.A0X = null;
        this.A0U = null;
        this.A0V = null;
        AnonymousClass0fD.A09(-2110606903, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-646870698);
        super.onResume();
        A08(this);
        2dZ r0 = this.A03;
        if (r0 == null) {
            r0 = Dba.A0A(this);
        }
        r0.A0X(this.A0c);
        AnonymousClass0fD.A09(1695927122, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A0A.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.direct_recipients_selected_section);
        if (!(linearLayout == null || this.A04 == null)) {
            linearLayout.setOrientation(0);
            TextView A0d = AnonymousClass7TE.A0d(view, R.id.direct_new_chat_to_field);
            if (A0d != null) {
                A0d.setText(2131959841);
                A0d.setPadding(A0d.getPaddingLeft(), A0d.getPaddingTop(), 0, A0d.getPaddingBottom());
                DbT.A17(requireContext(), A0d, 2Yu.A08(requireContext()));
            }
            View findViewById = view.findViewById(R.id.recipient_picker_add_recipient_button);
            this.A0U = findViewById;
            if (findViewById != null) {
                findViewById.setPadding(findViewById.getPaddingLeft(), this.A0U.getPaddingTop(), 30, this.A0U.getPaddingBottom());
                AnonymousClass0fU.A00(new FPI(this, 57), this.A0U);
                View findViewById2 = view.findViewById(R.id.recipients_scroll_container);
                if (findViewById2 != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
                    layoutParams.weight = 8.0f;
                    findViewById2.setLayoutParams(layoutParams);
                }
            }
        }
        if (A0D(this)) {
            IgFormField igFormField = (IgFormField) view.findViewById(R.id.group_name_form_field);
            this.A0F = igFormField;
            if (igFormField != null) {
                igFormField.setVisibility(0);
                this.A0F.setRuleChecker(new C50495Fch());
                W0n.A02(this.A0F, new C19406WXz(this, 0));
                this.A0F.setImeOptions(6);
            }
        }
        this.A0X = (IgLinearLayout) view.findViewById(R.id.dynamic_fragment_container);
        this.A0V = view.findViewById(R.id.recipients_list);
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            DbZ.A1Y(this);
            if (!this.A0O && !this.A0Q) {
                getActivity().getWindow().setSoftInputMode(48);
            }
        }
        ViewStub A0F2 = DbS.A0F(view, R.id.create_chat_button);
        if (A0F2 != null && this.A0R) {
            IgButton igButton = (IgButton) A0F2.inflate();
            this.A0W = igButton;
            igButton.setVisibility(0);
            IgButton igButton2 = this.A0W;
            C48140EZi eZi = this.A02;
            if (eZi == null) {
                eZi = C48140EZi.OMNIPICKER_BOTTOM_CREATE_CHAT;
            }
            FPE.A01(igButton2, 51, this, eZi);
            A05();
        }
        ViewStub A0D2 = DbU.A0D(view, R.id.create_social_chat_layout);
        if (this.A0Q) {
            View inflate = A0D2.inflate();
            this.A0D = (IgdsButton) inflate.findViewById(R.id.social_channel_chat_cta_button);
            this.A0E = (IgdsButton) inflate.findViewById(R.id.social_channel_chat_secondary_button);
            inflate.setVisibility(0);
            IgdsButton igdsButton = this.A0D;
            if (igdsButton != null) {
                igdsButton.setVisibility(0);
                AnonymousClass0fU.A00(new FPI(this, 55), igdsButton);
            }
            IgdsButton igdsButton2 = this.A0E;
            if (igdsButton2 != null) {
                igdsButton2.setVisibility(0);
                AnonymousClass0fU.A00(new FPI(this, 56), igdsButton2);
            }
        }
        this.A03 = 2dY.A01(new FPI(this, 61), DbU.A0C(view, R.id.direct_recipient_picker_action_bar));
        this.A01 = new FKk(this, 5);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (parcelableArrayList = bundle2.getParcelableArrayList("bundle_extra_parcelable_new_group_selected_recipients")) != null && this.A0O) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                A1C.add(new DirectShareTarget((PendingRecipient) it.next()));
            }
            this.A0A.A0R(A1C);
        }
    }
}
