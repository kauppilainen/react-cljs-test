import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import { cljsToJs  } from 'react-cljs'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [cljsToJs(), react()],
})
