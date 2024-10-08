package com.facebook.react.internal.featureflags;

public interface ReactNativeFeatureFlagsProvider {
    boolean allowRecursiveCommitsWithSynchronousMountOnAndroid();

    boolean batchRenderingUpdatesInEventLoop();

    boolean commonTestFlag();

    boolean completeReactInstanceCreationOnBgThreadOnAndroid();

    boolean enableAlignItemsBaselineOnFabricIOS();

    boolean enableAndroidLineHeightCentering();

    boolean enableBridgelessArchitecture();

    boolean enableCleanTextInputYogaNode();

    boolean enableDeletionOfUnmountedViews();

    boolean enableEagerRootViewAttachment();

    boolean enableEventEmitterRetentionDuringGesturesOnAndroid();

    boolean enableFabricLogs();

    boolean enableFabricRenderer();

    boolean enableFabricRendererExclusively();

    boolean enableGranularShadowTreeStateReconciliation();

    boolean enableIOSViewClipToPaddingBox();

    boolean enableLayoutAnimationsOnIOS();

    boolean enableLongTaskAPI();

    boolean enableMicrotasks();

    boolean enablePreciseSchedulingForPremountItemsOnAndroid();

    boolean enablePropsUpdateReconciliationAndroid();

    boolean enableReportEventPaintTime();

    boolean enableSynchronousStateUpdates();

    boolean enableTextPreallocationOptimisation();

    boolean enableUIConsistency();

    boolean enableViewRecycling();

    boolean excludeYogaFromRawProps();

    boolean fetchImagesInViewPreallocation();

    boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    boolean forceBatchingMountItemsOnAndroid();

    boolean fuseboxEnabledDebug();

    boolean fuseboxEnabledRelease();

    boolean initEagerTurboModulesOnNativeModulesQueueAndroid();

    boolean lazyAnimationCallbacks();

    boolean loadVectorDrawablesOnImages();

    boolean removeNestedCallsToDispatchMountItemsOnAndroid();

    boolean setAndroidLayoutDirection();

    boolean traceTurboModulePromiseRejectionsOnAndroid();

    boolean useFabricInterop();

    boolean useImmediateExecutorInAndroidBridgeless();

    boolean useModernRuntimeScheduler();

    boolean useNativeViewConfigsInBridgelessMode();

    boolean useOptimisedViewPreallocationOnAndroid();

    boolean useOptimizedEventBatchingOnAndroid();

    boolean useRuntimeShadowNodeReferenceUpdate();

    boolean useRuntimeShadowNodeReferenceUpdateOnLayout();

    boolean useTurboModuleInterop();

    boolean useTurboModules();
}
