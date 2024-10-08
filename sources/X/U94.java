package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.ui.MusicPreviewButton;
import java.util.ArrayList;
import java.util.List;

public final class U94 extends PagingDataAdapter {
    public final Context A00;
    public final C320506sU A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C234502xy A04;
    public final X7t A05;
    public final Integer A06;
    public final List A07 = new ArrayList();
    public final 0sP A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U94(android.content.Context r3, X.C320506sU r4, X.AnonymousClass0iw r5, com.instagram.common.session.UserSession r6, X.C234502xy r7, X.X7t r8, java.lang.Integer r9, X.0sP r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            r2 = this;
            r0 = 1
            X.DbW.A1N(r6, r0, r4)
            X.U9S r1 = X.U9S.A00
            X.4CZ r0 = X.AnonymousClass12W.A01
            X.134 r0 = X.AnonymousClass12y.A00
            r2.<init>(r1, r0)
            r2.A03 = r6
            r2.A02 = r5
            r2.A05 = r8
            r2.A04 = r7
            r2.A01 = r4
            r2.A0B = r11
            r2.A0A = r12
            r2.A0C = r13
            r2.A06 = r9
            r2.A00 = r3
            r2.A09 = r14
            r2.A08 = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U94.<init>(android.content.Context, X.6sU, X.0iw, com.instagram.common.session.UserSession, X.2xy, X.X7t, java.lang.Integer, X.0sP, boolean, boolean, boolean, boolean):void");
    }

