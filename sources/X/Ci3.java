package X;

import com.instagram.api.schemas.ColorAtTextRangeDictIntf;
import com.instagram.api.schemas.InlineStyleAtRangeDictIntf;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.RangeIntf;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class Ci3 {
    public static Map A00(TextWithEntitiesIntf textWithEntitiesIntf) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList3 = null;
        if (textWithEntitiesIntf.Ap2() != null) {
            List<ColorAtTextRangeDictIntf> Ap2 = textWithEntitiesIntf.Ap2();
            if (Ap2 != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (ColorAtTextRangeDictIntf colorAtTextRangeDictIntf : Ap2) {
                    if (colorAtTextRangeDictIntf != null) {
                        arrayList2.add(colorAtTextRangeDictIntf.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("color_ranges", arrayList2);
        }
        if (textWithEntitiesIntf.BHJ() != null) {
            List<InlineStyleAtRangeDictIntf> BHJ = textWithEntitiesIntf.BHJ();
            if (BHJ != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (InlineStyleAtRangeDictIntf inlineStyleAtRangeDictIntf : BHJ) {
                    if (inlineStyleAtRangeDictIntf != null) {
                        arrayList.add(inlineStyleAtRangeDictIntf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("inline_style_ranges", arrayList);
        }
        if (textWithEntitiesIntf.BMj() != null) {
            LinkAction BMj = textWithEntitiesIntf.BMj();
            if (BMj != null) {
                str = BMj.A00;
            } else {
                str = null;
            }
            A1H.put("link_action", str);
        }
        if (textWithEntitiesIntf.BjD() != null) {
            List<RangeIntf> BjD = textWithEntitiesIntf.BjD();
            if (BjD != null) {
                arrayList3 = AnonymousClass7TE.A1C();
                for (RangeIntf rangeIntf : BjD) {
                    if (rangeIntf != null) {
                        arrayList3.add(rangeIntf.FHC());
                    }
                }
            }
            A1H.put("ranges", arrayList3);
        }
        if (textWithEntitiesIntf.getText() != null) {
            C41845B3m.A10(textWithEntitiesIntf.getText(), A1H);
        }
        if (textWithEntitiesIntf.C7Y() != null) {
            A1H.put("timestamp", textWithEntitiesIntf.C7Y());
        }
        return 0Yt.A0B(A1H);
    }
}
