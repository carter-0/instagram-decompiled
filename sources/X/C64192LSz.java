package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.Set;

/* renamed from: X.LSz  reason: case insensitive filesystem */
public final class C64192LSz {
    public static final C64192LSz A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.common.session.UserSession r4, X.C231872sY r5, X.C231882sZ r6, X.C65533Luw r7, X.AnonymousClass3Q2 r8) {
        /*
            r1 = 0
            X.AnonymousClass7TF.A1H(r7, r8)
            X.3Q2 r0 = r7.A02
            if (r0 == 0) goto L_0x000b
            r0.A0Z(r7)
        L_0x000b:
            r7.A02 = r8
            r7.A00 = r4
            boolean r0 = r8.A0u()
            r3 = 0
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = r8.A0L()
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            if (r0 == 0) goto L_0x0056
            java.lang.String r4 = r0.A33
        L_0x0024:
            if (r4 == 0) goto L_0x0056
            goto L_0x002a
        L_0x0027:
            java.lang.String r4 = r8.A33
            goto L_0x0024
        L_0x002a:
            android.widget.TextView r0 = r7.A0C     // Catch:{ NotFoundException -> 0x004c }
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r0)     // Catch:{ NotFoundException -> 0x004c }
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ NotFoundException -> 0x004c }
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            r1.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x004c }
            X.0iw r2 = X.AnonymousClass6WL.A02(r2)     // Catch:{ NotFoundException -> 0x004c }
            if (r2 == 0) goto L_0x0056
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r7.A0D     // Catch:{ NotFoundException -> 0x004c }
            java.lang.String r0 = "file://"
            java.lang.String r0 = X.002.A0R(r0, r4)     // Catch:{ NotFoundException -> 0x004c }
            X.DbV.A1P(r2, r1, r0)     // Catch:{ NotFoundException -> 0x004c }
            goto L_0x0056
        L_0x004c:
            X.0wj r2 = X.0wj.A01
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            java.lang.String r0 = "Unable to load resource for pending media upload"
            r2.AEf(r0, r1)
        L_0x0056:
            boolean r0 = r8.A12()
            android.widget.ImageView r1 = r7.A09
            if (r0 == 0) goto L_0x0089
            r0 = 2131237426(0x7f081a32, float:1.8091102E38)
            r1.setBackgroundResource(r0)
        L_0x0064:
            A02(r7)
            android.widget.ImageView r1 = r7.A0A
            r0 = 58
            X.LYE.A00(r1, r0, r7)
            android.widget.ImageView r1 = r7.A07
            r0 = 59
            X.LYE.A00(r1, r0, r7)
            com.instagram.igds.components.button.IgdsButton r1 = r7.A0E
            r0 = 9
            X.LY7.A00(r1, r0, r6, r7)
            if (r5 == 0) goto L_0x0085
            android.widget.ImageView r1 = r7.A08
            r0 = 10
            X.LY7.A00(r1, r0, r5, r7)
        L_0x0085:
            r8.A0Y(r7)
            return
        L_0x0089:
            r1.setBackground(r3)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64192LSz.A01(com.instagram.common.session.UserSession, X.2sY, X.2sZ, X.Luw, X.3Q2):void");
    }

    public static final void A02(C65533Luw luw) {
        ImageView imageView;
        ProgressBar progressBar;
        int i;
        AnonymousClass55U r0;
        AnonymousClass3Q2 r7 = luw.A02;
        if (r7 != null) {
            luw.A03.setOnClickListener((View.OnClickListener) null);
            TextView textView = luw.A0C;
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView.setPadding(0, 0, 0, 0);
            textView.setTypeface((Typeface) null, 1);
            luw.A05.setVisibility(0);
            if (r7.A0n() || r7.A1f == AnonymousClass3QD.CONFIGURED) {
                luw.A0A.setVisibility(8);
                luw.A04.setVisibility(8);
                imageView = luw.A07;
                imageView.setVisibility(8);
                luw.A08.setVisibility(8);
                View view = luw.A0E;
                view.setVisibility(8);
                int ordinal = r7.A1f.ordinal();
                if (ordinal != 8) {
                    if (ordinal != 7) {
                        if (ordinal != 6) {
                            1iA r1 = r7.A1G;
                            1iA r02 = 1iA.A0Q;
                            ProgressBar progressBar2 = luw.A0B;
                            if (r1 == r02) {
                                progressBar2.setIndeterminate(true);
                                progressBar2.setBackgroundResource(R.drawable.upload_indeterminate_background);
                            } else {
                                progressBar2.setIndeterminate(false);
                                progressBar2.setBackground((Drawable) null);
                                progressBar2.setProgress(r7.A03());
                            }
                            luw.A06.setVisibility(8);
                            progressBar = progressBar2;
                        } else if (r7.A0E() == ShareType.POST_LIVE_IGTV) {
                            imageView.setVisibility(0);
                            ProgressBar progressBar3 = luw.A0B;
                            progressBar3.setIndeterminate(true);
                            progressBar3.setBackgroundResource(R.drawable.upload_indeterminate_background);
                            return;
                        } else {
                            A03(luw);
                            luw.A06.setVisibility(0);
                        }
                    }
                    A03(luw);
                    progressBar = luw.A06;
                } else {
                    C61066Jw4 jw4 = r7.A0m;
                    if (jw4 == null || !jw4.A01) {
                        if (luw.A00 != null && (r7.A0w() || r7.A0v())) {
                            UserSession userSession = luw.A00;
                            if (userSession == null) {
                                throw AnonymousClass7TE.A0y();
                            } else if (DbY.A1Y(0Tu.A05, userSession, 36326438252590854L)) {
                                UserSession userSession2 = luw.A00;
                                if (userSession2 != null) {
                                    Resources resources = AnonymousClass7TE.A0S(textView).getResources();
                                    0BQ A002 = AnonymousClass0BO.A00(userSession2);
                                    textView.setPadding(luw.A0D.getPaddingLeft(), 0, 0, 0);
                                    textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                    textView.setTypeface((Typeface) null, 0);
                                    if (A002.CKD()) {
                                        AnonymousClass3Q2 r03 = luw.A02;
                                        if (r03 == null) {
                                            throw AnonymousClass7TE.A0y();
                                        } else if (r03.A4T.isEmpty()) {
                                            DbY.A0y(resources, textView, AnonymousClass7TF.A0Q(userSession2).getUsername(), 2131969301);
                                            luw.A0B.setVisibility(8);
                                        }
                                    }
                                    textView.setText(2131969302);
                                    luw.A0B.setVisibility(8);
                                }
                                luw.A06.setVisibility(0);
                                progressBar = view;
                            }
                        }
                        A03(luw);
                        progressBar = luw.A06;
                    } else {
                        Boolean bool = r7.A1v;
                        textView.setPadding(luw.A0D.getPaddingLeft(), 0, 0, 0);
                        textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setTypeface((Typeface) null, 0);
                        int i2 = 2131975519;
                        if (AnonymousClass7TF.A1Y(bool, false)) {
                            i2 = 2131975518;
                        }
                        textView.setText(i2);
                        luw.A0B.setVisibility(8);
                        progressBar = luw.A06;
                    }
                }
                progressBar.setVisibility(0);
                return;
            }
            1ud r4 = 1ua.A0G;
            Context A0S = AnonymousClass7TE.A0S(textView);
            UserSession userSession3 = luw.A00;
            if (userSession3 != null) {
                r4.A01(A0S, userSession3);
                AnonymousClass3Q2 r42 = luw.A02;
                if (r42 != null) {
                    luw.A0B.setVisibility(8);
                    luw.A06.setVisibility(0);
                    if (r42.A3D != null && (r0 = r42.A6I) != null && r0.A00 == 403) {
                        luw.A01();
                        return;
                    } else if (r42.A0z()) {
                        boolean A13 = r42.A13();
                        ImageView imageView2 = luw.A0A;
                        if (A13) {
                            imageView2.setVisibility(8);
                            luw.A04.setVisibility(8);
                            i = 2131969288;
                        } else {
                            imageView2.setVisibility(0);
                            luw.A04.setVisibility(0);
                            i = 2131969295;
                        }
                        textView.setText(i);
                        luw.A08.setVisibility(0);
                        imageView = luw.A07;
                    } else {
                        luw.A0A.setVisibility(8);
                        luw.A04.setVisibility(8);
                        luw.A08.setVisibility(8);
                        luw.A07.setVisibility(0);
                        int i3 = 2131969296;
                        if (r42.A12()) {
                            i3 = 2131969305;
                        }
                        textView.setText(i3);
                        return;
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
            imageView.setVisibility(8);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A03(C65533Luw luw) {
        Drawable drawable;
        int i;
        Object[] A1Z;
        TextView textView = luw.A0C;
        Context A0S = AnonymousClass7TE.A0S(textView);
        Resources resources = A0S.getResources();
        textView.setPadding(luw.A0D.getPaddingLeft(), 0, 0, 0);
        AnonymousClass3Q2 r0 = luw.A02;
        if (r0 != null) {
            if (AnonymousClass7TE.A1b(r0.A4T)) {
                UserSession userSession = luw.A00;
                if (userSession != null) {
                    C64833Liv A002 = C63270KuF.A00(userSession);
                    String A0n = DbU.A0n(A002.A03, AnonymousClass0t1.A01);
                    05G r6 = A002.A02;
                    int A0I = JTR.A0I(r6);
                    Object value = r6.getValue();
                    if (A0I == 1) {
                        String A003 = C64833Liv.A00(A002, (String) 00k.A0E((Iterable) value, 0));
                        if (A003 != null) {
                            i = 2131963572;
                            A1Z = new Object[]{A0n, A003};
                        }
                        i = 2131963571;
                        A1Z = C51968G9o.A1Z(A0n, JTR.A0I(r6));
                    } else {
                        if (((Set) value).size() == 2) {
                            String A004 = C64833Liv.A00(A002, (String) 00k.A0E(JTO.A0x(r6), 0));
                            String A005 = C64833Liv.A00(A002, (String) 00k.A0E(JTO.A0x(r6), 1));
                            if (!(A004 == null || A005 == null)) {
                                i = 2131963573;
                                A1Z = new Object[]{A0n, A004, A005};
                            }
                        }
                        i = 2131963571;
                        A1Z = C51968G9o.A1Z(A0n, JTR.A0I(r6));
                    }
                    String string = A0S.getString(i, A1Z);
                    0qQ.A07(string);
                    textView.setText(string);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                Drawable drawable2 = A0S.getDrawable(R.drawable.instagram_check_pano_outline_24);
                if (drawable2 != null) {
                    drawable = drawable2.mutate();
                    if (drawable != null) {
                        DbX.A11(A0S, drawable, R.color.grey_5);
                    }
                } else {
                    drawable = null;
                }
                int i2 = -AnonymousClass7TE.A06(3.0f, resources.getDisplayMetrics().density);
                int i3 = -AnonymousClass7TE.A06(4.0f, resources.getDisplayMetrics().density);
                if (drawable != null) {
                    drawable.setBounds(i2, i3, drawable.getIntrinsicWidth() + i2, drawable.getIntrinsicHeight() + i3);
                }
                textView.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setText(2131969293);
            }
            luw.A0B.setVisibility(8);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final View A00(Context context, UserSession userSession) {
        AnonymousClass7TG.A1N(context, userSession);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_pending_media, (ViewGroup) null);
        0qQ.A0A(inflate);
        C65533Luw luw = new C65533Luw(inflate);
        2eK.A00(luw.A0A, 2Yu.A0F(context, R.attr.glyphColorSecondary), 2Yu.A0F(context, R.attr.glyphColorSecondaryActive), 77);
        2eK.A00(luw.A08, 2Yu.A0F(context, R.attr.glyphColorSecondary), 2Yu.A0F(context, R.attr.glyphColorSecondaryActive), 77);
        2eK.A00(luw.A07, 2Yu.A0F(context, R.attr.glyphColorSecondary), 2Yu.A0F(context, R.attr.glyphColorSecondaryActive), 77);
        ProgressBar progressBar = luw.A0B;
        Drawable progressDrawable = progressBar.getProgressDrawable();
        if (progressDrawable != null) {
            String A002 = C273654mx.A00(16);
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            Context context2 = progressBar.getContext();
            Drawable drawable = context2.getDrawable(R.drawable.upload_track);
            if (drawable != null) {
                U1J u1j = new U1J((Resources) null, (U0V) null);
                u1j.A00.A01 = drawable;
                drawable.setCallback(u1j);
                layerDrawable.setDrawableByLayerId(16908301, u1j);
                int dimensionPixelSize = progressBar.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
                Drawable drawable2 = context2.getDrawable(R.drawable.progress_horizontal_upload);
                0qQ.A0C(drawable2, A002);
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable2;
                layerDrawable2.setDrawableByLayerId(16908301, new KHz(drawable, dimensionPixelSize));
                progressBar.setIndeterminateDrawable(layerDrawable2);
                inflate.addOnAttachStateChangeListener(new I9u(luw, 5));
                inflate.setTag(luw);
                return inflate;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
