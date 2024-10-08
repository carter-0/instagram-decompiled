package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class NJS extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final InputFilter A0J;
    public static final InputFilter[] A0K;
    public static final String __redex_internal_original_name = "DirectEditQuickReplyFragment";
    public int A00;
    public int A01;
    public int A02;
    public EditText A03;
    public EditText A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public UserSession A08;
    public C69670Nps A09;
    public C67569Mq3 A0A;
    public Integer A0B = AnonymousClass05K.A01;
    public boolean A0C = true;
    public View A0D;
    public IgdsListCell A0E;
    public boolean A0F;
    public boolean A0G;
    public final TextWatcher A0H = new C71273OhE(this, 13);
    public final C74442Pux A0I = new P0d(this);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        ? obj = new Object();
        int i = 2131959215;
        if (this.A0A != null) {
            i = 2131959216;
        }
        obj.A02 = getString(i);
        obj.A01 = C71401Ok0.A00(this, 19);
        this.A0D = r4.ErM(new C59904JbT(obj));
        DbX.A1A(C71401Ok0.A00(this, 20), DbX.A0M(), r4);
        A02(this);
    }

    static {
        C71272OhD ohD = C71272OhD.A00;
        A0J = ohD;
        A0K = new InputFilter[]{ohD};
    }

    public static final void A01(NJS njs) {
        String str;
        2dZ.A0t.A03(njs.getActivity()).setIsLoading(true);
        EditText editText = njs.A03;
        if (editText == null) {
            str = "messageField";
        } else {
            editText.setEnabled(false);
            EditText editText2 = njs.A04;
            if (editText2 == null) {
                str = "shortcutField";
            } else {
                editText2.setEnabled(false);
                TextView textView = njs.A05;
                if (textView != null) {
                    textView.setEnabled(false);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cb, code lost:
        if (X.Dba.A0c(r4, r3, r2).length() <= 0) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.NJS r10) {
        /*
            android.view.View r5 = r10.A0D
            if (r5 == 0) goto L_0x0085
            java.lang.String r8 = "shortcutTitle"
            r9 = r8
            android.widget.TextView r1 = r10.A07
            if (r1 == 0) goto L_0x003d
            r0 = 2131959208(0x7f131da8, float:1.955505E38)
            r1.setText(r0)
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto L_0x003d
            int r1 = r10.A02
            android.content.Context r0 = r10.requireContext()
            X.DbT.A17(r0, r2, r1)
            java.lang.String r8 = "messageTitle"
            android.widget.TextView r1 = r10.A06
            if (r1 == 0) goto L_0x003d
            r0 = 2131959202(0x7f131da2, float:1.9555038E38)
            r1.setText(r0)
            android.widget.TextView r2 = r10.A06
            if (r2 == 0) goto L_0x003d
            int r1 = r10.A02
            android.content.Context r0 = r10.requireContext()
            X.DbT.A17(r0, r2, r1)
            android.widget.EditText r0 = r10.A04
            if (r0 != 0) goto L_0x0086
            java.lang.String r8 = "shortcutField"
        L_0x003d:
            X.0qQ.A0F(r8)
        L_0x0040:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0045:
            X.Nps r0 = r10.A09
            java.lang.String r9 = "analyticsData"
            if (r0 == 0) goto L_0x00fe
            java.lang.String r3 = r0.A01
            X.0qQ.A07(r3)
            X.Nps r0 = r10.A09
            if (r0 == 0) goto L_0x00fe
            java.lang.String r2 = r0.A02
            X.0qQ.A07(r2)
            int r1 = r10.A01
            java.lang.String r0 = "creation_message_field_max_character_limit_reached"
            X.0xI r2 = X.C3265677h.A01(r10, r0, r3, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "quick_reply_message_field_character_limit"
            r2.A08(r1, r0)
            X.DbU.A1R(r2, r4)
        L_0x006d:
            android.widget.TextView r0 = r10.A06
            if (r0 == 0) goto L_0x003d
            r0.setText(r6)
            android.widget.TextView r2 = r10.A06
            if (r2 == 0) goto L_0x003d
            int r1 = r10.A00
            android.content.Context r0 = r10.requireContext()
            X.DbT.A17(r0, r2, r1)
        L_0x0081:
            r0 = 0
        L_0x0082:
            r5.setEnabled(r0)
        L_0x0085:
            return
        L_0x0086:
            java.lang.String r3 = X.AnonymousClass7TF.A0f(r0)
            int r0 = r3.length()
            r2 = 15
            r7 = 1
            r4 = 0
            if (r0 <= r2) goto L_0x0146
            android.content.res.Resources r3 = X.DbV.A05(r10)
            r1 = 2131959209(0x7f131da9, float:1.9555052E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00a1:
            r0[r4] = r2
            java.lang.String r1 = r3.getString(r1, r0)
        L_0x00a7:
            if (r1 == 0) goto L_0x019c
            android.widget.TextView r0 = r10.A07
            if (r0 == 0) goto L_0x00fe
            r0.setText(r1)
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto L_0x00fe
            int r1 = r10.A00
            android.content.Context r0 = r10.requireContext()
            X.DbT.A17(r0, r2, r1)
            r3 = 1
        L_0x00be:
            android.widget.EditText r0 = r10.A03
            if (r0 == 0) goto L_0x0143
            android.text.Editable r0 = r0.getText()
            r0.toString()
            android.widget.EditText r0 = r10.A03
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            int r1 = X.DbX.A05(r0)
            int r0 = r10.A01
            if (r1 <= r0) goto L_0x0103
            android.content.res.Resources r2 = X.DbV.A05(r10)
            r1 = 2131959203(0x7f131da3, float:1.955504E38)
            int r0 = r10.A01
            java.lang.String r6 = X.JTS.A0i(r2, r0, r1)
            if (r6 == 0) goto L_0x0103
            android.widget.EditText r0 = r10.A03
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            int r1 = X.DbX.A05(r0)
            int r0 = r10.A01
            if (r1 <= r0) goto L_0x006d
            com.instagram.common.session.UserSession r4 = r10.A08
            if (r4 != 0) goto L_0x0045
            java.lang.String r9 = "userSession"
        L_0x00fe:
            X.0qQ.A0F(r9)
            goto L_0x0040
        L_0x0103:
            if (r3 != 0) goto L_0x0081
            boolean r0 = A04(r10)
            if (r0 == 0) goto L_0x0081
            android.widget.EditText r0 = r10.A03
            if (r0 == 0) goto L_0x0143
            java.lang.String r4 = X.AnonymousClass7TF.A0f(r0)
            int r3 = r4.length()
            int r3 = r3 - r7
            r2 = 0
            r1 = 0
        L_0x011a:
            if (r2 > r3) goto L_0x0132
            r0 = r3
            if (r1 != 0) goto L_0x0120
            r0 = r2
        L_0x0120:
            boolean r0 = X.Dbb.A1a(r4, r0)
            if (r1 != 0) goto L_0x012d
            if (r0 != 0) goto L_0x012a
            r1 = 1
            goto L_0x011a
        L_0x012a:
            int r2 = r2 + 1
            goto L_0x011a
        L_0x012d:
            if (r0 == 0) goto L_0x0132
            int r3 = r3 + -1
            goto L_0x011a
        L_0x0132:
            java.lang.String r0 = X.Dba.A0c(r4, r3, r2)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0081
            android.widget.EditText r0 = r10.A04
            if (r0 != 0) goto L_0x019f
            java.lang.String r9 = "shortcutField"
            goto L_0x00fe
        L_0x0143:
            java.lang.String r9 = "messageField"
            goto L_0x00fe
        L_0x0146:
            r1 = 0
        L_0x0147:
            java.lang.String r2 = " !#$%&()*+-./\\:;<=>?@[]^_`{|}~`\"×÷"
            char r0 = r2.charAt(r1)
            java.lang.String r0 = java.lang.Character.toString(r0)
            X.0qQ.A07(r0)
            boolean r0 = X.00l.A0d(r3, r0, r4)
            if (r0 == 0) goto L_0x0165
            android.content.res.Resources r3 = X.DbV.A05(r10)
            r1 = 2131959207(0x7f131da7, float:1.9555048E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            goto L_0x00a1
        L_0x0165:
            int r1 = r1 + 1
            r0 = 34
            if (r1 < r0) goto L_0x0147
            com.instagram.common.session.UserSession r0 = r10.A08
            if (r0 != 0) goto L_0x0173
            java.lang.String r8 = "userSession"
            goto L_0x003d
        L_0x0173:
            X.McN r0 = X.C66778McO.A00(r0)
            X.Mq3 r2 = r0.A02(r3)
            if (r2 == 0) goto L_0x019c
            X.Mq3 r0 = r10.A0A
            if (r0 == 0) goto L_0x018f
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = r2.A00()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x019c
        L_0x018f:
            android.content.res.Resources r1 = X.DbV.A05(r10)
            r0 = 2131959206(0x7f131da6, float:1.9555046E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x00a7
        L_0x019c:
            r3 = 0
            goto L_0x00be
        L_0x019f:
            java.lang.String r4 = X.AnonymousClass7TF.A0f(r0)
            int r3 = r4.length()
            int r3 = r3 - r7
            r2 = 0
            r1 = 0
        L_0x01aa:
            if (r2 > r3) goto L_0x01c2
            r0 = r3
            if (r1 != 0) goto L_0x01b0
            r0 = r2
        L_0x01b0:
            boolean r0 = X.Dbb.A1a(r4, r0)
            if (r1 != 0) goto L_0x01bd
            if (r0 != 0) goto L_0x01ba
            r1 = 1
            goto L_0x01aa
        L_0x01ba:
            int r2 = r2 + 1
            goto L_0x01aa
        L_0x01bd:
            if (r0 == 0) goto L_0x01c2
            int r3 = r3 + -1
            goto L_0x01aa
        L_0x01c2:
            java.lang.String r0 = X.Dba.A0c(r4, r3, r2)
            int r1 = r0.length()
            r0 = 1
            if (r1 > 0) goto L_0x0082
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJS.A02(X.NJS):void");
    }

    public static final void A03(NJS njs, Integer num) {
        String str;
        if (num == AnonymousClass05K.A01 || OPZ.A00(num) != 0) {
            njs.A0B = num;
            int A002 = OPZ.A00(num);
            if (A002 != 0) {
                str = njs.requireContext().getString(A002);
            } else {
                str = "";
            }
            0qQ.A0A(str);
            IgdsListCell igdsListCell = njs.A0E;
            if (igdsListCell != null) {
                int i = 0;
                igdsListCell.A0K(str, false);
                IgdsListCell igdsListCell2 = njs.A0E;
                if (igdsListCell2 != null) {
                    IgTextView subtitleView = igdsListCell2.getSubtitleView();
                    if (str.length() != 0) {
                        i = 8;
                    }
                    subtitleView.setVisibility(i);
                    IgdsListCell igdsListCell3 = njs.A0E;
                    if (igdsListCell3 != null) {
                        igdsListCell3.setTextCellType(C69349Njo.TYPE_CHEVRON);
                        return;
                    }
                }
            }
            0qQ.A0F("assignLabelCell");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final boolean A04(NJS njs) {
        String str;
        EditText editText = njs.A03;
        if (editText == null) {
            str = "messageField";
        } else {
            String A0f = AnonymousClass7TF.A0f(editText);
            int length = A0f.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A1a = Dbb.A1a(A0f, i2);
                if (z) {
                    if (!A1a) {
                        break;
                    }
                    length--;
                } else if (!A1a) {
                    z = true;
                } else {
                    i++;
                }
            }
            String A0c = Dba.A0c(A0f, length, i);
            EditText editText2 = njs.A04;
            if (editText2 == null) {
                str = "shortcutField";
            } else {
                String A0f2 = AnonymousClass7TF.A0f(editText2);
                int length2 = A0f2.length() - 1;
                int i3 = 0;
                boolean z2 = false;
                while (i3 <= length2) {
                    int i4 = length2;
                    if (!z2) {
                        i4 = i3;
                    }
                    boolean A1a2 = Dbb.A1a(A0f2, i4);
                    if (z2) {
                        if (!A1a2) {
                            break;
                        }
                        length2--;
                    } else if (!A1a2) {
                        z2 = true;
                    } else {
                        i3++;
                    }
                }
                String A0c2 = Dba.A0c(A0f2, length2, i3);
                if (A0c.length() == 0 && A0c2.length() == 0) {
                    return false;
                }
                C67569Mq3 mq3 = njs.A0A;
                if (mq3 == null || !A0c.equals(mq3.A02) || !0qQ.A0K(A0c2, mq3.A03) || njs.A0B != mq3.A00) {
                    return true;
                }
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "direct_edit_quick_reply_fragment";
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A08;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        if (!this.A0C || !A04(this)) {
            return false;
        }
        A00(this);
        return true;
    }

    public static final void A00(NJS njs) {
        C358248ab A0U = DbW.A0U(njs);
        A0U.A09(2131975992);
        A0U.A08(2131975991);
        A0U.A0H((DialogInterface.OnClickListener) null, 2131968381);
        Dba.A0t(C71249OgE.A00(njs, 39), A0U, 2131976948);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.Nps, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(702105546);
        NJS.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0U = DbS.A0U(requireArguments);
        this.A08 = A0U;
        if (A0U != null) {
            this.A01 = IgNetworkConsentStorage.MAX_ENTRIES;
            this.A0F = 182.A06(0Tu.A05, A0U, 36329702427738374L);
            this.A02 = 2Yu.A08(requireContext());
            String string = requireArguments.getString("DirectEditQuickReplyFragment.quick_reply_id");
            if (string != null) {
                UserSession userSession = this.A08;
                if (userSession != null) {
                    C67569Mq3 mq3 = (C67569Mq3) C66778McO.A00(userSession).A07.get(string);
                    this.A0A = mq3;
                    if (mq3 == null) {
                        IllegalStateException A0y = AnonymousClass7TE.A0y();
                        AnonymousClass0fD.A09(1051280217, A022);
                        throw A0y;
                    }
                }
            }
            String string2 = requireArguments.getString("source_module");
            String string3 = requireArguments.getString("waterfall_id");
            String string4 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            ? obj = new Object();
            obj.A01 = string2;
            obj.A02 = string3;
            obj.A00 = string4;
            this.A09 = obj;
            UserSession userSession2 = this.A08;
            if (userSession2 != null) {
                C66778McO.A00(userSession2).A00 = this.A0I;
                this.A00 = 2Yu.A03(requireContext());
                AnonymousClass0fD.A09(-1565978910, A022);
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-808930311);
        0qQ.A0B(layoutInflater, 0);
        Bundle requireArguments = requireArguments();
        this.A08 = DbS.A0U(requireArguments);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_edit_quick_reply, viewGroup, false);
        this.A03 = DbU.A0E(inflate, R.id.message);
        this.A04 = DbU.A0E(inflate, R.id.shortcut);
        this.A06 = DbU.A0G(inflate, R.id.message_title);
        this.A07 = DbU.A0G(inflate, R.id.shortcut_title);
        this.A0E = (IgdsListCell) inflate.requireViewById(R.id.assign_label_cell);
        View A0G2 = AnonymousClass7TF.A0G(inflate, R.id.assign_label_separator);
        if (this.A0F) {
            A0G2.setVisibility(0);
            IgdsListCell igdsListCell = this.A0E;
            if (igdsListCell != null) {
                igdsListCell.setVisibility(0);
                IgdsListCell igdsListCell2 = this.A0E;
                if (igdsListCell2 != null) {
                    C71401Ok0.A01(igdsListCell2, 21, this);
                }
            }
            0qQ.A0F("assignLabelCell");
            throw AnonymousClass00P.createAndThrow();
        }
        C67569Mq3 mq3 = this.A0A;
        if (mq3 != null) {
            Context requireContext = requireContext();
            EditText editText = this.A03;
            if (editText != null) {
                editText.setText(mq3.A02);
                EditText editText2 = this.A04;
                if (editText2 != null) {
                    editText2.setText(mq3.A03);
                    TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.delete);
                    this.A05 = A0d;
                    if (A0d != null) {
                        DbT.A18(requireContext, A0d, 2131959211);
                        A0d.setVisibility(0);
                        C71401Ok0.A01(A0d, 22, this);
                    }
                    Integer num = mq3.A00;
                    0qQ.A07(num);
                    A03(this, num);
                }
                0qQ.A0F("shortcutField");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("messageField");
            throw AnonymousClass00P.createAndThrow();
        } else if (requireArguments.containsKey("DirectEditQuickReplyFragment.quick_reply_message")) {
            EditText editText3 = this.A03;
            if (editText3 != null) {
                editText3.setText(requireArguments.getString("DirectEditQuickReplyFragment.quick_reply_message"));
            }
            0qQ.A0F("messageField");
            throw AnonymousClass00P.createAndThrow();
        }
        EditText editText4 = this.A03;
        if (editText4 != null) {
            TextWatcher textWatcher = this.A0H;
            editText4.addTextChangedListener(textWatcher);
            EditText editText5 = this.A04;
            if (editText5 != null) {
                editText5.setFilters(A0K);
                EditText editText6 = this.A04;
                if (editText6 != null) {
                    editText6.addTextChangedListener(textWatcher);
                    IgdsListCell igdsListCell3 = this.A0E;
                    if (igdsListCell3 != null) {
                        igdsListCell3.setTextCellType(C69349Njo.TYPE_CHEVRON);
                        AnonymousClass0fD.A09(145539629, A022);
                        return inflate;
                    }
                    0qQ.A0F("assignLabelCell");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("shortcutField");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("messageField");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-2074793521);
        super.onDestroy();
        UserSession userSession = this.A08;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        C66778McO.A00(userSession).A00 = null;
        AnonymousClass0fD.A09(-43337007, A022);
    }

    public final void onResume() {
        Window window;
        String str;
        int A022 = AnonymousClass0fD.A02(1289135669);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity == null || (window = rootActivity.getWindow()) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-405274865, A022);
            throw A0y;
        }
        window.setSoftInputMode(16);
        if (!this.A0G) {
            IgdsListCell igdsListCell = this.A0E;
            if (igdsListCell == null) {
                str = "assignLabelCell";
            } else if (igdsListCell.getVisibility() != 0) {
                this.A0G = true;
                EditText editText = this.A04;
                str = "shortcutField";
                if (editText != null) {
                    editText.requestFocus();
                    EditText editText2 = this.A04;
                    if (editText2 != null) {
                        0nA.A0Q(editText2);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-526121344, A022);
    }
}
