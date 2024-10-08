package com.instagram.ui.widget.thumbnailview;

import X.002;
import X.0wb;
import X.1Xj;
import X.2Yu;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51969G9p;
import X.C62576Ki9;
import X.C63115Krj;
import X.C64885Ljl;
import X.C71382cm;
import X.C71662eb;
import X.DbU;
import X.DbY;
import X.DbZ;
import X.JTO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.Iterator;
import java.util.List;

public class ThumbnailView extends FrameLayout {
    public View A00;
    public C71662eb A01;
    public RoundedCornerMediaFrameLayout A02;
    public List A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C71662eb A08;
    public C71662eb A09;
    public C71662eb A0A;
    public C62576Ki9 A0B = C62576Ki9.A03;

    private void setGridOnInflateListener(C71662eb r3) {
        r3.A02 = new C64885Ljl(this, 7);
    }

    private void A00() {
        int i;
        if (this.A03 != null) {
            int i2 = this.A05;
            C62576Ki9 ki9 = this.A0B;
            if (ki9 == C62576Ki9.A04) {
                i = (i2 * 2) + this.A04;
            } else if (ki9 == C62576Ki9.A05) {
                i = i2;
                i2 = (i2 * 2) + this.A04;
            } else {
                i = i2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i);
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                JTO.A0H(it).setLayoutParams(layoutParams);
            }
        }
    }

    private void A01() {
        this.A01.A02();
        List<IgImageView> list = this.A03;
        if (list != null) {
            for (IgImageView igImageView : list) {
                igImageView.setImageDrawable((Drawable) null);
                igImageView.A0E = null;
                igImageView.A0D = null;
            }
        }
        A04(this);
        getGridHolder().A03(0);
    }

    public static void A04(ThumbnailView thumbnailView) {
        thumbnailView.A08.A02();
        thumbnailView.A09.A02();
        thumbnailView.A0A.A02();
        thumbnailView.A01.A02();
        View view = thumbnailView.A00;
        if (view != null) {
            thumbnailView.A02.removeView(view);
            thumbnailView.A00 = null;
        }
    }

    private C71662eb getGridHolder() {
        int ordinal = this.A0B.ordinal();
        if (ordinal == 1) {
            return this.A0A;
        }
        if (ordinal != 2) {
            return this.A08;
        }
        return this.A09;
    }

    public void setGridLayout(C62576Ki9 ki9) {
        boolean A1a = C51969G9p.A1a(ki9, this.A0B);
        this.A0B = ki9;
        if (A1a) {
            setupGrid((ViewGroup) getGridHolder().A01());
        }
    }

    public ThumbnailView(Context context) {
        super(context);
        A02((AttributeSet) null);
    }

    private void A02(AttributeSet attributeSet) {
        C62576Ki9 ki9;
        Context context = getContext();
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) LayoutInflater.from(context).inflate(R.layout.thumbnail_view_layout, this).requireViewById(R.id.container);
        this.A02 = roundedCornerMediaFrameLayout;
        this.A01 = DbY.A0T(roundedCornerMediaFrameLayout, R.id.single_thumbnail_stub);
        C71662eb A0T = DbY.A0T(this.A02, R.id.two_by_two_thumbnail_stub);
        this.A08 = A0T;
        setGridOnInflateListener(A0T);
        C71662eb A0T2 = DbY.A0T(this.A02, R.id.two_rows_one_column_thumbnail_stub);
        this.A0A = A0T2;
        setGridOnInflateListener(A0T2);
        C71662eb A0T3 = DbY.A0T(this.A02, R.id.two_columns_one_row_thumbnail_stub);
        this.A09 = A0T3;
        setGridOnInflateListener(A0T3);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2H);
            if (obtainStyledAttributes.hasValue(2)) {
                int i = obtainStyledAttributes.getInt(2, 0);
                C62576Ki9[] values = C62576Ki9.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        0wb.A03("ThumbnailView_GridLayout", 002.A0O("Unexpected grid layout index: ", i));
                        ki9 = C62576Ki9.A03;
                        break;
                    }
                    ki9 = values[i2];
                    if (ki9.A00 == i) {
                        break;
                    }
                    i2++;
                }
                this.A0B = ki9;
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.A02.setRadius(obtainStyledAttributes.getDimensionPixelOffset(0, DbY.A01(context)));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, AnonymousClass7TF.A02(context, R.dimen.account_recs_header_image_margin));
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.A06 = obtainStyledAttributes.getColor(3, 2Yu.A0F(context, R.attr.strokeColor));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static void setImageForMedia(ImageUrl imageUrl, IgImageView igImageView, AnonymousClass0iw r4) {
        DbU.A14(igImageView.getContext(), igImageView, R.color.fds_transparent);
        igImageView.setUrl(imageUrl, r4);
    }

    /* access modifiers changed from: private */
    public void setupGrid(ViewGroup viewGroup) {
        this.A03 = AnonymousClass7TE.A1C();
        for (int requireViewById : this.A0B.A01) {
            RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) viewGroup.requireViewById(requireViewById);
            roundedCornerImageView.setStrokeColor(this.A06);
            roundedCornerImageView.setStrokeWidth(this.A07);
            this.A03.add(roundedCornerImageView);
        }
        A00();
    }

    public final void onMeasure(int i, int i2) {
        int A002 = C63115Krj.A00(i, i2);
        this.A05 = (View.MeasureSpec.getSize(A002) - this.A04) / 2;
        A00();
        super.onMeasure(A002, A002);
    }

    public void setCustomView(View view) {
        A04(this);
        this.A02.addView(view);
        this.A00 = view;
    }

    public void setGridImages(List list, AnonymousClass0iw r7) {
        A01();
        this.A03.getClass();
        int min = Math.min(list.size(), this.A03.size());
        for (int i = 0; i < min; i++) {
            IgImageView igImageView = (IgImageView) this.A03.get(i);
            igImageView.setUrl((ImageUrl) list.get(i), r7);
            DbU.A14(igImageView.getContext(), igImageView, R.color.thumbnail_tint);
        }
    }

    public void setGridImagesFromMedia(Context context, AnonymousClass0iw r6, List list) {
        A01();
        this.A03.getClass();
        int min = Math.min(list.size(), this.A03.size());
        for (int i = 0; i < min; i++) {
            ExtendedImageUrl A1n = DbZ.A0T(list, i).A1n(context);
            A1n.getClass();
            setImageForMedia(A1n, (IgImageView) this.A03.get(i), r6);
        }
    }

    public void setSingleImageFromMedia(1Xj r3, ImageUrl imageUrl, AnonymousClass0iw r5) {
        A04(this);
        this.A01.A03(0);
        IgImageView A012 = this.A01.A01();
        if (r3 != null) {
            setImageForMedia(imageUrl, A012, r5);
        } else {
            A012.setUrl(imageUrl, r5);
        }
    }

    public void setSingleImageFromUrl(ImageUrl imageUrl, AnonymousClass0iw r4) {
        A04(this);
        this.A01.A03(0);
        this.A01.A01().setUrl(imageUrl, r4);
    }

    public ThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(attributeSet);
    }

    public ThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(attributeSet);
    }
}
