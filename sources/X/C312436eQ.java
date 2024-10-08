package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.6eQ  reason: invalid class name and case insensitive filesystem */
public final class C312436eQ extends HashMap<C312446eR, List<String>> {
    public C312436eQ() {
        C312446eR r1 = C312446eR.HairSegmentationDataProvider;
        EnumEntries enumEntries = 1US.A02;
        put(r1, Arrays.asList(new String[]{C312656et.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforhairsegmentation"}));
        put(C312446eR.PersonSegmentationDataProvider, Arrays.asList(new String[]{C312656et.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforpersonsegmentation"}));
        put(C312446eR.RecognitionTrackingDataProvider, Arrays.asList(new String[]{"arservicesfortargettracking", C312656et.PYTORCH_VOLTRON_MODULE_NAME}));
        put(C312446eR.BodyTrackingDataProvider, Arrays.asList(new String[]{C312656et.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforbodytracking"}));
        put(C312446eR.GenericMLService, Arrays.asList(new String[]{C312656et.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforgenericml"}));
        put(C312446eR.FaceWaveDataProvider, Arrays.asList(new String[]{C312656et.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforfacewave"}));
        put(C312446eR.ExpressionFittingDataProvider, Arrays.asList(new String[]{C312656et.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforexpressionfitting"}));
        put(C312446eR.RuntimeRigMappingDataProvider, Arrays.asList(new String[]{"arservicesforruntimerigmapping"}));
        put(C312446eR.HandTrackingDataProvider, Arrays.asList(new String[]{C312656et.PYTORCH_VOLTRON_MODULE_NAME, "arservicesforhandtracking"}));
        put(C312446eR.MovingTargetTrackingDataProvider, Arrays.asList(new String[]{"arservicesfortargettracking"}));
        put(C312446eR.WOLFService, Arrays.asList(new String[]{"arservicesforwolf"}));
        put(C312446eR.UnifiedTargetTrackingDataProvider, Arrays.asList(new String[]{"arservicesforunifiedtargettracking", "slam"}));
        put(C312446eR.WorldTrackingDataProvider, Arrays.asList(new String[]{"slam"}));
        put(C312446eR.RecognitionService, Arrays.asList(new String[]{"arservicesforrecognition", "arservicesfortargettracking", C312656et.PYTORCH_VOLTRON_MODULE_NAME}));
    }
}
