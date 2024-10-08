package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.GiC  reason: case insensitive filesystem */
public final class C53079GiC extends 2Rw {
    public final Activity A00;
    public final AnonymousClass07Z A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final 2el A04;
    public final 1Xj A05;
    public final H8V A06;
    public final List A07;
    public final 0sP A08;
    public final 0sP A09;
    public final 0sL A0A;
    public final boolean A0B;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        View inflate;
        0qQ.A0B(viewGroup, 0);
        if (i == 4) {
            inflate = new IgdsPeopleCell(AnonymousClass7TE.A0S(viewGroup), false);
        } else {
            Context A0S = AnonymousClass7TE.A0S(viewGroup);
            switch (i) {
                case 1:
                    i2 = R.layout.recipe_item_music;
                    break;
                case 2:
                    i2 = R.layout.recipe_item_effect;
                    break;
                case 3:
                    i2 = R.layout.recipe_item_remix;
                    break;
                case 5:
                    i2 = R.layout.recipe_item_layout;
                    break;
                case 6:
                    i2 = R.layout.recipe_item_child_association;
                    break;
                case 7:
                    boolean A012 = C52180GHw.A01(A0S, this.A03);
                    i2 = R.layout.recipe_item_location;
                    if (A012) {
                        i2 = R.layout.recipe_item_location_v2;
                        break;
                    }
                    break;
                case 8:
                    i2 = R.layout.recipe_item_cutout_sticker;
                    break;
                case 9:
                    i2 = R.layout.recipe_item_template;
                    break;
                case 10:
                    i2 = R.layout.recipe_item_meta_verified_link;
                    break;
                case 11:
                    i2 = R.layout.recipe_item_app_more_info;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    i2 = R.layout.recipe_item_gen_ai_label;
                    break;
                case 13:
                    i2 = R.layout.recipe_item_business_category;
                    break;
                case 14:
                    i2 = R.layout.recipe_item_generic_item;
                    break;
                default:
                    throw DbW.A0a("Unknown View Type ID: ", i);
            }
            inflate = LayoutInflater.from(A0S).inflate(i2, viewGroup, false);
        }
        0qQ.A0A(inflate);
        switch (i) {
            case 3:
                return new HKZ(inflate, this);
            case 4:
                return new HKU(inflate, this);
            case 5:
                return new HKQ(inflate, this);
            case 6:
                return new HKY(inflate, this);
            case 7:
                return new HKX(inflate, this);
            case 8:
                Activity activity = this.A00;
                UserSession userSession = this.A03;
                1Xj r9 = this.A05;
                return new C54593HKc(activity, inflate, this.A01, this.A02, userSession, r9, this.A08, false);
            case 9:
                return new C54591HKa(inflate, this.A02, this.A08, this.A0A);
            case 10:
                return new HKS(inflate, this);
            case 11:
                return new HKV(inflate, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new HKR(inflate, this);
            case 13:
                return new HKT(inflate, this);
            case 14:
                return new HKW(inflate, this);
            default:
                return new C54592HKb(inflate, this, i);
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        C53110Gii gii = (C53110Gii) r4;
        0qQ.A0B(gii, 0);
        C57088IOc iOc = (C57088IOc) this.A07.get(i);
        gii.A01(iOc);
        C2354830a A002 = AnonymousClass30Y.A00(iOc, Integer.valueOf(i), iOc.getKey());
        A002.A00(this.A06);
        C51967G9n.A0z(gii.itemView, A002, this.A04);
    }

    public C53079GiC(Activity activity, AnonymousClass07Z r3, AnonymousClass0iw r4, UserSession userSession, 2el r6, 1Xj r7, H8V h8v, List list, 0sP r10, 0sP r11, 0sL r12, boolean z) {
        C51972G9s.A1D(userSession, r6);
        0qQ.A0B(r7, 6);
        this.A02 = r4;
        this.A00 = activity;
        this.A03 = userSession;
        this.A04 = r6;
        this.A06 = h8v;
        this.A05 = r7;
        this.A07 = list;
        this.A01 = r3;
        this.A08 = r10;
        this.A09 = r11;
        this.A0A = r12;
        this.A0B = z;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1738923805);
        int size = this.A07.size();
        AnonymousClass0fD.A0A(612869254, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(1733441064);
        List list = this.A07;
        Object obj = list.get(i);
        int i2 = 14;
        if (obj instanceof H3R) {
            i2 = 2;
        } else if (obj instanceof H3E) {
            i2 = 1;
        } else if (obj instanceof H3P) {
            i2 = 3;
        } else if (obj instanceof H3F) {
            i2 = 4;
        } else if (obj instanceof H3K) {
            i2 = 5;
        } else if (obj instanceof H3I) {
            i2 = 7;
        } else if (obj instanceof H3S) {
            i2 = 8;
        } else if (obj instanceof H3Q) {
            i2 = 9;
        } else if (obj instanceof H3J) {
            i2 = 10;
        } else if (obj instanceof H3M) {
            i2 = 11;
        } else if (obj instanceof H3H) {
            i2 = 12;
        } else if (obj instanceof H3G) {
            i2 = 13;
        } else if (!(obj instanceof H3L) && !(obj instanceof H3O) && !(obj instanceof H3N)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Unknown View Type: ");
            IllegalArgumentException A0w = AnonymousClass7TE.A0w(AnonymousClass7TF.A0i(C51969G9p.A0x(list.get(i)), A1A));
            AnonymousClass0fD.A0A(1180442327, A032);
            throw A0w;
        }
        AnonymousClass0fD.A0A(-334429970, A032);
        return i2;
    }
}
