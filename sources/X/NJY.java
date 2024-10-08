package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.nestablescrollingview.NestableViewPager;
import java.util.AbstractList;
import java.util.ArrayList;

public final class NJY extends AnonymousClass4DH implements AnonymousClass4DR, C74470PvQ, JPL, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ThreadDetailHomePageFragment";
    public LinearLayout A00;
    public TabLayout A01;
    public 0wc A02;
    public Capabilities A03;
    public C69362Nk2 A04;
    public OMs A05;
    public OMs A06;
    public OMs A07;
    public OMs A08;
    public OMs A09;
    public OMs A0A;
    public OMs A0B;
    public OMs A0C;
    public OMs A0D;
    public OMs A0E;
    public OMs A0F;
    public OMs A0G;
    public OMs A0H;
    public OMs A0I;
    public OMs A0J;
    public OMs A0K;
    public OMs A0L;
    public OMs A0M;
    public OMs A0N;
    public OMs A0O;
    public OMs A0P;
    public C74449Pv4 A0Q;
    public OG1 A0R;
    public OF3 A0S;
    public OHL A0T;
    public C66965Mfy A0U;
    public C62032KWk A0V;
    public C270264gS A0W;
    public NIF A0X;
    public C47167Dri A0Y;
    public N4P A0Z;
    public C71030OZh A0a;
    public IgdsListCell A0b;
    public C254793t3 A0c;
    public C231002qi A0d;
    public Integer A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public View A0n;
    public LinearLayout A0o;
    public TextView A0p;
    public TextView A0q;
    public TextView A0r;
    public TextView A0s;
    public C252063oV A0t;
    public C67707MtL A0u;
    public OMs A0v;
    public OMs A0w;
    public GradientSpinnerAvatarView A0x;
    public NestableViewPager A0y;
    public final 1a8 A0z = C66580MXl.A0O();
    public final DirectThreadDetailsCollectionRowViewModel A10;
    public final AnonymousClass2qU A11;
    public final ArrayList A12 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A13;
    public final AnonymousClass0eM A14;
    public final AnonymousClass0eM A15;
    public final Ot0 A16;
    public final 27S A17;

    public static final void A0A(NJY njy) {
        N4P n4p;
        String A072;
        NJY njy2 = njy;
        Context context = njy.getContext();
        if (context != null && (n4p = njy.A0Z) != null && !C71118OdC.A03((Activity) context, context, njy2, AnonymousClass7TE.A0l(njy.A14), (2EM) null, C330397Mp.A00(n4p), false)) {
            if (njy2.A0k) {
                0wc r2 = njy2.A02;
                if (r2 == null) {
                    0qQ.A0F("typedLogger");
                    throw AnonymousClass00P.createAndThrow();
                }
                C254793t3 r0 = n4p.A0L;
                if (!(r0 == null || (A072 = C300965yF.A07(r0)) == null)) {
                    C66584MXp.A13(r2, "armadillo_igd_group_profile_change_group_photo", A072);
                }
            }
            C71030OZh oZh = njy2.A0a;
            if (oZh != null) {
                oZh.A02(AnonymousClass7TF.A1V(n4p.A0C));
            }
        }
    }

    public static final void A0G(NJY njy, C68303N9q n9q) {
        NJY njy2 = njy;
        N4P n4p = njy.A0Z;
        if (n4p != null) {
            OZ1 oz1 = OZ1.A00;
            UserSession A0l2 = AnonymousClass7TE.A0l(njy2.A14);
            FragmentActivity requireActivity = njy2.requireActivity();
            Capabilities capabilities = njy2.A03;
            if (capabilities == null) {
                0qQ.A0F("threadCapabilities");
                throw AnonymousClass00P.createAndThrow();
            } else {
                oz1.A01(njy2, requireActivity, njy2, A0l2, capabilities, n4p, n9q);
            }
        }
    }

    public static final void A0H(NJY njy, C68303N9q n9q) {
        NJY njy2 = njy;
        N4P n4p = njy.A0Z;
        if (n4p != null) {
            C71117OdB odB = C71117OdB.A00;
            UserSession A0l2 = AnonymousClass7TE.A0l(njy.A14);
            FragmentActivity requireActivity = njy.requireActivity();
            boolean z = njy.A0j;
            C231002qi r7 = njy2.A0d;
            if (r7 == null) {
                0qQ.A0F("quickPromotionDelegate");
                throw AnonymousClass00P.createAndThrow();
            } else {
                odB.A04(requireActivity, njy2, A0l2, n4p, n9q, r7, z);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, androidx.fragment.app.Fragment, X.NJY] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0I(X.NJY r10, X.C68303N9q r11) {
        /*
            r5 = r10
            X.N4P r9 = r10.A0Z
            if (r9 == 0) goto L_0x0032
            X.OZ2 r1 = X.OZ2.A00
            android.content.Context r2 = r10.requireContext()
            X.0eM r0 = r10.A14
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r3 = r10.requireActivity()
            X.0wc r6 = r10.A02
            if (r6 != 0) goto L_0x0023
            java.lang.String r0 = "typedLogger"
        L_0x001b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0023:
            X.0gy r4 = X.AnonymousClass07i.A00(r10)
            X.Mfy r8 = r10.A0U
            java.lang.String r0 = "restrictController"
            if (r8 == 0) goto L_0x001b
            r10 = r11
            r11 = r8
            r1.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJY.A0I(X.NJY, X.N9q):void");
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0o = (LinearLayout) view.requireViewById(R.id.thread_details_header);
        this.A0x = (GradientSpinnerAvatarView) view.requireViewById(R.id.group_photo_avatar);
        this.A0t = DbV.A0T(view, R.id.direct_group_photo_faceswarm_stub, false);
        this.A0s = DbU.A0G(view, R.id.thread_title);
        this.A0r = DbU.A0G(view, R.id.thread_subtitle);
        this.A0p = DbU.A0G(view, R.id.change_title_photo);
        this.A00 = (LinearLayout) view.requireViewById(R.id.shortcuts_container);
        this.A0K = A00(view, R.id.invite_link_section);
        this.A0v = A00(view, R.id.customer_details);
        this.A0P = A00(view, R.id.theme_section);
        this.A0J = A00(view, R.id.dmm_section);
        this.A0w = A00(view, R.id.people_section);
        this.A0H = A00(view, R.id.create_group_section);
        this.A0G = A00(view, R.id.chat_controls_section);
        this.A0F = A00(view, R.id.channel_insights_section);
        this.A0E = A00(view, R.id.channel_controls_section);
        this.A0C = A00(view, R.id.best_practices_section);
        this.A0L = A00(view, R.id.nicknames_section);
        this.A0M = A00(view, R.id.privacy_controls_section);
        this.A0O = A00(view, R.id.restrict_button);
        this.A0D = A00(view, R.id.block_button);
        this.A0N = A00(view, R.id.report_button);
        this.A0b = (IgdsListCell) view.requireViewById(R.id.agent_embodiment_section);
        this.A09 = A00(view, R.id.agent_hallucination_disclaimer);
        this.A08 = A00(view, R.id.agent_data_usage_section);
        this.A07 = A00(view, R.id.ai_agent_creator_button);
        this.A0I = A00(view, R.id.creator_ai_replies_toggle);
        this.A0A = A00(view, R.id.agent_memu_section);
        this.A06 = A00(view, R.id.ai_studio_section);
        this.A0B = A00(view, R.id.agent_voice_settings_section);
        this.A05 = A00(view, R.id.add_ai_section);
        this.A0n = view.requireViewById(R.id.shared_section);
        this.A0q = DbU.A0G(view, R.id.viewpager_label);
        this.A01 = (TabLayout) view.requireViewById(R.id.tab_layout);
        NestableViewPager nestableViewPager = (NestableViewPager) view.requireViewById(R.id.thread_details_pager);
        this.A0y = nestableViewPager;
        if (nestableViewPager != null) {
            nestableViewPager.setAdapter(this.A0u);
            TabLayout tabLayout = this.A01;
            String str = "tabLayout";
            if (tabLayout != null) {
                NestableViewPager nestableViewPager2 = this.A0y;
                if (nestableViewPager2 != null) {
                    tabLayout.setupWithViewPager(nestableViewPager2);
                    int color = view.getContext().getColor(2Yu.A0B(getContext()));
                    TabLayout tabLayout2 = this.A01;
                    if (tabLayout2 != null) {
                        tabLayout2.A0C = color;
                        tabLayout2.A0D(new C71806Or7(this, 1));
                        AnonymousClass0eM r4 = this.A14;
                        UserSession A0l2 = AnonymousClass7TE.A0l(r4);
                        if (182.A06(DbS.A0J(A0l2, 0), A0l2, 36314223365589483L)) {
                            this.A0R = new OG1(view);
                        }
                        1a8 r3 = this.A0z;
                        C74449Pv4 pv4 = this.A0Q;
                        if (pv4 == null) {
                            str = "clientInfra";
                        } else {
                            PU8.A00(C66789Mca.A00(pv4.BNa().APA(), C74050PoF.A00, 2).A0D(), r3, this, 27);
                            this.A0W = AnonymousClass7MX.A00(AnonymousClass7TE.A0l(r4));
                            A07(this);
                            A0E(this);
                            C231002qi r0 = this.A0d;
                            if (r0 == null) {
                                str = "quickPromotionDelegate";
                            } else {
                                r0.Dh3();
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("viewPager");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final NJm A02(NJY njy) {
        String str;
        UserSession A0l2 = AnonymousClass7TE.A0l(njy.A14);
        Capabilities capabilities = njy.A03;
        if (capabilities == null) {
            str = "threadCapabilities";
        } else {
            C254793t3 r3 = njy.A0c;
            if (r3 != null) {
                return C69944Nuk.A00(A0l2, capabilities, r3, njy.requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", 0), njy.A0j);
            }
            str = "threadId";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(Context context, OMs oMs, String str, int i, int i2) {
        oMs.A00.setVisibility(0);
        IgSimpleImageView igSimpleImageView = oMs.A02;
        igSimpleImageView.setVisibility(0);
        oMs.A04.setVisibility(8);
        TypedValue typedValue = AnonymousClass4Ed.A00;
        Drawable drawable = null;
        try {
            Drawable drawable2 = context.getDrawable(i);
            if (drawable2 != null) {
                drawable = drawable2.mutate();
                0qQ.A07(drawable);
                AnonymousClass7TE.A1R(drawable, i2);
            }
        } catch (Resources.NotFoundException unused) {
        }
        igSimpleImageView.setImageDrawable(drawable);
        IgTextView igTextView = oMs.A05;
        igTextView.setTextColor(i2);
        igTextView.setText(str);
    }

    public static final void A05(C69491NmZ nmZ, NJY njy) {
        String str;
        C254793t3 r0;
        C254793t3 r02;
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(njy, AnonymousClass7TE.A0l(njy.A14)), "direct_thread_details_click_action");
        C51965G9l.A19(nmZ, A0e2);
        N4P n4p = njy.A0Z;
        Boolean bool = null;
        if (n4p == null || (r02 = n4p.A0L) == null) {
            str = null;
        } else {
            str = C300965yF.A07(r02);
        }
        C66580MXl.A1J(A0e2, str);
        N4P n4p2 = njy.A0Z;
        if (!(n4p2 == null || (r0 = n4p2.A0L) == null)) {
            bool = Boolean.valueOf(r0 instanceof MsysThreadId);
        }
        A0e2.A7p("is_e2ee", bool);
        A0e2.Cgf();
    }

    public static final void A06(NJY njy) {
        String str;
        ImageUrl imageUrl;
        AnonymousClass0eM r5 = njy.A14;
        UserSession A0l2 = AnonymousClass7TE.A0l(r5);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, A0l2, 36324449682731102L)) {
            N4P n4p = njy.A0Z;
            if (n4p != null) {
                ArrayList A052 = AnonymousClass3UE.A05(AnonymousClass0t1.A01.A01(AnonymousClass7TE.A0l(r5)), JTO.A15(n4p.A0c), !N4P.A05(n4p));
                if (n4p.A0x) {
                    str = n4p.A0P;
                    if (str == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    str = "";
                }
                UserSession A0l3 = AnonymousClass7TE.A0l(r5);
                C254793t3 r10 = njy.A0c;
                if (r10 != null) {
                    N4P n4p2 = njy.A0Z;
                    if (n4p2 != null) {
                        imageUrl = n4p2.A0C;
                    } else {
                        imageUrl = null;
                    }
                    ArrayList A1D = AnonymousClass7TE.A1D(A052);
                    int i = n4p.A09;
                    0qQ.A0B(A0l3, 0);
                    NIZ niz = new NIZ();
                    Bundle A092 = C66581MXm.A09(A0l3);
                    OXL.A02(A092, r10, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
                    A092.putString("thread_title", str);
                    A092.putParcelable("thread_picture_image_url", imageUrl);
                    A092.putParcelableArrayList("members_picture_image_url", A1D);
                    A092.putString("analytics_entrypoint", "thread_details");
                    A092.putInt("DirectThreadDetailFragment.THREAD_SUBTYPE", i);
                    niz.setArguments(A092);
                    UserSession A0l4 = AnonymousClass7TE.A0l(r5);
                    C254793t3 r0 = njy.A0c;
                    if (r0 != null) {
                        new C55952HqG(njy, A0l4, "thread_details", C300965yF.A07(r0)).A00(C54682HOn.TAP_CHANGE_NAME_IMAGE, (C62639Kk1) null);
                        C66583MXo.A1G(DbU.A0P((Bundle) null, niz, njy.requireActivity(), AnonymousClass7TE.A0l(r5)), __redex_internal_original_name);
                        return;
                    }
                }
                0qQ.A0F("threadId");
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        N4P n4p3 = njy.A0Z;
        boolean z = false;
        if (n4p3 != null) {
            if (n4p3.A09 == 29) {
                z = true;
                C313756gx A002 = C313746gw.A00(AnonymousClass7TE.A0l(r5));
                int A062 = n4p3.A06();
                String A032 = N4P.A03(n4p3);
                String str2 = n4p3.A0Q;
                1Ln A0J2 = DbT.A0J(A002);
                if (DbT.A1Y(A0J2)) {
                    DbW.A17(A0J2, A002);
                    DbV.A1M(A0J2, "change_name_photo_sheet_rendered");
                    A0J2.A0p("change_name_photo_text");
                    C66582MXn.A1C(A0J2, A002, DbZ.A0b(A0J2, "thread_details", A032, str2, A062));
                }
            }
            C46498Dg1 dg1 = new C46498Dg1(njy.requireContext(), AnonymousClass7TE.A0l(r5));
            int i2 = 2131968694;
            if (182.A05(r2, AnonymousClass7TE.A0l(r5))) {
                i2 = 2131968692;
            }
            dg1.A04(new C71398Ojx(1, (Object) njy, (Object) n4p3, z), i2);
            boolean A053 = 182.A05(r2, AnonymousClass7TE.A0l(r5));
            int i3 = 2131958715;
            if (A053) {
                i3 = 2131958714;
            }
            dg1.A04(new C71398Ojx(2, (Object) njy, (Object) n4p3, z), i3);
            dg1.A04(C71390Ojo.A00, 2131954722);
            dg1.A05 = true;
            new C49945FFy(dg1).A03(njy.requireActivity());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A07(NJY njy) {
        C74449Pv4 pv4 = njy.A0Q;
        if (pv4 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C74550Pwj.A00(pv4);
        }
    }

    public static final void A09(NJY njy) {
        FragmentActivity activity;
        N4P n4p = njy.A0Z;
        if (n4p != null && (activity = njy.getActivity()) != null) {
            AnonymousClass0eM r5 = njy.A14;
            C47167Dri A002 = C71123OdH.A00(AnonymousClass7TE.A0l(r5), n4p);
            UserSession A0l2 = AnonymousClass7TE.A0l(r5);
            Bundle A0A2 = DbY.A0A(A0l2);
            AnonymousClass0Dg.A00(A0A2, A0l2);
            E5m e5m = new E5m();
            e5m.setArguments(A0A2);
            C74449Pv4 pv4 = njy.A0Q;
            if (pv4 == null) {
                0qQ.A0F("clientInfra");
                throw AnonymousClass00P.createAndThrow();
            }
            e5m.A02 = pv4.C62();
            e5m.A01 = A002;
            e5m.A03 = "thread_details";
            C331127Pr A0W2 = DbS.A0W(AnonymousClass7TE.A0l(r5));
            A0W2.A17 = true;
            DbU.A0y(activity, e5m, A0W2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r1 = (X.C69660Npi) ((X.NW5) r1).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.NJY r9) {
        /*
            X.OMs r0 = r9.A0v
            java.lang.String r8 = "customerDetails"
            if (r0 == 0) goto L_0x0043
            A0J(r0)
            android.content.Context r6 = r9.getContext()
            if (r6 == 0) goto L_0x00d8
            X.N4P r1 = r9.A0Z
            if (r1 == 0) goto L_0x00d8
            boolean r0 = X.N4P.A05(r1)
            if (r0 != 0) goto L_0x00d8
            int r1 = r1.A09
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r1 == r0) goto L_0x00d8
            X.0eM r7 = r9.A14
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            r4 = 0
            X.0Tu r2 = X.DbS.A0J(r3, r4)
            r0 = 36324715970703641(0x810d2300003119, double:3.0352348755393633E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d8
            X.OMs r5 = r9.A0v
            if (r5 == 0) goto L_0x0043
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            X.3t3 r0 = r9.A0c
            if (r0 != 0) goto L_0x004b
            java.lang.String r8 = "threadId"
        L_0x0043:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004b:
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x0055
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x0057
        L_0x0055:
            java.lang.String r2 = ""
        L_0x0057:
            X.0qQ.A0B(r3, r4)
            X.0sm r1 = X.0Yt.A0E()
            java.lang.String r0 = "customer_details_thread_details_entry_point_impression"
            X.OZ3.A00(r3, r0, r2, r1)
            com.instagram.common.ui.base.IgTextView r1 = r5.A05
            r0 = 2131959462(0x7f131ea6, float:1.9555565E38)
            X.DbU.A1G(r1, r9, r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r5.A02
            r1.setVisibility(r4)
            r0 = 2131238154(0x7f081d0a, float:1.8092579E38)
            X.DbU.A13(r6, r1, r0)
            android.view.View r3 = r5.A00
            r3.setVisibility(r4)
            X.KWk r0 = r9.A0V
            if (r0 != 0) goto L_0x0082
            java.lang.String r8 = "customerDetailsRepository"
            goto L_0x0043
        L_0x0082:
            X.05G r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.NoX r1 = (X.C69589NoX) r1
            boolean r0 = r1 instanceof X.NW5
            if (r0 == 0) goto L_0x00bc
            X.NW5 r1 = (X.NW5) r1
            java.lang.Object r1 = r1.A00
            X.Npi r1 = (X.C69660Npi) r1
            java.lang.String r2 = r1.A02
            if (r2 == 0) goto L_0x009e
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00bd
        L_0x009e:
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x00a8
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00bd
        L_0x00a8:
            java.lang.String r2 = r1.A03
            if (r2 == 0) goto L_0x00b2
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00bd
        L_0x00b2:
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x00bc
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00bd
        L_0x00bc:
            r2 = 0
        L_0x00bd:
            com.instagram.common.ui.base.IgTextView r1 = r5.A04
            if (r2 == 0) goto L_0x00c7
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00ce
        L_0x00c7:
            r0 = 2131959461(0x7f131ea5, float:1.9555563E38)
            java.lang.String r2 = r9.getString(r0)
        L_0x00ce:
            r1.setText(r2)
            r1.setVisibility(r4)
            r0 = 7
            X.C71395Oju.A00(r3, r0, r9)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJY.A0B(X.NJY):void");
    }

    public static final void A0C(NJY njy) {
        Context context;
        String A032;
        int i;
        Object[] objArr;
        Object A033;
        N4P n4p = njy.A0Z;
        if (n4p != null && (context = njy.getContext()) != null) {
            int i2 = 8;
            if (!N4P.A05(n4p) || n4p.A0C() || !AnonymousClass7TE.A1b(00k.A0a(n4p.A0T))) {
                OMs oMs = njy.A0w;
                if (oMs != null) {
                    A0K(oMs, 8);
                    return;
                }
            } else {
                ((C70612ODj) njy.A15.getValue()).A02.add(C69501Nmj.A08);
                OMs oMs2 = njy.A0w;
                if (oMs2 != null) {
                    oMs2.A02.setVisibility(0);
                    OMs oMs3 = njy.A0w;
                    if (oMs3 != null) {
                        DbU.A13(context, oMs3.A02, R.drawable.instagram_users_pano_outline_24);
                        OMs oMs4 = njy.A0w;
                        if (oMs4 != null) {
                            C71395Oju.A00(oMs4.A00, 9, njy);
                            OMs oMs5 = njy.A0w;
                            if (oMs5 != null) {
                                oMs5.A00.setContentDescription(njy.getString(2131959009));
                                OMs oMs6 = njy.A0w;
                                if (oMs6 != null) {
                                    2eS.A01(oMs6.A00);
                                    OMs oMs7 = njy.A0w;
                                    if (oMs7 != null) {
                                        DbU.A1G(oMs7.A05, njy, 2131959009);
                                        OMs oMs8 = njy.A0w;
                                        if (oMs8 != null) {
                                            IgTextView igTextView = oMs8.A04;
                                            AnonymousClass0eM r3 = njy.A14;
                                            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                                            0qQ.A0B(A0l2, 1);
                                            ArrayList A042 = C330397Mp.A04(A0l2, n4p, C67350MmR.DEFAULT, false);
                                            int size = A042.size();
                                            if (size != 0) {
                                                if (size != 1) {
                                                    if (size != 2) {
                                                        if (size != 3) {
                                                            i = 2131958993;
                                                            objArr = new Object[3];
                                                            objArr[0] = A03(A042, 0);
                                                            objArr[1] = A03(A042, 1);
                                                            A033 = Integer.valueOf(A042.size() - 2);
                                                        } else {
                                                            i = 2131959031;
                                                            objArr = new Object[3];
                                                            objArr[0] = A03(A042, 0);
                                                            objArr[1] = A03(A042, 1);
                                                            A033 = A03(A042, 2);
                                                        }
                                                        objArr[2] = A033;
                                                    } else {
                                                        i = 2131959036;
                                                        objArr = new Object[]{A03(A042, 0), A03(A042, 1)};
                                                    }
                                                    A032 = context.getString(i, objArr);
                                                    0qQ.A0A(A032);
                                                } else {
                                                    A032 = A03(A042, 0);
                                                }
                                                igTextView.setText(A032);
                                                OMs oMs9 = njy.A0w;
                                                if (oMs9 != null) {
                                                    A0K(oMs9, 0);
                                                    OMs oMs10 = njy.A0w;
                                                    if (oMs10 != null) {
                                                        IgSimpleImageView igSimpleImageView = oMs10.A03;
                                                        if (njy.A0f) {
                                                            i2 = 0;
                                                        }
                                                        igSimpleImageView.setVisibility(i2);
                                                        if (n4p.A09 == 29) {
                                                            C313756gx A002 = C313746gw.A00(AnonymousClass7TE.A0l(r3));
                                                            int A062 = n4p.A06();
                                                            String A034 = N4P.A03(n4p);
                                                            String str = n4p.A0Q;
                                                            1Ln A0J2 = DbT.A0J(A002);
                                                            if (DbT.A1Y(A0J2)) {
                                                                DbW.A17(A0J2, A002);
                                                                C66581MXm.A1I(A0J2, "people_section_rendered");
                                                                A0J2.A0p("people_section");
                                                                A0J2.A0i(DbZ.A0b(A0J2, "thread_details", A034, str, A062));
                                                                A0J2.Cgf();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                            } else {
                                                throw AnonymousClass7TE.A0z("At least one member should exist in a group");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("peopleSection");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
        if (r5 == false) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(X.NJY r26) {
        /*
            r9 = r26
            X.N4P r8 = r9.A0Z
            if (r8 == 0) goto L_0x038e
            android.content.Context r7 = r9.getContext()
            if (r7 == 0) goto L_0x038e
            int r6 = r8.A09
            com.instagram.common.typedurl.ImageUrl r1 = r8.A0C
            X.0eE r13 = X.AnonymousClass0t1.A01
            X.0eM r0 = r9.A14
            r26 = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r26)
            r13.A01(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r26)
            com.instagram.user.model.User r2 = r13.A01(r0)
            X.0eM r0 = r8.A0c
            r25 = r0
            java.util.List r0 = X.JTO.A15(r25)
            boolean r5 = X.N4P.A05(r8)
            r10 = 0
            X.34S r12 = X.AnonymousClass3UE.A02(r10, r2, r10, r0)
            java.lang.Object r11 = r12.A00
            com.instagram.common.typedurl.ImageUrl r11 = (com.instagram.common.typedurl.ImageUrl) r11
            boolean r18 = X.AnonymousClass48O.A02(r6)
            r4 = 29
            r3 = 8
            r2 = 0
            java.lang.String r17 = "avatar"
            if (r18 == 0) goto L_0x0289
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r8.A0G
            if (r0 == 0) goto L_0x0050
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
        L_0x004d:
            if (r0 == 0) goto L_0x0050
            r11 = r0
        L_0x0050:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            if (r1 != 0) goto L_0x0057
            r1 = r11
        L_0x0057:
            r0.A0F(r10, r9, r1)
        L_0x005a:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            r0.setGradientSpinnerVisible(r2)
            android.widget.TextView r13 = r9.A0s
            if (r13 != 0) goto L_0x006f
            java.lang.String r16 = "title"
        L_0x0067:
            X.0qQ.A0F(r16)
        L_0x006a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006f:
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r26)
            java.lang.String r1 = r8.A0P
            java.util.List r0 = X.JTO.A15(r25)
            java.lang.String r12 = X.AnonymousClass48N.A08(r7, r11, r1, r0, r2)
            X.0qQ.A07(r12)
            java.util.List r0 = X.JTO.A15(r25)
            r11 = 0
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            X.N9q r0 = (X.C68303N9q) r0
            r1 = 1
            if (r0 == 0) goto L_0x0099
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.isVerified()
            if (r0 != r1) goto L_0x0099
            r11 = 1
        L_0x0099:
            if (r18 != 0) goto L_0x0278
            X.3Te r0 = r8.A0E
            boolean r0 = X.C66651MaK.A03(r0, r6)
            if (r0 != 0) goto L_0x0278
            r0 = r10
        L_0x00a4:
            X.C46334Dcc.A00(r13, r0, r12, r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            if (r0 != 0) goto L_0x00c3
            X.1px r11 = X.AnonymousClass1q4.A00()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r26)
            java.util.List r0 = X.JTO.A15(r25)
            boolean r0 = r11.BZO(r1, r0, r6)
            if (r0 == 0) goto L_0x0115
        L_0x00c3:
            android.widget.TextView r1 = r9.A0r
            java.lang.String r16 = "subtitle"
            if (r1 == 0) goto L_0x0067
            java.util.List r0 = X.JTO.A15(r25)
            if (r0 == 0) goto L_0x0275
            java.lang.Object r0 = X.00k.A0J(r0)
            X.N9q r0 = (X.C68303N9q) r0
            if (r0 == 0) goto L_0x0275
            com.instagram.user.model.User r0 = r0.A00
        L_0x00d9:
            java.util.List r13 = X.JTO.A15(r25)
            int r12 = r13.size()
            r11 = 1
            if (r12 != r11) goto L_0x021c
            java.lang.Object r11 = X.00k.A0I(r13)
            X.N9q r11 = (X.C68303N9q) r11
            com.instagram.user.model.User r11 = r11.A00
            boolean r11 = r11.A1X()
            if (r11 == 0) goto L_0x021c
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r26)
            java.lang.String r11 = X.C3262475z.A01(r11)
            if (r11 == 0) goto L_0x021c
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r26)
            java.lang.String r0 = X.C3262475z.A01(r0)
        L_0x0104:
            r1.setText(r0)
            android.widget.TextView r0 = r9.A0r
            if (r0 == 0) goto L_0x0067
            r0.setVisibility(r2)
            android.widget.TextView r0 = r9.A0r
            if (r0 == 0) goto L_0x0067
            X.DbT.A1H(r0)
        L_0x0115:
            boolean r10 = r8.A0C()
            int r1 = r8.A08
            java.util.List r0 = X.JTO.A15(r25)
            boolean r0 = X.C66640Ma9.A04(r0, r1, r10, r5)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r26)
            boolean r10 = r9.A0m
            boolean r1 = r9.A0k
            X.0qQ.A0B(r12, r2)
            r15 = 1
            if (r0 != 0) goto L_0x0134
            r0 = 1
            if (r5 != 0) goto L_0x0135
        L_0x0134:
            r0 = 0
        L_0x0135:
            boolean r11 = r8.A0v
            if (r11 != 0) goto L_0x013b
            if (r6 != r4) goto L_0x0219
        L_0x013b:
            if (r0 == 0) goto L_0x0219
            if (r10 != 0) goto L_0x0219
            boolean r0 = r8.A0n
            if (r0 != 0) goto L_0x0219
            if (r1 == 0) goto L_0x0152
            X.0Tu r10 = X.0Tu.A05
            r0 = 36317135353418535(0x81063e00001327, double:3.0304408626435666E-306)
            boolean r0 = X.182.A06(r10, r12, r0)
            if (r0 == 0) goto L_0x0219
        L_0x0152:
            boolean r0 = X.N4P.A04(r12, r8)
            boolean r0 = X.C69945Nul.A00(r12, r6, r0)
            if (r0 == 0) goto L_0x0219
        L_0x015c:
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r26)
            X.3t3 r12 = r8.A0L
            boolean r13 = r8.A0C()
            java.util.List r1 = X.JTO.A15(r25)
            boolean r0 = r9.A0m
            X.DbW.A1N(r14, r2, r1)
            r10 = 0
            if (r0 != 0) goto L_0x0188
            if (r12 == 0) goto L_0x020a
            X.3t0 r0 = X.C300965yF.A02(r12)
            if (r0 == 0) goto L_0x020a
            X.9HW r5 = X.AnonymousClass9HV.A00(r14)
            X.3t0 r1 = X.C300965yF.A01(r12)
            r0 = 12
            boolean r10 = r5.A00(r1, r0)
        L_0x0188:
            android.widget.TextView r1 = r9.A0p
            java.lang.String r16 = "changeTitleOrImageButton"
            if (r1 == 0) goto L_0x0067
            int r0 = X.1QE.A02(r7)
            X.DbT.A17(r7, r1, r0)
            if (r15 == 0) goto L_0x01cc
            android.widget.TextView r3 = r9.A0p
            if (r10 == 0) goto L_0x01b4
            if (r3 == 0) goto L_0x0067
            r0 = 2131960458(0x7f13228a, float:1.9557585E38)
            X.DbU.A1G(r3, r9, r0)
            android.widget.TextView r1 = r9.A0p
            if (r1 == 0) goto L_0x0067
            r0 = 10
        L_0x01a9:
            X.C71395Oju.A00(r1, r0, r9)
        L_0x01ac:
            android.widget.TextView r0 = r9.A0p
            if (r0 == 0) goto L_0x0067
            r0.setVisibility(r2)
            return
        L_0x01b4:
            if (r3 == 0) goto L_0x0067
            boolean r1 = X.AnonymousClass48O.A04(r6)
            r0 = 2131958952(0x7f131ca8, float:1.955453E38)
            if (r1 == 0) goto L_0x01c2
            r0 = 2131958950(0x7f131ca6, float:1.9554527E38)
        L_0x01c2:
            X.DbU.A1G(r3, r9, r0)
            android.widget.TextView r1 = r9.A0p
            if (r1 == 0) goto L_0x0067
            r0 = 12
            goto L_0x01a9
        L_0x01cc:
            if (r10 == 0) goto L_0x01ee
            android.widget.TextView r3 = r9.A0p
            if (r3 == 0) goto L_0x0067
            if (r6 != r4) goto L_0x01e1
            r1 = 2131958932(0x7f131c94, float:1.955449E38)
        L_0x01d7:
            X.DbU.A1G(r3, r9, r1)
            android.widget.TextView r1 = r9.A0p
            if (r1 == 0) goto L_0x0067
            r0 = 11
            goto L_0x01a9
        L_0x01e1:
            boolean r0 = X.AnonymousClass48O.A04(r6)
            r1 = 2131958951(0x7f131ca7, float:1.9554529E38)
            if (r0 == 0) goto L_0x01d7
            r1 = 2131958949(0x7f131ca5, float:1.9554525E38)
            goto L_0x01d7
        L_0x01ee:
            if (r6 != r4) goto L_0x0281
            X.3Te r0 = r8.A0E
            if (r0 == 0) goto L_0x038e
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x038e
            android.widget.TextView r0 = r9.A0p
            if (r0 == 0) goto L_0x0067
            r0.setText(r1)
            android.widget.TextView r1 = r9.A0p
            if (r1 == 0) goto L_0x0067
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r1.setTextAppearance(r0)
            goto L_0x01ac
        L_0x020a:
            boolean r0 = X.C66640Ma9.A06(r1, r13, r5)
            if (r0 != 0) goto L_0x0188
            if (r12 == 0) goto L_0x0188
            if (r5 == 0) goto L_0x0188
            if (r11 == 0) goto L_0x0188
            r10 = 1
            goto L_0x0188
        L_0x0219:
            r15 = 0
            goto L_0x015c
        L_0x021c:
            r11 = 1014(0x3f6, float:1.421E-42)
            if (r6 != r11) goto L_0x0262
            if (r0 == 0) goto L_0x0262
            X.4Cl r11 = r0.A03
            java.lang.String r11 = r11.AaS()
            if (r11 == 0) goto L_0x0262
            X.4Cl r11 = r0.A03
            java.lang.String r11 = r11.AaR()
            if (r11 == 0) goto L_0x0262
            X.1ps r10 = X.AnonymousClass9B9.A00()
            X.1pt r10 = r10.A02
            androidx.fragment.app.FragmentActivity r19 = r9.requireActivity()
            com.instagram.common.session.UserSession r20 = X.AnonymousClass7TE.A0l(r26)
            java.lang.String r21 = "ThreadDetailHomePageFragment"
            X.4Cl r11 = r0.A03
            java.lang.String r22 = r11.AaR()
            java.lang.String r11 = "Required value was null."
            if (r22 == 0) goto L_0x0384
            X.4Cl r0 = r0.A03
            java.lang.String r23 = r0.AaS()
            if (r23 == 0) goto L_0x037f
            int r0 = r8.A01
            r17 = r10
            r18 = r7
            r24 = r0
            android.text.SpannableStringBuilder r0 = r17.A00(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0104
        L_0x0262:
            X.AnonymousClass9B9.A00()
            r0 = 2131975293(0x7f135c7d, float:1.9587674E38)
            java.lang.CharSequence r0 = r7.getText(r0)
            X.0qQ.A07(r0)
            android.text.SpannableStringBuilder r0 = X.C69835Nsx.A00(r7, r0, r10, r10, r2)
            goto L_0x0104
        L_0x0275:
            r0 = r10
            goto L_0x00d9
        L_0x0278:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.Jw4 r0 = new X.Jw4
            r0.<init>((java.lang.Integer) r1)
            goto L_0x00a4
        L_0x0281:
            android.widget.TextView r0 = r9.A0p
            if (r0 == 0) goto L_0x0067
            r0.setVisibility(r3)
            return
        L_0x0289:
            if (r6 != r4) goto L_0x0293
            X.3Te r0 = r8.A0E
            if (r0 == 0) goto L_0x0050
            com.instagram.common.typedurl.ImageUrl r0 = r0.A04
            goto L_0x004d
        L_0x0293:
            boolean r0 = X.AnonymousClass48O.A01(r6)
            if (r0 == 0) goto L_0x02c2
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r26)
            com.instagram.user.model.User r11 = r13.A01(r0)
            java.util.List r1 = X.JTO.A15(r25)
            X.3Te r0 = r8.A0E
            if (r0 == 0) goto L_0x0389
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0389
            X.34S r0 = X.AnonymousClass3UE.A00(r10, r11, r0, r10, r1)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r11 = r9.A0x
            if (r11 == 0) goto L_0x037a
            java.lang.Object r1 = r0.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.Object r0 = r0.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r11.A0G(r10, r9, r1, r0)
            goto L_0x005a
        L_0x02c2:
            java.lang.String r16 = "faceswarmStub"
            if (r1 == 0) goto L_0x02eb
            X.3oV r11 = r9.A0t
            if (r11 == 0) goto L_0x0067
            boolean r0 = r11.CVM()
            if (r0 == 0) goto L_0x02d3
            r11.setVisibility(r3)
        L_0x02d3:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            r0.setVisibility(r2)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            r0.A0F(r10, r9, r1)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r9.A0x
            if (r1 == 0) goto L_0x037a
            r0 = 1
            X.C71395Oju.A00(r1, r0, r9)
            goto L_0x005a
        L_0x02eb:
            if (r5 == 0) goto L_0x0334
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r26)
            X.0Tu r14 = X.0Tu.A05
            r0 = 36327670908205671(0x810fd300003a67, double:3.0371035899142254E-306)
            boolean r0 = X.182.A06(r14, r15, r0)
            if (r0 == 0) goto L_0x0334
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r26)
            com.instagram.user.model.User r1 = r13.A01(r0)
            java.util.List r0 = X.JTO.A15(r25)
            java.util.ArrayList r11 = X.AnonymousClass3UE.A05(r1, r0, r2)
            X.3oV r0 = r9.A0t
            if (r0 == 0) goto L_0x0067
            android.view.View r1 = r0.getView()
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r1 = (com.instagram.igds.components.faceswarm.IgdsFaceSwarm) r1
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            r0.setVisibility(r3)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            r0.setGradientSpinnerVisible(r2)
            r1.setVisibility(r2)
            r1.A08 = r2
            r1.setImageUrls(r11, r9)
            r0 = 1
            X.C71395Oju.A00(r1, r0, r9)
            goto L_0x005a
        L_0x0334:
            X.3oV r1 = r9.A0t
            if (r5 != 0) goto L_0x0353
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x0343
            r1.setVisibility(r3)
        L_0x0343:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            r0.setVisibility(r2)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            r0.A0F(r10, r9, r11)
            goto L_0x005a
        L_0x0353:
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x035e
            r1.setVisibility(r3)
        L_0x035e:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A0x
            if (r0 == 0) goto L_0x037a
            r0.setVisibility(r2)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r9.A0x
            if (r1 == 0) goto L_0x037a
            java.lang.Object r0 = r12.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r1.A0G(r10, r9, r11, r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r9.A0x
            if (r1 == 0) goto L_0x037a
            r0 = 1
            X.C71395Oju.A00(r1, r0, r9)
            goto L_0x005a
        L_0x037a:
            X.0qQ.A0F(r17)
            goto L_0x006a
        L_0x037f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x0384:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x0389:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x038e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJY.A0D(X.NJY):void");
    }

    /* JADX WARNING: type inference failed for: r2v438, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v148, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05fb, code lost:
        if (X.C331057Pi.A02(r7) == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00de, code lost:
        if (A0M(r0) != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06dd, code lost:
        if (r6.A09 != 29) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f1, code lost:
        if (r5 != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0bc6, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TE.A0l(r0.A14), 36325145468220038L) == false) goto L_0x0bc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0be8, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TE.A0l(r0.A14), 36325145468154501L) != false) goto L_0x0bea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0d3d, code lost:
        if (X.AnonymousClass7TF.A0Q(r8).CQp(r3) == false) goto L_0x0d3f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0E(X.NJY r43) {
        /*
            r0 = r43
            X.N4P r1 = r0.A0Z
            if (r1 == 0) goto L_0x1232
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x1232
            X.0eM r12 = r0.A15
            java.lang.Object r1 = r12.getValue()
            X.ODj r1 = (X.C70612ODj) r1
            java.util.Set r1 = r1.A02
            r1.clear()
            android.widget.LinearLayout r2 = r0.A0o
            if (r2 != 0) goto L_0x0027
            java.lang.String r11 = "headerView"
        L_0x001f:
            X.0qQ.A0F(r11)
        L_0x0022:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0027:
            r1 = 0
            r2.setVisibility(r1)
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x03ce
            android.content.Context r4 = r0.getContext()
            if (r4 == 0) goto L_0x03ce
            X.Dri r7 = r0.A0Y
            if (r7 == 0) goto L_0x03ce
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r5 = 11
            X.PgO r19 = X.C66580MXl.A15(r0, r5)
            X.Nmj r16 = X.C69501Nmj.A02
            r15 = 0
            r26 = 0
            r6 = 29
            X.Phe r5 = new X.Phe
            r5.<init>(r6, r0, r7)
            r21 = 2131952258(0x7f130282, float:1.9540954E38)
            r22 = 2131238947(0x7f082023, float:1.8094187E38)
            r35 = 0
            r10 = 1
            X.NVe r14 = new X.NVe
            r17 = r15
            r18 = r15
            r23 = r10
            r20 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.add(r14)
            r5 = 12
            X.PgO r19 = X.C66580MXl.A15(r0, r5)
            X.Nmj r16 = X.C69501Nmj.A0A
            r6 = 30
            X.Phe r5 = new X.Phe
            r5.<init>(r6, r0, r2)
            r21 = 2131969940(0x7f134794, float:1.9576817E38)
            r22 = 2131238956(0x7f08202c, float:1.8094205E38)
            X.NVe r14 = new X.NVe
            r20 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.add(r14)
            r5 = 13
            X.PgO r18 = X.C66580MXl.A15(r0, r5)
            r5 = 31
            X.Phe r6 = new X.Phe
            r6.<init>(r5, r0, r2)
            r20 = 2131973441(0x7f135541, float:1.9583918E38)
            r21 = 2131238210(0x7f081d42, float:1.8092692E38)
            X.NVe r5 = new X.NVe
            r13 = r5
            r14 = r15
            r16 = r15
            r19 = r6
            r22 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.add(r5)
            r11 = 14
            X.PgO r19 = X.C66580MXl.A15(r0, r11)
            r6 = 32
            X.Phe r5 = new X.Phe
            r5.<init>(r6, r0, r2)
            X.Nmj r16 = X.C69501Nmj.A0D
            r21 = 2131972797(0x7f1352bd, float:1.9582612E38)
            r22 = 2131238766(0x7f081f6e, float:1.809382E38)
            X.NVe r14 = new X.NVe
            r18 = r15
            r23 = r1
            r20 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.add(r14)
            boolean r8 = X.N4P.A05(r2)
            if (r8 != 0) goto L_0x00e0
            int r5 = X.N4P.A00(r2)
            if (r5 != r10) goto L_0x00e0
            boolean r5 = A0M(r0)
            r14 = 2
            if (r5 == 0) goto L_0x00e1
        L_0x00e0:
            r14 = 3
        L_0x00e1:
            boolean r5 = r2.A0w
            if (r5 != 0) goto L_0x00f3
            boolean r5 = r2.A10
            if (r5 != 0) goto L_0x00f3
            boolean r5 = r2.A0q
            r23 = 2131958992(0x7f131cd0, float:1.9554612E38)
            r24 = 2131237864(0x7f081be8, float:1.809199E38)
            if (r5 == 0) goto L_0x00f9
        L_0x00f3:
            r23 = 2131959039(0x7f131cff, float:1.9554707E38)
            r24 = 2131237865(0x7f081be9, float:1.8091993E38)
        L_0x00f9:
            r5 = 33
            X.Phe r7 = new X.Phe
            r7.<init>(r5, r0, r2)
            r5 = 21
            X.Phe r6 = new X.Phe
            r6.<init>(r5, r0, r2)
            X.Nmj r18 = X.C69501Nmj.A06
            X.NVe r5 = new X.NVe
            r16 = r5
            r19 = r15
            r20 = r15
            r21 = r7
            r22 = r6
            r25 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3.add(r5)
            if (r8 != 0) goto L_0x01ab
            int r5 = X.N4P.A00(r2)
            if (r5 != r10) goto L_0x01ab
            X.0eM r5 = r2.A0c
            java.util.List r5 = X.JTO.A15(r5)
            java.lang.Object r5 = r5.get(r1)
            X.N9q r5 = (X.C68303N9q) r5
            X.0qQ.A0B(r5, r1)
            com.instagram.user.model.User r9 = r5.A00
            boolean r6 = r9.isRestricted()
            r32 = 2131972302(0x7f1350ce, float:1.9581608E38)
            if (r6 == 0) goto L_0x0142
            r32 = 2131975971(0x7f135f23, float:1.958905E38)
        L_0x0142:
            java.lang.Integer r28 = X.C66581MXm.A0m(r4)
            r6 = 45
            X.AwZ r8 = new X.AwZ
            r8.<init>(r6, r5, r0, r2)
            r6 = 22
            X.Phe r7 = new X.Phe
            r7.<init>(r6, r0, r5)
            X.Nmj r27 = X.C69501Nmj.A0C
            r33 = 2131238721(0x7f081f41, float:1.8093729E38)
            X.NVe r6 = new X.NVe
            r25 = r6
            r29 = r15
            r30 = r8
            r31 = r7
            r34 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.add(r6)
            boolean r6 = r9.CXO()
            r22 = 2131953885(0x7f1308dd, float:1.9544254E38)
            if (r6 == 0) goto L_0x0177
            r22 = 2131975843(0x7f135ea3, float:1.958879E38)
        L_0x0177:
            java.lang.Integer r18 = X.C66581MXm.A0m(r4)
            r6 = 2130970239(0x7f04067f, float:1.7549183E38)
            int r6 = X.AnonymousClass7TF.A03(r4, r6)
            android.graphics.ColorFilter r16 = X.AnonymousClass37O.A00(r6)
            java.lang.Integer r19 = X.C66581MXm.A0m(r4)
            r6 = 23
            X.Phe r7 = new X.Phe
            r7.<init>(r6, r0, r2)
            r8 = 24
            X.Phe r6 = new X.Phe
            r6.<init>(r8, r0, r5)
            X.Nmj r17 = X.C69501Nmj.A04
            r23 = 2131237975(0x7f081c57, float:1.8092216E38)
            X.NVe r15 = new X.NVe
            r20 = r7
            r21 = r6
            r24 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r15)
        L_0x01ab:
            java.lang.Integer r18 = X.C66581MXm.A0m(r4)
            r5 = 2130970239(0x7f04067f, float:1.7549183E38)
            int r5 = X.AnonymousClass7TF.A03(r4, r5)
            android.graphics.ColorFilter r16 = X.AnonymousClass37O.A00(r5)
            java.lang.Integer r19 = X.C66581MXm.A0m(r4)
            r5 = 25
            X.Phe r6 = new X.Phe
            r6.<init>(r5, r0, r2)
            r7 = 26
            X.Phe r5 = new X.Phe
            r5.<init>(r7, r0, r2)
            X.Nmj r17 = X.C69501Nmj.A0B
            r22 = 2131972171(0x7f13504b, float:1.9581342E38)
            r23 = 2131238715(0x7f081f3b, float:1.8093717E38)
            X.NVe r15 = new X.NVe
            r20 = r6
            r21 = r5
            r24 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r15)
            r5 = 10
            X.PgO r39 = X.C66580MXl.A15(r0, r5)
            r5 = 46
            X.AwZ r6 = new X.AwZ
            r6.<init>(r5, r4, r0, r2)
            r41 = 2131958945(0x7f131ca1, float:1.9554517E38)
            r42 = 2131238122(0x7f081cea, float:1.8092514E38)
            X.NVe r5 = new X.NVe
            r34 = r5
            r36 = r35
            r37 = r35
            r38 = r35
            r40 = r6
            r43 = r1
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r3.add(r5)
            X.9HD r8 = X.AnonymousClass9HC.A1b
            X.0eM r5 = r0.A14
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.direct.capabilities.Capabilities r6 = r0.A03
            if (r6 != 0) goto L_0x021c
            java.lang.String r0 = "threadCapabilities"
        L_0x0217:
            X.0qQ.A0F(r0)
            goto L_0x0022
        L_0x021c:
            X.9HC r7 = r8.A00(r7, r6)
            r6 = 27
            X.Phe r9 = new X.Phe
            r9.<init>(r6, r0, r2)
            r6 = 47
            X.AwZ r8 = new X.AwZ
            r8.<init>(r6, r4, r0, r2)
            r41 = 2131959237(0x7f131dc5, float:1.9555109E38)
            r42 = 2131238125(0x7f081ced, float:1.809252E38)
            X.NVe r6 = new X.NVe
            r34 = r6
            r39 = r9
            r40 = r8
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r3.add(r6)
            java.lang.Integer r38 = X.C66581MXm.A0m(r4)
            r6 = 28
            X.Phe r9 = new X.Phe
            r9.<init>(r6, r0, r2)
            r6 = 48
            X.AwZ r8 = new X.AwZ
            r8.<init>(r6, r4, r0, r2)
            r41 = 2131957531(0x7f13171b, float:1.9551649E38)
            r42 = 2131238196(0x7f081d34, float:1.8092664E38)
            X.NVe r6 = new X.NVe
            r34 = r6
            r39 = r9
            r40 = r8
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r3.add(r6)
            r8 = 49
            X.AwZ r6 = new X.AwZ
            r6.<init>(r8, r7, r0, r2)
            X.Inz r7 = new X.Inz
            r7.<init>(r1, r4, r0, r2)
            X.Nmj r17 = X.C69501Nmj.A05
            r22 = 2131959618(0x7f131f42, float:1.9555882E38)
            r23 = 2131238262(0x7f081d76, float:1.8092798E38)
            X.NVe r2 = new X.NVe
            r15 = r2
            r16 = r35
            r18 = r35
            r19 = r35
            r20 = r6
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r2)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r5)
            android.widget.LinearLayout r5 = r0.A00
            if (r5 != 0) goto L_0x029b
            java.lang.String r0 = "shortcutsContainer"
            goto L_0x0217
        L_0x029b:
            java.lang.Object r4 = r12.getValue()
            X.ODj r4 = (X.C70612ODj) r4
            X.AnonymousClass7TF.A1D(r6, r1, r4)
            r5.removeAllViewsInLayout()
            android.content.Context r15 = r5.getContext()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r3.iterator()
        L_0x02b3:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x02cc
            java.lang.Object r3 = r8.next()
            r2 = r3
            X.NVe r2 = (X.C68744NVe) r2
            X.0sa r2 = r2.A07
            boolean r2 = X.C51971G9r.A1b(r2)
            if (r2 == 0) goto L_0x02b3
            r7.add(r3)
            goto L_0x02b3
        L_0x02cc:
            r2 = 18
            java.util.List r9 = X.C73429PcU.A00(r7, r2)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            int r13 = r9.size()
            r8 = 0
            r3 = 0
        L_0x02dc:
            if (r8 >= r13) goto L_0x031f
            java.lang.Object r2 = r9.get(r8)
            X.NVe r2 = (X.C68744NVe) r2
            boolean r2 = r2.A08
            if (r2 == 0) goto L_0x02f2
            java.lang.Object r2 = r9.get(r8)
            r7.add(r2)
        L_0x02ef:
            int r8 = r8 + 1
            goto L_0x02dc
        L_0x02f2:
            int r2 = r14 + -1
            if (r3 != r2) goto L_0x03c3
            int r2 = X.DbT.A02(r9, r8)
            if (r2 <= r10) goto L_0x03bd
            X.0Tu r10 = X.0Tu.A05
            r2 = 36314910560750472(0x81043800060b88, double:3.0290338948017625E-306)
            boolean r2 = X.182.A06(r10, r6, r2)
            r10 = 2131238564(0x7f081ea4, float:1.809341E38)
            if (r2 == 0) goto L_0x030f
            r10 = 2131238715(0x7f081f3b, float:1.8093717E38)
        L_0x030f:
            int r2 = r9.size()
            java.util.List r3 = r9.subList(r8, r2)
            X.NVd r2 = new X.NVd
            r2.<init>(r3, r10)
        L_0x031c:
            r7.add(r2)
        L_0x031f:
            java.util.Iterator r10 = r7.iterator()
        L_0x0323:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x03ce
            java.lang.Object r9 = r10.next()
            X.NoS r9 = (X.C69584NoS) r9
            boolean r2 = r9 instanceof X.C68744NVe
            if (r2 == 0) goto L_0x037d
            X.NVe r9 = (X.C68744NVe) r9
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r15)
            r2 = 2131625151(0x7f0e04bf, float:1.8877502E38)
            android.view.View r7 = X.DbT.A0D(r3, r5, r2, r1)
            r2 = 2131441332(0x7f0b36b4, float:1.8504673E38)
            android.widget.ImageView r3 = X.DbX.A0J(r7, r2)
            r2 = 2131441333(0x7f0b36b5, float:1.8504675E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r7, r2)
            r7.setVisibility(r1)
            X.C71395Oju.A00(r7, r11, r9)
            int r2 = r9.A01
            X.DbT.A18(r15, r8, r2)
            java.lang.Integer r2 = r9.A05
            if (r2 == 0) goto L_0x0364
            int r2 = r2.intValue()
            X.DbT.A17(r15, r8, r2)
        L_0x0364:
            int r2 = r9.A00
            X.DbU.A13(r15, r3, r2)
            android.graphics.ColorFilter r2 = r9.A02
            if (r2 == 0) goto L_0x0370
            r3.setColorFilter(r2)
        L_0x0370:
            r5.addView(r7)
            X.Nmj r3 = r9.A03
            if (r3 == 0) goto L_0x0323
            java.util.Set r2 = r4.A02
            r2.add(r3)
            goto L_0x0323
        L_0x037d:
            boolean r2 = r9 instanceof X.C68743NVd
            if (r2 == 0) goto L_0x11c2
            X.0qQ.A0A(r15)
            X.NVd r9 = (X.C68743NVd) r9
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r15)
            r2 = 2131625151(0x7f0e04bf, float:1.8877502E38)
            android.view.View r2 = X.DbT.A0D(r3, r5, r2, r1)
            X.ODi r8 = new X.ODi
            r8.<init>(r2)
            android.view.View r7 = r8.A00
            r7.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r3 = r8.A02
            int r2 = r9.A01
            X.DbT.A18(r15, r3, r2)
            r14 = 5
            X.Ojz r13 = new X.Ojz
            r16 = r6
            r17 = r8
            r18 = r9
            r13.<init>((int) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18)
            X.AnonymousClass0fU.A00(r13, r7)
            com.instagram.common.ui.base.IgSimpleImageView r3 = r8.A01
            int r2 = r9.A00
            X.DbU.A13(r15, r3, r2)
            r5.addView(r7)
            goto L_0x0323
        L_0x03bd:
            java.lang.Object r2 = r9.get(r8)
            goto L_0x031c
        L_0x03c3:
            java.lang.Object r2 = r9.get(r8)
            r7.add(r2)
            int r3 = r3 + 1
            goto L_0x02ef
        L_0x03ce:
            A0D(r0)
            X.N4P r4 = r0.A0Z
            if (r4 == 0) goto L_0x042a
            X.0eM r3 = r0.A14
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r2 = X.OXA.A01(r2, r4)
            java.lang.String r8 = "inviteLinkSection"
            if (r2 == 0) goto L_0x1191
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r2 = X.OXA.A02(r2, r4)
            if (r2 == 0) goto L_0x1191
            java.lang.String r5 = r4.A0O
            X.OMs r2 = r0.A0K
            if (r2 == 0) goto L_0x11bd
            A0K(r2, r1)
            X.OMs r3 = r0.A0K
            if (r3 == 0) goto L_0x11bd
            r2 = 2131238496(0x7f081e60, float:1.8093272E38)
            r3.A00(r2)
            X.OMs r2 = r0.A0K
            if (r2 == 0) goto L_0x11bd
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131963172(0x7f132d24, float:1.956309E38)
            X.DbU.A1G(r3, r0, r2)
            boolean r2 = r4.A0j
            if (r2 == 0) goto L_0x1181
            if (r5 == 0) goto L_0x1181
            int r2 = r5.length()
            if (r2 == 0) goto L_0x1181
            X.OMs r2 = r0.A0K
            if (r2 == 0) goto L_0x11bd
            r2.A01(r5)
        L_0x041f:
            X.OMs r2 = r0.A0K
            if (r2 == 0) goto L_0x11bd
            android.view.View r3 = r2.A00
            r2 = 54
            X.C71405Ok4.A01(r3, r2, r4, r0)
        L_0x042a:
            X.N4P r6 = r0.A0Z
            if (r6 == 0) goto L_0x053a
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x053a
            X.0eM r4 = r0.A14
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.direct.capabilities.Capabilities r14 = r0.A03
            java.lang.String r11 = "threadCapabilities"
            if (r14 == 0) goto L_0x001f
            X.0qQ.A0B(r13, r1)
            X.3t3 r15 = r6.A0L
            int r3 = r6.A09
            boolean r17 = X.N4P.A04(r13, r6)
            boolean r2 = r6.A0v
            r16 = r3
            r18 = r2
            boolean r2 = X.C327827Ci.A02(r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x1174
            X.OIq r5 = X.P2L.A00
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.direct.capabilities.Capabilities r2 = r0.A03
            if (r2 == 0) goto L_0x001f
            boolean r2 = r5.A00(r3, r2, r6)
            if (r2 == 0) goto L_0x1174
            boolean r2 = r6.A0C()
            if (r2 != 0) goto L_0x1174
            java.lang.Object r2 = r12.getValue()
            X.ODj r2 = (X.C70612ODj) r2
            X.Nmj r3 = X.C69501Nmj.A0E
            java.util.Set r2 = r2.A02
            r2.add(r3)
            X.N4P r8 = r0.A0Z
            if (r8 == 0) goto L_0x053a
            android.content.Context r7 = r0.getContext()
            if (r7 == 0) goto L_0x053a
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.Dri r6 = X.C71123OdH.A00(r2, r8)
            X.OMs r2 = r0.A0P
            java.lang.String r11 = "themeSection"
            if (r2 == 0) goto L_0x001f
            android.view.View r2 = r2.A00
            r9 = 0
            r2.setVisibility(r1)
            X.OMs r2 = r0.A0P
            if (r2 == 0) goto L_0x001f
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131958756(0x7f131be4, float:1.9554133E38)
            X.DbU.A1G(r3, r0, r2)
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r5 = r6.A03
            java.lang.String r3 = r5.A0A
            if (r3 == 0) goto L_0x1159
            int r2 = r3.length()
            if (r2 == 0) goto L_0x1159
            X.OMs r2 = r0.A0P
            if (r2 == 0) goto L_0x001f
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
        L_0x04b6:
            r2.setText(r3)
        L_0x04b9:
            X.OMs r2 = r0.A0P
            if (r2 == 0) goto L_0x001f
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r2.A06
            r2.setVisibility(r1)
            boolean r2 = X.AnonymousClass3HA.A00(r7)
            if (r2 == 0) goto L_0x1155
            java.lang.String r3 = r5.A06
        L_0x04ca:
            if (r3 == 0) goto L_0x1146
            boolean r2 = X.C253833rU.A03(r3)
            if (r2 == 0) goto L_0x1146
            int r2 = r3.length()
            if (r2 == 0) goto L_0x1146
            X.OMs r2 = r0.A0P
            if (r2 == 0) goto L_0x001f
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r2.A06
            android.net.Uri r3 = X.DbT.A09(r3)
            r2 = -1
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.C253833rU.A00(r3, r2, r2)
            r5.setUrl(r2, r0)
        L_0x04ea:
            X.OMs r2 = r0.A0P
            if (r2 == 0) goto L_0x001f
            android.view.View r5 = r2.A01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0qQ.A0B(r3, r1)
            boolean r2 = X.OPO.A01(r3, r8)
            if (r2 != 0) goto L_0x0505
            boolean r2 = X.OPO.A00(r3, r8)
            if (r2 != 0) goto L_0x0505
            r9 = 8
        L_0x0505:
            r5.setVisibility(r9)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            boolean r2 = X.OPO.A00(r2, r8)
            if (r2 == 0) goto L_0x0523
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.1Av r5 = X.1Au.A00(r2)
            X.0s0 r4 = r5.A07
            X.0YZ[] r3 = X.1Av.A8a
            r2 = 430(0x1ae, float:6.03E-43)
            X.DbZ.A1b(r5, r4, r3, r2)
        L_0x0523:
            X.OMs r2 = r0.A0P
            if (r2 == 0) goto L_0x001f
            android.view.View r3 = r2.A00
            r14 = 4
            X.Ojz r2 = new X.Ojz
            r13 = r2
            r15 = r6
            r16 = r0
            r17 = r8
            r18 = r7
            r13.<init>((int) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18)
            X.AnonymousClass0fU.A00(r2, r3)
        L_0x053a:
            A0B(r0)
            X.OMs r2 = r0.A0J
            java.lang.String r3 = "disappearingMessagesSection"
            if (r2 == 0) goto L_0x11b8
            android.view.View r2 = r2.A00
            r4 = 8
            r2.setVisibility(r4)
            boolean r2 = r0.A0j
            if (r2 == 0) goto L_0x058c
            X.N4P r8 = r0.A0Z
            if (r8 == 0) goto L_0x058c
            android.content.Context r7 = r0.getContext()
            if (r7 == 0) goto L_0x058c
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r2 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r2 == 0) goto L_0x058c
            X.OMs r6 = r0.A0J
            if (r6 == 0) goto L_0x11b8
            com.instagram.common.ui.base.IgTextView r3 = r6.A05
            r2 = 2131960971(0x7f13248b, float:1.9558626E38)
            X.DbU.A1G(r3, r0, r2)
            com.instagram.common.ui.base.IgTextView r5 = r6.A04
            X.4li r2 = r8.A0H
            boolean r3 = r2.A08
            r2 = 2131960969(0x7f132489, float:1.9558622E38)
            if (r3 == 0) goto L_0x0576
            r2 = 2131960970(0x7f13248a, float:1.9558624E38)
        L_0x0576:
            X.DbU.A1G(r5, r0, r2)
            com.instagram.common.ui.base.IgSimpleImageView r3 = r6.A02
            r3.setVisibility(r1)
            r2 = 2131238132(0x7f081cf4, float:1.8092534E38)
            X.DbU.A13(r7, r3, r2)
            android.view.View r2 = r6.A00
            r2.setVisibility(r1)
            X.C71395Oju.A00(r2, r4, r0)
        L_0x058c:
            A0C(r0)
            X.N4P r6 = r0.A0Z
            if (r6 == 0) goto L_0x066e
            X.0eM r8 = r0.A14
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r8)
            X.0Tu r7 = X.0Tu.A05
            r2 = 36324883474428346(0x810d4a000031ba, double:3.03534080556935E-306)
            boolean r3 = X.182.A06(r7, r5, r2)
            r2 = 0
            if (r3 == 0) goto L_0x05c5
            int r5 = r6.A09
            r3 = 47
            if (r5 == r3) goto L_0x05db
            r3 = 1003(0x3eb, float:1.406E-42)
            if (r5 == r3) goto L_0x05db
            r3 = 1014(0x3f6, float:1.421E-42)
            if (r5 != r3) goto L_0x05c5
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r8)
            X.0qQ.A0B(r5, r1)
            r2 = 36329882816364911(0x8111d60000416f, double:3.038502409540768E-306)
            boolean r2 = X.182.A06(r7, r5, r2)
        L_0x05c5:
            java.lang.String r9 = "createGroupSection"
            if (r2 == 0) goto L_0x113d
            boolean r2 = r6.A0C()
            if (r2 != 0) goto L_0x113d
            X.3t3 r2 = r0.A0c
            r7 = 0
            if (r2 != 0) goto L_0x05dd
            java.lang.String r9 = "threadId"
        L_0x05d6:
            X.0qQ.A0F(r9)
            goto L_0x0022
        L_0x05db:
            r2 = 1
            goto L_0x05c5
        L_0x05dd:
            X.3t0 r5 = X.C300965yF.A02(r2)
            if (r5 == 0) goto L_0x05fd
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r8)
            X.2Dm r3 = X.2L2.A00(r2)
            java.lang.String r2 = r5.A00
            X.3U9 r2 = X.C66581MXm.A0a(r3, r2)
            if (r2 == 0) goto L_0x05f7
            X.3Tu r7 = r2.AiM()
        L_0x05f7:
            boolean r2 = X.C331057Pi.A02(r7)
            if (r2 != 0) goto L_0x113d
        L_0x05fd:
            boolean r2 = r0.A0k
            if (r2 != 0) goto L_0x113d
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgSimpleImageView r2 = r2.A02
            r2.setVisibility(r1)
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgSimpleImageView r5 = r2.A02
            android.content.Context r3 = r0.requireContext()
            r2 = 2131237850(0x7f081bda, float:1.8091962E38)
            X.DbU.A13(r3, r5, r2)
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            android.view.View r5 = r2.A00
            r3 = 31
            X.FP8 r2 = new X.FP8
            r2.<init>((java.lang.Object) r0, (int) r3)
            X.AnonymousClass0fU.A00(r2, r5)
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            android.view.View r3 = r2.A00
            boolean r6 = X.N4P.A05(r6)
            r5 = 1
            r2 = 2131958964(0x7f131cb4, float:1.9554555E38)
            if (r6 != r5) goto L_0x063d
            r2 = 2131958965(0x7f131cb5, float:1.9554557E38)
        L_0x063d:
            java.lang.String r2 = r0.getString(r2)
            r3.setContentDescription(r2)
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            android.view.View r2 = r2.A00
            X.2eS.A01(r2)
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131958964(0x7f131cb4, float:1.9554555E38)
            if (r6 != r5) goto L_0x065b
            r2 = 2131958965(0x7f131cb5, float:1.9554557E38)
        L_0x065b:
            X.DbU.A1G(r3, r0, r2)
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
            r2.setVisibility(r4)
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            A0K(r2, r1)
        L_0x066e:
            android.content.Context r7 = r0.getContext()
            if (r7 == 0) goto L_0x06ce
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            X.N4P r5 = r0.A0Z
            X.0qQ.A0B(r6, r1)
            r3 = 0
            if (r5 == 0) goto L_0x068f
            boolean r2 = X.C69948Nuo.A00(r6, r5)
            if (r2 != 0) goto L_0x068e
            boolean r2 = X.C69947Nun.A00(r6, r5)
            if (r2 == 0) goto L_0x068f
        L_0x068e:
            r3 = 1
        L_0x068f:
            java.lang.String r5 = "chatControlsSection"
            X.OMs r2 = r0.A0G
            if (r3 == 0) goto L_0x1136
            if (r2 == 0) goto L_0x11b3
            com.instagram.common.ui.base.IgSimpleImageView r2 = r2.A02
            r2.setVisibility(r1)
            X.OMs r2 = r0.A0G
            if (r2 == 0) goto L_0x11b3
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A02
            r2 = 2131238148(0x7f081d04, float:1.8092567E38)
            X.DbU.A13(r7, r3, r2)
            X.OMs r2 = r0.A0G
            if (r2 == 0) goto L_0x11b3
            android.view.View r3 = r2.A00
            r2 = 6
            X.C71395Oju.A00(r3, r2, r0)
            X.OMs r2 = r0.A0G
            if (r2 == 0) goto L_0x11b3
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131958962(0x7f131cb2, float:1.955455E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r2 = r0.A0G
            if (r2 == 0) goto L_0x11b3
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
            r2.setVisibility(r4)
            X.OMs r2 = r0.A0G
            if (r2 == 0) goto L_0x11b3
            A0K(r2, r1)
        L_0x06ce:
            android.content.Context r7 = r0.getContext()
            if (r7 == 0) goto L_0x075a
            X.N4P r6 = r0.A0Z
            if (r6 == 0) goto L_0x06df
            int r5 = r6.A09
            r3 = 29
            r2 = 1
            if (r5 == r3) goto L_0x06e0
        L_0x06df:
            r2 = 0
        L_0x06e0:
            java.lang.String r8 = "channelInsightsSection"
            r5 = 0
            if (r2 == 0) goto L_0x112d
            if (r6 == 0) goto L_0x06ed
            X.3Te r2 = r6.A0E
            if (r2 == 0) goto L_0x06ed
            java.lang.String r5 = r2.A07
        L_0x06ed:
            X.0eM r3 = r0.A14
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r2 = X.C51966G9m.A1W(r2, r5)
            if (r2 == 0) goto L_0x112d
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r5 = X.0Tu.A05
            r2 = 36319407399443848(0x81084f007f1d88, double:3.0318777136987695E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x112d
            X.OMs r2 = r0.A0F
            if (r2 == 0) goto L_0x11bd
            com.instagram.common.ui.base.IgSimpleImageView r2 = r2.A02
            r2.setVisibility(r1)
            X.OMs r2 = r0.A0F
            if (r2 == 0) goto L_0x11bd
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A02
            r2 = 2131238469(0x7f081e45, float:1.8093218E38)
            X.DbU.A13(r7, r3, r2)
            X.OMs r2 = r0.A0F
            if (r2 == 0) goto L_0x11bd
            android.view.View r3 = r2.A00
            r2 = 5
            X.C71395Oju.A00(r3, r2, r0)
            X.OMs r2 = r0.A0F
            if (r2 == 0) goto L_0x11bd
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131958955(0x7f131cab, float:1.9554537E38)
            X.DbU.A1G(r3, r0, r2)
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x112a
            X.3Te r2 = r2.A0E
            if (r2 == 0) goto L_0x112a
            int r6 = r2.A02
        L_0x073f:
            X.OMs r2 = r0.A0F
            if (r2 == 0) goto L_0x11bd
            com.instagram.common.ui.base.IgTextView r5 = r2.A04
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131820647(0x7f110067, float:1.9274015E38)
            java.lang.String r2 = X.DbY.A0d(r3, r6, r2)
            r5.setText(r2)
            X.OMs r2 = r0.A0F
            if (r2 == 0) goto L_0x11bd
            A0K(r2, r1)
        L_0x075a:
            android.content.Context r7 = r0.getContext()
            if (r7 == 0) goto L_0x07e6
            X.0eM r5 = r0.A14
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            X.3t3 r10 = r0.A0c
            if (r10 == 0) goto L_0x1126
            X.N4P r6 = r0.A0Z
            X.0qQ.A0B(r8, r1)
            if (r6 == 0) goto L_0x0785
            boolean r2 = X.C329997La.A01(r8, r6)
            if (r2 == 0) goto L_0x0785
            boolean r2 = r6.A0v
            if (r2 == 0) goto L_0x0785
            X.0Tu r9 = X.0Tu.A05
            r2 = 36317719469233618(0x8106c6000415d2, double:3.0308102598370707E-306)
            X.182.A06(r9, r8, r2)
        L_0x0785:
            r9 = 1
            if (r6 == 0) goto L_0x1103
            int r3 = r6.A07
            r2 = 6
            if (r3 == r2) goto L_0x078f
            if (r3 != r4) goto L_0x1103
        L_0x078f:
            r9 = 0
        L_0x0790:
            java.lang.String r6 = "channelControlsSection"
            X.OMs r2 = r0.A0E
            if (r9 == 0) goto L_0x10fc
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgSimpleImageView r2 = r2.A02
            r2.setVisibility(r1)
            X.OMs r2 = r0.A0E
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A02
            r2 = 2131238148(0x7f081d04, float:1.8092567E38)
            X.DbU.A13(r7, r3, r2)
            X.OMs r2 = r0.A0E
            if (r2 == 0) goto L_0x0864
            android.view.View r3 = r2.A00
            r2 = 4
            X.C71395Oju.A00(r3, r2, r0)
            X.OMs r2 = r0.A0E
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131958954(0x7f131caa, float:1.9554535E38)
            X.DbU.A1G(r3, r0, r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.9HW r5 = X.AnonymousClass9HV.A00(r2)
            X.3t3 r3 = r0.A0c
            if (r3 == 0) goto L_0x1126
            r2 = 45
            boolean r3 = r5.A00(r3, r2)
            X.OMs r2 = r0.A0E
            if (r3 == 0) goto L_0x10f3
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgTextView r3 = r2.A04
            r2 = 2131958953(0x7f131ca9, float:1.9554533E38)
            X.DbU.A1G(r3, r0, r2)
        L_0x07df:
            X.OMs r2 = r0.A0E
            if (r2 == 0) goto L_0x0864
            A0K(r2, r1)
        L_0x07e6:
            android.content.Context r7 = r0.requireContext()
            X.N4P r5 = r0.A0Z
            if (r5 == 0) goto L_0x084c
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            X.0Tu r6 = X.0Tu.A05
            r2 = 36326807619778539(0x810f0a000037eb, double:3.0365576428367236E-306)
            boolean r2 = X.182.A06(r6, r8, r2)
            java.lang.String r6 = "nicknamesSection"
            if (r2 == 0) goto L_0x10ea
            X.OMs r2 = r0.A0L
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgSimpleImageView r2 = r2.A02
            r2.setVisibility(r1)
            X.OMs r2 = r0.A0L
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A02
            r2 = 2131238951(0x7f082027, float:1.8094195E38)
            X.DbU.A13(r7, r3, r2)
            X.OMs r2 = r0.A0L
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131959004(0x7f131cdc, float:1.9554636E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r2 = r0.A0L
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
            r2.setVisibility(r4)
            X.OMs r2 = r0.A0L
            if (r2 == 0) goto L_0x0864
            A0K(r2, r1)
            X.OMs r2 = r0.A0L
            if (r2 == 0) goto L_0x0864
            android.view.View r3 = r2.A00
            r2 = 55
            X.C71405Ok4.A01(r3, r2, r5, r0)
            java.lang.Object r2 = r12.getValue()
            X.ODj r2 = (X.C70612ODj) r2
            X.Nmj r3 = X.C69501Nmj.A07
            java.util.Set r2 = r2.A02
            r2.add(r3)
        L_0x084c:
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x0927
            android.content.Context r5 = r0.getContext()
            if (r5 == 0) goto L_0x0927
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r2)
            X.N4P r8 = r0.A0Z
            com.instagram.direct.capabilities.Capabilities r7 = r0.A03
            if (r7 != 0) goto L_0x0869
            java.lang.String r6 = "threadCapabilities"
        L_0x0864:
            X.0qQ.A0F(r6)
            goto L_0x0022
        L_0x0869:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.1Av r2 = X.1Au.A00(r2)
            X.C51972G9s.A1B(r9, r2)
            r10 = 0
            if (r8 == 0) goto L_0x08da
            X.OIp r2 = X.C72357P2w.A05
            boolean r2 = r2.A00(r9, r8, r1)
            if (r2 != 0) goto L_0x08be
            boolean r2 = X.C69953Nut.A00(r9, r7, r8)
            if (r2 != 0) goto L_0x08be
            boolean r2 = r8.A13
            if (r2 != 0) goto L_0x08be
            boolean r2 = X.OPN.A01(r9, r8)
            if (r2 != 0) goto L_0x08be
            X.3t3 r2 = r8.A0L
            X.0qQ.A0B(r2, r1)
            boolean r2 = r2 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r2 != 0) goto L_0x08be
            boolean r2 = r8.A0m
            if (r2 != 0) goto L_0x08be
            boolean r2 = X.C69954Nuu.A00(r9, r8)
            if (r2 != 0) goto L_0x08be
            X.0eM r3 = r8.A0c
            java.util.List r2 = X.JTO.A15(r3)
            boolean r2 = X.AnonymousClass7TE.A1b(r2)
            if (r2 == 0) goto L_0x10c6
            java.util.List r2 = X.JTO.A15(r3)
            java.lang.Object r2 = r2.get(r1)
            X.N9q r2 = (X.C68303N9q) r2
            boolean r2 = X.C69952Nus.A00(r9, r7, r8, r2)
            if (r2 == 0) goto L_0x10c6
        L_0x08be:
            r6 = 1
        L_0x08bf:
            boolean r2 = r8.A0v
            if (r2 == 0) goto L_0x08da
            boolean r2 = X.C66640Ma9.A03(r8)
            if (r2 != 0) goto L_0x08da
            int r3 = r8.A09
            r2 = 1014(0x3f6, float:1.421E-42)
            if (r3 == r2) goto L_0x08da
            r2 = 1012(0x3f4, float:1.418E-42)
            if (r3 == r2) goto L_0x08da
            r2 = 1013(0x3f5, float:1.42E-42)
            if (r3 == r2) goto L_0x08da
            if (r6 == 0) goto L_0x08da
            r10 = 1
        L_0x08da:
            java.lang.String r6 = "privacyControlsSection"
            if (r10 == 0) goto L_0x10bd
            java.lang.Object r2 = r12.getValue()
            X.ODj r2 = (X.C70612ODj) r2
            X.Nmj r3 = X.C69501Nmj.A09
            java.util.Set r2 = r2.A02
            r2.add(r3)
            X.OMs r2 = r0.A0M
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgSimpleImageView r2 = r2.A02
            r2.setVisibility(r1)
            X.OMs r2 = r0.A0M
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A02
            r2 = 2131238514(0x7f081e72, float:1.8093309E38)
            X.DbU.A13(r5, r3, r2)
            X.OMs r2 = r0.A0M
            if (r2 == 0) goto L_0x0864
            android.view.View r3 = r2.A00
            r2 = 13
            X.C71395Oju.A00(r3, r2, r0)
            X.OMs r2 = r0.A0M
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131959016(0x7f131ce8, float:1.955466E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r2 = r0.A0M
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
            r2.setVisibility(r4)
            X.OMs r2 = r0.A0M
            if (r2 == 0) goto L_0x0864
            A0K(r2, r1)
        L_0x0927:
            X.N4P r5 = r0.A0Z
            android.content.Context r8 = r0.getContext()
            if (r8 == 0) goto L_0x0a27
            java.lang.String r16 = "blockButton"
            java.lang.String r15 = "reportButton"
            java.lang.String r14 = "restrictButton"
            if (r5 == 0) goto L_0x10a6
            boolean r2 = X.N4P.A05(r5)
            if (r2 != 0) goto L_0x10a6
            boolean r2 = r5.A0C()
            if (r2 != 0) goto L_0x10a6
            int r2 = X.N4P.A00(r5)
            r10 = 1
            if (r2 != r10) goto L_0x10a6
            boolean r2 = r0.A0l
            if (r2 == 0) goto L_0x10a6
            X.0eM r2 = r5.A0c
            java.util.List r2 = X.JTO.A15(r2)
            java.lang.Object r6 = r2.get(r1)
            X.N9q r6 = (X.C68303N9q) r6
            int r2 = X.2Yu.A03(r8)
            int r7 = r8.getColor(r2)
            X.0eM r9 = r0.A14
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r9)
            com.instagram.direct.capabilities.Capabilities r2 = r0.A03
            java.lang.String r13 = "threadCapabilities"
            if (r2 == 0) goto L_0x119f
            boolean r2 = X.C69952Nus.A00(r3, r2, r5, r6)
            if (r2 == 0) goto L_0x109d
            java.lang.Object r2 = r12.getValue()
            X.ODj r2 = (X.C70612ODj) r2
            X.Nmj r3 = X.C69501Nmj.A0C
            java.util.Set r2 = r2.A02
            r2.add(r3)
            X.OMs r11 = r0.A0O
            if (r11 == 0) goto L_0x11ae
            X.0qQ.A0B(r6, r10)
            com.instagram.user.model.User r2 = r6.A00
            boolean r3 = r2.isRestricted()
            r2 = 2131972302(0x7f1350ce, float:1.9581608E38)
            if (r3 == 0) goto L_0x0996
            r2 = 2131975971(0x7f135f23, float:1.958905E38)
        L_0x0996:
            java.lang.String r10 = X.AnonymousClass7TE.A16(r8, r2)
            r3 = 2131238721(0x7f081f41, float:1.8093729E38)
            int r2 = X.C51968G9o.A04(r8)
            A04(r8, r11, r10, r3, r2)
            X.OMs r2 = r0.A0O
            if (r2 == 0) goto L_0x11ae
            android.view.View r3 = r2.A00
            r2 = 56
            X.C71405Ok4.A01(r3, r2, r6, r0)
        L_0x09af:
            com.instagram.direct.capabilities.Capabilities r2 = r0.A03
            if (r2 == 0) goto L_0x119f
            boolean r2 = X.C69950Nuq.A00(r2, r5)
            if (r2 == 0) goto L_0x1094
            java.lang.Object r2 = r12.getValue()
            X.ODj r2 = (X.C70612ODj) r2
            X.Nmj r3 = X.C69501Nmj.A04
            java.util.Set r2 = r2.A02
            r2.add(r3)
            X.OMs r10 = r0.A0D
            if (r10 == 0) goto L_0x11a9
            X.0qQ.A0B(r6, r1)
            com.instagram.user.model.User r2 = r6.A00
            boolean r3 = r2.CXO()
            r2 = 2131953885(0x7f1308dd, float:1.9544254E38)
            if (r3 == 0) goto L_0x09db
            r2 = 2131975843(0x7f135ea3, float:1.958879E38)
        L_0x09db:
            java.lang.String r3 = X.DbU.A0m(r0, r2)
            r2 = 2131237975(0x7f081c57, float:1.8092216E38)
            A04(r8, r10, r3, r2, r7)
            X.OMs r2 = r0.A0D
            if (r2 == 0) goto L_0x11a9
            android.view.View r3 = r2.A00
            r2 = 57
            X.C71405Ok4.A01(r3, r2, r6, r0)
        L_0x09f0:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r9)
            com.instagram.direct.capabilities.Capabilities r2 = r0.A03
            if (r2 == 0) goto L_0x119f
            boolean r2 = X.C69951Nur.A00(r3, r2, r5)
            if (r2 == 0) goto L_0x10b4
            java.lang.Object r2 = r12.getValue()
            X.ODj r2 = (X.C70612ODj) r2
            X.Nmj r3 = X.C69501Nmj.A0B
            java.util.Set r2 = r2.A02
            r2.add(r3)
            X.OMs r5 = r0.A0N
            if (r5 == 0) goto L_0x11a4
            r2 = 2131972171(0x7f13504b, float:1.9581342E38)
            java.lang.String r3 = X.DbU.A0m(r0, r2)
            r2 = 2131238715(0x7f081f3b, float:1.8093717E38)
            A04(r8, r5, r3, r2, r7)
            X.OMs r2 = r0.A0N
            if (r2 == 0) goto L_0x11a4
            android.view.View r3 = r2.A00
            r2 = 58
            X.C71405Ok4.A01(r3, r2, r6, r0)
        L_0x0a27:
            A0F(r0)
            X.N4P r7 = r0.A0Z
            if (r7 == 0) goto L_0x0acb
            int r3 = r7.A09
            r2 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r8 = "agentEmbodimentSection"
            if (r3 != r2) goto L_0x108b
            X.0eM r3 = r0.A14
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r2 = X.AnonymousClass9B8.A06(r2)
            if (r2 == 0) goto L_0x108b
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r5 = X.DbS.A0J(r6, r1)
            r2 = 36319398803479784(0x81084d00231ce8, double:3.031872277576482E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x108b
            int r2 = X.N4P.A00(r7)
            r5 = 1
            if (r2 != r5) goto L_0x0acb
            com.instagram.user.model.User r6 = X.N4P.A01(r7)
            boolean r2 = r6.A1l()
            if (r2 == 0) goto L_0x108b
            X.0eM r2 = r0.A13
            java.lang.Object r3 = r2.getValue()
            X.7ZW r3 = (X.AnonymousClass7ZW) r3
            java.lang.String r2 = r6.getId()
            java.lang.Boolean r3 = r3.A00(r2)
            if (r3 == 0) goto L_0x108b
            com.instagram.igds.components.textcell.IgdsListCell r2 = r0.A0b
            if (r2 == 0) goto L_0x11bd
            r2.setVisibility(r1)
            com.instagram.igds.components.textcell.IgdsListCell r7 = r0.A0b
            if (r7 == 0) goto L_0x11bd
            boolean r3 = r3.booleanValue()
            r2 = 2131968751(0x7f1342ef, float:1.9574405E38)
            if (r3 == 0) goto L_0x0a8f
            r2 = 2131968777(0x7f134309, float:1.9574458E38)
        L_0x0a8f:
            java.lang.String r2 = X.DbU.A0m(r0, r2)
            r7.A0K(r2, r1)
            com.instagram.igds.components.textcell.IgdsListCell r3 = r0.A0b
            if (r3 == 0) goto L_0x11bd
            r2 = 2131238943(0x7f08201f, float:1.8094179E38)
            r3.A05(r2)
            com.instagram.igds.components.textcell.IgdsListCell r3 = r0.A0b
            if (r3 == 0) goto L_0x11bd
            X.Njo r2 = X.C69349Njo.TYPE_CHEVRON
            r3.setTextCellType(r2)
            com.instagram.igds.components.textcell.IgdsListCell r3 = r0.A0b
            if (r3 == 0) goto L_0x11bd
            X.AnonymousClass9B9.A00()
            r2 = 2131960487(0x7f1322a7, float:1.9557644E38)
            r3.A06(r2)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r0.A0b
            if (r2 == 0) goto L_0x11bd
            r2.setEnabled(r5)
            com.instagram.igds.components.textcell.IgdsListCell r5 = r0.A0b
            if (r5 == 0) goto L_0x11bd
            r3 = 52
            X.Ok4 r2 = new X.Ok4
            r2.<init>(r3, r6, r0)
            r5.A0C(r2)
        L_0x0acb:
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x0b35
            int r3 = r2.A09
            r2 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r7 = "agentHallucinationDisclaimerSection"
            if (r3 == r2) goto L_0x0adb
            r2 = 1014(0x3f6, float:1.421E-42)
            if (r3 != r2) goto L_0x1082
        L_0x0adb:
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            X.0qQ.A0B(r6, r1)
            boolean r2 = X.AnonymousClass9B8.A07(r6)
            if (r2 == 0) goto L_0x1082
            X.0Tu r5 = X.0Tu.A05
            r2 = 36319398806560011(0x81084d00521d0b, double:3.03187227952443E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x1082
            X.OMs r2 = r0.A09
            if (r2 == 0) goto L_0x119a
            A0K(r2, r1)
            X.OMs r3 = r0.A09
            if (r3 == 0) goto L_0x119a
            r2 = 2131238900(0x7f081ff4, float:1.8094092E38)
            r3.A00(r2)
            X.AnonymousClass9B9.A00()
            X.OMs r2 = r0.A09
            if (r2 == 0) goto L_0x119a
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131960495(0x7f1322af, float:1.955766E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r3 = r0.A09
            if (r3 == 0) goto L_0x119a
            r2 = 2131960494(0x7f1322ae, float:1.9557658E38)
            java.lang.String r2 = X.DbU.A0m(r0, r2)
            r3.A01(r2)
            X.OMs r2 = r0.A09
            if (r2 == 0) goto L_0x119a
            android.view.View r5 = r2.A00
            r3 = 30
            X.FP8 r2 = new X.FP8
            r2.<init>((java.lang.Object) r0, (int) r3)
            X.AnonymousClass0fU.A00(r2, r5)
        L_0x0b35:
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x0b92
            int r3 = r2.A09
            r2 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r7 = "agentDataUsageSection"
            if (r3 == r2) goto L_0x0b45
            r2 = 1014(0x3f6, float:1.421E-42)
            if (r3 != r2) goto L_0x1079
        L_0x0b45:
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            boolean r2 = X.AnonymousClass9B8.A07(r2)
            if (r2 == 0) goto L_0x1079
            X.OMs r2 = r0.A08
            if (r2 == 0) goto L_0x119a
            A0K(r2, r1)
            X.OMs r3 = r0.A08
            if (r3 == 0) goto L_0x119a
            r2 = 2131238199(0x7f081d37, float:1.809267E38)
            r3.A00(r2)
            X.1ps r2 = X.AnonymousClass9B9.A00()
            X.1pt r6 = r2.A02
            X.OMs r2 = r0.A08
            if (r2 == 0) goto L_0x119a
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131960486(0x7f1322a6, float:1.9557642E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r3 = r0.A08
            if (r3 == 0) goto L_0x119a
            r2 = 2131960485(0x7f1322a5, float:1.955764E38)
            java.lang.String r2 = X.DbU.A0m(r0, r2)
            r3.A01(r2)
            X.OMs r2 = r0.A08
            if (r2 == 0) goto L_0x119a
            android.view.View r5 = r2.A00
            r3 = 56
            X.FPE r2 = new X.FPE
            r2.<init>((int) r3, (java.lang.Object) r6, (java.lang.Object) r0)
            X.AnonymousClass0fU.A00(r2, r5)
        L_0x0b92:
            X.N4P r6 = r0.A0Z
            if (r6 == 0) goto L_0x0c89
            X.0eM r2 = r6.A0c
            java.util.List r3 = X.JTO.A15(r2)
            int r2 = r3.size()
            r5 = 1
            if (r2 != r5) goto L_0x1076
            java.lang.Object r2 = X.00k.A0I(r3)
            X.N9q r2 = (X.C68303N9q) r2
            com.instagram.user.model.User r2 = r2.A00
            boolean r2 = r2.A1X()
            if (r2 == 0) goto L_0x1076
        L_0x0bb1:
            r11 = 1
            if (r5 == 0) goto L_0x0bc8
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            X.0Tu r7 = X.0Tu.A05
            r2 = 36325145468220038(0x810d87000c3286, double:3.0355064914981805E-306)
            boolean r2 = X.182.A06(r7, r8, r2)
            r10 = 1
            if (r2 != 0) goto L_0x0bc9
        L_0x0bc8:
            r10 = 0
        L_0x0bc9:
            int r2 = r6.A09
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = X.AnonymousClass48O.A06(r2)
            if (r2 == 0) goto L_0x1073
            if (r5 != 0) goto L_0x1073
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            X.0Tu r7 = X.0Tu.A05
            r2 = 36325145468154501(0x810d87000b3285, double:3.0355064914567346E-306)
            boolean r2 = X.182.A06(r7, r8, r2)
            if (r2 == 0) goto L_0x1073
        L_0x0bea:
            X.0eM r7 = r0.A14
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r7)
            X.0Tu r8 = X.0Tu.A05
            r2 = 36325145467433598(0x810d870000327e, double:3.0355064910008326E-306)
            boolean r2 = X.182.A06(r8, r9, r2)
            java.lang.String r9 = "agentAiStudioSection"
            r8 = 0
            if (r10 != 0) goto L_0x0c02
            if (r11 == 0) goto L_0x106a
        L_0x0c02:
            if (r2 == 0) goto L_0x106a
            X.OMs r2 = r0.A06
            if (r2 == 0) goto L_0x05d6
            A0K(r2, r1)
            X.0eM r2 = r6.A0c
            java.util.List r2 = X.JTO.A15(r2)
            if (r2 == 0) goto L_0x1067
            java.lang.Object r2 = X.00k.A0J(r2)
            X.N9q r2 = (X.C68303N9q) r2
            if (r2 == 0) goto L_0x1067
            com.instagram.user.model.User r6 = r2.A00
        L_0x0c1d:
            if (r5 == 0) goto L_0x1063
            java.lang.String r17 = "meta_ai_thread_details"
        L_0x0c21:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            X.LTH r5 = new X.LTH
            r5.<init>(r2)
            if (r6 == 0) goto L_0x1060
            X.4Cl r2 = r6.A03
            java.lang.String r7 = r2.AaU()
        L_0x0c32:
            X.1Ln r3 = X.LTH.A00(r5)
            boolean r2 = X.DbT.A1Y(r3)
            if (r2 == 0) goto L_0x0c4d
            java.lang.String r2 = "thread_details_ai_studio_button_shown"
            r3.A0l(r2)
            if (r7 == 0) goto L_0x0c47
            java.lang.Long r8 = X.AnonymousClass7TE.A10(r7)
        L_0x0c47:
            r3.A0j(r8)
            r3.Cgf()
        L_0x0c4d:
            X.OMs r3 = r0.A06
            if (r3 == 0) goto L_0x05d6
            r2 = 2131237857(0x7f081be1, float:1.8091976E38)
            r3.A00(r2)
            X.AnonymousClass9B9.A00()
            X.OMs r2 = r0.A06
            if (r2 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131960491(0x7f1322ab, float:1.9557652E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r3 = r0.A06
            if (r3 == 0) goto L_0x05d6
            r2 = 2131960490(0x7f1322aa, float:1.955765E38)
            java.lang.String r2 = X.DbU.A0m(r0, r2)
            r3.A01(r2)
            X.OMs r2 = r0.A06
            if (r2 == 0) goto L_0x05d6
            android.view.View r3 = r2.A00
            r18 = 2
            X.FOu r2 = new X.FOu
            r13 = r2
            r14 = r5
            r15 = r0
            r16 = r6
            r13.<init>((X.LTH) r14, (X.NJY) r15, (com.instagram.user.model.User) r16, (java.lang.String) r17, (int) r18)
            X.AnonymousClass0fU.A00(r2, r3)
        L_0x0c89:
            X.N4P r5 = r0.A0Z
            if (r5 == 0) goto L_0x0d07
            int r3 = r5.A09
            r2 = 1014(0x3f6, float:1.421E-42)
            java.lang.String r8 = "agentCreatorSection"
            if (r3 != r2) goto L_0x1057
            X.0eM r3 = r0.A14
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r2 = X.AnonymousClass9B8.A07(r2)
            if (r2 == 0) goto L_0x1057
            X.0eM r2 = r5.A0c
            java.util.List r2 = X.JTO.A15(r2)
            if (r2 == 0) goto L_0x0d07
            java.lang.Object r2 = X.00k.A0J(r2)
            X.N9q r2 = (X.C68303N9q) r2
            if (r2 == 0) goto L_0x0d07
            com.instagram.user.model.User r6 = r2.A00
            if (r6 == 0) goto L_0x0d07
            X.4Cl r2 = r6.A03
            java.lang.String r7 = r2.AaS()
            if (r7 == 0) goto L_0x0d07
            X.4Cl r2 = r6.A03
            java.lang.String r17 = r2.AaR()
            if (r17 == 0) goto L_0x0d07
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            X.LTH r5 = new X.LTH
            r5.<init>(r2)
            X.OMs r2 = r0.A07
            if (r2 == 0) goto L_0x11bd
            A0K(r2, r1)
            X.OMs r3 = r0.A07
            if (r3 == 0) goto L_0x11bd
            r2 = 2131238943(0x7f08201f, float:1.8094179E38)
            r3.A00(r2)
            X.OMs r2 = r0.A07
            if (r2 == 0) goto L_0x11bd
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131968702(0x7f1342be, float:1.9574306E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r2 = r0.A07
            if (r2 == 0) goto L_0x11bd
            r2.A01(r7)
            X.OMs r2 = r0.A07
            if (r2 == 0) goto L_0x11bd
            android.view.View r3 = r2.A00
            r18 = 3
            X.FOu r2 = new X.FOu
            r13 = r2
            r14 = r5
            r15 = r0
            r16 = r6
            r13.<init>((X.LTH) r14, (X.NJY) r15, (com.instagram.user.model.User) r16, (java.lang.String) r17, (int) r18)
            X.AnonymousClass0fU.A00(r2, r3)
        L_0x0d07:
            X.N4P r11 = r0.A0Z
            if (r11 == 0) goto L_0x0d8a
            X.1px r14 = X.AnonymousClass1q4.A00()
            androidx.fragment.app.FragmentActivity r15 = r0.requireActivity()
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            X.1pw r14 = (X.1pw) r14
            r7 = 1
            X.0qQ.A0B(r8, r7)
            X.0eM r10 = r11.A0c
            java.util.List r5 = X.JTO.A15(r10)
            int r9 = r11.A09
            boolean r6 = r14.BZO(r8, r5, r9)
            X.6oA r3 = new X.6oA
            r3.<init>(r8)
            r2 = 1003(0x3eb, float:1.406E-42)
            if (r9 != r2) goto L_0x0d3f
            com.instagram.user.model.User r2 = X.AnonymousClass7TF.A0Q(r8)
            boolean r3 = r2.CQp(r3)
            r2 = 1
            if (r3 != 0) goto L_0x0d40
        L_0x0d3f:
            r2 = 0
        L_0x0d40:
            r9 = 0
            if (r6 != 0) goto L_0x0fbc
            if (r2 != 0) goto L_0x0fbc
        L_0x0d45:
            java.lang.String r7 = "creatorAIRepliesSection"
            if (r9 == 0) goto L_0x0fb2
            java.lang.Object r2 = r12.getValue()
            X.ODj r2 = (X.C70612ODj) r2
            X.Nmj r3 = X.C69501Nmj.A03
            java.util.Set r2 = r2.A02
            r2.add(r3)
            X.OMs r3 = r0.A0I
            if (r3 == 0) goto L_0x119a
            int r2 = r9.A00
            r3.A00(r2)
            X.OMs r2 = r0.A0I
            if (r2 == 0) goto L_0x119a
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            java.lang.Object r2 = r9.A03
            X.DbZ.A14(r3, r2)
            X.OMs r2 = r0.A0I
            if (r2 == 0) goto L_0x119a
            com.instagram.common.ui.base.IgTextView r3 = r2.A04
            java.lang.Object r2 = r9.A02
            X.DbZ.A14(r3, r2)
            X.OMs r2 = r0.A0I
            if (r2 == 0) goto L_0x119a
            android.view.View r3 = r2.A00
            r2 = 53
            X.C71405Ok4.A01(r3, r2, r9, r0)
            X.OMs r2 = r0.A0I
            if (r2 == 0) goto L_0x119a
            android.view.View r3 = r2.A00
            r2 = 0
        L_0x0d87:
            r3.setVisibility(r2)
        L_0x0d8a:
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x0dec
            int r3 = r2.A09
            r2 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r7 = "agentMemuSection"
            if (r3 != r2) goto L_0x0fa9
            X.0eM r3 = r0.A14
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r2 = X.AnonymousClass9B8.A07(r2)
            if (r2 == 0) goto L_0x0fa9
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r5 = X.0Tu.A05
            r2 = 36325836957168902(0x810e2800003506, double:3.0359437918938446E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x0fa9
            X.OMs r2 = r0.A0A
            if (r2 == 0) goto L_0x119a
            A0K(r2, r1)
            X.OMs r3 = r0.A0A
            if (r3 == 0) goto L_0x119a
            r2 = 2131238284(0x7f081d8c, float:1.8092842E38)
            r3.A00(r2)
            X.AnonymousClass9B9.A00()
            X.OMs r2 = r0.A0A
            if (r2 == 0) goto L_0x119a
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131960489(0x7f1322a9, float:1.9557648E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r3 = r0.A0A
            if (r3 == 0) goto L_0x119a
            r2 = 2131960488(0x7f1322a8, float:1.9557646E38)
            java.lang.String r2 = X.DbU.A0m(r0, r2)
            r3.A01(r2)
            X.OMs r2 = r0.A0A
            if (r2 == 0) goto L_0x119a
            android.view.View r3 = r2.A00
            r2 = 42
            X.C56800ICx.A00(r3, r2, r0)
        L_0x0dec:
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x0e46
            int r3 = r2.A09
            r2 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r9 = "agentVoiceSettingsSection"
            if (r3 != r2) goto L_0x0fa0
            X.0eM r3 = r0.A14
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r2 = X.AnonymousClass9B8.A07(r2)
            if (r2 == 0) goto L_0x0fa0
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r2 = X.AnonymousClass9B8.A0A(r2)
            if (r2 == 0) goto L_0x0fa0
            X.OMs r2 = r0.A0B
            if (r2 == 0) goto L_0x05d6
            A0K(r2, r1)
            X.OMs r3 = r0.A0B
            if (r3 == 0) goto L_0x05d6
            r2 = 2131237940(0x7f081c34, float:1.8092145E38)
            r3.A00(r2)
            X.AnonymousClass9B9.A00()
            X.OMs r2 = r0.A0B
            if (r2 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131960493(0x7f1322ad, float:1.9557656E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r3 = r0.A0B
            if (r3 == 0) goto L_0x05d6
            r2 = 2131960492(0x7f1322ac, float:1.9557654E38)
            java.lang.String r2 = X.DbU.A0m(r0, r2)
            r3.A01(r2)
            X.OMs r2 = r0.A0B
            if (r2 == 0) goto L_0x05d6
            android.view.View r3 = r2.A00
            r2 = 3
            X.C71395Oju.A00(r3, r2, r0)
        L_0x0e46:
            X.N4P r7 = r0.A0Z
            if (r7 == 0) goto L_0x0e72
            X.0eM r2 = r0.A14
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            X.0Tu r5 = X.DbS.A0J(r6, r1)
            r2 = 36329882816495984(0x8111d600024170, double:3.038502409623659E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            r5 = 0
            if (r2 == 0) goto L_0x0e67
            int r3 = r7.A09
            r2 = 47
            if (r3 != r2) goto L_0x0e67
            r5 = 1
        L_0x0e67:
            java.lang.String r8 = "addAiSection"
            X.OMs r2 = r0.A05
            if (r5 != 0) goto L_0x0f6e
            if (r2 == 0) goto L_0x11bd
            A0K(r2, r4)
        L_0x0e72:
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x0f40
            X.0eM r7 = r0.A14
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r7)
            X.N4P r5 = r0.A0Z
            X.0qQ.A0B(r8, r1)
            r6 = 1
            if (r5 == 0) goto L_0x0f6b
            int r4 = r5.A09
            r3 = 29
            if (r4 != r3) goto L_0x0f6b
            java.lang.String r3 = X.N4P.A02(r5)
            boolean r3 = X.C51966G9m.A1W(r8, r3)
            if (r3 == 0) goto L_0x0f6b
            boolean r3 = r5.A0v
            if (r3 == 0) goto L_0x0f6b
            X.0Tu r5 = X.0Tu.A05
            r3 = 36319407399050628(0x81084f00791d84, double:3.0318777134500956E-306)
            boolean r3 = X.182.A06(r5, r8, r3)
            if (r3 == 0) goto L_0x0f6b
        L_0x0ea7:
            java.lang.String r9 = "bestPracticesSection"
            r8 = 0
            if (r6 == 0) goto L_0x0f63
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            X.6gx r7 = X.C313746gw.A00(r3)
            X.N4P r3 = r0.A0Z
            if (r3 == 0) goto L_0x0f60
            int r6 = r3.A06()
        L_0x0ebc:
            X.OMs r3 = r0.A0C
            if (r3 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgSimpleImageView r3 = r3.A02
            r3.setVisibility(r1)
            X.OMs r3 = r0.A0C
            if (r3 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgSimpleImageView r4 = r3.A02
            r3 = 2131238671(0x7f081f0f, float:1.8093627E38)
            X.DbU.A13(r2, r4, r3)
            X.OMs r3 = r0.A0C
            if (r3 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgTextView r5 = r3.A05
            r4 = 2131958918(0x7f131c86, float:1.9554462E38)
            android.content.Context r3 = X.02K.A01(r2)
            X.DbT.A18(r3, r5, r4)
            X.OMs r3 = r0.A0C
            if (r3 == 0) goto L_0x05d6
            com.instagram.common.ui.base.IgTextView r4 = r3.A04
            r3 = 2131958917(0x7f131c85, float:1.955446E38)
            android.content.Context r2 = X.02K.A01(r2)
            X.DbT.A18(r2, r4, r3)
            X.OMs r2 = r0.A0C
            if (r2 == 0) goto L_0x05d6
            android.view.View r3 = r2.A00
            X.Oit r2 = new X.Oit
            r2.<init>(r6, r1, r7, r0)
            X.AnonymousClass0fU.A00(r2, r3)
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x0f5e
            X.3t3 r2 = r2.A0L
            if (r2 == 0) goto L_0x0f5e
            java.lang.String r5 = X.C300965yF.A07(r2)
        L_0x0f0b:
            X.N4P r2 = r0.A0Z
            if (r2 == 0) goto L_0x0f5c
            java.lang.String r4 = r2.A0Q
        L_0x0f11:
            X.1Ln r3 = X.DbT.A0J(r7)
            boolean r2 = X.DbT.A1Y(r3)
            if (r2 == 0) goto L_0x0f39
            X.DbW.A17(r3, r7)
            java.lang.String r2 = "thread_details_rendered"
            X.C66581MXm.A1I(r3, r2)
            java.lang.String r2 = "best_practices_button"
            r3.A0p(r2)
            java.lang.String r2 = "thread_details"
            X.DbZ.A1L(r3, r2, r6)
            r3.A0s(r5)
            if (r4 == 0) goto L_0x0f36
            java.lang.Long r8 = X.AnonymousClass7TE.A10(r4)
        L_0x0f36:
            X.C66582MXn.A1C(r3, r7, r8)
        L_0x0f39:
            X.OMs r2 = r0.A0C
            if (r2 == 0) goto L_0x05d6
            A0K(r2, r1)
        L_0x0f40:
            java.lang.Object r1 = r12.getValue()
            X.ODj r1 = (X.C70612ODj) r1
            java.util.Set r1 = r1.A02
            boolean r1 = X.C66580MXl.A1b(r1)
            if (r1 == 0) goto L_0x1232
            java.lang.Object r3 = r12.getValue()
            X.ODj r3 = (X.C70612ODj) r3
            X.3t3 r2 = r0.A0c
            if (r2 != 0) goto L_0x11ca
            java.lang.String r11 = "threadId"
            goto L_0x001f
        L_0x0f5c:
            r4 = r8
            goto L_0x0f11
        L_0x0f5e:
            r5 = r8
            goto L_0x0f0b
        L_0x0f60:
            r6 = 0
            goto L_0x0ebc
        L_0x0f63:
            X.OMs r1 = r0.A0C
            if (r1 == 0) goto L_0x05d6
            A0J(r1)
            goto L_0x0f40
        L_0x0f6b:
            r6 = 0
            goto L_0x0ea7
        L_0x0f6e:
            if (r2 == 0) goto L_0x11bd
            com.instagram.common.ui.base.IgTextView r3 = r2.A05
            r2 = 2131960484(0x7f1322a4, float:1.9557638E38)
            X.DbU.A1G(r3, r0, r2)
            X.OMs r3 = r0.A05
            if (r3 == 0) goto L_0x11bd
            r2 = 2131237857(0x7f081be1, float:1.8091976E38)
            r3.A00(r2)
            X.OMs r2 = r0.A05
            if (r2 == 0) goto L_0x11bd
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
            r2.setVisibility(r4)
            X.OMs r2 = r0.A05
            if (r2 == 0) goto L_0x11bd
            android.view.View r2 = r2.A01
            r2.setVisibility(r1)
            X.OMs r2 = r0.A05
            if (r2 == 0) goto L_0x11bd
            android.view.View r3 = r2.A00
            r2 = 2
            X.C71395Oju.A00(r3, r2, r0)
            goto L_0x0e72
        L_0x0fa0:
            X.OMs r2 = r0.A0B
            if (r2 == 0) goto L_0x05d6
            A0J(r2)
            goto L_0x0e46
        L_0x0fa9:
            X.OMs r2 = r0.A0A
            if (r2 == 0) goto L_0x119a
            A0J(r2)
            goto L_0x0dec
        L_0x0fb2:
            X.OMs r2 = r0.A0I
            if (r2 == 0) goto L_0x119a
            android.view.View r3 = r2.A00
            r2 = 8
            goto L_0x0d87
        L_0x0fbc:
            java.lang.Object r2 = X.00k.A0J(r5)
            X.N9q r2 = (X.C68303N9q) r2
            if (r2 == 0) goto L_0x0d45
            com.instagram.user.model.User r6 = r2.A00
            if (r6 == 0) goto L_0x0d45
            java.lang.String r5 = r11.A0Q
            if (r5 == 0) goto L_0x0d45
            java.util.Map r9 = r11.A0U
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x100f
            java.lang.String r3 = r8.A06
            boolean r2 = r11.A0h
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.util.Map r9 = java.util.Collections.singletonMap(r3, r2)
            X.0qQ.A07(r9)
            java.util.List r10 = X.JTO.A15(r10)
            int r2 = X.JTT.A08(r10)
            java.util.LinkedHashMap r3 = X.DbS.A0x(r2)
            java.util.Iterator r10 = r10.iterator()
        L_0x0ff5:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x100b
            java.lang.Object r2 = r10.next()
            X.N9q r2 = (X.C68303N9q) r2
            com.instagram.user.model.User r2 = r2.A00
            java.lang.String r2 = r2.getId()
            X.JTP.A1R(r2, r3, r7)
            goto L_0x0ff5
        L_0x100b:
            java.util.LinkedHashMap r9 = X.0Yt.A04(r9, r3)
        L_0x100f:
            java.util.Collection r3 = r9.values()
            if (r3 == 0) goto L_0x103f
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x103f
        L_0x101b:
            r2 = 2131968777(0x7f134309, float:1.9574458E38)
        L_0x101e:
            java.lang.String r3 = X.C51967G9n.A0p(r15, r2)
            r2 = 2131953360(0x7f1306d0, float:1.9543189E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r15, r2)
            X.FOS r13 = new X.FOS
            r16 = r8
            r17 = r6
            r18 = r9
            r19 = r5
            r20 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.Jvl r9 = new X.Jvl
            r9.<init>(r13, r2, r3)
            goto L_0x0d45
        L_0x103f:
            java.util.Iterator r3 = r3.iterator()
        L_0x1043:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x101b
            java.lang.Object r2 = r3.next()
            boolean r2 = X.AnonymousClass7TE.A1a(r2)
            if (r2 != 0) goto L_0x1043
            r2 = 2131968751(0x7f1342ef, float:1.9574405E38)
            goto L_0x101e
        L_0x1057:
            X.OMs r2 = r0.A07
            if (r2 == 0) goto L_0x11bd
            A0J(r2)
            goto L_0x0d07
        L_0x1060:
            r7 = r8
            goto L_0x0c32
        L_0x1063:
            java.lang.String r17 = "thread_details"
            goto L_0x0c21
        L_0x1067:
            r6 = r8
            goto L_0x0c1d
        L_0x106a:
            X.OMs r2 = r0.A06
            if (r2 == 0) goto L_0x05d6
            A0J(r2)
            goto L_0x0c89
        L_0x1073:
            r11 = 0
            goto L_0x0bea
        L_0x1076:
            r5 = 0
            goto L_0x0bb1
        L_0x1079:
            X.OMs r2 = r0.A08
            if (r2 == 0) goto L_0x119a
            A0J(r2)
            goto L_0x0b92
        L_0x1082:
            X.OMs r2 = r0.A09
            if (r2 == 0) goto L_0x119a
            A0J(r2)
            goto L_0x0b35
        L_0x108b:
            com.instagram.igds.components.textcell.IgdsListCell r2 = r0.A0b
            if (r2 == 0) goto L_0x11bd
            r2.setVisibility(r4)
            goto L_0x0acb
        L_0x1094:
            X.OMs r2 = r0.A0O
            if (r2 == 0) goto L_0x11ae
            A0K(r2, r4)
            goto L_0x09f0
        L_0x109d:
            X.OMs r2 = r0.A0O
            if (r2 == 0) goto L_0x11ae
            A0K(r2, r4)
            goto L_0x09af
        L_0x10a6:
            X.OMs r2 = r0.A0O
            if (r2 == 0) goto L_0x11ae
            A0K(r2, r4)
            X.OMs r2 = r0.A0D
            if (r2 == 0) goto L_0x11a9
            A0K(r2, r4)
        L_0x10b4:
            X.OMs r2 = r0.A0N
            if (r2 == 0) goto L_0x11a4
            A0K(r2, r4)
            goto L_0x0a27
        L_0x10bd:
            X.OMs r2 = r0.A0M
            if (r2 == 0) goto L_0x0864
            A0K(r2, r4)
            goto L_0x0927
        L_0x10c6:
            X.0Tu r6 = X.0Tu.A05
            r2 = 36314910560816009(0x81043800070b89, double:3.0290338948432084E-306)
            boolean r2 = X.182.A06(r6, r9, r2)
            if (r2 != 0) goto L_0x10e7
            boolean r2 = X.C69950Nuq.A00(r7, r8)
            if (r2 != 0) goto L_0x08be
            boolean r2 = X.C69951Nur.A00(r9, r7, r8)
            if (r2 != 0) goto L_0x08be
            boolean r2 = X.C69953Nut.A00(r9, r7, r8)
            if (r2 == 0) goto L_0x10e7
            goto L_0x08be
        L_0x10e7:
            r6 = 0
            goto L_0x08bf
        L_0x10ea:
            X.OMs r2 = r0.A0L
            if (r2 == 0) goto L_0x0864
            A0K(r2, r4)
            goto L_0x084c
        L_0x10f3:
            if (r2 == 0) goto L_0x0864
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
            r2.setVisibility(r4)
            goto L_0x07df
        L_0x10fc:
            if (r2 == 0) goto L_0x0864
            A0K(r2, r4)
            goto L_0x07e6
        L_0x1103:
            X.9HW r3 = X.AnonymousClass9HV.A00(r8)
            r2 = 45
            boolean r2 = r3.A00(r10, r2)
            if (r2 != 0) goto L_0x0790
            if (r6 == 0) goto L_0x078f
            int r3 = r6.A09
            r2 = 29
            if (r3 != r2) goto L_0x078f
            X.0Tu r6 = X.0Tu.A05
            r2 = 36319407392234791(0x81084f00111d27, double:3.031877709139733E-306)
            boolean r2 = X.182.A06(r6, r8, r2)
            if (r2 == 0) goto L_0x078f
            goto L_0x0790
        L_0x1126:
            java.lang.String r6 = "threadId"
            goto L_0x0864
        L_0x112a:
            r6 = 1
            goto L_0x073f
        L_0x112d:
            X.OMs r2 = r0.A0F
            if (r2 == 0) goto L_0x11bd
            A0J(r2)
            goto L_0x075a
        L_0x1136:
            if (r2 == 0) goto L_0x11b3
            A0K(r2, r4)
            goto L_0x06ce
        L_0x113d:
            X.OMs r2 = r0.A0H
            if (r2 == 0) goto L_0x05d6
            A0K(r2, r4)
            goto L_0x066e
        L_0x1146:
            X.OMs r2 = r0.A0P
            if (r2 == 0) goto L_0x001f
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = r2.A06
            android.graphics.drawable.Drawable r2 = X.C327827Ci.A00(r7, r5)
            r3.setImageDrawable(r2)
            goto L_0x04ea
        L_0x1155:
            java.lang.String r3 = r5.A08
            goto L_0x04ca
        L_0x1159:
            r10 = 8
            int r3 = r5.A04
            X.OMs r2 = r0.A0P
            if (r3 == 0) goto L_0x116b
            if (r2 == 0) goto L_0x001f
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
            java.lang.String r3 = r0.getString(r3)
            goto L_0x04b6
        L_0x116b:
            if (r2 == 0) goto L_0x001f
            com.instagram.common.ui.base.IgTextView r2 = r2.A04
            r2.setVisibility(r10)
            goto L_0x04b9
        L_0x1174:
            X.OMs r2 = r0.A0P
            if (r2 != 0) goto L_0x117c
            java.lang.String r11 = "themeSection"
            goto L_0x001f
        L_0x117c:
            A0J(r2)
            goto L_0x053a
        L_0x1181:
            X.OMs r3 = r0.A0K
            if (r3 == 0) goto L_0x11bd
            r2 = 2131968751(0x7f1342ef, float:1.9574405E38)
            java.lang.String r2 = X.DbU.A0m(r0, r2)
            r3.A01(r2)
            goto L_0x041f
        L_0x1191:
            X.OMs r2 = r0.A0K
            if (r2 == 0) goto L_0x11bd
            A0J(r2)
            goto L_0x042a
        L_0x119a:
            X.0qQ.A0F(r7)
            goto L_0x0022
        L_0x119f:
            X.0qQ.A0F(r13)
            goto L_0x0022
        L_0x11a4:
            X.0qQ.A0F(r15)
            goto L_0x0022
        L_0x11a9:
            X.0qQ.A0F(r16)
            goto L_0x0022
        L_0x11ae:
            X.0qQ.A0F(r14)
            goto L_0x0022
        L_0x11b3:
            X.0qQ.A0F(r5)
            goto L_0x0022
        L_0x11b8:
            X.0qQ.A0F(r3)
            goto L_0x0022
        L_0x11bd:
            X.0qQ.A0F(r8)
            goto L_0x0022
        L_0x11c2:
            java.lang.String r0 = "Unsupported action"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            throw r1
        L_0x11ca:
            boolean r5 = r0.A0k
            X.N4P r1 = r0.A0Z
            if (r1 == 0) goto L_0x1243
            boolean r7 = X.N4P.A05(r1)
        L_0x11d4:
            java.lang.Integer r6 = r0.A0e
            r0 = 3
            X.0qQ.A0B(r6, r0)
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x1232
            X.0wc r1 = r3.A01
            java.lang.String r0 = "direct_thread_details_impression"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x1232
            java.lang.String r1 = X.C300965yF.A07(r2)
            if (r1 == 0) goto L_0x1241
            X.N0Z r2 = new X.N0Z
            r2.<init>()
            java.lang.String r0 = "id"
            r2.A06(r0, r1)
            if (r5 == 0) goto L_0x1239
            if (r7 == 0) goto L_0x1236
            X.XSV r1 = X.XSV.A03
        L_0x1202:
            java.lang.String r0 = "type"
            r2.A01(r1, r0)
        L_0x1207:
            int r0 = r6.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x1233
            java.lang.String r0 = "swipe"
        L_0x1211:
            X.DbS.A1N(r4, r0)
            java.util.Set r0 = r3.A02
            java.util.List r1 = X.00k.A0a(r0)
            java.lang.String r0 = "setting_type"
            r4.AAe(r0, r1)
            X.C66581MXm.A1H(r4, r5)
            java.lang.String r0 = "impression"
            X.DbS.A1J(r4, r0)
            java.lang.String r0 = "thread"
            r4.AAK(r2, r0)
            r4.Cgf()
            r0 = 1
            r3.A00 = r0
        L_0x1232:
            return
        L_0x1233:
            java.lang.String r0 = "tap"
            goto L_0x1211
        L_0x1236:
            X.XSV r1 = X.XSV.A04
            goto L_0x1202
        L_0x1239:
            if (r7 == 0) goto L_0x123e
            X.XSV r1 = X.XSV.A05
            goto L_0x1202
        L_0x123e:
            X.XSV r1 = X.XSV.A06
            goto L_0x1202
        L_0x1241:
            r2 = 0
            goto L_0x1207
        L_0x1243:
            r7 = 0
            goto L_0x11d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJY.A0E(X.NJY):void");
    }

    public static void A0J(OMs oMs) {
        oMs.A00.setVisibility(8);
    }

    public static void A0K(OMs oMs, int i) {
        oMs.A00.setVisibility(i);
    }

    public static final boolean A0M(NJY njy) {
        int i;
        N4P n4p = njy.A0Z;
        if (n4p == null) {
            return false;
        }
        UserSession A0l2 = AnonymousClass7TE.A0l(njy.A14);
        0qQ.A0B(A0l2, 0);
        AnonymousClass0t1.A01.A01(A0l2);
        if (n4p.A0K != null || n4p.A0m) {
            return false;
        }
        if (C331057Pi.A01(A0l2, n4p.A0D) && !182.A06(0Tu.A05, A0l2, 36325385985668013L)) {
            return false;
        }
        if ((!n4p.A0v && (i = n4p.A09) != 29 && !AnonymousClass48O.A02(i)) || C66640Ma9.A03(n4p)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, A0l2, 36314223365589483L) || n4p.A0k) {
            return false;
        }
        C254793t3 r1 = n4p.A0L;
        if (AnonymousClass6W3.A08(r1)) {
            return true;
        }
        0qQ.A0B(r1, 0);
        if (!(r1 instanceof MsysThreadId) || !182.A06(r2, A0l2, 36318389483935851L)) {
            return false;
        }
        return true;
    }

    public final UserSession A0N() {
        return AnonymousClass7TE.A0l(this.A14);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A14);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    public final boolean onBackPressed() {
        C67707MtL mtL = this.A0u;
        ? r0 = this.A0y;
        if (r0 != 0) {
            if (r0.getVisibility() != 0 || mtL == null || mtL.getCount() <= 0) {
                return false;
            }
            NestableViewPager nestableViewPager = this.A0y;
            if (nestableViewPager != null) {
                AnonymousClass4DR A012 = mtL.A01(nestableViewPager.getCurrentItem());
                if (A012 instanceof AnonymousClass4DR) {
                    return A012.onBackPressed();
                }
                return false;
            }
        }
        0qQ.A0F("viewPager");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.2qU] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel, java.lang.Object] */
    public NJY() {
        AnonymousClass2bO.A00();
        this.A11 = new Object();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ? obj = new Object();
        obj.A01 = A1C;
        obj.A00 = null;
        obj.A02 = false;
        obj.A03 = false;
        this.A10 = obj;
        this.A15 = C73902Pld.A00(this, 32);
        this.A0e = AnonymousClass05K.A01;
        this.A13 = C73902Pld.A00(this, 29);
        this.A16 = new Ot0(this, 0);
        this.A17 = new Ot0(this, 1);
        this.A14 = C227642jf.A02(this);
    }

    public static OMs A00(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return new OMs(requireViewById);
    }

    public static final NKQ A01(NJY njy) {
        int i;
        String str;
        boolean z = njy.requireArguments().getBoolean("DirectThreadDetailFragment.SHOULD_ALLOW_LEAVE_CONVERSATION", true);
        UserSession A0l2 = AnonymousClass7TE.A0l(njy.A14);
        Capabilities capabilities = njy.A03;
        if (capabilities == null) {
            str = "threadCapabilities";
        } else {
            C254793t3 r3 = njy.A0c;
            if (r3 == null) {
                str = "threadId";
            } else {
                N4P n4p = njy.A0Z;
                if (n4p != null) {
                    i = n4p.A09;
                } else {
                    i = 0;
                }
                return C69941Nuh.A00(A0l2, capabilities, r3, i, z, false);
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static String A03(AbstractList abstractList, int i) {
        return ((C68303N9q) abstractList.get(i)).A00.getUsername();
    }

    public static final void A08(NJY njy) {
        C66584MXp.A0l(A01(njy), njy);
        N4P n4p = njy.A0Z;
        if (n4p != null && n4p.A09 == 29) {
            C313756gx A002 = C313746gw.A00(AnonymousClass7TE.A0l(njy.A14));
            int A062 = n4p.A06();
            String A032 = N4P.A03(n4p);
            String str = n4p.A0Q;
            1Ln A0J2 = DbT.A0J(A002);
            if (DbT.A1Y(A0J2)) {
                DbW.A17(A0J2, A002);
                DbV.A1M(A0J2, "people_sheet_rendered");
                A0J2.A0p("people_section");
                A0J2.A0i(DbZ.A0b(A0J2, "thread_details", A032, str, A062));
                A0J2.Cgf();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v44, types: [com.instagram.ui.widget.nestablescrollingview.NestableViewPager, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0107, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TE.A0l(r2), 36322809006598596L) != false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(X.NJY r12) {
        /*
            android.content.Context r0 = r12.getContext()
            if (r0 == 0) goto L_0x007b
            com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel r0 = r12.A10
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            r3 = 1
            r11 = r0 ^ 1
            X.N4P r9 = r12.A0Z
            if (r9 == 0) goto L_0x007b
            boolean r8 = r9.A0C()
            r0 = 48
            java.lang.String r5 = X.C273654mx.A00(r0)
            java.lang.String r2 = "headerView"
            java.lang.String r7 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams"
            java.lang.String r1 = "viewPagerHeader"
            r6 = 8
            java.lang.String r10 = "viewPager"
            r4 = 0
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r0 = r12.A0y
            if (r8 == 0) goto L_0x007f
            if (r0 == 0) goto L_0x0190
            r0.setVisibility(r4)
            android.view.View r0 = r12.A0n
            if (r0 == 0) goto L_0x018b
            r0.setVisibility(r6)
            java.util.ArrayList r1 = r12.A12
            r1.clear()
            boolean r0 = X.N4P.A05(r9)
            if (r0 == 0) goto L_0x007c
            X.Nk2 r0 = X.C69362Nk2.People
        L_0x0047:
            r1.add(r0)
            android.widget.LinearLayout r0 = r12.A0o
            if (r0 == 0) goto L_0x0186
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            X.0qQ.A0C(r2, r7)
            X.5sn r2 = (X.C298055sn) r2
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r0 = r12.A0y
            if (r0 == 0) goto L_0x0190
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0qQ.A0C(r1, r5)
            X.2dP r1 = (X.2dP) r1
            r2.A00 = r3
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r0 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r0.<init>()
            r1.A00(r0)
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r0 = r12.A0y
            if (r0 == 0) goto L_0x0190
            X.08m r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x007b
            r0.notifyDataSetChanged()
        L_0x007b:
            return
        L_0x007c:
            X.Nk2 r0 = X.C69362Nk2.PrivacyControls
            goto L_0x0047
        L_0x007f:
            if (r0 == 0) goto L_0x0190
            r0.setVisibility(r4)
            android.view.View r0 = r12.A0n
            if (r0 == 0) goto L_0x018b
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r12.A0o
            if (r0 == 0) goto L_0x0186
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            X.0qQ.A0C(r2, r7)
            X.5sn r2 = (X.C298055sn) r2
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r0 = r12.A0y
            if (r0 == 0) goto L_0x0190
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0qQ.A0C(r1, r5)
            X.2dP r1 = (X.2dP) r1
            r2.A00 = r3
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r0 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r0.<init>()
            r1.A00(r0)
            java.util.ArrayList r5 = r12.A12
            r5.clear()
            boolean r0 = r12.A0g
            if (r0 == 0) goto L_0x00bd
            X.Nk2 r0 = X.C69362Nk2.Media
            r5.add(r0)
        L_0x00bd:
            boolean r0 = r12.A0i
            if (r0 == 0) goto L_0x010e
            X.3t3 r0 = r12.A0c
            r9 = 0
            if (r0 != 0) goto L_0x00d0
            java.lang.String r7 = "threadId"
        L_0x00c8:
            X.0qQ.A0F(r7)
        L_0x00cb:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d0:
            X.3t0 r8 = X.C300965yF.A02(r0)
            if (r8 == 0) goto L_0x0109
            X.7Pi r7 = X.C331077Pk.A02
            X.0eM r2 = r12.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.2Dm r1 = X.2L2.A00(r0)
            java.lang.String r0 = r8.A00
            X.3U9 r0 = X.C66581MXm.A0a(r1, r0)
            if (r0 == 0) goto L_0x00ee
            X.3Tu r9 = r0.AiM()
        L_0x00ee:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = r7.A03(r0, r9)
            if (r0 == 0) goto L_0x0109
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322809006598596(0x810b67001529c4, double:3.034028903760605E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x010e
        L_0x0109:
            X.Nk2 r0 = X.C69362Nk2.Reshares
            r5.add(r0)
        L_0x010e:
            if (r11 == 0) goto L_0x0115
            X.Nk2 r0 = X.C69362Nk2.Collections
            r5.add(r0)
        L_0x0115:
            boolean r0 = r12.A0h
            if (r0 == 0) goto L_0x011e
            X.Nk2 r0 = X.C69362Nk2.Orders
            r5.add(r0)
        L_0x011e:
            int r1 = r5.size()
            java.lang.String r7 = "tabLayout"
            java.lang.String r2 = "sharedLabel"
            android.widget.TextView r0 = r12.A0q
            if (r1 != r3) goto L_0x0179
            if (r0 == 0) goto L_0x0186
            r0.setVisibility(r4)
            com.google.android.material.tabs.TabLayout r0 = r12.A01
            if (r0 == 0) goto L_0x00c8
            r0.setVisibility(r6)
            android.widget.TextView r1 = r12.A0q
            if (r1 == 0) goto L_0x0186
            java.lang.Object r0 = r5.get(r4)
            X.Nk2 r0 = (X.C69362Nk2) r0
            int r0 = r0.A00
            X.DbU.A1G(r1, r12, r0)
        L_0x0145:
            com.instagram.ui.widget.nestablescrollingview.NestableViewPager r0 = r12.A0y
            if (r0 == 0) goto L_0x0190
            X.08m r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x0152
            r0.notifyDataSetChanged()
        L_0x0152:
            int r0 = r5.size()
            if (r0 <= r3) goto L_0x007b
            com.google.android.material.tabs.TabLayout r3 = r12.A01
            if (r3 == 0) goto L_0x00c8
            X.Fmv r2 = new X.Fmv
            r2.<init>(r12, r4)
            android.content.res.Resources r0 = r3.getResources()
            int r1 = X.AnonymousClass7TE.A0B(r0)
            com.google.android.material.tabs.TabLayout r0 = r12.A01
            if (r0 == 0) goto L_0x00c8
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            int r0 = X.0nA.A09(r0)
            X.C324806zv.A00(r3, r2, r1, r0)
            return
        L_0x0179:
            if (r0 == 0) goto L_0x0186
            r0.setVisibility(r6)
            com.google.android.material.tabs.TabLayout r0 = r12.A01
            if (r0 == 0) goto L_0x00c8
            r0.setVisibility(r4)
            goto L_0x0145
        L_0x0186:
            X.0qQ.A0F(r2)
            goto L_0x00cb
        L_0x018b:
            X.0qQ.A0F(r1)
            goto L_0x00cb
        L_0x0190:
            X.0qQ.A0F(r10)
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJY.A0F(X.NJY):void");
    }

    public static final boolean A0L(NJY njy) {
        C331157Pu A0f2 = C66582MXn.A0f(njy);
        if (A0f2 == null || !A0f2.A0S() || !(A0f2.A03.A0M() instanceof NJY)) {
            return false;
        }
        return true;
    }

    public final void AHB() {
        A08(this);
    }

    public final void APp() {
        A0E(this);
    }

    public final void Cfo() {
        String str;
        FragmentActivity activity = getActivity();
        if (activity != null && !C69959Nuz.A00(activity)) {
            this.A0z.A01();
            activity.finish();
        }
        C254793t3 r0 = this.A0c;
        if (r0 == null) {
            C66580MXl.A18();
            throw AnonymousClass00P.createAndThrow();
        }
        C254763t0 A022 = C300965yF.A02(r0);
        if (A022 != null && (str = A022.A00) != null) {
            AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A14)).A00(new C57070INk(str, false));
        }
    }

    public final void CgA() {
        A07(this);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle("");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C71030OZh oZh;
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == 9683) {
            AnonymousClass37E r3 = AnonymousClass37D.A00;
            AnonymousClass37D A012 = r3.A01(requireActivity());
            if (A012 != null && ((AnonymousClass37F) A012).A0g) {
                DbX.A10(requireActivity(), r3);
            }
            getParentFragmentManager().A0d(getParentFragmentManager().A0T(0).A00);
        }
        if (intent != null && (oZh = this.A0a) != null) {
            AnonymousClass36V r0 = oZh.A0E;
            r0.onActivityResult(i, i2, intent);
            JZM.A00(((AnonymousClass36U) r0).A04).A09((28t) null, 6);
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(1204472011);
        NJY.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Context requireContext = requireContext();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A03 = capabilities;
            C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A002 != null) {
                this.A0c = A002;
                String str2 = "threadId";
                this.A0k = A002 instanceof MsysThreadId;
                AnonymousClass0eM r3 = this.A14;
                UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                C254793t3 r4 = this.A0c;
                if (r4 != null) {
                    Capabilities capabilities2 = this.A03;
                    if (capabilities2 == null) {
                        str2 = "threadCapabilities";
                    } else {
                        C74449Pv4 A012 = C330397Mp.A01(requireContext, A0l2, capabilities2, r4);
                        this.A0Q = A012;
                        if (A012 == null) {
                            str2 = "clientInfra";
                        } else {
                            C74550Pwj.A01(A012);
                            this.A0j = requireArguments.getBoolean(AnonymousClass000.A00(429), false);
                            this.A02 = DbW.A0J(AnonymousClass7TE.A0l(r3), __redex_internal_original_name);
                            this.A0l = 182.A06(0Tu.A05, AnonymousClass7TE.A0l(r3), 36314910560816009L);
                            UserSession A0l3 = AnonymousClass7TE.A0l(r3);
                            C254793t3 r0 = this.A0c;
                            if (r0 != null) {
                                C254763t0 A023 = C300965yF.A02(r0);
                                if (A023 == null || (str = A023.A00) == null) {
                                    str = "";
                                }
                                this.A0V = new C62032KWk(A0l3, AnonymousClass05K.A00, str);
                                this.A0S = new OF3(AnonymousClass7TE.A0l(r3), new O77(this));
                                0hq childFragmentManager = getChildFragmentManager();
                                0qQ.A07(childFragmentManager);
                                this.A0u = new C67707MtL(childFragmentManager, this);
                                1YN A003 = AnonymousClass2bO.A00();
                                UserSession A0l4 = AnonymousClass7TE.A0l(r3);
                                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0N;
                                AnonymousClass2bO.A00();
                                this.A0d = A003.A01(this, this, A0l4, 2bV.A01(new C50731FhW(this, 0), new C50733FhY(this, 0), (C230902qW) null, (C230922qa) null, (C71202bS) null, (C230882qT) null, false), quickPromotionSlot);
                                UserSession A0l5 = AnonymousClass7TE.A0l(r3);
                                C231002qi r42 = this.A0d;
                                if (r42 == null) {
                                    str2 = "quickPromotionDelegate";
                                } else {
                                    C66965Mfy mfy = new C66965Mfy(A0l5, this, r42);
                                    this.A0U = mfy;
                                    registerLifecycleListener(mfy);
                                    this.A0T = new OHL(requireContext, AnonymousClass7TE.A0l(r3), new O78(this));
                                    C254793t3 r02 = this.A0c;
                                    if (r02 != null) {
                                        C254763t0 A024 = C300965yF.A02(r02);
                                        if (A024 != null) {
                                            UserSession A0l6 = AnonymousClass7TE.A0l(r3);
                                            String str3 = A024.A00;
                                            String str4 = this.A10.A00;
                                            NMI nmi = new NMI((Object) this, 15);
                                            0qQ.A0B(A0l6, 0);
                                            0qQ.A0B(str3, 1);
                                            1NY A0b2 = AnonymousClass7TG.A0b(A0l6);
                                            A0b2.A0A("collections/list/");
                                            A0b2.A0O((15p) null, C54074Gyy.class, C56341Hws.class, false);
                                            A0b2.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
                                            A0b2.A0C("count", 4);
                                            A0b2.A9m("show_without_media", "false");
                                            A0b2.A0G("max_id", str4);
                                            1OC A0M2 = A0b2.A0M();
                                            A0M2.A00 = nmi;
                                            1ES.A03(A0M2);
                                        }
                                        AnonymousClass0fD.A09(612418348, A022);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalArgumentException = C66580MXl.A0p();
            i = 1585894657;
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("threadCapabilities can't be null");
            i = -943125304;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2115907009);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_home_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1286637551, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1230255380);
        super.onDestroy();
        OHL ohl = this.A0T;
        if (ohl != null) {
            N4P n4p = this.A0Z;
            if (n4p != null) {
                n4p.A08();
            }
            ohl.A01.A00.dispose();
        }
        C67707MtL mtL = this.A0u;
        if (mtL != null) {
            mtL.A00.clear();
        }
        this.A0u = null;
        C66965Mfy mfy = this.A0U;
        if (mfy == null) {
            0qQ.A0F("restrictController");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(mfy);
        C71030OZh oZh = this.A0a;
        if (oZh != null) {
            oZh.A02 = null;
        }
        AnonymousClass0fD.A09(-1646704648, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-333264665);
        NestableViewPager nestableViewPager = this.A0y;
        if (nestableViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        nestableViewPager.setAdapter((08m) null);
        this.A0z.A01();
        super.onDestroyView();
        AnonymousClass0fD.A09(-140315011, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1459618579);
        NJY.super.onPause();
        C74449Pv4 pv4 = this.A0Q;
        if (pv4 != null) {
            pv4.BNa().stop();
            C74449Pv4 pv42 = this.A0Q;
            if (pv42 != null) {
                C74542Pwb B4p = pv42.B4p();
                if (B4p != null) {
                    B4p.stop();
                }
                1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A14));
                A002.A02(this.A16, 2Kb.class);
                A002.A02(this.A17, 27U.class);
                OHL ohl = this.A0T;
                if (ohl != null) {
                    ohl.A01.A01();
                }
                AnonymousClass0fD.A09(37046401, A022);
                return;
            }
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, X.NJY, java.lang.Object, X.4DH] */
    public final void onResume() {
        N4P n4p;
        C270264gS r2;
        String str;
        NIF nif;
        C254763t0 A022;
        int A023 = AnonymousClass0fD.A02(49502270);
        super.onResume();
        AnonymousClass0eM r4 = this.A14;
        if (LockedChatKillSwitch.isLockedChatEnabled(AnonymousClass7TE.A0l(r4), false) && (n4p = this.A0Z) != null && n4p.A02 == 1 && (r2 = this.A0W) != null) {
            C254793t3 r0 = n4p.A0L;
            if (r0 == null || (A022 = C300965yF.A02(r0)) == null) {
                str = null;
            } else {
                str = A022.A00;
            }
            if (r2.A00(str)) {
                NIF nif2 = this.A0X;
                if (nif2 == null) {
                    nif2 = C70001Nvf.A00("thread_details_page", (String) null);
                    this.A0X = nif2;
                    nif2.A04 = new C73902Pld(this, 30);
                    nif2.A03 = new C73902Pld(this, 31);
                }
                Dialog dialog = nif2.A01;
                if ((dialog == null || !dialog.isShowing()) && (nif = this.A0X) != null) {
                    nif.A0B(getParentFragmentManager(), "lockedChat");
                }
            }
        }
        C74449Pv4 pv4 = this.A0Q;
        if (pv4 != null) {
            C74550Pwj.A01(pv4);
            C74449Pv4 pv42 = this.A0Q;
            if (pv42 != null) {
                C74542Pwb B4p = pv42.B4p();
                if (C330397Mp.A07(AnonymousClass7TE.A0l(r4)) && B4p != null) {
                    C73568Pfp.A02(B4p, this, DbW.A0E(this), 19);
                    B4p.start();
                }
                1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r4));
                A002.A01(this.A16, 2Kb.class);
                A002.A01(this.A17, 27U.class);
                A07(this);
                AnonymousClass0fD.A09(-1747863420, A023);
                return;
            }
        }
        0qQ.A0F("clientInfra");
        throw AnonymousClass00P.createAndThrow();
    }
}
