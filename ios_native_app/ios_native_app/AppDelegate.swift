//
//  AppDelegate.swift
//  ios_native_app
//
//  Created by Deivid Willyan Rodrigues Fabiano on 17/02/21.
//

import UIKit
import Flutter

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {
    var window: UIWindow?

    var flutterEngine : FlutterEngine?

    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        // Instantiate Flutter engine
        self.flutterEngine = FlutterEngine(name: "io.flutter", project: nil)
        self.flutterEngine?.run(withEntrypoint: nil)

        return true
    }
}