    public final void A07(String str, boolean z) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        int i = 0;
        for (Object next : A01().A00) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            V2X v2x = (V2X) next;
            if (v2x instanceof C16181Uq6) {
                C16181Uq6 uq6 = (C16181Uq6) v2x;
                if (0qQ.A0K(uq6.A07, str2)) {
                    AudioPageMetadata audioPageMetadata = uq6.A00;
                    String str3 = audioPageMetadata.A00;
                    String str4 = audioPageMetadata.A07;
                    String str5 = audioPageMetadata.A08;
                    boolean z2 = audioPageMetadata.A0O;
                    String str6 = audioPageMetadata.A09;
                    String str7 = audioPageMetadata.A0B;
                    ImageUrl imageUrl = audioPageMetadata.A02;
                    ImageUrl imageUrl2 = audioPageMetadata.A03;
                    String str8 = audioPageMetadata.A0D;
                    String str9 = audioPageMetadata.A0M;
                    String str10 = audioPageMetadata.A0J;
                    String str11 = audioPageMetadata.A0K;
                    String str12 = audioPageMetadata.A0C;
                    String str13 = audioPageMetadata.A0N;
                    AudioType audioType = audioPageMetadata.A05;
                    boolean z3 = audioPageMetadata.A0Q;
                    MusicDataSource musicDataSource = audioPageMetadata.A06;
                    boolean z4 = audioPageMetadata.A0T;
                    boolean z5 = audioPageMetadata.A0R;
                    MusicAttributionConfig musicAttributionConfig = audioPageMetadata.A04;
                    String str14 = audioPageMetadata.A0I;
                    String str15 = audioPageMetadata.A0E;
                    String str16 = audioPageMetadata.A0F;
                    String str17 = audioPageMetadata.A0A;
                    String str18 = audioPageMetadata.A0H;
                    String str19 = audioPageMetadata.A0G;
                    boolean z6 = audioPageMetadata.A0S;
                    boolean z7 = z3;
                    AudioFilterType audioFilterType = audioPageMetadata.A01;
                    ImageUrl imageUrl3 = imageUrl;
                    ImageUrl imageUrl4 = imageUrl2;
                    MusicAttributionConfig musicAttributionConfig2 = musicAttributionConfig;
                    MusicDataSource musicDataSource2 = musicDataSource;
                    String str20 = str3;
                    String str21 = str4;
                    String str22 = str5;
                    String str23 = str6;
                    uq6.A00 = new AudioPageMetadata(audioFilterType, imageUrl3, imageUrl4, musicAttributionConfig2, audioType, musicDataSource2, str20, str21, str22, str23, str7, str8, str9, str10, str11, str12, str13, audioPageMetadata.A0L, str14, str15, str16, str17, str18, str19, z2, z7, z, z4, z5, z6);
                    notifyItemChanged(i);
                }
            }
            i = i2;
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            View inflate = DbV.A0D(viewGroup).inflate(R.layout.saved_audio_list_item, viewGroup, false);
            if (this.A09) {
                DbT.A16(this.A00, inflate, R.color.clips_creation_transparent_color);
            }
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            0qQ.A0A(inflate);
            return new UER(inflate, this.A06);
        } else if (i == 1) {
            return new UC3(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.audio_list_header, false));
        } else {
            if (i == 2) {
                return new UC2(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.audio_header_cell_container, false));
            }
            throw DbW.A0a("Unsupported audio list type ", i);
        }
    }

    public static final void A00(MusicDataSource musicDataSource, UER uer, U94 u94) {
        AnonymousClass8ZI r1;
        AnonymousClass8ZH r0;
        Integer C9D = u94.A04.C9D(musicDataSource);
        int intValue = C9D.intValue();
        boolean z = true;
        MusicPreviewButton musicPreviewButton = uer.A0C;
        if (intValue != 0) {
            r1 = musicPreviewButton.A00;
            if (intValue != 1) {
                r1.A01(AnonymousClass8ZH.STOP);
                r1.A00(0.0f);
            } else {
                r0 = AnonymousClass8ZH.LOADING;
                r1.A01(r0);
            }
        } else {
            r1 = musicPreviewButton.A00;
            r0 = AnonymousClass8ZH.PLAY;
            r1.A01(r0);
        }
        TextView textView = uer.A03;
        if (C9D != AnonymousClass05K.A0C) {
            z = false;
        }
        textView.setSelected(z);
    }

    public final void onBindViewHolder(C249703kE r21, int i) {
        Drawable drawable;
        String format;
        C252063oV r10;
        int intValue;
        int i2;
        int i3;
        long j;
        String str;
        C249703kE r6 = r21;
        0qQ.A0B(r6, 0);
        int i4 = i;
        V2X v2x = (V2X) A02(i4);
        if (v2x == null) {
            return;
        }
        if (v2x instanceof C16179Uq4) {
            ((UC3) r6).A00.setText(((C16179Uq4) v2x).A00);
        } else if (v2x instanceof C16180Uq5) {
            IgLinearLayout igLinearLayout = ((UC2) r6).A00;
            View childAt = igLinearLayout.getChildAt(0);
            if (childAt == null || !(childAt instanceof U56)) {
                Context context = this.A00;
                U56 u56 = new U56(context);
                C16180Uq5 uq5 = (C16180Uq5) v2x;
                u56.A01(uq5.A02);
                u56.A03(uq5.A01, uq5.A00);
                float dimension = context.getResources().getDimension(R.dimen.abc_text_size_menu_header_material);
                float dimension2 = context.getResources().getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
                IgTextView igTextView = u56.A03;
                if (igTextView == null) {
                    str = "headerText";
                } else {
                    Context A0S = AnonymousClass7TE.A0S(u56);
                    igTextView.setTextSize(0nA.A02(A0S, dimension));
                    IgTextView igTextView2 = u56.A02;
                    if (igTextView2 == null) {
                        str = "actionText";
                    } else {
                        igTextView2.setTextSize(0nA.A02(A0S, dimension2));
                        igLinearLayout.addView(u56);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            U56 u562 = (U56) childAt;
            C16180Uq5 uq52 = (C16180Uq5) v2x;
            u562.A01(uq52.A02);
            u562.A03(uq52.A01, uq52.A00);
        } else if (v2x instanceof C16181Uq6) {
            UER uer = (UER) r6;
            C16181Uq6 uq6 = (C16181Uq6) v2x;
            Integer valueOf = Integer.valueOf(i4);
            boolean A1U = AnonymousClass7TF.A1U(0, uer, uq6);
            List list = this.A07;
            String str2 = uq6.A07;
            if (!list.contains(str2)) {
                UserSession userSession = this.A03;
                AnonymousClass0iw r11 = this.A02;
                Long A0n = C51971G9r.A0n(0, str2);
                if (valueOf != null) {
                    j = (long) valueOf.intValue();
                } else {
                    j = -1;
                }
                Long valueOf2 = Long.valueOf(j);
                String str3 = uq6.A08;
                0qQ.A0B(userSession, 0);
                0qQ.A0B(r11, A1U);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r11, userSession), "instagram_organic_audio_track_impression");
                if (A0e.isSampled()) {
                    A0e.AAJ("containermodule", r11.getModuleName());
                    A0e.A9F(Pxd.A00(81), Long.valueOf(DbY.A04(A0n)));
                    DbY.A1C(A0e);
                    A0e.A9F("media_index", valueOf2);
                    A0e.AAJ("section_type", str3);
                    A0e.AAJ(C66579MXk.A00(406), str3);
                    A0e.Cgf();
                }
                list.add(str2);
            }
            IgImageView igImageView = uer.A07;
            Context context2 = this.A00;
            igImageView.setImageDrawable(new GIH(context2, (GJO) null, Dbb.A01(context2), DbY.A01(context2), C13989Tnp.A0A(context2), AnonymousClass7TF.A03(context2, R.attr.igds_color_photo_border), AnonymousClass7TG.A04(context2), -1, false));
            MusicAttributionConfig musicAttributionConfig = uq6.A00.A04;
            MusicAssetModel musicAssetModel = null;
            if (musicAttributionConfig == null || musicAttributionConfig.A02 == null) {
                JYP.A00(igImageView, uq6.A01);
            } else {
                Drawable drawable2 = igImageView.getDrawable();
                0qQ.A0C(drawable2, AnonymousClass000.A00(334));
                GIH gih = (GIH) drawable2;
                MusicAttributionConfig musicAttributionConfig2 = uq6.A00.A04;
                if (musicAttributionConfig2 != null) {
                    musicAssetModel = musicAttributionConfig2.A02;
                }
                JYP.A01(this.A03, musicAssetModel, gih);
            }
            GVM.A00((Drawable) null, uer.A0D, uq6.A09, uq6.A0E, false);
            boolean z = this.A09;
            if (z) {
                DbT.A17(context2, uer.A03, R.color.barcelona_story_share_light_mode);
            }
            TextView textView = uer.A04;
            textView.setText(uq6.A0A);
            String str4 = uq6.A0B;
            TextView textView2 = uer.A05;
            if (str4 != null) {
                textView2.setText(str4);
                DbX.A0H(textView).setMargins(0, 0, 0, 0);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            boolean z2 = uq6.A0D;
            if (z2) {
                View findViewById = uer.itemView.findViewById(R.id.container);
                0qQ.A0A(findViewById);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = AnonymousClass7TG.A02(context2);
                    TextView textView3 = uer.A02;
                    DbT.A18(context2, textView3, 2131975536);
                    textView3.setVisibility(0);
                    uer.A00.setVisibility(0);
                    findViewById.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException(C273654mx.A00(9));
                }
            } else {
                uer.A02.setVisibility(8);
                uer.A00.setVisibility(8);
            }
            if (!this.A0B || z2) {
                uer.A06.setVisibility(8);
                uer.A0B.setVisibility(8);
                uer.A09.setVisibility(8);
                View view = uer.A01;
                view.setPaddingRelative(AnonymousClass7TE.A0F(view.getResources()), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
            } else {
                TextView textView4 = uer.A06;
                textView4.setVisibility(0);
                if (z) {
                    DbT.A17(context2, textView4, R.color.barcelona_story_share_light_mode);
                }
                Integer num = uq6.A04;
                if (num == null) {
                    format = "";
                } else {
                    format = String.format("%d", C66581MXm.A1b(num, A1U ? 1 : 0));
                    0qQ.A07(format);
                }
                textView4.setText(format);
                View view2 = uer.A01;
                view2.setPaddingRelative(0, view2.getPaddingTop(), view2.getPaddingEnd(), view2.getPaddingBottom());
                Integer num2 = uq6.A05;
                Integer num3 = uq6.A03;
                if (num2 == null || !this.A0C) {
                    uer.A0B.setVisibility(8);
                    uer.A09.setVisibility(8);
                } else {
                    if (num3 == null || (intValue = num3.intValue()) == 0) {
                        uer.A0B.setVisibility(8);
                        r10 = uer.A09;
                    } else {
                        if (intValue - num2.intValue() > 0) {
                            i2 = R.drawable.instagram_chevron_up_pano_filled_12;
                            i3 = R.attr.igds_color_creation_tools_green;
                        } else {
                            boolean equals = num3.equals(num2);
                            i2 = R.drawable.instagram_chevron_down_pano_filled_12;
                            i3 = R.attr.igds_color_creation_tools_red;
                            if (equals) {
                                i2 = R.drawable.instagram_chevron_right_pano_filled_12;
                                i3 = R.attr.igds_color_secondary_icon;
                            }
                        }
                        uer.A09.setVisibility(8);
                        r10 = uer.A0B;
                        ((ImageView) r10.getView()).setImageResource(i2);
                        DbU.A14(context2, (ImageView) r10.getView(), 2Yu.A0H(context2, i3));
                    }
                    r10.setVisibility(0);
                }
            }
            Integer num4 = this.A06;
            if (num4 == AnonymousClass05K.A01 || num4 == AnonymousClass05K.A0C) {
                WBD.A00(uer.A08.getView(), 33, this, uq6);
            } else {
                C252063oV r1 = uer.A08;
                if (r1.CVM()) {
                    r1.setVisibility(8);
                }
            }
            if (num4 == AnonymousClass05K.A0N || num4 == AnonymousClass05K.A0Y) {
                C252063oV r9 = uer.A0A;
                WB4.A00(r9.getView(), uer, uq6, this, 46);
                r9.getView().setSelected(uq6.A00.A0P);
                if (z) {
                    DbU.A14(r9.getView().getContext(), (ImageView) r9.getView(), R.color.barcelona_story_share_light_mode);
                }
            } else {
                C252063oV r12 = uer.A0A;
                if (r12.CVM()) {
                    r12.setVisibility(8);
                }
            }
            if (!uq6.A0G || this.A0A) {
                drawable = null;
            } else {
                drawable = JTO.A0D(uer.A0E);
            }
            textView.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            WB4.A00(uer.itemView, uq6, valueOf, this, 47);
            MusicDataSource musicDataSource = uq6.A02;
            A00(musicDataSource, uer, this);
            0t0 A012 = AnonymousClass0eN.A01(new C20704Wxb(11, this, uq6, uer));
            C234502xy r2 = this.A04;
            if (r2.C9D(musicDataSource) != AnonymousClass05K.A00) {
                r2.ETw(musicDataSource, (C315536k3) A012.getValue(), (String) null, 0, -1, -1, false, false);
            }
            WB4.A00(uer.A0C, uq6, A012, this, 48);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported audio list item ");
            throw new IllegalArgumentException(AnonymousClass7TF.A0i(C51969G9p.A0x(v2x), sb));
        }
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(1545842545);
        Object A022 = A02(i);
        if (A022 instanceof C16179Uq4) {
            i2 = 1;
        } else {
            boolean z = A022 instanceof C16180Uq5;
            i2 = 0;
            if (z) {
                i2 = 2;
            }
        }
        AnonymousClass0fD.A0A(-1804164750, A032);
        return i2;
    }
}
