package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Iterator;

public final class NLa extends C231632rz {
    public final C69327NjS A00;
    public final Context A01;
    public final NKY A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(this.A00.A00);
        }
    }

    public NLa(Context context, C69327NjS njS, NKY nky) {
        this.A01 = context;
        this.A02 = nky;
        this.A00 = njS;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3;
        OHB ohb;
        String str;
        int A03 = AnonymousClass0fD.A03(929728284);
        Iterator it = C69327NjS.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it.next();
            if (((C69327NjS) obj3).A00 == i) {
                break;
            }
        }
        C69327NjS njS = (C69327NjS) obj3;
        if (njS == null) {
            njS = C69327NjS.CUSTOM_LIST_ITEM;
        }
        if (!(view == null || obj == null || !(obj instanceof OHB) || (ohb = (OHB) obj) == null)) {
            NKY nky = this.A02;
            0qQ.A0B(nky, 2);
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.adapter.SupportResourcesViewBinder.Holder");
            OD3 od3 = (OD3) tag;
            if (ohb.A00.ordinal() == 14) {
                C71406Ok5 ok5 = new C71406Ok5(nky, 15);
                int ordinal = njS.ordinal();
                if (ordinal == 0) {
                    View view2 = od3.A00;
                    if (view2 != null) {
                        AnonymousClass7TG.A0R(view2, R.id.support_resource_action_title).setText(ohb.A03.A00);
                        String str2 = ohb.A02.A00;
                        0qQ.A07(str2);
                        if (00l.A0W(str2)) {
                            Dbb.A0t(view2, R.id.support_resource_action_subtitle, 8);
                        } else {
                            AnonymousClass7TG.A0R(view2, R.id.support_resource_action_subtitle).setText(ohb.A02.A00);
                        }
                        AnonymousClass0fU.A00(ok5, view2);
                        view2.setVisibility(0);
                    }
                } else if (ordinal == 1) {
                    IgdsListCell igdsListCell = od3.A01;
                    if (igdsListCell != null) {
                        String str3 = ohb.A03.A00;
                        0qQ.A07(str3);
                        igdsListCell.A0I(str3);
                        String str4 = ohb.A02.A00;
                        0qQ.A07(str4);
                        igdsListCell.A0H(str4);
                        igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
                        Drawable drawable = view.getContext().getDrawable(R.drawable.instagram_heart_pano_outline_24);
                        if (drawable != null) {
                            igdsListCell.A09(drawable);
                        }
                        AnonymousClass0fU.A00(ok5, igdsListCell);
                        igdsListCell.setVisibility(0);
                        NHU nhu = nky.A09;
                        if (nhu != null) {
                            str = nhu.A00().A00();
                        } else {
                            str = null;
                        }
                        C70633OEe oEe = nky.A0A;
                        Integer A002 = O3X.A00(str);
                        0qQ.A0B(A002, 1);
                        UserSession userSession = oEe.A01;
                        if (182.A06(0Tu.A05, userSession, 36326910699059273L)) {
                            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(oEe.A00, userSession), "mwb_support_hub_entry_point_impression");
                            if (A0e.isSampled()) {
                                A0e.AAJ("logger_session_id", oEe.A02);
                                A0e.AAJ("hub_entry_point", "frx_flow");
                                A0e.AAJ("hub_use_case_type", O3Y.A00(A002));
                                A0e.Cgf();
                            }
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            } else {
                View view3 = od3.A00;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                IgdsListCell igdsListCell2 = od3.A01;
                if (igdsListCell2 != null) {
                    igdsListCell2.setVisibility(8);
                }
            }
        }
        AnonymousClass0fD.A0A(1639582126, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Object obj;
        int i2;
        int A03 = AnonymousClass0fD.A03(509058510);
        Iterator it = C69327NjS.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C69327NjS) obj).A00 == i) {
                break;
            }
        }
        C69327NjS njS = (C69327NjS) obj;
        if (njS == null) {
            njS = C69327NjS.CUSTOM_LIST_ITEM;
        }
        LayoutInflater from = LayoutInflater.from(this.A01);
        0qQ.A0A(from);
        0qQ.A0B(from, 0);
        int ordinal = njS.ordinal();
        if (ordinal == 0) {
            i2 = R.layout.support_resource_action_row;
        } else if (ordinal == 1) {
            i2 = R.layout.support_resource_action_row_igds;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        View A0A = DbU.A0A(from, viewGroup, i2, false);
        A0A.setTag(new OD3(A0A));
        AnonymousClass0fD.A0A(-1583984809, A03);
        return A0A;
    }

    public final int getViewTypeCount() {
        return C69327NjS.values().length;
    }
}
