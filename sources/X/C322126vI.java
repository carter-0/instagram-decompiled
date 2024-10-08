package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6vI  reason: invalid class name and case insensitive filesystem */
public final class C322126vI extends C322136vJ implements C2366034j {
    public Bitmap A00;
    public C322946wf A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public MRU A09;
    public AnonymousClass3BN A0A;
    public List A0B;
    public 0sP A0C = C322166vM.A00;
    public final UserSession A0D;
    public final AnonymousClass3BQ A0E;
    public final List A0F = new ArrayList();
    public final List A0G = new ArrayList();
    public final boolean A0H;
    public final boolean A0I;
    public final Context A0J;
    public final AnonymousClass0iw A0K;
    public final C230252pH A0L;
    public final Set A0M;
    public final boolean A0N;
    public final boolean A0O;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.3ot] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C322126vI(Context context, AnonymousClass0iw r4, UserSession userSession, AnonymousClass3BQ r6, boolean z, boolean z2, boolean z3, boolean z4) {
        super((C252303ot) new Object());
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A0J = context;
        this.A0D = userSession;
        this.A0I = z;
        this.A0O = z2;
        this.A0N = z3;
        this.A0K = r4;
        this.A0E = r6;
        this.A0H = z4;
        this.A0L = 1OP.A02(r4, userSession, (String) null);
        this.A04 = true;
        this.A0M = new HashSet();
    }

    public final int A02(String str) {
        if (str != null) {
            List<C319906rQ> list = this.mDiffer.A02;
            0qQ.A07(list);
            int i = 0;
            for (C319906rQ r1 : list) {
                if ((r1 instanceof C318806pZ) && 0qQ.A0K(((C318806pZ) r1).A00.A03.getId(), str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final void A08(String str) {
        AnonymousClass3BT A002;
        0qQ.A0B(str, 0);
        if (this.A0F.contains(str) && (A002 = A00(this, str)) != null) {
            A002.A02 = true;
        }
    }

    public final int CMG(Reel reel) {
        0qQ.A0B(reel, 0);
        return A02(reel.getId());
    }

    public final int CMH(Reel reel, C255773uh r3) {
        0qQ.A0B(reel, 0);
        return A02(reel.getId());
    }

    public final void Ei9(List list, boolean z, UserSession userSession) {
        0qQ.A0B(list, 0);
        A01((MRU) null, this, list, MNY.A00);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE r2;
        View view;
        0qQ.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        switch (i) {
            case 0:
                C322946wf r3 = this.A01;
                if (r3 != null) {
                    view = LayoutInflater.from(context).inflate(R.layout.layout_highlight_tray_button_row, viewGroup, false);
                    r2 = new C319786rD(view, r3);
                    break;
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            case 1:
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A07(context);
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_reel_tray_button, viewGroup, false);
                0qQ.A0A(inflate);
                inflate.setTag(new C319796rE(inflate));
                r2 = new C319796rE(inflate);
                break;
            case 2:
                r2 = AnonymousClass3Mc.A00(context, viewGroup, this.A0D);
                break;
            case 3:
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                View inflate2 = from.inflate(R.layout.highlights_tray_divider, viewGroup, false);
                0qQ.A07(inflate2);
                r2 = new C249703kE(inflate2);
                break;
            case 4:
                view = LayoutInflater.from(context).inflate(R.layout.layout_highlight_tray_padding_item, viewGroup, false);
                r2 = new C249703kE(view);
                break;
            case 6:
                View inflate3 = from.inflate(R.layout.reel_tray_pagination_loading_spinner, viewGroup, false);
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A0A(inflate3);
                r2 = new C255933ux(inflate3);
                break;
            case 7:
            case 9:
                0qQ.A07(context);
                view = LayoutInflater.from(context).inflate(R.layout.reel_item_story_unit, viewGroup, false);
                int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A0A(view);
                r2 = new AnonymousClass3N1(view);
                break;
            case 8:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                0qQ.A07(context);
                return C64173LSa.A00(context, viewGroup);
            default:
                throw new IllegalArgumentException(002.A0O("unexpected viewType: ", i));
        }
        view.setTag(r2);
        return r2;
    }

    public final void onViewAttachedToWindow(C249703kE r10) {
        0qQ.A0B(r10, 0);
        AnonymousClass3BN r4 = this.A0A;
        if (r4 != null) {
            C319906rQ r1 = (C319906rQ) getItem(r10.getBindingAdapterPosition());
            if (r1 instanceof C318806pZ) {
                Reel reel = ((C318806pZ) r1).A00.A03;
                int i = 0;
                Iterator it = this.A0F.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (0qQ.A0K(it.next(), reel.getId())) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                Set set = this.A0M;
                if (!set.contains(reel.getId())) {
                    String id = reel.getId();
                    0qQ.A07(id);
                    set.add(id);
                    this.A0L.A02(reel, r4, Boolean.valueOf(this.A07), (Boolean) null, (Integer) null, i);
                }
            }
        }
    }

    public static final AnonymousClass3BT A00(C322126vI r2, String str) {
        Object obj;
        Iterator it = r2.A0G.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass3BT) obj).A03.getId(), str)) {
                break;
            }
        }
        return (AnonymousClass3BT) obj;
    }

    public final Reel A03(String str) {
        List list = this.A0G;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Reel reel = ((AnonymousClass3BT) list.get(i)).A03;
            if (0qQ.A0K(reel.getId(), str)) {
                return reel;
            }
        }
        return null;
    }

    public final List A04() {
        List<AnonymousClass3BT> list = this.A0G;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (AnonymousClass3BT r0 : list) {
            arrayList.add(r0.A03);
        }
        return arrayList;
    }

    public final void A05() {
        this.A0G.clear();
        this.A0F.clear();
        this.A0A = null;
        this.A0M.clear();
        submitList(0sn.A00);
    }

    public final void A06() {
        0sn r2 = this.A0B;
        if (r2 == null) {
            r2 = 0sn.A00;
        }
        A01(this.A09, this, r2, this.A0C);
    }

    public final void A07(String str) {
        List list = this.A0F;
        if (list.contains(str)) {
            018.A1A(this.A0G, new MYK(str, 13));
            list.remove(str);
            List list2 = this.mDiffer.A02;
            0qQ.A07(list2);
            ArrayList arrayList = new ArrayList();
            for (Object next : list2) {
                C319906rQ r1 = (C319906rQ) next;
                if (!(r1 instanceof C318806pZ) || !0qQ.A0K(((C318806pZ) r1).A00.A03.getId(), str)) {
                    arrayList.add(next);
                }
            }
            submitList(arrayList);
        }
    }

    public final void A09(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            A06();
        }
    }

    public final boolean A0A() {
        if (this.A0G.isEmpty()) {
            UserSession userSession = this.A0D;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36322289314179110L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        if (r13.A03.A0p() == false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r26, int r27) {
        /*
            r25 = this;
            r15 = r26
            r5 = 0
            X.0qQ.A0B(r15, r5)
            r0 = r25
            r4 = r27
            int r9 = r0.getItemViewType(r4)
            android.content.Context r10 = r0.A0J
            r1 = 2130970237(0x7f04067d, float:1.7549178E38)
            int r7 = X.2Yu.A0H(r10, r1)
            r2 = 0
            java.lang.String r8 = "null cannot be cast to non-null type com.instagram.archive.helper.HighlightsTrayItem.MyWeekNux"
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.archive.helper.HighlightsTrayItem.Highlight"
            java.lang.String r1 = "Required value was null."
            r3 = 1
            switch(r9) {
                case 0: goto L_0x0110;
                case 1: goto L_0x0128;
                case 2: goto L_0x007a;
                case 3: goto L_0x00cc;
                case 4: goto L_0x0079;
                case 5: goto L_0x02a5;
                case 6: goto L_0x00fd;
                case 7: goto L_0x015d;
                case 8: goto L_0x019a;
                case 9: goto L_0x0225;
                case 10: goto L_0x0260;
                case 11: goto L_0x027c;
                case 12: goto L_0x0298;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.Object r2 = r0.getItem(r4)
            X.0qQ.A0C(r2, r6)
            X.6pZ r2 = (X.C318806pZ) r2
            X.3BT r8 = r2.A00
            com.instagram.common.session.UserSession r7 = r0.A0D
            r6 = r15
            X.Jpp r6 = (X.C60704Jpp) r6
            java.util.List r5 = r0.A0F
            X.6wf r2 = r0.A01
            if (r2 == 0) goto L_0x010a
            X.0iw r1 = r0.A0K
            java.lang.String r20 = r1.getModuleName()
            r23 = 0
            if (r27 == 0) goto L_0x0044
            r23 = 1
        L_0x0044:
            int r1 = r0.getItemCount()
            int r1 = r1 - r3
            r24 = 0
            if (r4 == r1) goto L_0x004f
            r24 = 1
        L_0x004f:
            r18 = r6
            r19 = r2
            r21 = r5
            r22 = r4
            r16 = r7
            r17 = r8
            X.C64173LSa.A03(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.6wf r1 = r0.A01
            if (r1 == 0) goto L_0x0079
            com.instagram.model.reels.Reel r0 = r8.A03
            boolean r0 = r1.Cdz(r0)
            if (r0 != r3) goto L_0x0079
            android.view.View r3 = r15.itemView
            X.0qQ.A06(r3)
            r1 = 500(0x1f4, double:2.47E-321)
            X.FrX r0 = new X.FrX
            r0.<init>(r3)
            r3.postDelayed(r0, r1)
        L_0x0079:
            return
        L_0x007a:
            java.lang.Object r2 = r0.getItem(r4)
            X.0qQ.A0C(r2, r6)
            X.6pZ r2 = (X.C318806pZ) r2
            X.3BT r13 = r2.A00
            X.3N1 r15 = (X.AnonymousClass3N1) r15
            com.instagram.common.session.UserSession r12 = r0.A0D
            java.lang.String r2 = r15.Bkc()
            X.3BT r14 = A00(r0, r2)
            X.6wf r6 = r0.A01
            if (r6 == 0) goto L_0x02b2
            java.util.List r7 = r0.A0F
            X.0iw r11 = r0.A0K
            boolean r5 = r0.A0O
            boolean r2 = r0.A0N
            if (r2 == 0) goto L_0x00a9
            com.instagram.model.reels.Reel r1 = r13.A03
            boolean r1 = r1.A0p()
            r21 = 1
            if (r1 != 0) goto L_0x00ab
        L_0x00a9:
            r21 = 0
        L_0x00ab:
            r18 = r4
            r19 = r5
            r20 = r2
            r22 = r3
            r16 = r6
            r17 = r7
            X.AnonymousClass3Mc.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.6wf r0 = r0.A01
            if (r0 == 0) goto L_0x0079
            com.instagram.model.reels.Reel r2 = r13.A03
            boolean r0 = r0.Cdz(r2)
            if (r0 != r3) goto L_0x0079
            r0 = 500(0x1f4, double:2.47E-321)
            X.C49101EpQ.A00(r12, r2, r15, r0)
            return
        L_0x00cc:
            boolean r1 = r0.A07
            android.view.View r0 = r15.itemView
            if (r1 == 0) goto L_0x00e2
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0079
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0079
            r0 = 0
        L_0x00df:
            r1.topMargin = r0
            return
        L_0x00e2:
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.view.View r0 = r15.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0079
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0079
            int r0 = -r2
            goto L_0x00df
        L_0x00fd:
            X.6wf r0 = r0.A01
            if (r0 == 0) goto L_0x0079
            r0.AUz()
            X.3ux r15 = (X.C255933ux) r15
            r15.A00(r0)
            return
        L_0x010a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0110:
            r2 = r15
            X.6rD r2 = (X.C319786rD) r2
            android.view.View r0 = r15.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            X.C52438GSq.A00(r2, r0)
            return
        L_0x0128:
            X.6rE r15 = (X.C319796rE) r15
            r4 = 2131963446(0x7f132e36, float:1.9563646E38)
            X.0qQ.A0B(r15, r5)
            android.widget.ImageView r0 = r15.A01
            r0.setImageResource(r5)
            r3 = 8
            r0.setVisibility(r3)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r15.A03
            r2.A0H(r5, r5)
            android.content.Context r0 = r2.getContext()
            int r1 = r0.getColor(r7)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setImageDrawable(r0)
            android.widget.TextView r0 = r15.A02
            r0.setText(r4)
            r0.setVisibility(r5)
            X.3oV r0 = r15.A04
            r0.setVisibility(r3)
            return
        L_0x015d:
            X.3N1 r15 = (X.AnonymousClass3N1) r15
            X.6wf r3 = r0.A01
            if (r3 == 0) goto L_0x0194
            X.MIa r6 = new X.MIa
            r6.<init>(r3)
            java.lang.Object r1 = r0.getItem(r4)
            X.0qQ.A0C(r1, r8)
            X.6pa r1 = (X.C318816pa) r1
            X.3BT r1 = r1.A00
            if (r1 == 0) goto L_0x0177
            com.instagram.model.reels.Reel r2 = r1.A03
        L_0x0177:
            com.instagram.common.session.UserSession r3 = r0.A0D
            X.0qQ.A0B(r15, r5)
            r0 = 3
            X.0qQ.A0B(r3, r0)
            r1 = 41
            X.MJ8 r0 = new X.MJ8
            r0.<init>(r1, r6, r2)
            X.C64021LJi.A00(r3, r15, r0)
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r0 = r15.A03
            X.3N0 r1 = r0.getHolder()
            X.KWN r0 = X.KWN.A00
            goto L_0x0253
        L_0x0194:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x019a:
            X.Jpp r15 = (X.C60704Jpp) r15
            X.6wf r6 = r0.A01
            if (r6 == 0) goto L_0x021f
            com.instagram.common.session.UserSession r7 = r0.A0D
            java.lang.Object r1 = r0.getItem(r4)
            X.0qQ.A0C(r1, r8)
            X.6pa r1 = (X.C318816pa) r1
            X.3BT r1 = r1.A00
            if (r1 == 0) goto L_0x01b1
            com.instagram.model.reels.Reel r2 = r1.A03
        L_0x01b1:
            r1 = 0
            if (r27 == 0) goto L_0x01b5
            r1 = 1
        L_0x01b5:
            int r0 = r0.getItemCount()
            int r0 = r0 - r3
            if (r4 != r0) goto L_0x01bd
            r3 = 0
        L_0x01bd:
            X.0qQ.A0B(r15, r5)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            X.C64173LSa.A04(r15)
            r15.A00(r1, r3)
            android.view.View r0 = r15.itemView
            android.content.Context r4 = r0.getContext()
            com.instagram.common.ui.base.IgSimpleImageView r1 = r15.A02
            X.Jci r0 = r15.A07
            r1.setImageDrawable(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r15.A04
            r1.setVisibility(r5)
            r0 = 2131238589(0x7f081ebd, float:1.809346E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r1.setImageDrawable(r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r4.getColor(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setImageTintList(r0)
            com.instagram.common.ui.base.IgTextView r3 = r15.A05
            android.view.View r0 = r15.itemView
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131963441(0x7f132e31, float:1.9563635E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setText(r0)
            r3.setVisibility(r5)
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r3.setTextColor(r0)
            X.LjE r0 = new X.LjE
            r0.<init>(r6, r7, r2)
            r15.A00 = r0
            return
        L_0x021f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0225:
            X.3N1 r15 = (X.AnonymousClass3N1) r15
            java.lang.Object r4 = r0.getItem(r4)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.archive.helper.HighlightsTrayItem.MyWeekEmptyPog"
            X.0qQ.A0C(r4, r2)
            X.6pb r4 = (X.C318826pb) r4
            X.6wf r2 = r0.A01
            if (r2 == 0) goto L_0x025a
            X.MIQ r3 = new X.MIQ
            r3.<init>(r2)
            boolean r2 = r4.A00
            com.instagram.common.session.UserSession r1 = r0.A0D
            X.0qQ.A0B(r15, r5)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.C64021LJi.A00(r1, r15, r3)
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r0 = r15.A03
            X.3N0 r1 = r0.getHolder()
            if (r2 == 0) goto L_0x0257
            X.HDR r0 = X.HDR.A00
        L_0x0253:
            X.C64021LJi.A01(r0, r1)
            return
        L_0x0257:
            X.KWM r0 = X.KWM.A00
            goto L_0x0253
        L_0x025a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0260:
            X.Jpp r15 = (X.C60704Jpp) r15
            X.6wf r2 = r0.A01
            if (r2 == 0) goto L_0x0276
            r1 = 0
            if (r27 == 0) goto L_0x026a
            r1 = 1
        L_0x026a:
            int r0 = r0.getItemCount()
            int r0 = r0 - r3
            if (r4 != r0) goto L_0x0272
            r3 = 0
        L_0x0272:
            X.C64173LSa.A02(r2, r15, r1, r3)
            return
        L_0x0276:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x027c:
            X.Jpp r15 = (X.C60704Jpp) r15
            X.6wf r2 = r0.A01
            if (r2 == 0) goto L_0x0292
            r1 = 0
            if (r27 == 0) goto L_0x0286
            r1 = 1
        L_0x0286:
            int r0 = r0.getItemCount()
            int r0 = r0 - r3
            if (r4 != r0) goto L_0x028e
            r3 = 0
        L_0x028e:
            X.C64173LSa.A01(r10, r15, r2, r1, r3)
            return
        L_0x0292:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0298:
            X.Jpp r15 = (X.C60704Jpp) r15
            r0 = 2
            X.0qQ.A0B(r15, r0)
            X.C64173LSa.A04(r15)
            r15.A00(r5, r5)
            return
        L_0x02a5:
            java.lang.String r1 = "unexpected viewType: "
            r0 = 5
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322126vI.onBindViewHolder(X.3kE, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
        if (r9.A03.A0l() == true) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0172, code lost:
        if (r0.intValue() > 0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017d, code lost:
        if (r14.A03 != false) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.MRU r13, X.C322126vI r14, java.util.List r15, X.0sP r16) {
        /*
            r14.A05()
            boolean r3 = r14.A03
            com.instagram.common.session.UserSession r6 = r14.A0D
            X.6wn r0 = X.C323006wm.A00(r6)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "my_week_enabled"
            r10 = 0
            boolean r0 = r1.getBoolean(r0, r10)
            r14.A03 = r0
            X.6wn r0 = X.C323006wm.A00(r6)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "seen_my_week_nux"
            boolean r0 = r1.getBoolean(r0, r10)
            r0 = r0 ^ 1
            r14.A06 = r0
            X.0Tu r8 = X.0Tu.A05
            r0 = 36328817664474733(0x8110de00003e6d, double:3.037828803196397E-306)
            boolean r12 = X.182.A06(r8, r6, r0)
            boolean r0 = r15.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0091
            java.util.Iterator r5 = r15.iterator()
        L_0x003d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r2 = r5.next()
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            boolean r0 = r2.A15(r6)
            if (r0 == 0) goto L_0x005a
            java.util.List r0 = r2.A0y
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005a
            goto L_0x003d
        L_0x005a:
            X.3BQ r4 = r14.A0E
            r0 = 0
            X.3BT r1 = new X.3BT
            r1.<init>(r0, r2, r4)
            boolean r0 = r14.A0H
            if (r0 == 0) goto L_0x0070
            boolean r0 = r2.A0l()
            if (r0 == 0) goto L_0x0070
            android.graphics.Bitmap r0 = r14.A00
            r1.A00 = r0
        L_0x0070:
            if (r13 == 0) goto L_0x0078
            boolean r0 = r13.Esv(r2)
            r1.A02 = r0
        L_0x0078:
            java.util.List r0 = r14.A0G
            r0.add(r1)
            java.util.List r1 = r14.A0F
            java.lang.String r0 = r2.getId()
            X.0qQ.A07(r0)
            r1.add(r0)
            goto L_0x003d
        L_0x008a:
            X.3BN r0 = new X.3BN
            r0.<init>(r6, r15)
            r14.A0A = r0
        L_0x0091:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r4 = r14.A0I
            if (r4 != 0) goto L_0x00b4
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x00b4
            java.util.List r0 = r14.A0G
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x00b4
            boolean r1 = r14.A07
            X.6pc r0 = new X.6pc
            r0.<init>(r1)
            r2.add(r0)
        L_0x00b4:
            boolean r0 = r14.A0N
            if (r0 == 0) goto L_0x00f7
            java.util.List r0 = r14.A0G
            java.lang.Object r9 = X.00k.A0J(r0)
            X.3BT r9 = (X.AnonymousClass3BT) r9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 36322289314900017(0x810aee000b2831, double:3.033700248637793E-306)
            boolean r11 = X.182.A06(r8, r6, r0)
            boolean r0 = r14.A0H
            r7 = 1
            if (r0 != 0) goto L_0x012d
            if (r9 == 0) goto L_0x00e7
            com.instagram.model.reels.Reel r0 = r9.A03
            boolean r0 = r0.A0l()
            if (r0 != r7) goto L_0x00e7
        L_0x00dd:
            boolean r0 = r14.A07
            X.6pZ r1 = new X.6pZ
            r1.<init>(r6, r9, r0)
        L_0x00e4:
            r5.add(r1)
        L_0x00e7:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f4
            X.6rR r0 = X.C319916rR.A00
            r5.add(r0)
        L_0x00f4:
            r2.addAll(r5)
        L_0x00f7:
            if (r12 == 0) goto L_0x0109
            if (r4 == 0) goto L_0x0109
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x0109
            boolean r1 = r14.A07
            X.6rS r0 = new X.6rS
            r0.<init>(r1)
            r2.add(r0)
        L_0x0109:
            java.util.List r0 = r14.A0G
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x0114:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x018b
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.3BT r0 = (X.AnonymousClass3BT) r0
            com.instagram.model.reels.Reel r0 = r0.A03
            boolean r0 = r0.A0l()
            if (r0 != 0) goto L_0x0114
            r7.add(r1)
            goto L_0x0114
        L_0x012d:
            X.0qQ.A0B(r6, r10)
            r0 = 36322289314179110(0x810aee00002826, double:3.0337002481818884E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r14.A06
            r10 = 0
            if (r0 == 0) goto L_0x015a
            if (r9 == 0) goto L_0x0152
            com.instagram.model.reels.Reel r8 = r9.A03
            boolean r0 = r8.A0l()
            if (r0 != r7) goto L_0x0152
            X.3BQ r1 = r14.A0E
            X.3BT r0 = new X.3BT
            r0.<init>(r10, r8, r1)
            r10 = r0
        L_0x0152:
            boolean r0 = r14.A07
            X.6pa r1 = new X.6pa
            r1.<init>(r10, r0)
            goto L_0x00e4
        L_0x015a:
            boolean r0 = r14.A03
            if (r0 != 0) goto L_0x0160
            if (r11 == 0) goto L_0x017b
        L_0x0160:
            if (r9 == 0) goto L_0x0176
            com.instagram.model.reels.Reel r1 = r9.A03
            boolean r0 = r1.A0l()
            if (r0 != r7) goto L_0x0176
            java.lang.Integer r0 = r1.A0e
            if (r0 == 0) goto L_0x0176
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0176
            goto L_0x00dd
        L_0x0176:
            if (r11 == 0) goto L_0x017b
            boolean r7 = r14.A03
            goto L_0x017f
        L_0x017b:
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x00e7
        L_0x017f:
            boolean r1 = r14.A07
            X.6pb r0 = new X.6pb
            r0.<init>(r7, r1)
            r5.add(r0)
            goto L_0x00e7
        L_0x018b:
            java.util.Iterator r7 = r7.iterator()
        L_0x018f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r5 = r7.next()
            X.3BT r5 = (X.AnonymousClass3BT) r5
            boolean r1 = r14.A07
            X.6pZ r0 = new X.6pZ
            r0.<init>(r6, r5, r1)
            r2.add(r0)
            goto L_0x018f
        L_0x01a6:
            X.6wf r0 = r14.A01
            r1 = 1
            if (r0 == 0) goto L_0x01b6
            boolean r0 = r0.CKZ()
            if (r0 != r1) goto L_0x01b6
            X.6rn r0 = X.C320116rn.A00
            r2.add(r0)
        L_0x01b6:
            if (r12 != 0) goto L_0x01c8
            if (r4 == 0) goto L_0x01c8
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x01c8
            boolean r1 = r14.A07
            X.6rS r0 = new X.6rS
            r0.<init>(r1)
            r2.add(r0)
        L_0x01c8:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01db
            java.lang.Object r0 = X.00k.A0K(r2)
            boolean r0 = r0 instanceof X.C319916rR
            if (r0 == 0) goto L_0x01db
            X.018.A15(r2)
        L_0x01db:
            X.6yZ r0 = new X.6yZ
            r1 = r16
            r0.<init>(r14, r1, r3)
            r14.submitList(r2, r0)
            r14.A0B = r15
            r14.A09 = r13
            r14.A0C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322126vI.A01(X.MRU, X.6vI, java.util.List, X.0sP):void");
    }

    public final Object Bkf(int i) {
        Object item = getItem(i);
        if (!(item instanceof C318806pZ)) {
            return null;
        }
        return item;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(1918439284);
        Object item = getItem(i);
        if (item instanceof C320116rn) {
            i2 = 6;
        } else if (item instanceof C319926rS) {
            i2 = 0;
            if (this.A07) {
                i2 = 11;
            }
        } else if (item instanceof C318816pa) {
            i2 = 7;
            if (this.A07) {
                i2 = 8;
            }
        } else if (item instanceof C318826pb) {
            i2 = 9;
            if (this.A07) {
                i2 = 10;
            }
        } else if (item instanceof C319916rR) {
            i2 = 3;
        } else if (item instanceof C318836pc) {
            i2 = 1;
            if (this.A07) {
                i2 = 12;
            }
        } else if (item instanceof C318806pZ) {
            i2 = 2;
            if (this.A07) {
                i2 = 13;
            }
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(1193710365, A032);
            throw runtimeException;
        }
        AnonymousClass0fD.A0A(-1544197244, A032);
        return i2;
    }
}
