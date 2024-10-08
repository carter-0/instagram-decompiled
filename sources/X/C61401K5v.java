package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.io.Serializable;

/* renamed from: X.K5v  reason: case insensitive filesystem */
public final class C61401K5v extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PublishScreenCategorySubFragment";
    public C60417JlA A00;
    public LP2 A01;
    public PublishScreenCategoryType A02;
    public boolean A03;
    public RecyclerView A04;
    public C62462KgC A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (!this.A03) {
            Context requireContext = requireContext();
            PublishScreenCategoryType publishScreenCategoryType = this.A02;
            if (publishScreenCategoryType == null) {
                0qQ.A0F("categoryType");
                throw AnonymousClass00P.createAndThrow();
            }
            r4.setTitle(requireContext.getString(LIh.A01(publishScreenCategoryType)));
            r4.Eu5(new LYF((Object) this, 59), true);
        }
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        MVR mvr;
        boolean A1V;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A03) {
            View A0G = AnonymousClass7TF.A0G(view, R.id.custom_action_bar);
            TextView A0R = AnonymousClass7TG.A0R(A0G, R.id.action_bar_title);
            Context requireContext = requireContext();
            PublishScreenCategoryType publishScreenCategoryType = this.A02;
            if (publishScreenCategoryType == null) {
                str = "categoryType";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            DbT.A18(requireContext, A0R, LIh.A01(publishScreenCategoryType));
            A0G.setVisibility(0);
            LYF.A01(AnonymousClass7TF.A0G(A0G, R.id.action_bar_button_back), 60, this);
        }
        JTT.A15(view, this);
        LP2 lp2 = this.A01;
        if (lp2 != null) {
            C62950Kp2 A032 = lp2.A03();
            AnonymousClass0eM r2 = this.A06;
            UserSession A0l = AnonymousClass7TE.A0l(r2);
            C62462KgC kgC = this.A05;
            if (kgC == null) {
                str = "screenType";
            } else {
                C60417JlA jlA = new C60417JlA(A0l, A032, kgC);
                this.A00 = jlA;
                RecyclerView recyclerView = this.A04;
                if (recyclerView == null) {
                    str = "recyclerView";
                } else {
                    recyclerView.setAdapter(jlA);
                    07U r4 = 07U.A05;
                    AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                    AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 7), AnonymousClass07a.A00(viewLifecycleOwner));
                    LP2 lp22 = this.A01;
                    if (lp22 != null) {
                        if (lp22 instanceof C61823KNm) {
                            mvr = ((C61823KNm) lp22).A01;
                        } else {
                            mvr = ((C61822KNl) lp22).A07;
                        }
                        mvr.Dh3();
                        LP2 lp23 = this.A01;
                        if (lp23 != null) {
                            C60102Jfi A042 = lp23.A04();
                            if (A042 instanceof C61829KNs) {
                                A1V = AnonymousClass7TF.A1V(((C61829KNs) A042).A02);
                            } else {
                                A1V = AnonymousClass7TF.A1V(((C361278fx) ((C61828KNr) A042).A03.A06.getValue()).A01);
                            }
                            if (!A1V) {
                                if (182.A06(0Tu.A05, DbT.A0X(r2), 36328645866503674L)) {
                                    DbT.A1I(this);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "dependencyProvider";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final String getModuleName() {
        String string = requireArguments().getString("publish_screen_category_parent_module_name");
        if (string != null) {
            PublishScreenCategoryType publishScreenCategoryType = this.A02;
            if (publishScreenCategoryType != null) {
                return 002.A0T(string, publishScreenCategoryType.name(), '_');
            }
            0qQ.A0F("categoryType");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LP2 lp2 = this.A01;
        if (lp2 == null) {
            JTO.A1M();
            throw AnonymousClass00P.createAndThrow();
        } else {
            lp2.A02().onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Throwable th;
        int i;
        PublishScreenCategoryType publishScreenCategoryType;
        int i2;
        C62462KgC kgC;
        LP2 kNm;
        MVR mvr;
        String str;
        int A022 = AnonymousClass0fD.A02(-2143891664);
        C61401K5v.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("publish_screen_category_type");
            if (parcelable instanceof PublishScreenCategoryType) {
                publishScreenCategoryType = (PublishScreenCategoryType) parcelable;
            } else {
                publishScreenCategoryType = null;
            }
            if (publishScreenCategoryType == null) {
                0kD.A07(002.A0R(getModuleName(), ".onCreate"), "categoryType is null.", (Throwable) null);
                i2 = -1625389080;
            } else {
                this.A02 = publishScreenCategoryType;
                Serializable serializable = bundle2.getSerializable("publish_screen_type");
                if (!(serializable instanceof C62462KgC) || (kgC = (C62462KgC) serializable) == null) {
                    0kD.A07(002.A0R(getModuleName(), ".onCreate"), "screenType is null.", (Throwable) null);
                    i2 = 1345868014;
                } else {
                    this.A05 = kgC;
                    this.A03 = requireArguments().getBoolean("should_show_customized_action_bar", false);
                    C62462KgC kgC2 = this.A05;
                    if (kgC2 == null) {
                        str = "screenType";
                    } else {
                        int ordinal = kgC2.ordinal();
                        if (ordinal == 0) {
                            UserSession A0l = AnonymousClass7TE.A0l(this.A06);
                            String string = bundle2.getString("ClipsConstants.ARGS_WATERFALL_ID", AnonymousClass7TF.A0b());
                            0qQ.A07(string);
                            kNm = new C61823KNm(bundle2, this, this, A0l, string);
                        } else if (ordinal == 1) {
                            kNm = new C61822KNl(bundle2, this, this, AnonymousClass7TE.A0l(this.A06));
                        } else {
                            th = AnonymousClass7TE.A1K();
                            i = -1537868392;
                        }
                        this.A01 = kNm;
                        kNm.A05();
                        LP2 lp2 = this.A01;
                        if (lp2 == null) {
                            str = "dependencyProvider";
                        } else {
                            if (lp2 instanceof C61823KNm) {
                                mvr = ((C61823KNm) lp2).A01;
                            } else {
                                mvr = ((C61822KNl) lp2).A07;
                            }
                            mvr.EBi();
                            i2 = -2129967308;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            AnonymousClass0fD.A09(i2, A022);
            return;
        }
        th = AnonymousClass7TE.A0y();
        i = -1626880183;
        AnonymousClass0fD.A09(i, A022);
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2055349199);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_publish_screen_sub_fragment, false);
        this.A04 = DbZ.A0F(A0D, R.id.recycler_view);
        AnonymousClass0fD.A09(2049855351, A022);
        return A0D;
    }

    public final void onDestroy() {
        MVR mvr;
        int A022 = AnonymousClass0fD.A02(625406042);
        super.onDestroy();
        LP2 lp2 = this.A01;
        if (lp2 == null) {
            JTO.A1M();
            throw AnonymousClass00P.createAndThrow();
        }
        if (lp2 instanceof C61823KNm) {
            mvr = ((C61823KNm) lp2).A01;
        } else {
            mvr = ((C61822KNl) lp2).A07;
        }
        mvr.FIx();
        AnonymousClass0fD.A09(-1253177728, A022);
    }
}
