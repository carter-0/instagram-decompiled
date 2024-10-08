package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.direct.prompts.DirectEditAddYoursParams;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;
import java.util.TimeZone;

public final class NKH extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DirectAddYoursCreationFragment";
    public int A00 = 0;
    public int A01;
    public Context A02;
    public IgEditText A03;
    public IgTextView A04;
    public AnonymousClass7IQ A05;
    public C70846ONz A06;
    public C67739Mts A07;
    public DirectEditAddYoursParams A08;
    public DirectPromptTypes A09;
    public DirectThreadKey A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public int A0F;
    public final AnonymousClass0eM A0G = C227642jf.A02(this);
    public final C69365Nk5 A0H = C69365Nk5.ADD_YOURS;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "prompts_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r13.A08 != null) goto L_0x0046;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r29, android.os.Bundle r30) {
        /*
            r28 = this;
            r11 = 0
            r12 = r29
            X.0qQ.A0B(r12, r11)
            r13 = r28
            r0 = r30
            super.onViewCreated(r12, r0)
            android.content.Context r2 = r12.getContext()
            r13.A02 = r2
            if (r2 == 0) goto L_0x021d
            X.OUZ r1 = X.OUZ.A00
            X.0eM r15 = r13.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r15)
            int r0 = r1.A00(r0)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r0)
            r13.A0D = r0
            X.0lg r0 = X.DbT.A0X(r15)
            X.0Tu r10 = X.0Tu.A05
            r2 = 36324136150576973(0x810c9c00072f4d, double:3.03486819495651E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r10, r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0046
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r13.A08
            r1 = 8
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            r0 = 2131427778(0x7f0b01c2, float:1.8477182E38)
            X.DbT.A1F(r12, r0, r1)
            r0 = 2131438723(0x7f0b2c83, float:1.849938E38)
            android.view.View r0 = r12.requireViewById(r0)
            com.instagram.common.ui.base.IgEditText r0 = (com.instagram.common.ui.base.IgEditText) r0
            r13.A03 = r0
            X.0lg r0 = X.DbT.A0X(r15)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r10, r0, r2)
            boolean r0 = r0.booleanValue()
            java.lang.String r16 = "textField"
            if (r0 == 0) goto L_0x01fa
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r13.A08
            if (r0 != 0) goto L_0x01fa
            com.instagram.common.ui.base.IgEditText r0 = r13.A03
            if (r0 == 0) goto L_0x0219
            r0.setEnabled(r11)
        L_0x0073:
            androidx.fragment.app.FragmentActivity r4 = r13.requireActivity()
            r0 = 2131441113(0x7f0b35d9, float:1.8504228E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r12, r0)
            r13.A04 = r0
            r0 = 2131428521(0x7f0b04a9, float:1.8478689E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r12, r0)
            X.0lg r0 = X.DbT.A0X(r15)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r10, r0, r2)
            boolean r0 = r0.booleanValue()
            java.lang.String r6 = "sendButton"
            if (r0 == 0) goto L_0x01cf
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r13.A08
            if (r0 != 0) goto L_0x01cf
            com.instagram.common.ui.base.IgTextView r1 = r13.A04
            if (r1 == 0) goto L_0x0222
            r0 = 8
            r1.setVisibility(r0)
            r5.setVisibility(r0)
        L_0x00a7:
            X.Mts r9 = r13.A07
            java.lang.String r16 = "promptNamingSuggestionsViewModel"
            if (r9 == 0) goto L_0x0219
            android.content.Context r18 = r13.requireContext()
            com.instagram.common.session.UserSession r19 = X.AnonymousClass7TE.A0l(r15)
            X.Nk5 r14 = r13.A0H
            android.view.View r1 = r13.requireView()
            r0 = 2131438769(0x7f0b2cb1, float:1.8499474E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r1, r0)
            com.instagram.common.ui.base.IgSimpleImageView r8 = (com.instagram.common.ui.base.IgSimpleImageView) r8
            com.instagram.model.direct.DirectThreadKey r0 = r13.A0A
            java.lang.String r6 = "threadKey"
            if (r0 == 0) goto L_0x0222
            java.lang.String r7 = r0.A00
            java.lang.String r6 = r0.A01
            int r5 = r13.A01
            int r4 = r13.A0F
            r1 = 1
            X.O6F r0 = new X.O6F
            r0.<init>(r13)
            r21 = r0
            r22 = r14
            r23 = r7
            r24 = r6
            r25 = r5
            r26 = r4
            r27 = r1
            r20 = r8
            r17 = r9
            r17.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.0lg r0 = X.DbT.A0X(r15)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r10, r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0132
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r13.A08
            if (r0 != 0) goto L_0x0132
            r0 = 2131427781(0x7f0b01c5, float:1.8477188E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r12, r0)
            r0 = 2131427779(0x7f0b01c3, float:1.8477184E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r12, r0)
            r0 = 2131427780(0x7f0b01c4, float:1.8477186E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r12, r0)
            X.61u r6 = (X.C3021461u) r6
            android.content.Context r5 = r13.A02
            if (r5 == 0) goto L_0x021d
            r4 = 2131970905(0x7f134b59, float:1.9578774E38)
            java.lang.String r0 = r13.A0D
            if (r0 == 0) goto L_0x0220
            X.DbX.A13(r5, r7, r0, r4)
            r8.setVisibility(r11)
            r7.setVisibility(r11)
            r6.setVisibility(r11)
            r0 = 49
            X.C71407Ok6.A02(r6, r13, r0)
        L_0x0132:
            r0 = 2131439336(0x7f0b2ee8, float:1.8500624E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r12, r0)
            r0 = 2131439334(0x7f0b2ee6, float:1.850062E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r12, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r4 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r4
            X.0lg r0 = X.DbT.A0X(r15)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r10, r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01c9
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r13.A08
            if (r0 != 0) goto L_0x01c9
            r0 = 2131439335(0x7f0b2ee7, float:1.8500622E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r12, r0)
            android.content.Context r3 = r13.A02
            if (r3 == 0) goto L_0x021d
            r2 = 2131970910(0x7f134b5e, float:1.9578784E38)
            java.lang.String r0 = r13.A0D
            if (r0 == 0) goto L_0x0220
            X.DbX.A13(r3, r6, r0, r2)
            com.instagram.direct.prompts.DirectPromptTypes r2 = r13.A09
            com.instagram.direct.prompts.DirectPromptTypes r0 = com.instagram.direct.prompts.DirectPromptTypes.ADD_YOURS
            if (r2 != r0) goto L_0x01ae
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r6.setTextAppearance(r0)
            r4.setEnabled(r11)
            r4.setChecked(r11)
        L_0x017b:
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r13.A08
            if (r0 != 0) goto L_0x018e
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x01a0
            boolean r0 = r4.isChecked()
            if (r0 != 0) goto L_0x01a0
            r0 = 0
        L_0x018c:
            r13.A00 = r0
        L_0x018e:
            X.Mts r0 = r13.A07
            if (r0 == 0) goto L_0x0219
            X.2Fk r2 = r0.A03
            r0 = 2
            X.PqQ r1 = new X.PqQ
            r1.<init>(r13, r0)
            r0 = 32
            X.Dba.A15(r13, r2, r1, r0)
            return
        L_0x01a0:
            X.0lg r2 = X.DbT.A0X(r15)
            r0 = 36605611126953238(0x820c9c00021516, double:3.212874103425616E-306)
            int r0 = X.DbS.A04(r10, r2, r0)
            goto L_0x018c
        L_0x01ae:
            r4.setEnabled(r1)
            X.0lg r2 = X.DbT.A0X(r15)
            r0 = 2342167145364598609(0x20810c9c000c2f51, double:4.069092985344696E-152)
            boolean r0 = X.182.A06(r10, r2, r0)
            r4.setChecked(r0)
            X.PHt r0 = new X.PHt
            r0.<init>(r13, r11)
            r4.A07 = r0
            goto L_0x017b
        L_0x01c9:
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x017b
        L_0x01cf:
            r0 = 25
            X.C71405Ok4.A01(r5, r0, r4, r13)
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r13.A08
            com.instagram.common.ui.base.IgTextView r1 = r13.A04
            if (r0 == 0) goto L_0x01f4
            if (r1 == 0) goto L_0x0222
            r0 = 2131972502(0x7f135196, float:1.9582013E38)
        L_0x01df:
            X.DbU.A1G(r1, r13, r0)
            com.instagram.common.ui.base.IgTextView r0 = r13.A04
            if (r0 == 0) goto L_0x0222
            r0.setEnabled(r11)
            com.instagram.common.ui.base.IgTextView r1 = r13.A04
            if (r1 == 0) goto L_0x0222
            r0 = 26
            X.C71405Ok4.A01(r1, r0, r4, r13)
            goto L_0x00a7
        L_0x01f4:
            if (r1 == 0) goto L_0x0222
            r0 = 2131973082(0x7f1353da, float:1.958319E38)
            goto L_0x01df
        L_0x01fa:
            com.instagram.common.ui.base.IgEditText r1 = r13.A03
            if (r1 == 0) goto L_0x0219
            r0 = 5
            X.C71273OhE.A00(r1, r13, r0)
            com.instagram.common.ui.base.IgEditText r0 = r13.A03
            if (r0 == 0) goto L_0x0219
            r0.requestFocus()
            com.instagram.common.ui.base.IgEditText r0 = r13.A03
            if (r0 == 0) goto L_0x0219
            r0.setPadding(r11, r11, r11, r11)
            com.instagram.common.ui.base.IgEditText r0 = r13.A03
            if (r0 == 0) goto L_0x0219
            X.0nA.A0R(r0)
            goto L_0x0073
        L_0x0219:
            X.0qQ.A0F(r16)
            goto L_0x0225
        L_0x021d:
            java.lang.String r6 = "viewContext"
            goto L_0x0222
        L_0x0220:
            java.lang.String r6 = "recurrenceDescription"
        L_0x0222:
            X.0qQ.A0F(r6)
        L_0x0225:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKH.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final String A00(NKH nkh) {
        String str;
        String str2;
        IgEditText igEditText = nkh.A03;
        if (igEditText == null) {
            str = "textField";
        } else {
            String A12 = DbV.A12(AnonymousClass7TF.A0f(igEditText));
            C67739Mts mts = nkh.A07;
            str = "promptNamingSuggestionsViewModel";
            if (mts != null) {
                OBU obu = mts.A01;
                if (obu != null) {
                    str2 = obu.A01;
                } else {
                    str2 = null;
                }
                if (!00p.A0j(A12, str2, true) || obu == null) {
                    return null;
                }
                return obu.A00;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(NKH nkh) {
        C69494Nmc nmc;
        String str;
        C70846ONz oNz = nkh.A06;
        if (oNz == null) {
            str = "directPromptsPrivateAndSocialGroupsLogger";
        } else {
            C69497Nmf nmf = C69497Nmf.SEND;
            if (nkh.A08 == null) {
                nmc = C69494Nmc.PROMPT;
            } else {
                nmc = C69494Nmc.EDIT_FLOW;
            }
            String A002 = A00(nkh);
            DirectThreadKey directThreadKey = nkh.A0A;
            str = "threadKey";
            if (directThreadKey != null) {
                oNz.A00(nmf, nmc, A002, directThreadKey.A00, (String) null);
                C333537Zi A003 = C333527Zh.A00(AnonymousClass7TE.A0l(nkh.A0G));
                DirectThreadKey directThreadKey2 = nkh.A0A;
                if (directThreadKey2 != null) {
                    IgEditText igEditText = nkh.A03;
                    if (igEditText == null) {
                        str = "textField";
                    } else {
                        String A0f = AnonymousClass7TF.A0f(igEditText);
                        Context context = nkh.A02;
                        if (context == null) {
                            str = "viewContext";
                        } else {
                            A003.A0E((ULw) null, directThreadKey2, (Long) null, A0f, AnonymousClass7TE.A16(context, nkh.A0H.A00), (String) null, (String) null, TimeZone.getDefault().getID(), A00(nkh), 154, nkh.A00);
                            AnonymousClass7IQ r1 = nkh.A05;
                            if (r1 == null) {
                                str = "logger";
                            } else {
                                DirectThreadKey directThreadKey3 = nkh.A0A;
                                if (directThreadKey3 != null) {
                                    String str2 = directThreadKey3.A00;
                                    String str3 = directThreadKey3.A01;
                                    int i = nkh.A01;
                                    int i2 = nkh.A0F;
                                    String str4 = nkh.A0B;
                                    if (str4 == null) {
                                        str = "currentTabAsString";
                                    } else {
                                        r1.A09(AnonymousClass79B.A01(str4), str2, str3, i, i2, nkh.A0E);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.0rk] */
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        IllegalStateException illegalStateException;
        int i;
        Integer A0o;
        Integer A0o2;
        DirectPromptTypes directPromptTypes;
        DirectEditAddYoursParams directEditAddYoursParams;
        String str;
        int A022 = AnonymousClass0fD.A02(1674451746);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY);
        } else {
            parcelable = null;
        }
        if (parcelable != null) {
            this.A0A = (DirectThreadKey) parcelable;
            AnonymousClass0eM r5 = this.A0G;
            this.A05 = AnonymousClass7IP.A00(this, AnonymousClass7TE.A0l(r5));
            this.A06 = new C70846ONz(this, AnonymousClass7TE.A0l(r5));
            this.A0B = AnonymousClass7TF.A0j(this.A0H.toString());
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (A0o = DbV.A0o(bundle3, "direct_thread_sub_type")) == null) {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1012548623;
            } else {
                this.A01 = A0o.intValue();
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || (A0o2 = DbV.A0o(bundle4, "direct_thread_audience_type")) == null) {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = 436053834;
                } else {
                    this.A0F = A0o2.intValue();
                    Bundle bundle5 = this.mArguments;
                    if (bundle5 != null) {
                        directPromptTypes = (DirectPromptTypes) bundle5.getParcelable("direct_recurring_prompt_type");
                    } else {
                        directPromptTypes = null;
                    }
                    this.A09 = directPromptTypes;
                    Bundle bundle6 = this.mArguments;
                    if (bundle6 != null) {
                        directEditAddYoursParams = (DirectEditAddYoursParams) bundle6.getParcelable("direct_edit_add_yours_params");
                    } else {
                        directEditAddYoursParams = null;
                    }
                    this.A08 = directEditAddYoursParams;
                    if (directEditAddYoursParams != null) {
                        str2 = directEditAddYoursParams.A01;
                    }
                    this.A0C = str2;
                    AnonymousClass7IQ r6 = this.A05;
                    if (r6 == null) {
                        str = "logger";
                    } else {
                        DirectThreadKey directThreadKey = this.A0A;
                        str = "threadKey";
                        if (directThreadKey != null) {
                            String str3 = directThreadKey.A00;
                            String str4 = directThreadKey.A01;
                            int i2 = this.A01;
                            int i3 = this.A0F;
                            String str5 = this.A0B;
                            if (str5 == null) {
                                str = "currentTabAsString";
                            } else {
                                r6.A01(AnonymousClass79B.A01(str5), str3, str4, i2, i3);
                                NKH.super.onCreate(bundle);
                                Context requireContext = requireContext();
                                UserSession A0l = AnonymousClass7TE.A0l(r5);
                                C69365Nk5 nk5 = C69365Nk5.ADD_YOURS;
                                C67739Mts mts = new C67739Mts(requireContext, A0l, nk5, AnonymousClass7TF.A1V(this.A08));
                                this.A07 = mts;
                                UserSession A0l2 = AnonymousClass7TE.A0l(r5);
                                0qQ.A0B(A0l2, 0);
                                if (mts.A04 == nk5) {
                                    ? obj = new Object();
                                    int A042 = DbS.A04(0Tu.A05, A0l2, 36605611127018775L);
                                    obj.A00 = A042;
                                    if (A042 < 1) {
                                        obj.A00 = 60;
                                        A042 = 60;
                                    }
                                    NMH nmh = new NMH(0, obj, mts);
                                    1OC A002 = C70307O1l.A00((C61080JwI) null, A0l2, C69409Nko.TRENDING_PROMPTS_ADD_YOURS_IN_CHAT_SOURCING, C69406Nkk.DIRECT_THREAD, (Boolean) null, (String) null, A042);
                                    A002.A00 = nmh;
                                    1ES.A03(A002);
                                }
                                AnonymousClass0fD.A09(1097466565, A022);
                                return;
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 231058814;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1520143322);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_add_yours_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-1689734509, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1951722225);
        NKH.super.onPause();
        IgEditText igEditText = this.A03;
        if (igEditText == null) {
            0qQ.A0F("textField");
            throw AnonymousClass00P.createAndThrow();
        }
        0nA.A0N(igEditText);
        AnonymousClass0fD.A09(1577224192, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1959454135);
        super.onResume();
        IgEditText igEditText = this.A03;
        if (igEditText == null) {
            0qQ.A0F("textField");
            throw AnonymousClass00P.createAndThrow();
        }
        igEditText.requestFocus();
        AnonymousClass0fD.A09(523179707, A022);
    }
}
