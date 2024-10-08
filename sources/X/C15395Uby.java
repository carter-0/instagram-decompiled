package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Uby  reason: case insensitive filesystem */
public final class C15395Uby extends AnonymousClass32G implements C20985X8b, AnonymousClass4DS, AnonymousClass8Z4, G6V, G9d {
    public static final C18181Vmv A0B = new Object();
    public static final String __redex_internal_original_name = "BlockCommentersSettingFragment";
    public C15459UdA A00;
    public VT7 A01;
    public SearchEditText A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C14221Ts1 A07;
    public C337287g2 A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final String A0A = "block_commenters";

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final 1OC AMx(String str, String str2) {
        String str3 = str;
        0qQ.A0B(str, 0);
        C337287g2 r0 = this.A08;
        if (r0 == null) {
            0qQ.A0F("cache");
            throw AnonymousClass00P.createAndThrow();
        }
        return FFZ.A03(AnonymousClass7TE.A0l(this.A09), new C47165Drg(str3, AnonymousClass000.A00(2899), (String) null, r0.BiX(str).A04, (String) null, (String) null, 30, false, false, false));
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final void DeM(C268654dm r4, String str) {
        0qQ.A0B(str, 0);
        String str2 = this.A03;
        if (str.equals(str2)) {
            this.A06 = false;
            this.A04 = true;
            A01(str2, false);
        }
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final void Dhj() {
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final void DwY() {
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        C19881WhA whA;
        CharSequence charSequence2 = charSequence;
        0qQ.A0B(charSequence2, 1);
        String A012 = 0mp.A01(charSequence2);
        if (!0qQ.A0K(A012, this.A03)) {
            this.A03 = A012;
            this.A05 = true;
            this.A06 = true;
            if (A012 != null) {
                C15459UdA udA = this.A00;
                String str = "adapter";
                if (udA != null) {
                    udA.A01 = false;
                    boolean isEmpty = TextUtils.isEmpty(A012);
                    udA.A00 = isEmpty;
                    if (isEmpty) {
                        whA = udA.A05;
                        whA.A00.clear();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        List A002 = C14491TxD.A00(udA.A04, udA.A0A, A012);
                        C14492TxE.A00(A002, 3);
                        arrayList.addAll(A002);
                        C337287g2 r8 = udA.A07;
                        List list = r8.BiX(A012).A06;
                        List<Object> list2 = list;
                        if (list == null) {
                            C19881WhA whA2 = udA.A05;
                            ArrayList A0q = AnonymousClass7TF.A0q(whA2, 0);
                            Iterator it = whA2.iterator();
                            while (it.hasNext()) {
                                C66632Ma1 ma1 = (C66632Ma1) it.next();
                                String username = ma1.A06().getUsername();
                                String fullName = ma1.A06().getFullName();
                                if (DbT.A12(AnonymousClass1Q2.A02(), username).startsWith(DbT.A12(AnonymousClass1Q2.A02(), A012)) || (fullName != null && DbT.A12(AnonymousClass1Q2.A02(), fullName).startsWith(DbT.A12(AnonymousClass1Q2.A02(), A012)))) {
                                    A0q.add(ma1);
                                }
                            }
                            r8.A9z(A012, (String) null, A0q);
                            list2 = A0q;
                        }
                        C14492TxE.A00(list2, 3);
                        for (Object A1S : list2) {
                            JTR.A1S(A1S, arrayList);
                        }
                        whA = udA.A05;
                        List list3 = whA.A00;
                        list3.clear();
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                0qQ.A0B(next, 0);
                                list3.add(next);
                            }
                        }
                    }
                    if (udA.A00) {
                        udA.A01 = true;
                    } else {
                        AnonymousClass9P5 BiX = udA.A06.BiX(A012);
                        List list4 = BiX.A06;
                        if (list4 != null) {
                            int intValue = BiX.A01.intValue();
                            if (intValue == 2) {
                                udA.A01 = true;
                                whA.A00(list4);
                                udA.A0C();
                            } else if (intValue == 1) {
                                whA.A00(list4);
                            }
                        }
                    }
                    udA.A0C();
                    if (udA.A01) {
                        C15459UdA udA2 = this.A00;
                        if (udA2 != null) {
                            udA2.A02 = false;
                            udA2.A0C();
                            return;
                        }
                    } else {
                        C14221Ts1 ts1 = this.A07;
                        if (ts1 == null) {
                            str = "queuedTypeaheadManager";
                        } else {
                            ts1.A06(A012);
                            A01(this.A03, true);
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Drawable[] compoundDrawablesRelative;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (SearchEditText) view.requireViewById(R.id.block_commenter_search_edit_text);
        ColorFilter A062 = DbV.A06(requireContext(), R.color.baseline_neutral_80);
        SearchEditText searchEditText = this.A02;
        if (searchEditText != null) {
            searchEditText.setClearButtonColorFilter(A062);
        }
        SearchEditText searchEditText2 = this.A02;
        if (!(searchEditText2 == null || (compoundDrawablesRelative = searchEditText2.getCompoundDrawablesRelative()) == null)) {
            C13989Tnp.A11(A062, compoundDrawablesRelative[0]);
        }
        SearchEditText searchEditText3 = this.A02;
        if (searchEditText3 != null) {
            searchEditText3.A0C = this;
        }
        C15459UdA udA = this.A00;
        if (udA != null) {
            A0V(udA);
            0S7.A00(this);
            this.A04.setOnScrollListener(new C14431TwF(this));
            C15459UdA udA2 = this.A00;
            if (udA2 != null) {
                udA2.A0C();
                return;
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01(CharSequence charSequence, boolean z) {
        int color;
        String string;
        if (this.A04) {
            color = DbU.A01(requireContext());
            string = AnonymousClass7TF.A0e(DbV.A05(this), charSequence, 2131972817);
        } else {
            color = requireContext().getColor(R.color.grey_5);
            string = requireContext().getString(2131972868);
        }
        C15459UdA udA = this.A00;
        if (udA == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        udA.A02 = true;
        udA.A09.A00 = z;
        TwD twD = udA.A08;
        twD.A01 = string;
        twD.A00 = color;
        udA.A0C();
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A09);
    }

    public final void CLU() {
        SearchEditText searchEditText = this.A02;
        if (searchEditText != null) {
            searchEditText.A04();
        }
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void CgR() {
        String str;
        int length;
        if (this.A06 && !this.A04) {
            C14221Ts1 ts1 = this.A07;
            if (ts1 != null) {
                if (!ts1.A04() && (str = this.A03) != null && (length = str.length()) != 0 && length > 1) {
                    this.A05 = false;
                    C14221Ts1 ts12 = this.A07;
                    if (ts12 != null) {
                        ts12.A03(str);
                        A01((CharSequence) null, true);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("queuedTypeaheadManager");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r8, String str) {
        C69148NfX nfX = (C69148NfX) r8;
        boolean A1U = AnonymousClass7TF.A1U(0, str, nfX);
        if (str.equals(this.A03)) {
            String str2 = nfX.A03;
            boolean z = true;
            if (str2 == null || str2.length() == 0) {
                0wb.A03("UserSearchResponse", "Invalid UserSearchResponse format, missing rankToken");
            }
            List list = nfX.A00;
            0qQ.A07(list);
            this.A04 = false;
            C15459UdA udA = this.A00;
            if (udA != null) {
                udA.A01 = A1U;
                udA.A05.A00(list);
                udA.A0C();
                if (this.A05) {
                    0S7.A00(this);
                    this.A04.setSelection(0);
                }
                if (!nfX.A04 || !AnonymousClass7TE.A1b(list)) {
                    z = false;
                }
                this.A06 = z;
                C15459UdA udA2 = this.A00;
                if (udA2 != null) {
                    udA2.A02 = false;
                    udA2.A0C();
                    return;
                }
            }
            0qQ.A0F("adapter");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Euf() {
        SearchEditText searchEditText = this.A02;
        if (searchEditText != null) {
            searchEditText.A06();
        }
    }

    public final String getModuleName() {
        return this.A0A;
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, JTT.A0B(this, r3).getString(2131953880));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2086743470);
        C15395Uby.super.onCreate(bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("BlockCommentersSettingFragment.BLOCKED_COMMENTERS_LIST");
        this.A08 = new AnonymousClass7g1();
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A09;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        C337287g2 r2 = this.A08;
        if (r2 != null) {
            this.A00 = new C15459UdA(requireContext, this, this, A0l, r2, parcelableArrayList);
            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
            C337287g2 r7 = this.A08;
            if (r7 != null) {
                this.A07 = C14225Ts5.A00(A0l2, this, (C337247fx) null, this, r7, AnonymousClass05K.A00, 0, 200, false, false);
                AnonymousClass0fD.A09(-580102799, A022);
                return;
            }
        }
        0qQ.A0F("cache");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(342001797);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_block_commenter, viewGroup, false);
        AnonymousClass0fD.A09(-259829280, A022);
        return inflate;
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1451009623);
        VT7 vt7 = this.A01;
        if (vt7 != null) {
            C15459UdA udA = this.A00;
            str = "adapter";
            if (udA != null) {
                Set unmodifiableSet = Collections.unmodifiableSet(udA.A0C);
                0qQ.A07(unmodifiableSet);
                C15459UdA udA2 = this.A00;
                if (udA2 != null) {
                    Set unmodifiableSet2 = Collections.unmodifiableSet(udA2.A0D);
                    0qQ.A07(unmodifiableSet2);
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    if ((!unmodifiableSet.isEmpty()) || (!unmodifiableSet2.isEmpty())) {
                        writableNativeMap.putArray("newlyBlockedUserDicts", C18181Vmv.A00(unmodifiableSet));
                        writableNativeMap.putArray("newlyUnblockedUserDicts", C18181Vmv.A00(unmodifiableSet2));
                    }
                    vt7.A00.invoke(writableNativeMap);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C14221Ts1 ts1 = this.A07;
        if (ts1 == null) {
            str = "queuedTypeaheadManager";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        ts1.onDestroy();
        super.onDestroy();
        AnonymousClass0fD.A09(738568909, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1605917648);
        SearchEditText searchEditText = this.A02;
        if (searchEditText != null) {
            searchEditText.A04();
        }
        SearchEditText searchEditText2 = this.A02;
        if (searchEditText2 != null) {
            searchEditText2.A0C = null;
        }
        this.A02 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-1621359800, A022);
    }
}
