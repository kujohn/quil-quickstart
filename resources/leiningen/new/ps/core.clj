(ns {{name}}.core
  (:require [quil.core :as q :include-macros true]
            [{{name}}.dynamic :as d]
            [quil.middleware :as m]))

(q/defsketch optimistic_galois
  :size d/size
  :setup d/setup
  :update d/update-state
  :draw d/draw-state
  :features [:keep-on-top]
  :middleware [m/fun-mode])
