package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;

public final class NJR extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BusinessInboxCustomerDetailsFragment";
    public View A00;
    public IgEditText A01;
    public IgEditText A02;
    public IgEditText A03;
    public IgEditText A04;
    public C67730Mtj A05;
    public Integer A06 = AnonymousClass05K.A0Y;
    public Integer A07;
    public String A08 = "";
    public View A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgTextView A0C;
    public IgTextView A0D;
    public IgTextView A0E;
    public final AnonymousClass0eM A0F = C227642jf.A02(this);
    public final TextWatcher A0G = new C71273OhE(this, 16);
    public final String A0H = "business_inbox_customer_details_fragment";

    public static final void A00(IgEditText igEditText, NJR njr, CharSequence charSequence) {
        Editable text;
        ClipboardManager clipboardManager;
        if (igEditText != null && (text = igEditText.getText()) != null && text.length() != 0) {
            Object systemService = njr.requireContext().getSystemService("clipboard");
            if (systemService instanceof ClipboardManager) {
                clipboardManager = (ClipboardManager) systemService;
            } else {
                clipboardManager = null;
            }
            ClipData newPlainText = ClipData.newPlainText(charSequence, igEditText.getText());
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
            if (Build.VERSION.SDK_INT <= 32) {
                A02(njr, R.drawable.instagram_circle_check_pano_outline_24, 2131959545);
            }
        }
    }

    public final void configureActionBar(2da r6) {
        AnonymousClass3JR r2;
        int i;
        0qQ.A0B(r6, 0);
        r6.Eu4(true);
        r6.setTitle(requireContext().getString(2131959541));
        IgTextView igTextView = this.A0A;
        if (igTextView != null) {
            int intValue = this.A06.intValue();
            if (intValue == 0) {
                A04(this, true);
                DbT.A18(requireContext(), igTextView, 2131959539);
                DbT.A17(requireContext(), igTextView, 2Yu.A07(getContext()));
            } else if (intValue != 1) {
                if (intValue == 2) {
                    DbT.A18(requireContext(), igTextView, 2131959540);
                    DbT.A17(requireContext(), igTextView, 2Yu.A0H(getContext(), R.attr.igds_color_primary_text_disabled));
                    AnonymousClass3JR A0K = DbS.A0K();
                    A0K.A0I = this.A09;
                    r6.AA4(new AnonymousClass3Jb(A0K));
                    r2 = DbX.A0M();
                    i = 57;
                } else if (intValue == 3) {
                    DbT.A18(requireContext(), igTextView, 2131959540);
                    DbT.A17(requireContext(), igTextView, 2Yu.A0D(getContext()));
                    C71395Oju.A00(igTextView, 58, this);
                    AnonymousClass3JR A0K2 = DbS.A0K();
                    A0K2.A0I = this.A09;
                    r6.AA4(new AnonymousClass3Jb(A0K2));
                    r2 = DbX.A0M();
                    i = 59;
                } else if (intValue != 4) {
                    throw AnonymousClass7TE.A1K();
                } else {
                    return;
                }
                DbX.A1A(new C71395Oju(this, i), r2, r6);
                return;
            } else {
                A04(this, true);
                DbT.A18(requireContext(), igTextView, 2131959539);
                DbT.A17(requireContext(), igTextView, 2Yu.A07(getContext()));
                C71395Oju.A00(igTextView, 56, this);
            }
            AnonymousClass3JR A0K3 = DbS.A0K();
            A0K3.A0I = this.A09;
            r6.AA4(new AnonymousClass3Jb(A0K3));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C67730Mtj mtj = this.A05;
        IgTextView igTextView = null;
        if (mtj == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        C318136oS A002 = C318116oQ.A00(mtj);
        C73565Pfm pfm = new C73565Pfm(mtj, (AnonymousClass4D7) null, 21);
        19B r2 = 19B.A00;
        1Eo.A05(r2, pfm, A002);
        this.A00 = view;
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            A0G2.setSoftInputMode(20);
        }
        this.A01 = (IgEditText) view.requireViewById(R.id.business_inbox_customer_details_address);
        this.A0B = DbT.A0a(view, R.id.business_inbox_customer_details_address_title);
        this.A04 = (IgEditText) view.requireViewById(R.id.business_inbox_customer_details_phone);
        this.A0E = DbT.A0a(view, R.id.business_inbox_customer_details_phone_title);
        this.A02 = (IgEditText) view.requireViewById(R.id.business_inbox_customer_details_email);
        this.A0C = DbT.A0a(view, R.id.business_inbox_customer_details_email_title);
        this.A03 = (IgEditText) view.requireViewById(R.id.business_inbox_customer_details_note);
        this.A0D = DbT.A0a(view, R.id.business_inbox_customer_details_note_title);
        View view3 = this.A09;
        if (view3 != null) {
            igTextView = DbT.A0a(view3, R.id.customer_details_action_bar_action_text);
        }
        this.A0A = igTextView;
        07U r7 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass07Z A0I = JTP.A0I(this, r2, new MHF(view2, viewLifecycleOwner, r7, this, (AnonymousClass4D7) null, 28), AnonymousClass07a.A00(viewLifecycleOwner));
        1Eo.A05(r2, new MHI(A0I, r7, this, (AnonymousClass4D7) null, 16), AnonymousClass07a.A00(A0I));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r1 == 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r1 == 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 == 0) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.NJR r4) {
        /*
            com.instagram.common.ui.base.IgTextView r2 = r4.A0B
            r3 = 4
            if (r2 == 0) goto L_0x001a
            com.instagram.common.ui.base.IgEditText r0 = r4.A01
            if (r0 == 0) goto L_0x0016
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0016
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 4
        L_0x0017:
            r2.setVisibility(r0)
        L_0x001a:
            com.instagram.common.ui.base.IgTextView r2 = r4.A0C
            if (r2 == 0) goto L_0x0033
            com.instagram.common.ui.base.IgEditText r0 = r4.A02
            if (r0 == 0) goto L_0x002f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x002f
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0030
        L_0x002f:
            r0 = 4
        L_0x0030:
            r2.setVisibility(r0)
        L_0x0033:
            com.instagram.common.ui.base.IgTextView r2 = r4.A0E
            if (r2 == 0) goto L_0x004c
            com.instagram.common.ui.base.IgEditText r0 = r4.A04
            if (r0 == 0) goto L_0x0048
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0048
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0049
        L_0x0048:
            r0 = 4
        L_0x0049:
            r2.setVisibility(r0)
        L_0x004c:
            com.instagram.common.ui.base.IgTextView r1 = r4.A0D
            if (r1 == 0) goto L_0x0064
            com.instagram.common.ui.base.IgEditText r0 = r4.A03
            if (r0 == 0) goto L_0x0061
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0061
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0061
            r3 = 0
        L_0x0061:
            r1.setVisibility(r3)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJR.A01(X.NJR):void");
    }

    public static final void A02(NJR njr, int i, int i2) {
        1xC r2 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        DbS.A19(njr.requireContext(), A0a, i2);
        A0a.A04 = njr.requireActivity().getDrawable(i);
        A0a.A02();
        A0a.A06();
        DbY.A1K(r2, A0a);
    }

    public static final void A03(NJR njr, String str, String str2, String str3, String str4) {
        IgEditText igEditText = njr.A01;
        if (igEditText != null) {
            if (str == null) {
                str = "";
            }
            igEditText.setText(str);
        }
        IgEditText igEditText2 = njr.A01;
        if (igEditText2 != null) {
            igEditText2.addTextChangedListener(njr.A0G);
        }
        IgEditText igEditText3 = njr.A02;
        if (igEditText3 != null) {
            if (str3 == null) {
                str3 = "";
            }
            igEditText3.setText(str3);
        }
        IgEditText igEditText4 = njr.A02;
        if (igEditText4 != null) {
            igEditText4.addTextChangedListener(njr.A0G);
        }
        IgEditText igEditText5 = njr.A04;
        if (igEditText5 != null) {
            if (str2 == null) {
                str2 = "";
            }
            igEditText5.setText(str2);
        }
        IgEditText igEditText6 = njr.A04;
        if (igEditText6 != null) {
            igEditText6.addTextChangedListener(njr.A0G);
        }
        IgEditText igEditText7 = njr.A03;
        if (igEditText7 != null) {
            if (str4 == null) {
                str4 = "";
            }
            igEditText7.setText(str4);
        }
        IgEditText igEditText8 = njr.A03;
        if (igEditText8 != null) {
            igEditText8.addTextChangedListener(njr.A0G);
        }
        IgEditText igEditText9 = njr.A03;
        if (igEditText9 != null) {
            AnonymousClass0eM r4 = njr.A0F;
            UserSession A0l = AnonymousClass7TE.A0l(r4);
            0qQ.A0B(A0l, 0);
            int A042 = DbS.A04(0Tu.A06, A0l, 36606190947538275L);
            if (A042 <= 0) {
                A042 = 300;
            }
            igEditText9.setFilters(new C71270OhB[]{new C71270OhB(AnonymousClass7TE.A0l(r4), njr.A08, A042)});
        }
    }

    public static final void A04(NJR njr, boolean z) {
        C71395Oju oju;
        IgEditText igEditText;
        IgEditText igEditText2 = njr.A01;
        if (z) {
            if (igEditText2 != null) {
                igEditText2.setFocusable(false);
            }
            IgEditText igEditText3 = njr.A01;
            if (igEditText3 != null) {
                C71395Oju.A00(igEditText3, 60, njr);
            }
            IgEditText igEditText4 = njr.A04;
            if (igEditText4 != null) {
                igEditText4.setFocusable(false);
            }
            IgEditText igEditText5 = njr.A04;
            if (igEditText5 != null) {
                C71395Oju.A00(igEditText5, 61, njr);
            }
            IgEditText igEditText6 = njr.A02;
            if (igEditText6 != null) {
                igEditText6.setFocusable(false);
            }
            IgEditText igEditText7 = njr.A02;
            if (igEditText7 != null) {
                C71395Oju.A00(igEditText7, 62, njr);
            }
            IgEditText igEditText8 = njr.A03;
            if (igEditText8 != null) {
                igEditText8.setFocusable(false);
            }
            igEditText = njr.A03;
            if (igEditText != null) {
                oju = new C71395Oju(njr, 63);
            } else {
                return;
            }
        } else {
            if (igEditText2 != null) {
                igEditText2.setFocusableInTouchMode(true);
            }
            IgEditText igEditText9 = njr.A04;
            if (igEditText9 != null) {
                igEditText9.setFocusableInTouchMode(true);
            }
            IgEditText igEditText10 = njr.A02;
            if (igEditText10 != null) {
                igEditText10.setFocusableInTouchMode(true);
            }
            IgEditText igEditText11 = njr.A03;
            if (igEditText11 != null) {
                igEditText11.setFocusableInTouchMode(true);
            }
            IgEditText igEditText12 = njr.A01;
            oju = null;
            if (igEditText12 != null) {
                igEditText12.setOnClickListener((View.OnClickListener) null);
            }
            IgEditText igEditText13 = njr.A04;
            if (igEditText13 != null) {
                igEditText13.setOnClickListener((View.OnClickListener) null);
            }
            IgEditText igEditText14 = njr.A02;
            if (igEditText14 != null) {
                igEditText14.setOnClickListener((View.OnClickListener) null);
            }
            igEditText = njr.A03;
            if (igEditText == null) {
                return;
            }
        }
        AnonymousClass0fU.A00(oju, igEditText);
    }

    public final UserSession A05() {
        return AnonymousClass7TE.A0l(this.A0F);
    }

    public final String getModuleName() {
        return this.A0H;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0F);
    }

    public final boolean onBackPressed() {
        View view = this.A00;
        if (view == null) {
            return false;
        }
        0nA.A0N(view);
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(724713787);
        0qQ.A0B(layoutInflater, 0);
        NJR.super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A09 = DbU.A08(layoutInflater, R.layout.direct_inbox_user_details_action_bar);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_user_details, false);
        AnonymousClass0fD.A09(-1427063443, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1643520263);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
        this.A0B = null;
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
        this.A09 = null;
        this.A0A = null;
        AnonymousClass0fD.A09(-218753977, A022);
    }
}
