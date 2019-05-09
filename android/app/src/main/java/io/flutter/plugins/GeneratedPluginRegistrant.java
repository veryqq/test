package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    AppsflyerSdkPlugin.registerWith(registry.registrarFor("com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"));
    FluttertoastPlugin.registerWith(registry.registrarFor("io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
