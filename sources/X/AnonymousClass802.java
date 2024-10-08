package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.802  reason: invalid class name */
public final class AnonymousClass802 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Editable A04;
    public Layout.Alignment A05;
    public AnonymousClass87I A06;
    public C358868bb A07;
    public C369458un A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public static AnonymousClass802 A00(Fragment fragment, C353818Jf r6, int[] iArr) {
        r6.A02(iArr);
        TextColorScheme textColorScheme = new TextColorScheme(r6);
        ArrayList A012 = A01(fragment.requireContext());
        A012.add(0, textColorScheme);
        AnonymousClass802 A013 = new C39889ADn(fragment.requireContext()).A01();
        A013.A0E = true;
        A013.A0A = A012;
        return A013;
    }

    public static ArrayList A01(Context context) {
        C353818Jf r4 = new C353818Jf();
        r4.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r4.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_yellow)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink)));
        r4.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue));
        TextColorScheme textColorScheme = new TextColorScheme(r4);
        C353818Jf r42 = new C353818Jf();
        r42.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r42.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_purple)));
        r42.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_yellow));
        TextColorScheme textColorScheme2 = new TextColorScheme(r42);
        C353818Jf r43 = new C353818Jf();
        r43.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r43.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_purple)));
        r43.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_yellow));
        TextColorScheme textColorScheme3 = new TextColorScheme(r43);
        C353818Jf r44 = new C353818Jf();
        r44.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r44.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_green)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue)));
        r44.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink));
        TextColorScheme textColorScheme4 = new TextColorScheme(r44);
        C353818Jf r2 = new C353818Jf();
        r2.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r2.A02(AnonymousClass5BH.A01);
        r2.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink));
        TextColorScheme textColorScheme5 = new TextColorScheme(r2);
        C353818Jf r22 = new C353818Jf();
        r22.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_09));
        r22.A04 = new TextColors(TextShadow.A03, context.getColor(R.color.grey_9_50_transparent));
        r22.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_03)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_03)));
        r22.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_red));
        TextColorScheme textColorScheme6 = new TextColorScheme(r22);
        C353818Jf r23 = new C353818Jf();
        r23.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r23.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_09)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_09)));
        r23.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_red));
        return C256393vh.A01(textColorScheme, textColorScheme2, textColorScheme3, textColorScheme4, textColorScheme5, textColorScheme6, new TextColorScheme(r23));
    }

    public static ArrayList A02(Context context) {
        C353818Jf r4 = new C353818Jf();
        r4.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r4.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_yellow)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink)));
        r4.A05 = AnonymousClass05K.A00;
        r4.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue));
        TextColorScheme textColorScheme = new TextColorScheme(r4);
        C353818Jf r42 = new C353818Jf();
        r42.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r42.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_purple)));
        r42.A05 = AnonymousClass05K.A01;
        r42.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_yellow));
        TextColorScheme textColorScheme2 = new TextColorScheme(r42);
        C353818Jf r43 = new C353818Jf();
        r43.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r43.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_purple)));
        r43.A05 = AnonymousClass05K.A0C;
        r43.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_yellow));
        TextColorScheme textColorScheme3 = new TextColorScheme(r43);
        C353818Jf r44 = new C353818Jf();
        r44.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r44.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_green)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue)));
        r44.A05 = AnonymousClass05K.A0N;
        r44.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink));
        TextColorScheme textColorScheme4 = new TextColorScheme(r44);
        C353818Jf r2 = new C353818Jf();
        r2.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r2.A02(AnonymousClass5BH.A01);
        r2.A05 = AnonymousClass05K.A0Y;
        r2.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink));
        TextColorScheme textColorScheme5 = new TextColorScheme(r2);
        C353818Jf r22 = new C353818Jf();
        r22.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_09));
        r22.A04 = new TextColors(TextShadow.A03, context.getColor(R.color.grey_9_50_transparent));
        r22.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_03)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_03)));
        r22.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_red));
        TextColorScheme textColorScheme6 = new TextColorScheme(r22);
        C353818Jf r23 = new C353818Jf();
        r23.A02 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        r23.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_09)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_09)));
        r23.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_red));
        return C256393vh.A01(textColorScheme, textColorScheme2, textColorScheme3, textColorScheme4, textColorScheme5, textColorScheme6, new TextColorScheme(r23));
    }

    public static ArrayList A03(Context context) {
        C353818Jf r2 = new C353818Jf();
        r2.A02(context.getColor(R.color.grey_0), context.getColor(R.color.grey_0));
        TextColorScheme textColorScheme = new TextColorScheme(r2);
        C353818Jf r3 = new C353818Jf();
        r3.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_09)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_09)));
        TextColorScheme textColorScheme2 = new TextColorScheme(r3);
        C353818Jf r32 = new C353818Jf();
        r32.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_yellow)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink)));
        TextColorScheme textColorScheme3 = new TextColorScheme(r32);
        C353818Jf r22 = new C353818Jf();
        r22.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_pink)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_purple)));
        TextColorScheme textColorScheme4 = new TextColorScheme(r22);
        C353818Jf r23 = new C353818Jf();
        r23.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_purple)));
        TextColorScheme textColorScheme5 = new TextColorScheme(r23);
        C353818Jf r24 = new C353818Jf();
        r24.A02(context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_green)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_blue)));
        TextColorScheme textColorScheme6 = new TextColorScheme(r24);
        C353818Jf r1 = new C353818Jf();
        r1.A02(AnonymousClass5BH.A01);
        return C256393vh.A01(textColorScheme, textColorScheme2, textColorScheme3, textColorScheme4, textColorScheme5, textColorScheme6, new TextColorScheme(r1));
    }

    public static ArrayList A04(Context context, String str) {
        C353818Jf r2 = new C353818Jf();
        r2.A06 = str;
        r2.A02(2Yu.A0H(context, R.attr.igds_color_default_render), 2Yu.A0H(context, R.attr.igds_color_default_render));
        return C256393vh.A01(new TextColorScheme(r2));
    }

    public final AnonymousClass802 A05() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
            C39807AAe.A00(A0A2, this);
            A0A2.close();
            AnonymousClass802 parseFromJson = C39807AAe.parseFromJson(16P.A00(stringWriter.toString()));
            parseFromJson.A04 = this.A04;
            parseFromJson.A07 = this.A07;
            return parseFromJson;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
