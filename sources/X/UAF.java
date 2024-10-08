package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

public final class UAF extends 2Rw {
    public List A00 = new ArrayList();
    public final AnonymousClass0iw A01;

    public UAF(AnonymousClass0iw r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final void onBindViewHolder(C249703kE r7, int i) {
        IgTextView igTextView;
        String str;
        View.OnClickListener onClickListener;
        IgTextView igTextView2;
        0qQ.A0B(r7, 0);
        Object obj = this.A00.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0 || itemViewType == 1) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsThumbnailViewModel");
            VVR vvr = (VVR) obj;
            ImageUrl imageUrl = vvr.A01;
            View.OnClickListener onClickListener2 = vvr.A00;
            AnonymousClass0iw r2 = this.A01;
            0qQ.A0B(onClickListener2, 1);
            IgImageView igImageView = ((C14833UBm) r7).A00;
            igImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
            AnonymousClass0fU.A00(onClickListener2, igImageView);
            igImageView.setUrl(imageUrl, r2);
            igImageView.setVisibility(0);
            return;
        }
        if (itemViewType == 2) {
            UBQ ubq = (UBQ) r7;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel");
            str = ((PromoteCampaignControlsHeaderViewModel) obj).A00;
            if (str != null) {
                igTextView = ubq.A00;
            } else {
                0qQ.A0F("headerText");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (itemViewType != 3) {
            if (itemViewType == 4) {
                UDM udm = (UDM) r7;
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsPromotionDataRowViewModel");
                C17484VXl vXl = (C17484VXl) obj;
                String str2 = vXl.A02;
                String str3 = vXl.A01;
                onClickListener = vXl.A00;
                0qQ.A0B(str3, 1);
                udm.A03.setText(str2);
                udm.A02.setText(str3);
                udm.A01.setVisibility(0);
                igTextView2 = udm.A00;
            } else if (itemViewType == 6) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsPromotionActionRowViewModel");
                VVQ vvq = (VVQ) obj;
                String str4 = vvq.A02;
                int i2 = vvq.A00;
                onClickListener = vvq.A01;
                igTextView2 = ((C14832UBl) r7).A00;
                igTextView2.setText(str4);
                DbT.A17(igTextView2.getContext(), igTextView2, i2);
            } else {
                return;
            }
            AnonymousClass0fU.A00(onClickListener, igTextView2);
            return;
        } else {
            UDM udm2 = (UDM) r7;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsPromotionDataRowViewModel");
            C17484VXl vXl2 = (C17484VXl) obj;
            String str5 = vXl2.A02;
            str = vXl2.A01;
            0qQ.A0B(str, 1);
            udm2.A03.setText(str5);
            igTextView = udm2.A02;
        }
        igTextView.setText(str);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.UBQ, X.3kE] */
    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        switch (i) {
            case 0:
                return new C14833UBm(A0F.inflate(R.layout.promote_campaign_controls_thumbnail_view, viewGroup, false), false);
            case 1:
                return new C14833UBm(A0F.inflate(R.layout.promote_campaign_controls_thumbnail_view, viewGroup, false), true);
            case 2:
                View inflate = A0F.inflate(R.layout.row_title_textview, viewGroup, false);
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A0B(inflate, 1);
                ? r2 = new C249703kE(inflate);
                r2.A00 = (TitleTextView) AnonymousClass7TF.A0F(inflate, R.id.row_header_textview);
                return r2;
            case 3:
            case 4:
                return new UDM(A0F.inflate(R.layout.promote_campaign_controls_row, viewGroup, false));
            case 5:
                return new C14831UBk(A0F.inflate(R.layout.promote_campaign_controls_divider, viewGroup, false));
            case 6:
                return new C14832UBl(A0F.inflate(R.layout.promote_campaign_controls_action_row, viewGroup, false));
            default:
                throw new IllegalArgumentException("Unknown View Type");
        }
    }

    public static void A00(UZX uzx, List list) {
        UAF uaf = (UAF) uzx.A0B.getValue();
        uaf.A00 = list;
        uaf.notifyDataSetChanged();
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(564866322);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1415943059, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A03 = AnonymousClass0fD.A03(-1156292873);
        Object obj = this.A00.get(i);
        if (obj instanceof VVR) {
            i2 = AnonymousClass7TF.A1P(((VVR) obj).A02 ? 1 : 0);
        } else if (obj instanceof PromoteCampaignControlsHeaderViewModel) {
            i2 = 2;
        } else if (obj instanceof C17484VXl) {
            i2 = 3;
            if (((C17484VXl) obj).A03) {
                i2 = 4;
            }
        } else {
            Object obj2 = null;
            if (obj instanceof String) {
                obj2 = obj;
            }
            if (0qQ.A0K(obj2, "divider")) {
                i2 = 5;
            } else if (obj instanceof VVQ) {
                i2 = 6;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown View Model");
                AnonymousClass0fD.A0A(4527972, A03);
                throw illegalArgumentException;
            }
        }
        AnonymousClass0fD.A0A(2032749110, A03);
        return i2;
    }
}
