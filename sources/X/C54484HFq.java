package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HFq  reason: case insensitive filesystem */
public final class C54484HFq extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ReelsMidcardInjectToolFragment";
    public final ArrayList A00 = AnonymousClass7TE.A1C();
    public final List A01 = 0sr.A1P(new ClipsMidCardType[]{ClipsMidCardType.DRAFT, ClipsMidCardType.META_GALLERY, ClipsMidCardType.REELS_INSIGHTS, ClipsMidCardType.STORY_TO_REEL});
    public final List A02 = 0sr.A1P(new ClipsMidCardType[]{ClipsMidCardType.CAMERA_ROLL, ClipsMidCardType.POPULAR_REELS, ClipsMidCardType.PRODUCER_FEEDBACK, ClipsMidCardType.RECENTLY_SAVED_AUDIO, ClipsMidCardType.TEMPLATE});
    public final AnonymousClass0eM A03 = C58673Ivi.A00(this, 23);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final ClipsMidCardSubtype[] A05 = ClipsMidCardSubtype.values();
    public final ClipsMidCardType[] A06 = ClipsMidCardType.values();
    public final String A07 = "reels_midcard_inject_tool";

    public final String getModuleName() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(DbU.A0m(this, 2131958198));
    }

    public final void onCreate(Bundle bundle) {
        ClipsMidCardType clipsMidCardType;
        StringBuilder A1A;
        String str;
        int A022 = AnonymousClass0fD.A02(2026298355);
        super.onCreate(bundle);
        for (ClipsMidCardType clipsMidCardType2 : this.A06) {
            ArrayList arrayList = this.A00;
            Context requireContext = requireContext();
            String A0j = AnonymousClass7TF.A0j(clipsMidCardType2.name());
            if (this.A02.contains(clipsMidCardType2)) {
                A1A = AnonymousClass7TE.A1A();
                str = "** ";
            } else if (this.A01.contains(clipsMidCardType2)) {
                A1A = AnonymousClass7TE.A1A();
                str = "* ";
            } else {
                arrayList.add(new C50989Fmc(requireContext, (View.OnClickListener) new ID0(26, (Object) null, (Object) clipsMidCardType2, (Object) this), (CharSequence) A0j));
            }
            A1A.append(str);
            A0j = AnonymousClass7TF.A0l(A0j, A1A);
            arrayList.add(new C50989Fmc(requireContext, (View.OnClickListener) new ID0(26, (Object) null, (Object) clipsMidCardType2, (Object) this), (CharSequence) A0j));
        }
        ArrayList arrayList2 = this.A00;
        arrayList2.add(new C50989Fmc(requireContext(), (View.OnClickListener) null, (CharSequence) "------------"));
        for (ClipsMidCardSubtype clipsMidCardSubtype : this.A05) {
            switch (clipsMidCardSubtype.ordinal()) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 13:
                case 14:
                case 16:
                    clipsMidCardType = ClipsMidCardType.STORY;
                    break;
                case 17:
                case 19:
                case 20:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 38:
                case 39:
                case 40:
                case Seq.NULL_REFNUM:
                case Seq.RefTracker.REF_OFFSET:
                case 46:
                    clipsMidCardType = ClipsMidCardType.TEMPLATE;
                    break;
                case 21:
                case 22:
                    clipsMidCardType = ClipsMidCardType.CREATION_TOOL;
                    break;
                case 34:
                case 37:
                    clipsMidCardType = ClipsMidCardType.RECENTLY_SAVED_AUDIO;
                    break;
                case 35:
                case 36:
                    clipsMidCardType = ClipsMidCardType.REELS_INSIGHTS;
                    break;
            }
            Context requireContext2 = requireContext();
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append(clipsMidCardType);
            A1A2.append(" : ");
            arrayList2.add(new C50989Fmc(requireContext2, (View.OnClickListener) new ID0(26, (Object) clipsMidCardSubtype, (Object) clipsMidCardType, (Object) this), (CharSequence) AnonymousClass7TF.A0l(AnonymousClass7TF.A0j(clipsMidCardSubtype.name()), A1A2)));
        }
        setItems(arrayList2);
        AnonymousClass0fD.A09(-1818829433, A022);
    }
}
