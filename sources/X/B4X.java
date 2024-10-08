package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.feed.media.CameraToolInfoIntf;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4X {
    public static Map A00(CreativeConfigIntf creativeConfigIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList3 = null;
        if (creativeConfigIntf.AdD() != null) {
            AttributionUser AdD = creativeConfigIntf.AdD();
            if (AdD != null) {
                treeUpdaterJNI3 = AdD.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("attribution_user", treeUpdaterJNI3);
        }
        if (creativeConfigIntf.Ajq() != null) {
            A1H.put("camera_tools", creativeConfigIntf.Ajq());
        }
        if (creativeConfigIntf.getCaptureType() != null) {
            A1H.put("capture_type", creativeConfigIntf.getCaptureType());
        }
        if (creativeConfigIntf.AsN() != null) {
            List<CameraToolInfoIntf> AsN = creativeConfigIntf.AsN();
            if (AsN != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (CameraToolInfoIntf cameraToolInfoIntf : AsN) {
                    if (cameraToolInfoIntf != null) {
                        arrayList2.add(cameraToolInfoIntf.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("creation_tool_info", arrayList2);
        }
        if (creativeConfigIntf.Ayr() != null) {
            A1H.put("draft_metadata", creativeConfigIntf.Ayr());
        }
        if (creativeConfigIntf.Ays() != null) {
            A1H.put("draft_session_id", creativeConfigIntf.Ays());
        }
        if (creativeConfigIntf.B02() != null) {
            List<EffectPreviewIntf> B02 = creativeConfigIntf.B02();
            if (B02 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (EffectPreviewIntf effectPreviewIntf : B02) {
                    if (effectPreviewIntf != null) {
                        arrayList.add(effectPreviewIntf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("effect_configs", arrayList);
        }
        if (creativeConfigIntf.B0A() != null) {
            EffectPreviewIntf B0A = creativeConfigIntf.B0A();
            if (B0A != null) {
                treeUpdaterJNI2 = B0A.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("effect_preview", treeUpdaterJNI2);
        }
        if (creativeConfigIntf.B0B() != null) {
            ProductItemWithARIntf B0B = creativeConfigIntf.B0B();
            if (B0B != null) {
                treeUpdaterJNI = B0B.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(595), treeUpdaterJNI);
        }
        if (creativeConfigIntf.B30() != null) {
            A1H.put("expressive_format", creativeConfigIntf.B30());
        }
        if (creativeConfigIntf.B3W() != null) {
            A1H.put("face_effect_id", creativeConfigIntf.B3W());
        }
        if (creativeConfigIntf.getFailureReason() != null) {
            A1H.put(TraceFieldType.FailureReason, creativeConfigIntf.getFailureReason());
        }
        if (creativeConfigIntf.B7Y() != null) {
            A1H.put("format_variant", creativeConfigIntf.B7Y());
        }
        if (creativeConfigIntf.B92() != null) {
            List<GenAIToolInfoDictIntf> B92 = creativeConfigIntf.B92();
            if (B92 != null) {
                arrayList3 = AnonymousClass7TE.A1C();
                for (GenAIToolInfoDictIntf genAIToolInfoDictIntf : B92) {
                    if (genAIToolInfoDictIntf != null) {
                        arrayList3.add(genAIToolInfoDictIntf.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(1383), arrayList3);
        }
        if (creativeConfigIntf.Bbn() != null) {
            A1H.put("persisted_effect_metadata_json", creativeConfigIntf.Bbn());
        }
        return 0Yt.A0B(A1H);
    }
}
